@file:OptIn(ExperimentalFoundationApi::class)

package com.gu.source.components.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

/**
 * A pager progress indicator that displays a set of items that represent the pages in a pager.
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param modifier The modifier to apply to the layout.
 * @param maxVisibleItems The maximum number of items to display at once.
 * @param horizontalArrangement The [Arrangement] to use for the items.
 * @param itemsVerticalAlignment The vertical alignment to use for the items.
 * @param itemContent Slot to draw individual indicator item. Takes two arguments: the index of the
 * item and the index of the selected item.
 */
@Composable
fun BasePagerProgressIndicator(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    maxVisibleItems: Int = 5,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(4.dp),
    itemsVerticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    itemContent: @Composable (index: Int, selectedIndex: Int) -> Unit,
) {
    Row(
        modifier = modifier,
        verticalAlignment = itemsVerticalAlignment,
        horizontalArrangement = horizontalArrangement,
    ) {
        val startIndex = when {
            pagerState.currentPage < maxVisibleItems / 2f -> 0
            pagerState.pageCount - pagerState.currentPage < maxVisibleItems / 2f -> {
                pagerState.pageCount - maxVisibleItems
            }

            else -> pagerState.currentPage - maxVisibleItems / 2
        }
            .coerceAtLeast(0)

        val endIndex = (startIndex + maxVisibleItems).coerceAtMost(pagerState.pageCount)

        for (index in startIndex until endIndex) {
            itemContent(index, pagerState.currentPage)
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

    Column {
        HorizontalPager(state = pagerState) { Text(text = it.toString()) }
        BasePagerProgressIndicator(pagerState) { index, selectedIndex ->
            PagerProgressItem(
                index = index,
                selectedIndex = selectedIndex,
                selectedIndicatorSize = 16.dp,
                selectedColour = Color.Red,
                unSelectedColour = Color.Gray,
            )
        }
    }
}