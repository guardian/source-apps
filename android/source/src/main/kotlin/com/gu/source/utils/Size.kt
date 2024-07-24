package com.gu.source.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

/**
 * Whether the current device is a tablet. Equivalent to `sw600dp` qualifier in Android.
 */
@Suppress("MagicNumber")
@Composable
fun isTabletDevice() = LocalConfiguration.current.smallestScreenWidthDp >= 600