//[source](../../index.md)/[com.gu.source.daynight](index.md)/[AppColourMode](-app-colour-mode.md)

# AppColourMode

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [AppColourMode](-app-colour-mode.md)(modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, content: @[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)(modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))

Wrapper composable that allows accessing current light/dark mode in the UI tree using [LocalIsDarkModeActive](-local-is-dark-mode-active.md)`.current`. This wrapper should be used if accessing [AppColour](-app-colour/index.md) in the composition tree.

**Dev note**: Add this to top of your composition tree to ensure correct mode is available everywhere. It ensures that [isSystemInDarkTheme](https://developer.android.com/reference/kotlin/androidx/compose/foundation/package-summary.html) is only called once per composition tree.
