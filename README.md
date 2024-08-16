![source](https://github.com/guardian/source-android/assets/79363218/3aecb407-00f6-4472-a662-7504d5f0315f)

# Design system library for Guardian apps

----

# Android Usage

[![Available on maven central](https://maven-badges.herokuapp.com/maven-central/com.gu.source/source-android/badge.svg)](https://central.sonatype.com/artifact/com.gu.source/source-android)

[Android library details and usage notes are here.](/android/README.md).

[API documentation is here.](/android/docs/).

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
