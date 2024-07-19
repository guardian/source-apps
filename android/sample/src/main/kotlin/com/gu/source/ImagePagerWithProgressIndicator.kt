@file:OptIn(ExperimentalFoundationApi::class)

package com.gu.source

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.components.pager.PagerProgressBar
import com.gu.source.utils.TabletBothModePreviews

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

@Preview
@TabletBothModePreviews
@Composable
private fun Preview() {
    Box(modifier = Modifier.fillMaxSize()) {
        ImagePagerWithProgressIndicator(modifier = Modifier.align(Alignment.TopCenter))
    }
}