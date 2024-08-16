//[source](../../../index.md)/[com.gu.source.daynight](../index.md)/[AppColour](index.md)

# AppColour

open class [AppColour](index.md)(val light: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html), val dark: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = light)

Encapsulates light and dark mode colours. If [dark](dark.md) colour isn't provided, defaults to [light](light.md) in dark mode.

Access the correct colours for current app state using the [current](current.md) property.

**Dev note**: using `isSystemInDarkMode()` is an expensive operation, so we should do it once at top level and pass the resulting theme as composition local. This will also let us handle the scenarios where a user has selected always light/dark theme.

This class is 'open' only so we could extend it for the [Unspecified](-unspecified/index.md) data object.

#### Inheritors

| |
|---|
| [Unspecified](-unspecified/index.md) |
| [Transparent](-transparent/index.md) |

## Constructors

| | |
|---|---|
| [AppColour](-app-colour.md) | [androidJvm]<br>constructor(light: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html), dark: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = light) |

## Types

| Name | Summary |
|---|---|
| [Transparent](-transparent/index.md) | [androidJvm]<br>data object [Transparent](-transparent/index.md) : [AppColour](index.md)<br>Colour is transparent. |
| [Unspecified](-unspecified/index.md) | [androidJvm]<br>data object [Unspecified](-unspecified/index.md) : [AppColour](index.md)<br>Colour is not specified. |

## Properties

| Name | Summary |
|---|---|
| [current](current.md) | [androidJvm]<br>@get:[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>val [current](current.md): [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html)<br>Provides the card colour depending on whether dark mode is active or not |
| [dark](dark.md) | [androidJvm]<br>@get:[VisibleForTesting](https://developer.android.com/reference/kotlin/androidx/annotation/VisibleForTesting.html)(otherwise = 2)<br>val [dark](dark.md): [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) |
| [light](light.md) | [androidJvm]<br>@get:[VisibleForTesting](https://developer.android.com/reference/kotlin/androidx/annotation/VisibleForTesting.html)(otherwise = 2)<br>val [light](light.md): [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [androidJvm]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [androidJvm]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
