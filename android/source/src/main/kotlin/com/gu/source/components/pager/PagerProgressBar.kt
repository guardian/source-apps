@file:OptIn(ExperimentalFoundationApi::class)

package com.gu.source.components.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.utils.isTabletDevice

@Composable
fun PagerProgressBar(
    pagerState: PagerState,
    selectedIndicatorColour: Color,
    unSelectedIndicatorColour: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
//            .padding(top = 8.dp, bottom = 20.dp)
            .height(56.dp)
            .fillMaxWidth(),
    ) {
        PagerProgressIndicator(
            pagerState = pagerState,
            selectedIndicatorColour = selectedIndicatorColour,
            unSelectedIndicatorColour = unSelectedIndicatorColour,
            modifier = Modifier.align(Alignment.Center),
        )
        if (isTabletDevice()) {
            // TODO: 19/07/2024 Add page switchers here
            Text("Add page switchers here", modifier = Modifier.align(Alignment.CenterEnd))
        }
    }
}

@Preview(name = "phone")
@Preview(
    device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait",
    name = "tablet",
)
@Composable
private fun Preview() {
    PagerProgressBar(
        pagerState = rememberPagerState(1) { 10 },
        selectedIndicatorColour = Color.Red,
        unSelectedIndicatorColour = Color.Gray,
    )
}