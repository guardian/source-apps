package com.gu.source.components.rating

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Model enum used to specify desired star size for ratings.
 * These values correspond to exact design specifications.
 */
enum class RatingSize(
    /** The size value in dp. */
    val dp: Dp,
) {
    /** 12dp star icons - used inside small circles. */
    XSmall(SIZE_XSMALL),

    /** 14dp star icons - used inside medium circles. */
    Small(SIZE_SMALL),

    /** 18dp circles/stars - used for smaller card contexts. */
    Medium(SIZE_MEDIUM),

    /** 22dp circles/stars - used for larger card contexts. */
    Large(SIZE_LARGE),

    /** 28dp circles and 18dp star icons - used for article contexts. */
    XLarge(SIZE_XLARGE),
}

private val SIZE_XSMALL = 12.dp
private val SIZE_SMALL = 14.dp
private val SIZE_MEDIUM = 18.dp
private val SIZE_LARGE = 22.dp
private val SIZE_XLARGE = 28.dp