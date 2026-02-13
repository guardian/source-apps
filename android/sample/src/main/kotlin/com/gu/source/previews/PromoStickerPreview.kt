package com.gu.source.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.badge.SourceBadge
import com.gu.source.components.badge.SourceBadgeSizes
import com.gu.source.components.badge.SourceBadgeStyle
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.typography.TextSansBold17

@Composable
internal fun BadgePreview(onBackPress: () -> Unit, modifier: Modifier = Modifier) {
    PreviewScaffold("Promo sticker", onBackPress, modifier) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(getGridCount()),
            modifier = it,
            verticalArrangement = Arrangement.Center,
        ) {
            items(SourceBadgeSizes.entries.size) { size ->
                Text(
                    SourceBadgeSizes.entries[size].name,
                    style = Source.Typography.TextSansBold17,
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(bottom = 16.dp),
                )
            }
            items(SourceBadgeSizes.entries.size * SourceBadgeStyle.entries.size) { index ->
                val type = SourceBadgeStyle.entries[index / SourceBadgeSizes.entries.size]
                val size = SourceBadgeSizes.entries[index % SourceBadgeSizes.entries.size]
                SourceBadge(
                    text = type.name,
                    size = size,
                    style = type,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .wrapContentSize(),
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    AppColourMode { BadgePreview({}) }
}