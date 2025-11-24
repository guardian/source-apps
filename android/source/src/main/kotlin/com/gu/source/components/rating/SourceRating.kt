package com.gu.source.components.rating

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.R
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Neutral10
import com.gu.source.foundation.palette.Neutral93
import com.gu.source.foundation.typography.TextSans14
import com.gu.source.foundation.typography.TextSansBold17
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.pxToDp

/**
 * A reusable star rating component that displays circular stars with ratings.
 *
 * @param rating The rating value (1-5)
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
        val circleSize = style.circleSize.pixels.pxToDp()
        val starIconSize = style.starIconSize.pixels.pxToDp()

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
                circleSize = circleSize,
                starIconSize = starIconSize,
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
            painter = painterResource(
                if (isFilled) {
                    R.drawable.ic_vector_star_filled
                } else {
                    R.drawable.ic_vector_star_outlined
                },
            ),
            contentDescription = if (isFilled) "Filled Star" else "Outlined Star",
            tint = starColor.current,
        )
    }
}

private const val MIN_RATING = 1
private const val MAX_STARS = 5

/**
 * Preview composable showing all rating variations.
 */
@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PreviewPhoneBothMode
@Composable
internal fun SourceRatingPreview(
    modifier: Modifier = Modifier,
) {
    AppColourMode {
        val labelColour = AppColour(
            Source.Palette.Neutral10,
            Source.Palette.Neutral93,
        )

        Column(
            modifier = modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            // DefaultCards style
            Text(
                text = "Default Cards (18px circle, 12px star, 1px spacing)",
                style = Source.Typography.TextSansBold17,
                color = labelColour.current,
            )
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                for (rating in MIN_RATING..MAX_STARS) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Text(
                            text = "Rating $rating:",
                            style = Source.Typography.TextSans14,
                            color = labelColour.current,
                            modifier = Modifier.width(80.dp),
                        )
                        SourceRating(
                            rating = rating,
                            style = RatingStyle.DefaultCards,
                        )
                    }
                }
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

            // FeatureCards style
            Text(
                text = "Feature Cards (22px circle, 14px star, 2px spacing)",
                style = Source.Typography.TextSansBold17,
                color = labelColour.current,
            )
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                for (rating in MIN_RATING..MAX_STARS) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Text(
                            text = "Rating $rating:",
                            style = Source.Typography.TextSans14,
                            color = labelColour.current,
                            modifier = Modifier.width(80.dp),
                        )
                        SourceRating(
                            rating = rating,
                            style = RatingStyle.FeatureCards,
                        )
                    }
                }
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

            // DefaultArticle style
            Text(
                text = "Default Article (28px circle, 18px star, 2px spacing)",
                style = Source.Typography.TextSansBold17,
                color = labelColour.current,
            )
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                for (rating in MIN_RATING..MAX_STARS) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Text(
                            text = "Rating $rating:",
                            style = Source.Typography.TextSans14,
                            color = labelColour.current,
                            modifier = Modifier.width(80.dp),
                        )
                        SourceRating(
                            rating = rating,
                            style = RatingStyle.DefaultArticle,
                        )
                    }
                }
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

            // ImmersiveArticle style
            Text(
                text = "Immersive Article (28px circle, 18px star, 2px spacing)",
                style = Source.Typography.TextSansBold17,
                color = labelColour.current,
            )
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                for (rating in MIN_RATING..MAX_STARS) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        Text(
                            text = "Rating $rating:",
                            style = Source.Typography.TextSans14,
                            color = labelColour.current,
                            modifier = Modifier.width(80.dp),
                        )
                        SourceRating(
                            rating = rating,
                            style = RatingStyle.ImmersiveArticle,
                        )
                    }
                }
            }
        }
    }
}