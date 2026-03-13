# AGENTS.md — Source Apps (Android)

> Scope: the `android/` directory. iOS/Swift code in `Sources/` and `SourceSample/` is out of scope.

---

## Architecture Overview

This is the Guardian's **Source design system library for Android** — a pure Compose, published AAR on Maven Central (`com.gu.source:source-android`). It has two Gradle modules:

- **`:source`** — the library. No activities, no ViewModels. Only design tokens and Compose components.
- **`:sample`** — a standalone Android app that showcases all `:source` components interactively.

The `Source` object in `source/src/main/kotlin/com/gu/source/Source.kt` is the **single public namespace** for all tokens. All palette colours, typography styles, and icons are exposed as Kotlin extension properties on its nested objects (`Source.Palette`, `Source.Typography`, `Source.Icons.Base`), not as class members:

```kotlin
val Source.Palette.Brand400: Color get() = Color(0xff052962)
val Source.Typography.HeadlineBold14: TextStyle get() = BaseTextStyle + TextStyle(...)
val Source.Icons.Base.Checkmark: ImageVector  // generated ImageVector file
```

This means **adding a new token = adding a new extension property** to the appropriate file in `foundation/palette/`, `foundation/typography/`, or `foundation/icons/base/`.

---

## Module Structure

```
android/
  source/src/main/kotlin/com/gu/source/
    Source.kt                  ← public namespace object
    components/                ← Composable UI components (buttons, chips, banner, pager, rating, promosticker)
    foundation/                ← Design tokens (palette, typography, icons)
    daynight/                  ← AppColour + AppColourMode (light/dark abstraction)
    utils/                     ← PreviewAnnotations, Size (isTabletDevice), FontFamilyResource
  source/api/source-api.txt   ← Metalava API signature (auto-updated on release; do not hand-edit)
  sample/src/main/kotlin/com/gu/source/
    MainActivity.kt            ← ComponentActivity entry point
    navigation/                ← Navigator + Destination (AndroidX Navigation 3, @Serializable sealed interface)
    previews/                  ← One file per component screen
  build-logic/convention/     ← Composable convention plugins (library, application, compose variants)
  gradle/libs.versions.toml   ← Single version catalog for all dependencies
  version.txt                 ← Current library version (do NOT edit manually)
```

---

## Key Patterns

### Day/Night Colours
All colours are `AppColour(light: Color, dark: Color)`. Never use raw `Color` directly in components — always wrap in `AppColour` so `.current` resolves correctly via `LocalIsDarkModeActive`. Wrap the composition root in `AppColourMode { ... }`.

### Themes
Components that vary by Guardian theme accept a `theme: Source.Theme` parameter (`Core` or `ReaderRevenue`). The active theme is propagated via `LocalSourceTheme` (set by `SourceCoreTheme { }` or `ReaderRevenueTheme { }` wrappers). Internal colour mappings live in `ButtonColours.kt` pattern — a `when(theme)` extension on the `Priority` enum.

### Companion Models on `object`
Each component owns its enums/data classes on a companion `object` (e.g. `SourceButton.Size`, `SourceButton.Priority`, `SourceChip.Style`). When adding a new component, follow this pattern.

### Base vs Themed Components
- **Themed** (`SourceButton`, `SourceChip`): use preset `Priority` + `Source.Theme`; colours are resolved internally.
- **Base** (`PlainSourceButton`, `SourceBaseChip`): accept `ButtonColours` / `SourceBaseChip.Style` directly; for custom colour schemes. Always provide both a themed and a base variant when adding new interactive components.

### Preview Annotations
Use `@PreviewPhoneBothMode` and `@PreviewTabletBothMode` (defined in `utils/PreviewAnnotations.kt`) instead of raw `@Preview`. These cover Pixel 7 day/night + scaled font + narrow device in a single annotation. Test functions call the same `*Preview()` composables directly via Paparazzi.

---

## Build & Test Commands

All commands run from the `android/` directory.

```bash
# Build the library
./gradlew :source:assembleRelease

# Run all Paparazzi screenshot tests (JVM, no emulator needed)
./gradlew :source:test

# Record new / updated snapshots
./gradlew :source:recordPaparazziDebug

# Verify snapshots against recorded baselines
./gradlew :source:verifyPaparazziDebug

# Lint (Kotlinter)
./gradlew :source:lintKotlin

# Auto-format
./gradlew :source:formatKotlin

# Detekt static analysis
./gradlew :source:detekt

# Generate Metalava API signature file
./gradlew :source:metalavaGenerateSignatureRelease

# Check API compatibility (run before any public API change)
./gradlew :source:metalavaCheckCompatibilityRelease

# Publish to maven local (for testing in consumer apps)
./gradlew :source:publishToMavenLocal

# Publish to local build directory (for bundling into news app)
./gradlew :source:publishReleasePublicationToCustomRepository
# Output: source/build/custom/  (or override with -Prepo.local=<path>)

# Run the sample app
./gradlew :sample:installDebug
```

---

## Testing Approach

All tests in `:source` are **Paparazzi screenshot tests** (no instrumentation/emulator needed). Test files mirror component files and directly call internal `@VisibleForTesting` `*Preview()` composables:

```kotlin
@RunWith(TestParameterInjector::class)
class SourceButtonTest(@TestParameter private val nightMode: NightMode) {
    @get:Rule val paparazzi = createComponentPaparazziRule(nightMode)

    @Test fun coreIconBefore() { paparazzi.snapshot { CoreButtonIconBeforePreview() } }
}
```

Use `createComponentPaparazziRule()` for sub-screen components (SHRINK render mode) and `createScreenPaparazziRule()` for full-screen. Parametric day/night and font-scale variants are handled via `TestParameterInjector` with `NightMode` and `FontScale` enums from `BaseDeviceConfig.kt`.

Snapshot baselines live in `source/src/test/snapshots/`. Always run `recordPaparazziDebug` after intentional visual changes.

---

## Versioning & Releasing

- **Version** is in `android/version.txt` (e.g. `9.0.0`). **Do not edit manually** — the GitHub Actions [Release workflow](https://github.com/guardian/source-apps/actions/workflows/release.yml) updates it automatically.
- **Version increments** are computed from Metalava API diff: breaking change → major, new API → minor, no API change → patch.
- **Preview releases** can be triggered from any branch via the Release action; the format is `x.y.z-PREVIEW.<branch>.<datetime>.<hash>`.
- The public API surface is tracked in `source/api/source-api.txt`. Any change to a `public` or `internal` annotated symbol updates this file. Run `metalavaGenerateSignatureRelease` locally if you add/remove public API.

---

## Convention Plugins (`build-logic/`)

Modules pick composable plugins from `build-logic/convention/`:

| Plugin ID | Use for |
|---|---|
| `com.theguardian.library.android` | Android library modules |
| `com.theguardian.compose.library` | Adds Compose + Paparazzi to a library module |
| `com.theguardian.application` | Android application modules |
| `com.theguardian.compose.application` | Adds Compose to an application module |

These plugins are **additive and single-responsibility**. If a new module needs one-off config with no shared logic, put it directly in `build.gradle.kts` rather than creating a new plugin.

---

## Adding a New Component

Follow these steps end-to-end when adding a new component to `:source`.

### 1. Create the component in `:source`

Create a new package under `source/src/main/kotlin/com/gu/source/components/<componentname>/`. Every component package needs at minimum:

- **The main composable file** (e.g. `SourceWidget.kt`) — put all public enums and data classes on a companion `object` (e.g. `SourceWidget.Size`, `SourceWidget.Priority`). Follow `SourceButton.kt` or `PromoSticker.kt` as canonical examples.
- **Default values and colours** — Create a `SourceWidgetDefaults` object to specify any default dimensions, padding, typography styles, colours etc. that the component needs. If the component has multiple colour inputs, create a `colours(...)` function inside `SourceWidgetDefaults` to allow consumers to easily create a `WidgetColours` data class with the correct defaults.
- Keep the public API surface minimal — only the main composable function(s) and any necessary enums/data classes. All internal implementation details (including raw `Color` values) should be `private` to the file or `internal` to the library.
- Use `AppColour(light, dark)` for every colour value. Never pass raw `Color` to a component's internal layout.
- Mark all `@Preview` composables `internal` and annotate them `@VisibleForTesting`.

```kotlin
// source/src/main/kotlin/com/gu/source/components/widget/SourceWidget.kt
object SourceWidget {
    enum class Size { Small, Medium, Large }
    enum class Priority { Primary, Secondary }
}

@Composable
fun SourceWidget(
    priority: SourceWidget.Priority,
    size: SourceWidget.Size,
    modifier: Modifier = Modifier,
    theme: Source.Theme = LocalSourceTheme.current,
) { /* ... */ }

@VisibleForTesting
@PreviewPhoneBothMode
@Composable
internal fun SourceWidgetPreview() {
    AppColourMode {
        SourceWidget(priority = SourceWidget.Priority.Primary, size = SourceWidget.Size.Medium)
    }
}
```

If the component supports custom colours (not just preset themes), also create a **base variant** accepting a `ButtonColours`-style parameter directly (see `PlainSourceButton.kt` / `SourceBaseChip.kt`).

### 2. Add `@Preview` composables and Paparazzi screenshot tests

Internal `@Preview` functions live at the bottom of the component file (annotated `@PreviewPhoneBothMode` and/or `@PreviewTabletBothMode`). They are the source of truth for screenshot tests.

Create a mirror test file at `source/src/test/kotlin/com/gu/source/components/<componentname>/SourceWidgetTest.kt`:

```kotlin
@RunWith(TestParameterInjector::class)
class SourceWidgetTest(@TestParameter private val nightMode: NightMode) {
    @get:Rule
    val paparazzi = createComponentPaparazziRule(nightMode)

    @Test fun primary() { paparazzi.snapshot { SourceWidgetPreview() } }
}
```

Add `@TestParameter private val fontScale: FontScale` when the component renders text. After writing the test, record baselines:

```bash
./gradlew :source:recordPaparazziDebug
```

Commit the generated snapshots from `source/src/test/snapshots/`.

### 3. Add a component README and link it from the parent README

Create `source/src/main/kotlin/com/gu/source/components/<componentname>/README.md`. Include:
- A one-paragraph description
- A light/dark screenshot table (upload images to the GitHub PR and paste the URLs)
- Usage code examples for both the themed and base variant (if applicable)
- A link to the full API docs at `https://guardian.github.io/source-apps/android/docs/`

Then open `android/README.md` and add an entry under the **Components** section, following the existing pattern:

```markdown
### My Widget

Short description of the component.

[See here for full details of the widget component.][mywidget]
```

Add the link reference at the bottom of `android/README.md` alongside the existing refs:

```markdown
[mywidget]: ./source/src/main/kotlin/com/gu/source/components/widget/README.md
```

### 4. Add a preview screen in `:sample`

**a. Create the preview composable** — add `sample/src/main/kotlin/com/gu/source/previews/WidgetPreview.kt`. Wrap content in `PreviewScaffold` (provides top bar + back button) and `AppColourMode`. Use `@PreviewLightDark` for the Android Studio preview:

```kotlin
@Composable
internal fun WidgetPreview(onBackPress: () -> Unit, modifier: Modifier = Modifier) {
    PreviewScaffold("Widget", onBackPress, modifier) {
        // Show all size/priority/style combinations
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    AppColourMode { WidgetPreview({}) }
}
```

**b. Add a `Destination`** in `navigation/Destination.kt`:

```kotlin
@Serializable
object WidgetPreview : Destination
```

**c. Wire the Home screen** — in `Home.kt` add a `SourceButton` nav entry inside the `Column`:

```kotlin
SourceButton(
    text = "Widget",
    priority = SourceButton.Priority.TertiaryOnWhite,
    onClick = { navigate(Destination.WidgetPreview) },
)
```

**d. Register the route** — in `MainActivity.kt` add an `entry` block inside the `entryProvider` lambda:

```kotlin
entry(Destination.WidgetPreview) {
    WidgetPreview(navigator::popBackStack)
}
```

### 5. Validate with a preview release

Before merging, publish a preview release to test the component in a real consumer app:

1. Push your branch to GitHub.
2. Trigger the [Release workflow](https://github.com/guardian/source-apps/actions/workflows/release.yml) targeting **your branch** (not `main`).
3. The action publishes to Maven Central and posts the version string (e.g. `9.1.0-PREVIEW.my-branch.2026-03-13T1045.abc1234`) as a PR comment.
4. Update the consumer app's version catalog to the preview version and verify end-to-end rendering.

### 6. Get PR approval from the design systems team

All new components require at least one approval from a member of the **Guardian design systems team** before merging. Tag `@guardian/android-developers` as a reviewer and include light/dark screenshots in the PR description. Ensure the recorded Paparazzi snapshots are committed with the code changes.

### 7. Produce a production release after merging

Once the PR is merged to `main`:

1. Trigger the [Release workflow](https://github.com/guardian/source-apps/actions/workflows/release.yml) targeting **`main`**.
2. The workflow runs `metalavaCheckCompatibilityRelease` to determine the version bump (major / minor / patch), updates `version.txt`, updates `source/api/source-api.txt`, publishes to Maven Central, and creates a GitHub release.
3. Do **not** edit `version.txt` or `source/api/source-api.txt` manually — these are owned by the release workflow.