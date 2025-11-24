package com.gu.source.components.rating

/**
 * Model enum used to specify desired star size for ratings.
 * These values correspond to exact design specifications.
 */
@Suppress("MagicNumber")
enum class RatingSize(
    /** The size value in pixels. */
    val pixels: Int,
) {
    /** 12px star icons - used inside small circles. */
    XSmall(12),

    /** 14px star icons - used inside medium circles. */
    Small(14),

    /** 18px circles/stars - used for smaller card contexts. */
    Medium(18),

    /** 22px circles/stars - used for larger card contexts. */
    Large(22),

    /** 28px circles and 18px star icons - used for article contexts. */
    XLarge(28),
}