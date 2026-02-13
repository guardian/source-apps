package com.gu.source.navigation

import kotlinx.serialization.Serializable

/** A marker interface for navigation destinations. */
@Serializable
internal sealed interface Destination {

    @Serializable
    object Home : Destination

}