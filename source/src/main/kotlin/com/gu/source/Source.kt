package com.gu.source

import androidx.compose.ui.text.TextStyle
import com.gu.source.Source.typography
import com.gu.source.typography.Typography

/**
 * Source is the Guardian's design system. This object provides handles to tokens for colours(TBD),
 * [typography] and more.
 * @property typography Provides source defined [TextStyle]s for use in the Guardian apps.
 */
object Source {
    val typography = Typography
}