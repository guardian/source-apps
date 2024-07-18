@file:OptIn(ExperimentalFoundationApi::class)

package com.gu.source.components.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.presets.palette.Neutral46
import com.gu.source.presets.palette.Neutral73
import com.gu.source.presets.palette.Neutral86
import com.gu.source.presets.palette.Sport500
import com.gu.source.presets.typography.Titlepiece70
import kotlinx.coroutines.delay

private const val DefaultUnselectedItemScaling = 0.5F
private val DefaultSelectedItemSize = 16.dp
private val DefaultItemSpacing = 4.dp
private const val DefaultIndicatorCount = 5
private const val DefaultNumberOfItemsToScale = 2

/**
 * A pager progress indicator that displays progress indicators to represent progress in a
 * [HorizontalPager] or a [VerticalPager].
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param selectedIndicatorColour The colour to use for the selected page indicator.
 * @param unSelectedIndicatorColour The colour to use for the unselected page indicator.
 * @param modifier The modifier to apply to the layout.
 * @param maxIndicatorCount The maximum number of indicators to display. Defaults to 5, maximum
 * is constrained to the number of pages in the [PagerState].
 * @param indicatorSpacing Horizontal spacing between indicator. Defaults to `4.dp`.
 * @param indicatorShape The shape to use for the indicator. Defaults to [CircleShape].
 * @param selectedItemSize The size of each item. Defaults to `16.dp`. The adjacent items will be
 * scaled down by `0.75`, and remaining items by `0.5`.
 * @param unselectedItemScaling The scaling factor to apply to unselected items. Defaults to `0.5`.
 * @param numberOfItemsToScale The number of items to spread scaling across on each side of
 * selected item.
 * @param itemsVerticalAlignment The vertical alignment to use for the items. Defaults to
 * [Alignment.CenterVertically].
 */
// TODO: 18/07/2024 Even number of items
@Composable
fun PagerProgressIndicator(
    pagerState: PagerState,
    selectedIndicatorColour: Color,
    unSelectedIndicatorColour: Color,
    modifier: Modifier = Modifier,
    maxIndicatorCount: Int = DefaultIndicatorCount,
    indicatorSpacing: Dp = DefaultItemSpacing,
    indicatorShape: Shape = CircleShape,
    selectedItemSize: Dp = DefaultSelectedItemSize,
    unselectedItemScaling: Float = DefaultUnselectedItemScaling,
    numberOfItemsToScale: Int = DefaultNumberOfItemsToScale,
    itemsVerticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
) {
    val listState = rememberLazyListState()

    val adjustedMaxItems = maxIndicatorCount.coerceAtMost(pagerState.pageCount)
    val indicatorWidth = selectedItemSize * adjustedMaxItems +
        indicatorSpacing * (adjustedMaxItems - 1)

    val widthInPx = with(LocalDensity.current) { selectedItemSize.toPx() }
    LaunchedEffect(pagerState.currentPage) {
        val viewportSize = listState.layoutInfo.viewportSize

        listState.animateScrollToItem(
            index = pagerState.currentPage,
            scrollOffset = (widthInPx / 2 - viewportSize.width / 2).toInt(),
        )
    }

    LazyRow(
        state = listState,
        modifier = modifier.width(indicatorWidth),
        horizontalArrangement = Arrangement.spacedBy(indicatorSpacing),
        verticalAlignment = itemsVerticalAlignment,
        userScrollEnabled = false,
        contentPadding = PaddingValues(horizontal = indicatorSpacing),
    ) {
        items(pagerState.pageCount) { pageIndex ->
            PagerProgressItem(
                itemIndex = pageIndex,
                selectedItemIndex = pagerState.currentPage,
                selectedItemSize = selectedItemSize,
                selectedColour = selectedIndicatorColour,
                unSelectedColour = unSelectedIndicatorColour,
                unselectedItemScaling = unselectedItemScaling,
                itemShape = indicatorShape,
                numberOfItemsToScale = numberOfItemsToScale,
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
            selectedIndicatorColour = Source.Palette.Sport500,
            unSelectedIndicatorColour = Source.Palette.Neutral73,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .align(Alignment.CenterHorizontally),
        )
    }
}