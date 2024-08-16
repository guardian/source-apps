//[source](../../index.md)/[com.gu.source.components.buttons](index.md)/[PlainSourceContentButton](-plain-source-content-button.md)

# PlainSourceContentButton

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [PlainSourceContentButton](-plain-source-content-button.md)(size: [SourceButton.Size](-source-button/-size/index.md), onClick: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, buttonColours: [ButtonColours](-button-colours/index.md) = PlainDefault, disabledButtonColours: [ButtonColours](-button-colours/index.md)? = null, content: @[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))

A plain, basic Source compatible button component. This button does not have any Source colour theming. Provide [buttonColours](-plain-source-content-button.md) to theme the button.

This is a low-level component and should be sparingly used only for custom buttons. Prefer to use [PlainSourceButton](-plain-source-button.md) or [SourceIconButton](-source-icon-button.md) instead.

#### Parameters

androidJvm

| | |
|---|---|
| size | Button size from [SourceButton.Size](-source-button/-size/index.md)s. Reflects the prominence of the action. |
| onClick | Callback for action to take when user clicks the button. |
| modifier | Optional [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) |
| enabled | Whether the button is enabled and can be interacted with. |
| buttonColours | Optional colours for the button. Use this to theme the button. |
| disabledButtonColours | Optional colours for the button when it is disabled. If not provided, the button colours are used with reduced opacity. |
| content | Slot for composable content to present inside the button. |
