![source](https://github.com/guardian/source-android/assets/79363218/3aecb407-00f6-4472-a662-7504d5f0315f)

# Design system library for Guardian apps

----

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
> See [here](/android/README.md) if you need to build and bundle the library as a local repository.

## Using the library

The library exposes a single object `com.gu.Source`. Design presets are available as properties on this object, e.g. `Source.Typography.HeadlineBold15`.

The library bundles app font files, so they are not separately required in consumer apps.

### Typography presets

Typography presets include `fontFamily`, `fontSize`, `lineHeight`, `fontWeight`, `fontStyle` in a single token.

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

Three button components are available - `SourceButton`, `SourceIconButton` and `PlainSourceButton`.

The source buttons have preset style and size variants corresponding to Source specifications. Both Core and Reader Revenue themes are provided.

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

The plain button is intended for when custom colour schemes are used. It does not use preconfigured `priority` or `theme`. It can instead directly be provided with `ButtonColours`. (Plain button is available from version `0.2.1`)

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

----

# iOS Usage 

## Adding the Swift Package To Xcode

To add the `Source` Swift Package to your project, follow these steps:

1. Open your project in Xcode.

2. Go to `File` > `Swift Packages` > `Add Package Dependency...`.

3. In the search bar, enter the URL `https://github.com/guardian/source-apps.git` click `Next`.

4. Select the version rule that suits your needs, then click `Next`.

5. Choose the `Source` library and click `Finish`.

Now, the `Source` Swift Package should be added to your project and you can import it wherever you need it.

## Using in Another Swift Package

If you're developing a Swift Package and want to use `Source`, you can add it as a dependency in your `Package.swift` file.

Here's how you can do it:

1. Open your `Package.swift` file.

2. Add `Source` to the dependencies array:

```swift
dependencies: [
    .package(url: "https://github.com/guardian/source-apps.git", branch: "main")
]
```

3. Add `Source` as a dependency for your target:

```swift
targets: [
    .target(
            name: "YourPackageName",
            dependencies: [
                .product(name: "Source", package: "source-apps")
            ]),
]
```

4. Now, you can import `Source` in any Swift file in your package.

## Typography 

If you are using in this package that doesn't already use the `GuardianFonts` package you will need to ensure you have registered the custom fonts. 
You can skip this step if your project already includes the `GuardianFonts` package. 

### Registration 
If you are using in this package that doesn't already use the `GuardianFonts` package you will need to ensure you 
Custom fonts are registered differently in Swift Packages due to the lack of an info.plist. 
You should use `GuardianFonts.registerFonts()` function to register the fonts contained in this swift package to use in your application. 

If using this from within another **module**, you can do the registration within the module's `init()` function. 

Otherwise, from within a **project** this can be done within the App Delegate `application(_:willFinishLaunchingWithOptions:)` function.

### Usage

The Typography fonts provided by this library are of type `GuardianFont`. GuardianFont is a type provided by the GuardianFonts app which encapsulates all required font properties, eg. style, size & lineHeight. 

1. Import framework - `import Source` 

2. Use font modifier from `GuardianFonts` package - `.font(Typography.headlineBld14)`

## ColorPalette
This defines the brand colours from [Source documentation](https://design.theguardian.com/#colour-palette).

### Usage

1. Import framework - `import Source`
2. Access colours like so - `ColorPalette.brand400`
