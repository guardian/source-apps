package com.gu.source.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewWrapperProvider
import com.gu.source.daynight.AppColourMode

/**
 * Preview wrapper provider class that wraps the preview with [com.gu.source.daynight.AppColourMode].
 *
 * Usage:
 * ```kotlin
 * @PreviewWrapper(AppColourWrapper::class)
 * @PreviewPhoneBothMode
 * @Composable
 * fun MyComposablePreview() {
 *     MyComposable()
 * }
 * ```
 */
class AppColourWrapper : PreviewWrapperProvider {
    @Composable
    override fun Wrap(content: @Composable (() -> Unit)) {
        AppColourMode {
            content()
        }
    }
}