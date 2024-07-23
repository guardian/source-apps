![source](https://github.com/guardian/source-android/assets/79363218/3aecb407-00f6-4472-a662-7504d5f0315f)

# The Source library for Android

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

> [!note]
> See [here](#building-and-using-directly) if you need to build and bundle the library as a local repository.

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
    // Using Source typography preset
    style = Source.Typography.TextEgyptianItalic14,
)
```
### Core palette colours

Core palette colours are available for direct use in components through `Source.Palette`. [Preview all available colours here](https://github.com/guardian/source-apps/blob/main/android/source/src/main/kotlin/com/gu/source/presets/palette/palette.png).

```kotlin
Text(
    text = "The world's leading liberal voice",
    // Using Source palette colours
    color = Source.Palette.Brand400,
)
```

### Buttons

Four core button components are available - `SourceButton`, `SourceIconButton`, `PlainSourceButton` and `SourceBaseIconButton`.

#### Themed buttons


The first two source buttons have preset style and size variants corresponding to Source specifications. Both _Core_ and _Reader Revenue_ themes are provided. The latter two use Source defined sizing but can be used for custom colour schemes.

| Core theme | Reader revenue theme |
| --- | --- |
| ![Core themed text only buttons](https://github.com/user-attachments/assets/e69393fb-675b-4f0e-9f52-62a28736bcfc) | ![Reader revenue themed text only buttons](https://github.com/user-attachments/assets/7ca3d409-252e-45e1-964f-efd03b1ebe39) |

##### Usage examples

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

#### Base buttons

The plain and base buttons are intended for when custom colour schemes are needed. These do not use preconfigured `priority` or `theme`. They expect to be directly be provided with `ButtonColours`. (`PlainSourceButton` is available from version `0.2.1`, `SourceBaseIconButton` is available from `0.3.0`)

##### Usage examples

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

### Pager progress indicators

The `PagerProgressBar` component is used to denote progress as a user flips through the items in a `HorizontalPager`. It is typically used for image carousels.

The progress bar is styled to match Source specifications. It is expected to be placed below the pager.

##### Usage example

![Progress bar for tablets](https://github.com/user-attachments/assets/ec1c2520-8c2c-42c0-9a8c-631054e77a67)


```kotlin
Column(
    modifier = modifier .widthIn(max = 695.dp),
) {
    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .aspectRatio(695 / 544f)
            .clip(RoundedCornerShape(16.dp)),
    ) { page ->
        SampleImage(
            randomKey = page,
            modifier = Modifier.fillMaxWidth(),
        )
    }
    
    // Place the bar below the pager
    PagerProgressBar(pagerState = pagerState)
}
```

#### Custom progress indicators

A lower level component `PagerProgressIndicator` is also available. It provides a lot more options for customising appearance of the indicators.

##### Usage example:

![Custom indicator styling](https://github.com/user-attachments/assets/2d08a04d-a146-4ab0-a61c-5b8a89502cd1)


```kotlin
Column(modifier = Modifier.padding(8.dp)) {
    HorizontalPager(state = pagerState) {
        Box(
            modifier = Modifier
                .size(400.dp)
                .background(Source.Palette.Neutral86, RoundedCornerShape(8.dp)),
        ) {
            Text(
                text = (it + 1).toString(),
                style = Source.Typography.Titlepiece70,
                modifier = Modifier.align(Alignment.Center),
                color = Source.Palette.Neutral46,
            )
        }
    }
    
    // Place indicator below the pager, style it and set alignment explicitly
    PagerProgressIndicator(
        pagerState = pagerState,
        selectedIndicatorColour = Source.Palette.Sport500,
        unSelectedIndicatorColour = Source.Palette.Sport500.copy(alpha = 0.3F),
        indicatorShape = CutCornerShape(8.dp),
        maxIndicatorCount = 7,
        numberOfItemsToScale = 5,
        modifier = Modifier
            .padding(top = 8.dp)
            .align(Alignment.CenterHorizontally),
    )
}
```

----

## Building and using directly

### As a bundled repo

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

### From maven local

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