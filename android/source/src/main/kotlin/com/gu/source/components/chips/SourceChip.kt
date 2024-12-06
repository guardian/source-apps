package com.gu.source.components.chips

import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Object defining property models for `SourceChip`s.
 */
object SourceChip {
    /** Supported `SourceChip` sizes. */
    enum class Size(internal val height: Dp) {
        Small(32.dp),
        Medium(40.dp),
    }

    /**
     * Represents the visual shape and style of a chip component.
     *
     * @property border The border stroke of the chip, including thickness and color.
     * @property fillColour The background color of the chip.
     * @property shape The shape of the chip (e.g., rounded corners, rectangle).
     */
    data class Style(
        val border: BorderStroke,
        val fillColour: Color,
        val shape: Shape,
    )
}