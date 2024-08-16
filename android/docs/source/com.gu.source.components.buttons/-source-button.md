//[source](../../index.md)/[com.gu.source.components.buttons](index.md)/[SourceButton](-source-button.md)

# SourceButton

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [SourceButton](-source-button.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), priority: [SourceButton.Priority](-source-button/-priority/index.md), onClick: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, size: [SourceButton.Size](-source-button/-size/index.md) = SourceButton.Size.Small, theme: [Source.Theme](../com.gu.source/-source/-theme/index.md)? = null, iconSide: [SourceButton.IconSide](-source-button/-icon-side/index.md) = SourceButton.IconSide.Left, icon: @[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)([Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) = {})

A Source button component with text and an optional icon.

#### Parameters

androidJvm

| | |
|---|---|
| text | Text to display on the button. |
| priority | Button priority from [SourceButton.Priority](-source-button/-priority/index.md)s. Informs users of how important an action is. |
| onClick | Callback for action to take when user clicks the button. |
| modifier | Optional [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) |
| enabled | Whether the button is enabled and can be interacted with. |
| size | Optional button size from [SourceButton.Size](-source-button/-size/index.md)s. Reflects the prominence of the action. Defaults to [SourceButton.Size.Small](-source-button/-size/-small/index.md). |
| theme | Optional [Source.Theme](../com.gu.source/-source/-theme/index.md) to apply to the button. If not provided, the current theme from [LocalSourceTheme](../com.gu.source.theme/-local-source-theme.md) will be used.<br>Unless using the button as a standalone component, it is recommended to wrap the whole screen/sheet with [SourceCoreTheme](../com.gu.source.theme/-source-core-theme.md) or [ReaderRevenueTheme](../com.gu.source.theme/-reader-revenue-theme.md) to provide consistent theme to all child components once. |
| iconSide | Optional the side of the button on which the icon appears. Defaults to [SourceButton.IconSide.Left](-source-button/-icon-side/-left/index.md). |
| icon | Optional icon to display on the button. |
