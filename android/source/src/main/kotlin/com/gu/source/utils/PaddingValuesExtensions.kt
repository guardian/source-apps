package com.gu.source.utils

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection

/**
 * Adds together the values of the given [PaddingValues] and returns updated [PaddingValues].
 */
infix operator fun PaddingValues.plus(other: PaddingValues): PaddingValues {
    val direction = LayoutDirection.Ltr
    return PaddingValues(
        top = calculateTopPadding() + other.calculateTopPadding(),
        end = calculateEndPadding(direction) + other.calculateEndPadding(direction),
        bottom = calculateBottomPadding() + other.calculateBottomPadding(),
        start = calculateStartPadding(direction) + other.calculateStartPadding(direction),
    )
}

/**
 * Updates the given [PaddingValues] with the given [Dp] values and returns updated [PaddingValues].
 */
fun PaddingValues.copy(
    top: Dp = calculateTopPadding(),
    start: Dp = calculateStartPadding(LayoutDirection.Ltr),
    end: Dp = calculateEndPadding(LayoutDirection.Ltr),
    bottom: Dp = calculateBottomPadding(),
) = PaddingValues(
    top = top,
    start = start,
    end = end,
    bottom = bottom,
)