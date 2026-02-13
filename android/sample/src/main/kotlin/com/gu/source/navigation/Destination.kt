package com.gu.source.navigation

import kotlinx.serialization.Serializable

/** A marker interface for navigation destinations. */
@Serializable
internal sealed interface Destination {

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