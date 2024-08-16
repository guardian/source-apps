//[source](../../index.md)/[com.gu.source.components.buttons](index.md)/[SourceBaseIconButton](-source-base-icon-button.md)

# SourceBaseIconButton

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [SourceBaseIconButton](-source-base-icon-button.md)(size: [SourceButton.Size](-source-button/-size/index.md), buttonColours: [ButtonColours](-button-colours/index.md), onClick: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, disabledButtonColours: [ButtonColours](-button-colours/index.md)? = null, icon: @[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)([Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {})

Source icon-only button. This variant allows providing the icon as a composable slot.

#### Parameters

androidJvm

| | |
|---|---|
| size | The size of the button. Reflects the prominence of the action. |
| buttonColours | The colours to apply to the button. |
| onClick | The action to perform when the button is clicked. |
| modifier | The modifier to apply to the button. |
| enabled | Whether the button is enabled and can be interacted with. |
| disabledButtonColours | Optional colours to apply to the button when it is disabled. If not provided, the [buttonColours](-source-base-icon-button.md) will be used with reduced opacity. |
| icon | The icon to display in the button. Use a material [Icon](https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary.html) component to display the icon. |
