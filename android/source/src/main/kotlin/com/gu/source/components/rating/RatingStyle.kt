package com.gu.source.components.rating

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.foundation.palette.BrandAlt200
import com.gu.source.foundation.palette.BrandAlt400
import com.gu.source.foundation.palette.Neutral60
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.foundation.palette.Neutral86

/**
 * Style configuration for rating component.
 * This defines the visual appearance including colors, sizes, and spacing.
 */
sealed interface RatingStyle {
    /** Color for filled circle background (theme-aware). */
    val filledCircleColor: AppColour

    /** Color for empty circle background (theme-aware). */
    val emptyCircleColor: AppColour

    /** Color for star icon (theme-aware). */
    val starIconColor: AppColour

    /** Size of the circular background. */
    val circleSize: RatingSize

    /** Size of the star icon inside the circle. */
    val starIconSize: RatingSize

    /** Spacing between stars. */
    val starSpacing: Dp

    /**
     * Default card style with proper theme-aware colors.
     * Uses 18dp circle background with 12dp star icon and 1dp spacing.
     */
    data object DefaultCards : RatingStyle {
        override val filledCircleColor: AppColour = AppColour(
            Source.Palette.BrandAlt400,
            Source.Palette.BrandAlt200,
        )
        override val emptyCircleColor: AppColour = AppColour(
            Source.Palette.Neutral86,
            Source.Palette.Neutral60,
        )
        override val starIconColor: AppColour = AppColour(Source.Palette.Neutral7)
        override val circleSize: RatingSize = RatingSize.Medium
        override val starIconSize: RatingSize = RatingSize.XSmall
        override val starSpacing: Dp = 1.dp
    }

    /**
     * Feature card style with proper theme-aware colors.
     * Uses 22dp circle background with 14dp star icon and 2dp spacing.
     */
    data object FeatureCards : RatingStyle {
        override val filledCircleColor: AppColour = AppColour(
            Source.Palette.BrandAlt400,
            Source.Palette.BrandAlt200,
        )
        override val emptyCircleColor: AppColour = AppColour(
            Source.Palette.Neutral86,
            Source.Palette.Neutral60,
        )
        override val starIconColor: AppColour = AppColour(Source.Palette.Neutral7)
        override val circleSize: RatingSize = RatingSize.Large
        override val starIconSize: RatingSize = RatingSize.Small
        override val starSpacing: Dp = 2.dp
    }

    /**
     * Default article style with proper theme-aware colors.
     * Uses 28dp circle background with 18dp star icon and 2dp spacing.
     */
    data object DefaultArticle : RatingStyle {
        override val filledCircleColor: AppColour = AppColour(
            Source.Palette.BrandAlt400,
            Source.Palette.BrandAlt200,
        )
        override val emptyCircleColor: AppColour = AppColour(
            Source.Palette.Neutral86,
            Source.Palette.Neutral60,
        )
        override val starIconColor: AppColour = AppColour(Source.Palette.Neutral7)
        override val circleSize: RatingSize = RatingSize.XLarge
        override val starIconSize: RatingSize = RatingSize.Medium
        override val starSpacing: Dp = 2.dp
    }

    /**
     * Immersive article style with proper theme-aware colors.
     * Uses 28dp circle background with 18dp star icon and 2dp spacing.
     */
    data object ImmersiveArticle : RatingStyle {
        override val filledCircleColor: AppColour = AppColour(
            Source.Palette.BrandAlt400,
            Source.Palette.BrandAlt200,
        )
        override val emptyCircleColor: AppColour = AppColour(
            Source.Palette.Neutral86,
            Source.Palette.Neutral60,
        )
        override val starIconColor: AppColour = AppColour(Source.Palette.Neutral7)
        override val circleSize: RatingSize = RatingSize.XLarge
        override val starIconSize: RatingSize = RatingSize.Medium
        override val starSpacing: Dp = 2.dp
    }
}