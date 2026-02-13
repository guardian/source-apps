package com.gu.source

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gu.source.daynight.AppColour
import com.gu.source.foundation.icons.base.ArrowLeftStraight
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.foundation.palette.Neutral97

private val backgroundColour = AppColour(
    light = Source.Palette.Neutral97,
    dark = Source.Palette.Neutral7,
)
private val contentColour = AppColour(
    light = Source.Palette.Neutral7,
    dark = Source.Palette.Neutral97,
)

@Composable
internal fun SampleTopAppBar(
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    title: @Composable () -> Unit,
) {
    TopAppBar(
        title = title,
        navigationIcon = navigationIcon,
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = backgroundColour.current,
            titleContentColor = contentColour.current,
            navigationIconContentColor = contentColour.current,
        ),
    )
}

@Composable
internal fun SampleTopAppBarWithBack(
    onBackPress: () -> Unit,
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
) {
    SampleTopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = {
            IconButton(onClick = onBackPress) {
                Icon(
                    imageVector = Source.Icons.Base.ArrowLeftStraight,
                    contentDescription = null,
                )
            }
        },
    )
}