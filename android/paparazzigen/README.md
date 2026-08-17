# paparazzigen

Generates [Paparazzi](https://github.com/cashapp/paparazzi) screenshot tests from `@Composable`
preview functions, so components don't need a hand written test file each.

Annotate a preview:

```kotlin
@PaparazziTest
@PreviewPhoneBothMode
@Composable
internal fun PromoStickerPreview() {
    PromoSticker(text = "New")
}
```

...and a test is generated for it, then recorded by `recordPaparazziDebug` like any other Paparazzi
test.

## Modules

| Module | Artifact | Purpose |
|---|---|---|
| `annotations` | `com.gu.source:paparazzigen-annotations` | The `@PaparazziTest` annotation and its enums. `SOURCE` retention, so it never reaches your published artifact. |
| `processor` | `com.gu.source:paparazzigen-processor` | The KSP processor. Generates the test files with KotlinPoet. |
| `testing` | `com.gu.source:paparazzigen-testing` | Runtime helpers the generated tests call - the Paparazzi rules, `BaseDeviceConfig`, `toDeviceConfig` and `filterScreenshots`. |
| [`../paparazzigen-plugin`](../paparazzigen-plugin) | `com.gu.source:paparazzigen-gradle-plugin` | The `com.gu.source.paparazzigen` Gradle plugin, which wires the above together. |

> [!NOTE]
> These artifacts are not published yet, so paparazzigen is currently only usable inside this repo.

## The annotation

```kotlin
annotation class PaparazziTest(
    val nightMode: TestNightMode = TestNightMode.All,
    val device: TestDevice = TestDevice.Phone,
    val fontScale: TestFontScale = TestFontScale.Normal,
    val orientation: TestOrientation = TestOrientation.Portrait,
    val renderMode: RenderMode = RenderMode.Component,
)
```

Each of the first four axes is either a single specific value, or `All`. `All` turns that axis into
a `TestParameterInjector` test parameter, so every variant of it is rendered.

| Axis | `All` renders | Specific values |
|---|---|---|
| `nightMode` | day and night | `Day`, `Night` |
| `device` | phone and tablet | `Phone`, `Tablet` |
| `fontScale` | normal and extra large | `Normal`, `ExtraLarge` |
| `orientation` | portrait and landscape | `Portrait`, `Landscape` |

`renderMode` is not an axis. `Component` shrinks the snapshot to the component's drawable area,
`Screen` renders a full device sized screen.

The defaults render day and night on a portrait phone at the normal font scale, which is what most
sub screen components want.

### Keeping the snapshot count down

Rendering every combination gets expensive quickly. When `nightMode = All` is combined with any
other `All` axis, the generated test calls `filterScreenshots`, which skips night mode everywhere
except phone + portrait + normal font. So:

```kotlin
@PaparazziTest(device = TestDevice.All, fontScale = TestFontScale.All)
```

produces 5 snapshots rather than 8.

## Generated output

One test file per production file, named after it - `PromoSticker.kt` produces
`PromoStickerPaparazziTest.kt` in the same package.

Previews in the same file that share a configuration are grouped into one test class. If a file uses
more than one configuration, each class gets a suffix describing its config, e.g.
`PromoStickerPaparazziTestAllDevices`. A file with a single configuration gets no suffix, which
keeps snapshot file names stable.

Test method names drop the conventional `Preview` suffix and decapitalise, so `PromoStickerPreview`
becomes `promoSticker`. Collisions get a numeric suffix.

The example above generates:

```kotlin
@RunWith(TestParameterInjector::class)
public class PromoStickerPaparazziTest(
  @TestParameter
  private val nightMode: NightMode,
) {
  @get:Rule
  public val paparazzi: Paparazzi = createComponentPaparazziRule(
        deviceConfig = BaseDeviceConfig.Phone.toDeviceConfig(
          nightMode = nightMode,
          fontScale = FontScale.Normal,
          orientation = Orientation.Portrait,
        ),
      )

  @Test
  public fun promoSticker() {
    paparazzi.snapshot {
      PromoStickerPreview()
    }
  }
}
```

Generated code is written to `build/generated/paparazzigen/kotlin` and added to the **unit test**
source set, so it is never compiled into your library. It is not checked in, and is excluded from
Kotlinter and Detekt.

## Requirements

The annotated function must be:

- `@Composable`
- non-private
- top level
- callable with no arguments

Anything else is a KSP compilation error pointing at the offending function.

Previews that need wrapping in something like `AppColourMode` with a background aren't supported
yet, so those components still need a hand written test.

## Using it

### In this repo

`:source` already applies it. Annotate a preview, then:

```bash
./gradlew :source:recordPaparazziDebug
```

and commit the new baselines from `source/src/test/snapshots/`.

### In another project

The plugin does **not** apply KSP or Paparazzi itself, because their versions are tied to your
Kotlin and AGP versions. Apply both yourself first; the plugin fails with an actionable message if
either is missing.

The plugin is published to Maven Central rather than the Gradle Plugin Portal, so add
`mavenCentral()` to plugin management in `settings.gradle.kts`:

```kotlin
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
```

Then in the module's `build.gradle.kts`:

```kotlin
plugins {
    id("com.android.library")
    id("app.cash.paparazzi") version "<version>"
    id("com.google.devtools.ksp") version "<version>"
    id("com.gu.source.paparazzigen") version "<version>"
}
```

That's all that's needed - the plugin adds the annotations, processor and testing dependencies for
you, at its own version.

To configure it:

```kotlin
paparazzigen {
    // Version of the paparazzigen-* artifacts. Defaults to the plugin's own version, which is the
    // only combination that is tested together.
    dependencyVersion.set("10.0.1")

    // Set to false to declare the compileOnly, ksp and testImplementation dependencies yourself.
    addDependencies.set(true)

    // The variant the processor runs against. Tests are generated once, from a single variant, so
    // the same test isn't generated several times. Ignored for non-Android modules.
    variant.set("debug")
}
```

Android library, Android application and plain Kotlin JVM modules are all supported.
