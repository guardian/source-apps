package com.gu.source.components.rating

/**
 * Model enum used to specify desired star size for ratings.
 * These values correspond to exact design specifications.
 */
enum class RatingSize(
    /** The size value in pixels. */
    val pixels: Int,
) {
    /** 12px star icons - used inside small circles. */
    XSmall(SIZE_XSMALL),

    /** 14px star icons - used inside medium circles. */
    Small(SIZE_SMALL),

    /** 18px circles/stars - used for smaller card contexts. */
    Medium(SIZE_MEDIUM),

    /** 22px circles/stars - used for larger card contexts. */
    Large(SIZE_LARGE),

    /** 28px circles and 18px star icons - used for article contexts. */
    XLarge(SIZE_XLARGE),
}

private const val SIZE_XSMALL = 12
private const val SIZE_SMALL = 14
private const val SIZE_MEDIUM = 18
private const val SIZE_LARGE = 22
private const val SIZE_XLARGE = 28