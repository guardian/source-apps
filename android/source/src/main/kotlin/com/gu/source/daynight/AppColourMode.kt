package com.gu.source.daynight

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier

/**
 * Default value for is dark mode active when a composable is not wrapped in local [AppColourMode].
 */
val LocalIsDarkModeActive = compositionLocalOf { false }

/**
 * Wrapper composable that allows accessing current light/dark mode in the UI tree using
 * [LocalIsDarkModeActive]`.current`. This wrapper should be used if accessing [AppColour] in the
 * composition tree.
 *
 * **Dev note**: Add this to top of your composition tree to ensure correct mode is available
 * everywhere. It ensures that [isSystemInDarkTheme] is only called once per composition tree.
 */
@Composable
fun AppColourMode(
    modifier: Modifier = Modifier,
    content: @Composable (modifier: Modifier) -> Unit,
) {
    CompositionLocalProvider(LocalIsDarkModeActive provides isSystemInDarkTheme()) {
        content(modifier)
    }
}