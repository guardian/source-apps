package com.gu.source

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.*
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.typography.HeadlineBold20
import com.gu.source.presets.typography.TextSansBold15

private val icons = listOf(
    Source.Icons.Base.ChevronLeftSmall,
    Source.Icons.Base.ChevronRightSmall,
    Source.Icons.Base.ChevronLeftSingle,
    Source.Icons.Base.ChevronRightSingle,
    Source.Icons.Base.ChevronLeftDouble,
    Source.Icons.Base.ChevronRightDouble,
    Source.Icons.Base.Minus,
    Source.Icons.Base.Plus,
    Source.Icons.Base.Check,
)

@Composable
internal fun IconsPreview(modifier: Modifier = Modifier) {
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
            item(span = { GridItemSpan(2) }) {
                Text(
                    text = "Icons",
                    style = Source.Typography.HeadlineBold20,
                    modifier = Modifier.padding(8.dp),
                )
            }
            items(icons) { icon ->
                Row(
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    SourceIconButton(
                        icon = icon,
                        priority = SourceButton.Priority.TertiaryOnWhite,
                        contentDescription = null,
                        onClick = {},
                        size = SourceButton.Size.XSmall,
                    )
                    Text(
                        text = icon.name,
                        modifier = Modifier.weight(1f),
                        style = Source.Typography.TextSansBold15,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                    )
                }
            }
        }
    }
}

@Preview(device = "spec:width=1080px,height=8340px,dpi=440")
@Composable
private fun Preview() {
    AppColourMode {
        IconsPreview()
    }
}