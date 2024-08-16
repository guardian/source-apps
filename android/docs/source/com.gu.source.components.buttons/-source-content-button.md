//[source](../../index.md)/[com.gu.source.components.buttons](index.md)/[SourceContentButton](-source-content-button.md)

# SourceContentButton

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [SourceContentButton](-source-content-button.md)(size: [SourceButton.Size](-source-button/-size/index.md), priority: [SourceButton.Priority](-source-button/-priority/index.md), onClick: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, theme: [Source.Theme](../com.gu.source/-source/-theme/index.md)? = null, content: @[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))

A basic Source compatible button component. This is a low-level component and should be sparingly used only for custom buttons. Prefer to use [SourceButton](-source-button/index.md) or [SourceIconButton](-source-icon-button.md) instead.

#### Parameters

androidJvm

| | |
|---|---|
| size | Button size from [SourceButton.Size](-source-button/-size/index.md)s. Reflects the prominence of the action. |
| priority | Button priority from [SourceButton.Priority](-source-button/-priority/index.md)s. Informs users of how important an action is. |
| onClick | Callback for action to take when user clicks the button. |
| modifier | Optional [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) |
| enabled | Whether the button is enabled and can be interacted with. |
| theme | Optional [Source.Theme](../com.gu.source/-source/-theme/index.md) to apply to the button. If not provided, the current theme from [LocalSourceTheme](../com.gu.source.theme/-local-source-theme.md) will be used.<br>Unless using the button as a standalone component, it is recommended to wrap the whole screen/sheet with [SourceCoreTheme](../com.gu.source.theme/-source-core-theme.md) or [ReaderRevenueTheme](../com.gu.source.theme/-reader-revenue-theme.md) to provide consistent theme to all child components once. |
| content | Slot for composable content to present inside the button. |
