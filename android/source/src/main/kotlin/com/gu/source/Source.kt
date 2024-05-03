package com.gu.source

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.gu.source.Source.typography
import com.gu.source.presets.palette.Palette
import com.gu.source.presets.typography.Typography

/**
 * Source is the Guardian's design system. This object provides handles to tokens for colours(TBD),
 * [typography] and more.
 */
object Source {
    /**
     * [TextStyle] presets.
     */
    val typography = Typography

    /**
     * Core [Color] palette tokens.
     */
    val palette = Palette
}