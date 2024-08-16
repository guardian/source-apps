//[source](../../index.md)/[com.gu.source.components.buttons](index.md)/[SourceIconButton](-source-icon-button.md)

# SourceIconButton

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [SourceIconButton](-source-icon-button.md)(icon: [ImageVector](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/vector/ImageVector.html), priority: [SourceButton.Priority](-source-button/-priority/index.md), contentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, onClick: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, size: [SourceButton.Size](-source-button/-size/index.md) = SourceButton.Size.Medium, theme: [Source.Theme](../com.gu.source/-source/-theme/index.md)? = null)

Source icon-only button.

#### Parameters

androidJvm

| | |
|---|---|
| icon | The icon to display in the button. Use an icon from [Source.Icons](../com.gu.source/-source/-icons/index.md) or Material [Icons](https://developer.android.com/reference/kotlin/androidx/compose/material/icons/Icons.html). |
| priority | The priority of the button. Informs users of how important an action is. |
| contentDescription | The content description for the button. |
| onClick | The action to perform when the button is clicked. |
| modifier | The modifier to apply to the button. |
| enabled | Whether the button is enabled and can be interacted with. |
| size | Optional size for the button. Reflects the prominence of the action. Defaults to [SourceButton.Size.Medium](-source-button/-size/-medium/index.md). |
| theme | Optional [Source.Theme](../com.gu.source/-source/-theme/index.md) to apply to the button. If not provided, the current theme from [LocalSourceTheme](../com.gu.source.theme/-local-source-theme.md) will be used.<br>Unless using the button as a standalone component, it is recommended to wrap the whole screen/sheet with [SourceCoreTheme](../com.gu.source.theme/-source-core-theme.md) or [ReaderRevenueTheme](../com.gu.source.theme/-reader-revenue-theme.md) to provide consistent theme to all child components once. |

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [SourceIconButton](-source-icon-button.md)(painter: [Painter](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/painter/Painter.html), priority: [SourceButton.Priority](-source-button/-priority/index.md), contentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, onClick: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, size: [SourceButton.Size](-source-button/-size/index.md) = SourceButton.Size.Medium, theme: [Source.Theme](../com.gu.source/-source/-theme/index.md)? = null)

Source icon-only button.

#### Parameters

androidJvm

| | |
|---|---|
| painter | The icon to display in the button. |
| priority | The priority of the button. Informs users of how important an action is. |
| contentDescription | The content description for the button. |
| onClick | The action to perform when the button is clicked. |
| modifier | The modifier to apply to the button. |
| enabled | Whether the button is enabled and can be interacted with. |
| size | Optional size for the button. Reflects the prominence of the action. Defaults to [SourceButton.Size.Medium](-source-button/-size/-medium/index.md). |
| theme | Optional [Source.Theme](../com.gu.source/-source/-theme/index.md) to apply to the button. If not provided, the current theme from [LocalSourceTheme](../com.gu.source.theme/-local-source-theme.md) will be used.<br>Unless using the button as a standalone component, it is recommended to wrap the whole screen/sheet with [SourceCoreTheme](../com.gu.source.theme/-source-core-theme.md) or [ReaderRevenueTheme](../com.gu.source.theme/-reader-revenue-theme.md) to provide consistent theme to all child components once. |

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [SourceIconButton](-source-icon-button.md)(icon: [ImageBitmap](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/ImageBitmap.html), priority: [SourceButton.Priority](-source-button/-priority/index.md), contentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, onClick: () -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, enabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, size: [SourceButton.Size](-source-button/-size/index.md) = SourceButton.Size.Medium, theme: [Source.Theme](../com.gu.source/-source/-theme/index.md)? = null)

Source icon-only button.

#### Parameters

androidJvm

| | |
|---|---|
| icon | The icon to display in the button. |
| priority | The priority of the button. Informs users of how important an action is. |
| contentDescription | The content description for the button. |
| onClick | The action to perform when the button is clicked. |
| modifier | The modifier to apply to the button. |
| enabled | Whether the button is enabled and can be interacted with. |
| size | Optional size for the button. Reflects the prominence of the action. Defaults to [SourceButton.Size.Medium](-source-button/-size/-medium/index.md). |
| theme | Optional [Source.Theme](../com.gu.source/-source/-theme/index.md) to apply to the button. If not provided, the current theme from [LocalSourceTheme](../com.gu.source.theme/-local-source-theme.md) will be used.<br>Unless using the button as a standalone component, it is recommended to wrap the whole screen/sheet with [SourceCoreTheme](../com.gu.source.theme/-source-core-theme.md) or [ReaderRevenueTheme](../com.gu.source.theme/-reader-revenue-theme.md) to provide consistent theme to all child components once. |
