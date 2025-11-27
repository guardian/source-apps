package com.gu.source.components.rating

import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.foundation.palette.BrandAlt200
import com.gu.source.foundation.palette.BrandAlt400
import com.gu.source.foundation.palette.Neutral60
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.foundation.palette.Neutral86

/**
 * Style configuration for rating component colors.
 * This defines only the color scheme, independent of size.
 */
sealed interface RatingStyle {
    /** Color for filled star (theme-aware). */
    val filledStarColor: AppColour

    /** Color for empty star (theme-aware). */
    val emptyStarColor: AppColour

    /** Color for star icon (theme-aware). */
    val starIconColor: AppColour

    /**
     * Default card style with standard theme-aware colors.
     * Used for default card contexts.
     */
    data object DefaultCards : RatingStyle {
        override val filledStarColor: AppColour = AppColour(
            Source.Palette.BrandAlt400,
            Source.Palette.BrandAlt200,
        )
        override val emptyStarColor: AppColour = AppColour(
            Source.Palette.Neutral86,
            Source.Palette.Neutral60,
        )
        override val starIconColor: AppColour = AppColour(Source.Palette.Neutral7)
    }

    /**
     * Feature card style with theme-aware colors.
     * Used for feature card contexts with immersive backgrounds.
     */
    data object FeatureCards : RatingStyle {
        override val filledStarColor: AppColour = AppColour(
            Source.Palette.BrandAlt400,
            Source.Palette.BrandAlt200,
        )
        override val emptyStarColor: AppColour = AppColour(
            Source.Palette.Neutral60,
            Source.Palette.Neutral60,
        )
        override val starIconColor: AppColour = AppColour(Source.Palette.Neutral7)
    }

    /**
     * Default article style with standard theme-aware colors.
     * Used for default article contexts.
     */
    data object DefaultArticle : RatingStyle {
        override val filledStarColor: AppColour = AppColour(
            Source.Palette.BrandAlt400,
            Source.Palette.BrandAlt200,
        )
        override val emptyStarColor: AppColour = AppColour(
            Source.Palette.Neutral86,
            Source.Palette.Neutral60,
        )
        override val starIconColor: AppColour = AppColour(Source.Palette.Neutral7)
    }

    /**
     * Immersive article style with theme-aware colors.
     * Used for immersive article contexts with dark backgrounds.
     */
    data object ImmersiveArticle : RatingStyle {
        override val filledStarColor: AppColour = AppColour(
            Source.Palette.BrandAlt400,
            Source.Palette.BrandAlt200,
        )
        override val emptyStarColor: AppColour = AppColour(
            Source.Palette.Neutral60,
            Source.Palette.Neutral60,
        )
        override val starIconColor: AppColour = AppColour(Source.Palette.Neutral7)
    }
}