package com.gu.source

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.Check
import com.gu.source.icons.ChevronLeft
import com.gu.source.icons.ChevronRight
import com.gu.source.icons.core.Minus
import com.gu.source.icons.core.Plus
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.typography.HeadlineBold20
import com.gu.source.presets.typography.TextSansBold14
import com.gu.source.presets.typography.TextSansBold15

private val icons = mapOf(
    "Base" to listOf(
        Source.Icons.Base.Check,
        Source.Icons.Base.ChevronLeft,
        Source.Icons.Base.ChevronRight,
    ),
    "Core" to listOf(
        Source.Icons.Core.Plus,
        Source.Icons.Core.Minus,
    ),
)

@Composable
internal fun Icons(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral0,
        ).current,
        contentColor = AppColour(
            Source.Palette.Neutral0,
            Source.Palette.Neutral100,
        ).current,
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(vertical = 8.dp),
        ) {
            item {
                Text(
                    text = "Icons",
                    style = Source.Typography.HeadlineBold20,
                    modifier = Modifier.padding(8.dp),
                )
            }
            icons.keys.forEachIndexed { iconIndex, iconKey ->
                item(span = { GridItemSpan(2) }) {
                    Column {
                        Spacer(modifier = Modifier.height(8.dp))
                        HorizontalDivider()
                        Text(
                            text = iconKey,
                            style = Source.Typography.TextSansBold14,
                            modifier = Modifier.padding(8.dp),
                        )
                    }
                }
                items(icons[iconKey].orEmpty()) { icon ->
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .fillMaxWidth(),
                    ) {
                        Text(
                            text = icon.name,
                            modifier = Modifier
                                .align(Alignment.Center),
                            style = Source.Typography.TextSansBold15,
                        )
                        SourceIconButton(
                            icon = icon,
                            priority = SourceButton.Priority.TertiaryOnWhite,
                            contentDescription = null,
                            onClick = {},
                            size = SourceButton.Size.XSmall,
                        )
                    }
                }
            }
        }
    }
}

@Preview(device = "spec:width=1080px,height=8340px,dpi=440")
@Composable
private fun Preview() {
    AppColourMode {
        Icons()
    }
}