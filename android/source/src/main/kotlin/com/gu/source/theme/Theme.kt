package com.gu.source.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import com.gu.source.Source
import com.gu.source.daynight.AppColourMode

/**
 * Default value for is dark mode active when a composable is not wrapped in local [AppColourMode].
 */
val LocalSourceTheme = compositionLocalOf { Source.Theme.Core }

/**
 * Wrapper composable that sets [Source.Theme.Core] as the active theme for its children.
 * @param modifier Modifier passed through to [content]
 * @param content
 */
@Composable
fun SourceCoreTheme(
    modifier: Modifier = Modifier,
    content: @Composable (modifier: Modifier) -> Unit,
) {
    CompositionLocalProvider(LocalSourceTheme provides Source.Theme.Core) {
        content(modifier)
    }
}

/**
 * Wrapper composable that sets [Source.Theme.ReaderRevenue] as the active theme for its children.
 * @param modifier Modifier passed through to [content]
 * @param content
 */
@Composable
fun ReaderRevenueTheme(
    modifier: Modifier = Modifier,
    content: @Composable (modifier: Modifier) -> Unit,
) {
    CompositionLocalProvider(LocalSourceTheme provides Source.Theme.ReaderRevenue) {
        content(modifier)
    }
}