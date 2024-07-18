@file:OptIn(ExperimentalFoundationApi::class)

package com.gu.source.components.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.presets.palette.Neutral46
import com.gu.source.presets.palette.Neutral86
import com.gu.source.presets.typography.Titlepiece70
import kotlinx.coroutines.delay

private const val ScaleOffsetOne = 0.75F
private const val ScaleOffsetTwo = 0.5F
private val SelectedItemSize = 16.dp

/**
 * A pager progress indicator that displays a set of items that represent the pages in a pager.
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param modifier The modifier to apply to the layout.
 * @param maxVisibleItems The maximum number of items to display at once. Defaults to 5.
 * @param itemSpacing Horizontal spacing between items. Defaults to `4.dp`.
 * @param selectedItemSize The size of each item. Defaults to `16.dp`. The adjacent items will be
 * scaled down by `0.75`, and remaining items by `0.5`.
 * @param itemsVerticalAlignment The vertical alignment to use for the items. Defaults to
 * [Alignment.CenterVertically].
 */
@Composable
fun PagerProgressIndicator(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    maxVisibleItems: Int = 5,
    itemSpacing: Dp = 4.dp,
    selectedItemSize: Dp = SelectedItemSize,
    itemsVerticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
) {
    val listState = rememberLazyListState()

    val widthInPx = with(LocalDensity.current) { selectedItemSize.toPx() }

    LaunchedEffect(pagerState.currentPage) {
        val viewportSize = listState.layoutInfo.viewportSize

        listState.scrollToItem(
            index = pagerState.currentPage,
            scrollOffset = (widthInPx / 2 - viewportSize.width / 2).toInt(),
        )
    }

    LazyRow(
        state = listState,
        modifier = modifier.width((selectedItemSize + itemSpacing) * maxVisibleItems),
        horizontalArrangement = Arrangement.spacedBy(itemSpacing),
        verticalAlignment = itemsVerticalAlignment,
        userScrollEnabled = false,
        contentPadding = PaddingValues(horizontal = itemSpacing),
    ) {
        items(pagerState.pageCount) { pageIndex ->
            PagerProgressItem(
                index = pageIndex,
                selectedIndex = pagerState.currentPage,
                selectedIndicatorSize = selectedItemSize,
                selectedColour = Color.Red,
                unSelectedColour = Color.Gray,
                modifier = Modifier.graphicsLayer {
                    val size = when (pageIndex) {
                        pagerState.currentPage -> 1f
                        pagerState.currentPage - 1, pagerState.currentPage + 1 -> ScaleOffsetOne
                        else -> ScaleOffsetTwo
                    }
                    scaleX = size
                    scaleY = size
                },
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    val pagerState = rememberPagerState(0) { 10 }

    LaunchedEffect(pagerState) {
        while (true) {
            delay(1000)
            pagerState.scrollToPage((pagerState.currentPage + 1) % pagerState.pageCount)
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        HorizontalPager(state = pagerState) {
            Box(
                modifier = Modifier
                    .size(400.dp)
                    .background(Source.Palette.Neutral86, RoundedCornerShape(8.dp)),
            ) {
                Text(
                    text = (it + 1).toString(),
                    style = Source.Typography.Titlepiece70,
                    modifier = Modifier.align(Alignment.Center),
                    color = Source.Palette.Neutral46,
                )
            }
        }
        PagerProgressIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .align(Alignment.CenterHorizontally),
        )
    }
}