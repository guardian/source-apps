package com.gu.source.components.rating

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.icons.base.Star
import com.gu.source.foundation.icons.base.StarOutline
import com.gu.source.foundation.palette.Neutral10
import com.gu.source.foundation.palette.Neutral60
import com.gu.source.foundation.palette.Neutral86
import com.gu.source.foundation.palette.Neutral93
import com.gu.source.foundation.typography.TextSansBold17
import com.gu.source.utils.PreviewPhoneBothMode

/**
 * A reusable star rating component that displays circular stars with ratings.
 *
 * @param rating The rating value (0-5)
 * @param size The size configuration for stars and spacing
 * @param style The color style configuration (defaults to DefaultCards style)
 * @param modifier Modifier for styling
 */
@Composable
fun SourceRating(
    rating: Int,
    size: RatingSize,
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
                Spacer(modifier = Modifier.width(size.spacing))
            }

            CircularStar(
                isFilled = isFilled,
                backgroundColor = if (isFilled) {
                    style.filledStarColor
                } else {
                    style.emptyStarColor
                },
                starColor = style.starIconColor,
                circleSize = size.circleSize,
                starIconSize = size.starIconSize,
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
        val subtitleColour = AppColour(
            Source.Palette.Neutral60,
            Source.Palette.Neutral86,
        )

        Column(
            modifier = modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            // Show sizing and spacing
            Text(
                text = "Sizing & spacing",
                style = Source.Typography.TextSansBold17,
                color = labelColour.current,
            )

            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                // Fronts section
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(
                        text = "Fronts",
                        style = Source.Typography.TextSansBold17,
                        color = labelColour.current,
                    )

                    // Small - 18dp | 12dp star
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Text(
                            text = "18dp | 12dp star",
                            style = Source.Typography.TextSansBold17,
                            color = subtitleColour.current,
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            SourceRating(
                                rating = 5,
                                size = RatingSize.Small,
                                style = RatingStyle.DefaultCards,
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "→ 1dp gap",
                                style = Source.Typography.TextSansBold17,
                                color = AppColour(Color.Blue, Color.Cyan).current,
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    // Medium - 22dp | 14dp star
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Text(
                            text = "22dp | 14dp star",
                            style = Source.Typography.TextSansBold17,
                            color = subtitleColour.current,
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            SourceRating(
                                rating = 5,
                                size = RatingSize.Medium,
                                style = RatingStyle.DefaultCards,
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "→ 2dp gap",
                                style = Source.Typography.TextSansBold17,
                                color = AppColour(Color.Blue, Color.Cyan).current,
                            )
                        }
                    }
                }

                // Articles section
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(
                        text = "Articles",
                        style = Source.Typography.TextSansBold17,
                        color = labelColour.current,
                    )

                    // Large - 28dp | 18dp star
                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Text(
                            text = "28dp | 18dp star",
                            style = Source.Typography.TextSansBold17,
                            color = subtitleColour.current,
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            SourceRating(
                                rating = 5,
                                size = RatingSize.Large,
                                style = RatingStyle.DefaultArticle,
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "→ 2dp gap",
                                style = Source.Typography.TextSansBold17,
                                color = AppColour(Color.Blue, Color.Cyan).current,
                            )
                        }
                    }
                }
            }

            // Show style variations
            Text(
                text = "Color Styles",
                style = Source.Typography.TextSansBold17,
                color = labelColour.current,
            )

            // Show all four styles in a 2x2 grid
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
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                        ) {
                            Text(
                                text = styleName,
                                style = Source.Typography.TextSansBold17,
                                color = labelColour.current,
                            )
                            for (rating in MAX_STARS downTo MIN_RATING) {
                                SourceRating(
                                    rating = rating,
                                    size = RatingSize.Medium,
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