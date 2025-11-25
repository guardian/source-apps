package com.gu.source.components.rating

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.icons.base.Star
import com.gu.source.foundation.icons.base.StarOutline
import com.gu.source.foundation.palette.Neutral10
import com.gu.source.foundation.palette.Neutral93
import com.gu.source.foundation.typography.TextSansBold17
import com.gu.source.utils.PreviewPhoneBothMode

/**
 * A reusable star rating component that displays circular stars with ratings.
 *
 * @param rating The rating value (0-5)
 * @param style The visual style configuration
 * @param modifier Modifier for styling
 */
@Composable
fun SourceRating(
    rating: Int,
    style: RatingStyle,
    modifier: Modifier = Modifier,
) {
    require(rating in MIN_RATING..MAX_STARS) {
        "Rating must be between $MIN_RATING and $MAX_STARS, but was $rating"
    }

    Row(modifier = modifier) {
        repeat(MAX_STARS) { index ->
            val starNumber = index + 1
            val isFilled = starNumber <= rating

            if (index > 0) {
                Spacer(modifier = Modifier.width(style.starSpacing))
            }

            CircularStar(
                isFilled = isFilled,
                backgroundColor = if (isFilled) {
                    style.filledCircleColor
                } else {
                    style.emptyCircleColor
                },
                starColor = style.starIconColor,
                circleSize = style.circleSize.dp,
                starIconSize = style.starIconSize.dp,
            )
        }
    }
}

@Composable
private fun CircularStar(
    isFilled: Boolean,
    backgroundColor: AppColour,
    starColor: AppColour,
    circleSize: Dp,
    starIconSize: Dp,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(circleSize)
            .background(
                color = backgroundColor.current,
                shape = CircleShape,
            ),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            modifier = Modifier.size(starIconSize),
            imageVector = if (isFilled) {
                Source.Icons.Base.Star
            } else {
                Source.Icons.Base.StarOutline
            },
            contentDescription = if (isFilled) "Filled Star" else "Outlined Star",
            tint = starColor.current,
        )
    }
}

private const val MIN_RATING = 0
private const val MAX_STARS = 5

/**
 * Preview composable showing all rating variations.
 */
@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PreviewPhoneBothMode
@Composable
internal fun SourceRatingPreview(modifier: Modifier = Modifier) {
    AppColourMode {
        val labelColour = AppColour(
            Source.Palette.Neutral10,
            Source.Palette.Neutral93,
        )

        Column(
            modifier = modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            // Show rating styles in pairs (two per row)
            val styles = listOf(
                "Default Cards" to RatingStyle.DefaultCards,
                "Feature Cards" to RatingStyle.FeatureCards,
                "Default Article" to RatingStyle.DefaultArticle,
                "Immersive Article" to RatingStyle.ImmersiveArticle,
            )

            styles.chunked(2).forEach { stylePair ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    stylePair.forEach { (styleName, style) ->
                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            Text(
                                text = styleName,
                                style = Source.Typography.TextSansBold17,
                                color = labelColour.current,
                            )

                            // Show all ratings vertically from max to min
                            for (rating in MAX_STARS downTo MIN_RATING) {
                                SourceRating(
                                    rating = rating,
                                    style = style,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}