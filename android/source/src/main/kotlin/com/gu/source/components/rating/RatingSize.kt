package com.gu.source.components.rating

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Rating size specification with circle size, star icon size and spacing.
 * These values correspond to exact design specifications from Figma.
 */
enum class RatingSize(
    /** The circle background size in dp. */
    val circleSize: Dp,
    /** The star icon size in dp. */
    val starIconSize: Dp,
    /** The spacing between stars in dp. */
    val spacing: Dp,
) {
    /** 18dp circles with 12dp star icons and 1dp gap - for Fronts context. */
    Small(circleSize = 18.dp, starIconSize = 12.dp, spacing = 1.dp),

    /** 22dp circles with 14dp star icons and 2dp gap - for Fronts context. */
    Medium(circleSize = 22.dp, starIconSize = 14.dp, spacing = 2.dp),

    /** 28dp circles with 18dp star icons and 2dp gap - for Articles context. */
    Large(circleSize = 28.dp, starIconSize = 18.dp, spacing = 2.dp),
}