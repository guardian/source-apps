![source](https://github.com/guardian/source-android/assets/79363218/3aecb407-00f6-4472-a662-7504d5f0315f)

# The Source library for Android

[![Available on maven central](https://maven-badges.herokuapp.com/maven-central/com.gu.source/source-android/badge.svg)](https://central.sonatype.com/artifact/com.gu.source/source-android)

# Android Usage

[![Available on maven central](https://maven-badges.herokuapp.com/maven-central/com.gu.source/source-android/badge.svg)](https://central.sonatype.com/artifact/com.gu.source/source-android)

## Add the library dependency

Add the dependency to `build.gradle.kts` for the consuming module:

```kotlin
implementation("com.gu.source:source-android:<version>")
```

<!-- Alternatively, add it to your app's core design module as an `api` dependency. It will be transitively available to all other modules:

```kotlin
api("com.gu.source:source-android:<version>")
```-->

> [!Note]
> See [here](#building-and-using-as-a-bundled-repo) if you need to build and bundle the library as a local repository.

## Using the library

The library provides design presets and components.

The design presets are available name spaced under the `com.gu.Source` object, e.g. `Source.Typography.HeadlineBold15`.

### Typography presets

Typography presets include `fontFamily`, `fontSize`, `lineHeight`, `fontWeight`, `fontStyle` in a single token. [A rough preview of all typography styles is available here.](https://github.com/guardian/source-apps/blob/main/android/source/src/test/snapshots/images/com.gu.source.presets.typography_TypographyPreviewTest_snapshot.png)

The library bundles app font files, so they are not separately required in consumer apps.

Use typography presets directly in a `Text` component.

```kotlin
Text(
    text = "The world's leading liberal voice",
    style = Source.Typography.TextEgyptianItalic14,
)
```
### Core palette colours

Core palette colours are available for direct use in components through `Source.Palette`. [Preview all available colours here](https://github.com/guardian/source-apps/blob/main/android/source/src/main/kotlin/com/gu/source/presets/palette/palette.png).

```kotlin
Text(
    text = "The world's leading liberal voice",
    color = Source.Palette.Brand400,
)
```

### Buttons

Four core button components are available - `SourceButton`, `SourceIconButton`, `PlainSourceButton` and `SourceBaseIconButton`.

The first two source buttons have preset style and size variants corresponding to Source specifications. Both Core and Reader Revenue themes are provided. The latter two use Source defined sizing but can be used for custom colour schemes.

Using `SourceButton`:
```kotlin
SourceButton(
    text = "Sign in",
    priority = SourceButton.Priority.PrimaryOnWhite,
    onClick = {},
    size = SourceButton.Size.Small,
)
```

Using `SourceIconButton` with a Material Icon:
```kotlin
SourceIconButton(
    icon = Icons.Default.Person,
    priority = SourceButton.Priority.SecondaryOnBlue,
    contentDescription = null,
    onClick = {},
    size = SourceButton.Size.Medium,
)
```

Using `SourceIconButton` with a drawable resource:
```kotlin
SourceIconButton(
    painter = painterResource(R.drawable.ic_person),
    priority = SourceButton.Priority.SecondaryOnBlue,
    contentDescription = null,
    onClick = {},
)
```

The plain and base buttons are intended for when custom colour schemes are used. It does not use preconfigured `priority` or `theme`. It can instead directly be provided with `ButtonColours`. (`PlainSourceButton` is available from version `0.2.1`, `SourceBaseIconButton` is available from `0.3.0`)

```kotlin
PlainSourceButton(
    text = "Culture themed",
    onClick = {},
    modifier = Modifier.align(CenterHorizontally),
    buttonColours = ButtonColours(
        border = AppColour(
            light = Source.Palette.Culture200,
            dark = Source.Palette.Culture800,
        ),
        container = AppColour(
            light = Source.Palette.Culture800,
            dark = Source.Palette.Culture200,
        ),
        content = AppColour(
            light = Source.Palette.Culture200,
            dark = Source.Palette.Culture800,
        ),
    ),
)
```

```kotlin
SourceBaseIconButton(
    buttonColours = buttonColours,
    size = SourceButton.Size.Small,
    onClick = { },
) {
    Icon(
        imageVector = Source.Icons.Base.ChevronRight,
        contentDescription = null,
        modifier = it,
    )
}
```

----

### Using the library

The library is available on Maven Central. Add the library dependency to your `build.gradle.kts` file:

```kotlin
implementation("com.gu.source:source-android:<version>")
```

See the main [README](../README.md) for using the library.

### Building and using as a bundled repo

1. Build the library
   Run
   ```shell
   ./gradlew :source:publishReleasePublicationToGusourceRepository
   ```
   This will produce the library output at `/source/build/gusource/`.

2. Copy the built library to the news app
   Copy the library the built folder from `/source/build/gusource/` to the `android-news-app/src/main/libs/maven` folder in the `android-news-app` repo.

3. Update the version number in the news app
   If the library version has changed, update it in the version catalog for the news app.

### Building and using from maven local

1. Build the library
   Run
   ```shell
   ./gradlew :source:publishToMavenLocal
   ```
   This will publish the library to your local maven repository.

2. Update the version number in the news app
   If the library version has changed, update it in the version catalog for the news app.
   
3. Ensure you have `mavenLocal` declared first in your repositories
   ```groovy
   repositories {
       mavenLocal()
       mavenCentral()
       google()
   }
   ```

### Other notes

1. We use the `com.gu` package name and group id so we can use the Guardian's Sonatype infra for signing and publishing the library. See [this comment](https://github.com/guardian/source-android/pull/10/files?w=1#r1567071142) for reference. 