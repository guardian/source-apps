package com.gu.source.previews

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.SampleTopAppBar
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.foundation.icons.base.ArrowLeftStraight
import com.gu.source.foundation.palette.Neutral0
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.utils.isTabletDevice

private const val GRID_COUNT_TABLET = 4
private const val GRID_COUNT_PHONE = 2

@Composable
internal fun getGridCount(): Int = if (isTabletDevice()) GRID_COUNT_TABLET else GRID_COUNT_PHONE

@Composable
internal fun PreviewScaffold(
    title: String,
    onBackPress: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable (Modifier) -> Unit,
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            SampleTopAppBar(
                title = { Text(text = title) },
                navigationIcon = {
                    IconButton(onClick = onBackPress) {
                        Icon(
                            imageVector = Source.Icons.Base.ArrowLeftStraight,
                            contentDescription = null,
                        )
                    }
                },
            )
        },
        containerColor = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral0,
        ).current,
        contentColor = AppColour(
            Source.Palette.Neutral0,
            Source.Palette.Neutral100,
        ).current,
    ) {
        content(
            Modifier
                .padding(it)
                .padding(16.dp),
        )
    }
}