//[source](../../../index.md)/[com.gu.source.components.buttons](../index.md)/[ButtonColours](index.md)

# ButtonColours

[androidJvm]\
data class [ButtonColours](index.md)(val border: [AppColour](../../com.gu.source.daynight/-app-colour/index.md), val container: [AppColour](../../com.gu.source.daynight/-app-colour/index.md), val content: [AppColour](../../com.gu.source.daynight/-app-colour/index.md))

Model to provide colours for a button.

## Constructors

| | |
|---|---|
| [ButtonColours](-button-colours.md) | [androidJvm]<br>constructor(border: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html), container: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html), content: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html))<br>Secondary constructor to allow creating an instance without using `AppColour`. This can be used when loading colours from resources using `colourResource`.<br>constructor(border: [AppColour](../../com.gu.source.daynight/-app-colour/index.md), container: [AppColour](../../com.gu.source.daynight/-app-colour/index.md), content: [AppColour](../../com.gu.source.daynight/-app-colour/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [border](border.md) | [androidJvm]<br>val [border](border.md): [AppColour](../../com.gu.source.daynight/-app-colour/index.md) |
| [container](container.md) | [androidJvm]<br>val [container](container.md): [AppColour](../../com.gu.source.daynight/-app-colour/index.md) |
| [content](content.md) | [androidJvm]<br>val [content](content.md): [AppColour](../../com.gu.source.daynight/-app-colour/index.md)<br>Colour for the content of the button including text and icons. |
