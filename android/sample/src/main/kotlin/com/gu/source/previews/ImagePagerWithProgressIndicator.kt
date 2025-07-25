package com.gu.source.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.pager.PagerProgressBar
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Neutral10
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.PreviewTabletBothMode

@Suppress("MagicNumber")
@Composable
internal fun ImagePagerWithProgressIndicator(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState { 10 }
    Column(
        modifier = modifier
            .padding(8.dp)
            .widthIn(max = 695.dp),
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .aspectRatio(695 / 544f)
                .clip(RoundedCornerShape(16.dp)),
        ) { page ->
            SampleImage(
                randomKey = page,
                modifier = Modifier.fillMaxWidth(),
            )
        }

        PagerProgressBar(pagerState = pagerState)
    }
}

@PreviewPhoneBothMode
@PreviewTabletBothMode
@Composable
private fun Preview() {
    AppColourMode {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    AppColour(
                        light = Source.Palette.Neutral100,
                        dark = Source.Palette.Neutral10,
                    ).current,
                ),
        ) {
            ImagePagerWithProgressIndicator(modifier = Modifier.align(Alignment.TopCenter))
        }
    }
}