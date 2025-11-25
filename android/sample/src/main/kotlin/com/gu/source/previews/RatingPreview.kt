package com.gu.source.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.rating.RatingStyle
import com.gu.source.components.rating.SourceRating
import com.gu.source.daynight.AppColour
import com.gu.source.foundation.typography.TextSansBold17

private const val MIN_RATING = 0
private const val MAX_RATING = 5

@Composable
internal fun RatingPreview(modifier: Modifier = Modifier) {
    val labelColour = AppColour(light = Color.Black, dark = Color.White)
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .background(AppColour(Color.White, Color.Black).current)
            .verticalScroll(scrollState)
            .padding(horizontal = 16.dp, vertical = 8.dp),
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

                        // Show all ratings vertically
                        for (rating in MIN_RATING..MAX_RATING) {
                            SourceRating(
                                rating = rating,
                                style = style,
                            )
                        }
                    }
                }
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}