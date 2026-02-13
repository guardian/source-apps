package com.gu.source.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.rating.RatingSize
import com.gu.source.components.rating.RatingStyle
import com.gu.source.components.rating.SourceRating
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.typography.TextSansBold17

private const val MIN_RATING = 0
private const val MAX_RATING = 5

@Composable
internal fun RatingPreview(
    onBackPress: () -> Unit,
    modifier: Modifier = Modifier,
) {
    PreviewScaffold("Star ratings", onBackPress, modifier) {

        val labelColour = AppColour(light = Color.Black, dark = Color.White)
        val subtitleColour = AppColour(light = Color.Gray, dark = Color.LightGray)
        val scrollState = rememberScrollState()

        Column(
            modifier = it
                .background(AppColour(Color.White, Color.Black).current)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            // Title
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

            // Show style variations with all ratings
            Text(
                text = "Color Styles",
                style = Source.Typography.TextSansBold17,
                color = labelColour.current,
            )

            // Show all four style variations
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
                            for (rating in MAX_RATING downTo MIN_RATING) {
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

@PreviewLightDark
@Composable
private fun Preview() {
    AppColourMode { RatingPreview({}) }
}