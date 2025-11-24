@file:Suppress("MagicNumber")

package com.gu.source.components.rating

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.foundation.palette.BrandAlt200
import com.gu.source.foundation.palette.BrandAlt400
import com.gu.source.foundation.palette.Neutral60
import com.gu.source.foundation.palette.Neutral7

/**
 * Style configuration for rating component.
 * This defines the visual appearance including colors, sizes, and spacing.
 */
sealed interface RatingStyle {
    /** Color for filled circle background in light mode. */
    val lightFilledCircleColor: Color

    /** Color for filled circle background in dark mode. */
    val darkFilledCircleColor: Color

    /** Color for empty circle background (same for light/dark). */
    val emptyCircleColor: Color

    /** Color for star icon (same for light/dark). */
    val starIconColor: Color

    /** Size of the circular background. */
    val circleSize: RatingSize

    /** Size of the star icon inside the circle. */
    val starIconSize: RatingSize

    /** Spacing between stars. */
    val starSpacing: Dp

    /**
     * Default card style with proper theme-aware colors.
     * Uses 18px circle background with 12px star icon and 1px spacing.
     */
    data object DefaultCards : RatingStyle {
        override val lightFilledCircleColor: Color = Source.Palette.BrandAlt400
        override val darkFilledCircleColor: Color = Source.Palette.BrandAlt200
        override val emptyCircleColor: Color = Source.Palette.Neutral60
        override val starIconColor: Color = Source.Palette.Neutral7
        override val circleSize: RatingSize = RatingSize.Medium
        override val starIconSize: RatingSize = RatingSize.XSmall
        override val starSpacing: Dp = 1.dp
    }

    /**
     * Feature card style with proper theme-aware colors.
     * Uses 22px circle background with 14px star icon and 2px spacing.
     */
    data object FeatureCards : RatingStyle {
        override val lightFilledCircleColor: Color = Source.Palette.BrandAlt400
        override val darkFilledCircleColor: Color = Source.Palette.BrandAlt200
        override val emptyCircleColor: Color = Source.Palette.Neutral60
        override val starIconColor: Color = Source.Palette.Neutral7
        override val circleSize: RatingSize = RatingSize.Large
        override val starIconSize: RatingSize = RatingSize.Small
        override val starSpacing: Dp = 2.dp
    }

    /**
     * Default article style with proper theme-aware colors.
     * Uses 28px circle background with 18px star icon and 2px spacing.
     */
    data object DefaultArticle : RatingStyle {
        override val lightFilledCircleColor: Color = Source.Palette.BrandAlt400
        override val darkFilledCircleColor: Color = Source.Palette.BrandAlt200
        override val emptyCircleColor: Color = Source.Palette.Neutral60
        override val starIconColor: Color = Source.Palette.Neutral7
        override val circleSize: RatingSize = RatingSize.XLarge
        override val starIconSize: RatingSize = RatingSize.Medium
        override val starSpacing: Dp = 2.dp
    }

    /**
     * Immersive article style with proper theme-aware colors.
     * Uses 28px circle background with 18px star icon and 2px spacing.
     */
    data object ImmersiveArticle : RatingStyle {
        override val lightFilledCircleColor: Color = Source.Palette.BrandAlt400
        override val darkFilledCircleColor: Color = Source.Palette.BrandAlt200
        override val emptyCircleColor: Color = Source.Palette.Neutral60
        override val starIconColor: Color = Source.Palette.Neutral7
        override val circleSize: RatingSize = RatingSize.XLarge
        override val starIconSize: RatingSize = RatingSize.Medium
        override val starSpacing: Dp = 2.dp
    }
}