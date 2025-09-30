package com.gu.source.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.components.badge.SourceBadge
import com.gu.source.components.badge.SourceBadgeSizes
import com.gu.source.components.badge.SourceBadgeStyle

@Preview
@Composable
internal fun BadgePreview(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        SourceBadgeStyle.entries.forEach { type ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth(),
            ) {
                SourceBadgeSizes.entries.forEach { size ->
                    SourceBadge(
                        text = "New!",
                        size = size,
                        style = type,
                        modifier = Modifier.padding(8.dp),
                    )
                }
            }
        }
    }
}