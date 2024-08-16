//[source](../../index.md)/[com.gu.source.components.buttons](index.md)/[PlainSourceButton](-plain-source-button.md)

# PlainSourceButton

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [PlainSourceButton](-plain-source-button.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), onClick: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, buttonColours: [ButtonColours](-button-colours/index.md) = PlainDefault, disabledButtonColours: [ButtonColours](-button-colours/index.md)? = null, size: [SourceButton.Size](-source-button/-size/index.md) = SourceButton.Size.Small, iconSide: [SourceButton.IconSide](-source-button/-icon-side/index.md) = SourceButton.IconSide.Left, icon: @[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)([Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {})

A plain Source button component with text and an optional icon. This has no Source colour theming. Provide [buttonColours](-plain-source-button.md) to theme the button.

Prefer to use [SourceButton](-source-button/index.md) or [SourceIconButton](-source-icon-button.md) instead.

#### Parameters

androidJvm

| | |
|---|---|
| text | Text to display on the button. |
| onClick | Callback for action to take when user clicks the button. |
| modifier | Optional [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) |
| enabled | Whether the button is enabled and can be interacted with. |
| buttonColours | Optional colours for the button. Use this to theme the button. |
| disabledButtonColours | Optional colours for the button when it is disabled. If not provided, the button colours are used with reduced opacity. |
| size | Button size from [SourceButton.Size](-source-button/-size/index.md)s. Reflects the prominence of the action. |
| iconSide | Optional the side of the button on which the icon appears. Defaults to [SourceButton.IconSide.Left](-source-button/-icon-side/-left/index.md). |
| icon | Optional icon to display on the button. |
