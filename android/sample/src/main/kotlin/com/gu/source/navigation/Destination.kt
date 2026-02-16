package com.gu.source.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

/** A marker interface for navigation destinations. */
@Serializable
internal sealed interface Destination : NavKey {

    @Serializable
    object Home : Destination

    @Serializable
    object PalettePreview : Destination

    @Serializable
    object PagerProgressBarPreview : Destination

    @Serializable
    object ButtonsPreview : Destination

    @Serializable
    object IconsPreview : Destination

    @Serializable
    object AlertBannerPreview : Destination

    @Serializable
    object ChipsPreview : Destination

    @Serializable
    object BadgesPreview : Destination

    @Serializable
    object StarRatingsPreview : Destination
}