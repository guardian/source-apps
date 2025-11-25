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
import com.gu.source.foundation.typography.TextSansBold17
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.pxToDp

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
            verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            RatingStylePreview(
                title = "Default Cards",
                style = RatingStyle.DefaultCards,
                labelColour = labelColour,
            )

            RatingStylePreview(
                title = "Feature Cards",
                style = RatingStyle.FeatureCards,
                labelColour = labelColour,
            )

            RatingStylePreview(
                title = "Default Article",
                style = RatingStyle.DefaultArticle,
                labelColour = labelColour,
            )

            RatingStylePreview(
                title = "Immersive Article",
                style = RatingStyle.ImmersiveArticle,
                labelColour = labelColour,
            )
        }
    }
}

@Composable
private fun RatingStylePreview(
    title: String,
    style: RatingStyle,
    labelColour: AppColour,
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = title,
            style = Source.Typography.TextSansBold17,
            color = labelColour.current,
        )
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            for (rating in MIN_RATING..MAX_STARS) {
                SourceRating(
                    rating = rating,
                    style = style,
                )
            }
        }
    }
}