package com.gu.source

import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gu.source.daynight.AppColour
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.foundation.palette.Neutral97

private val topBarBackgroundColour = AppColour(
    light = Source.Palette.Neutral97,
    dark = Source.Palette.Neutral7,
)
private val topBarContentColour = AppColour(
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
            containerColor = topBarBackgroundColour.current,
            titleContentColor = topBarContentColour.current,
            navigationIconContentColor = topBarContentColour.current,
        ),
    )
}