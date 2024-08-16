//[source](../../index.md)/[com.gu.source.daynight](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [AppColour](-app-colour/index.md) | [androidJvm]<br>open class [AppColour](-app-colour/index.md)(val light: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html), val dark: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = light)<br>Encapsulates light and dark mode colours. If [dark](-app-colour/dark.md) colour isn't provided, defaults to [light](-app-colour/light.md) in dark mode. |

## Properties

| Name | Summary |
|---|---|
| [LocalIsDarkModeActive](-local-is-dark-mode-active.md) | [androidJvm]<br>val [LocalIsDarkModeActive](-local-is-dark-mode-active.md): [ProvidableCompositionLocal](https://developer.android.com/reference/kotlin/androidx/compose/runtime/ProvidableCompositionLocal.html)&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)&gt;<br>Default value for is dark mode active when a composable is not wrapped in local [AppColourMode](-app-colour-mode.md). |

## Functions

| Name | Summary |
|---|---|
| [AppColourMode](-app-colour-mode.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [AppColourMode](-app-colour-mode.md)(modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, content: @[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)(modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Wrapper composable that allows accessing current light/dark mode in the UI tree using [LocalIsDarkModeActive](-local-is-dark-mode-active.md)`.current`. This wrapper should be used if accessing [AppColour](-app-colour/index.md) in the composition tree. |
