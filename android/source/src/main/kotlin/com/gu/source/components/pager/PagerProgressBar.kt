@file:OptIn(ExperimentalFoundationApi::class)

package com.gu.source.components.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.ChevronLeft
import com.gu.source.icons.ChevronRight
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral10
import com.gu.source.presets.palette.Neutral100
import com.gu.source.utils.PhoneBothModePreviews
import com.gu.source.utils.TabletBothModePreviews
import com.gu.source.utils.isTabletDevice
import kotlinx.coroutines.launch

private enum class ProgressDirection {
    Previous,
    Next
}

private val SelectedIndicatorColour = AppColour(
    light = Source.Palette.Neutral0,
    dark = Source.Palette.Neutral100,
)
private val UnSelectedIndicatorColour = AppColour(
    light = Source.Palette.Neutral0.copy(alpha = 0.2f),
    dark = Source.Palette.Neutral100.copy(alpha = 0.3f),
)

/**
 * A progress bar that shows the current page of a [PagerState] and, on tablets, allows the user to
 * navigate between pages using next/prev buttons.
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param buttonPriority The priority for the next previous buttons - impacts the colour style.
 * @param modifier
 * @param selectedIndicatorColour The colour of the selected indicator item.
 * @param unSelectedIndicatorColour The colour of the unselected indicators items.
 */
@Suppress("CognitiveComplexMethod")
@Composable
fun PagerProgressBar(
    pagerState: PagerState,
    buttonPriority: SourceButton.Priority,
    modifier: Modifier = Modifier,
    selectedIndicatorColour: AppColour = SelectedIndicatorColour,
    unSelectedIndicatorColour: AppColour = UnSelectedIndicatorColour,
) {
    val coroutineScope = rememberCoroutineScope()

    Box(
        modifier = modifier
            // TODO: 19/07/2024 Confirm whether these go inside or outside the component.
//            .padding(top = 8.dp, bottom = 20.dp)
            .height(56.dp)
            .fillMaxWidth(),
    ) {
        PagerProgressIndicator(
            pagerState = pagerState,
            selectedIndicatorColour = selectedIndicatorColour.current,
            unSelectedIndicatorColour = unSelectedIndicatorColour.current,
            modifier = Modifier.align(Alignment.Center),
        )
        if (isTabletDevice()) {
            ProgressButtons(
                priority = buttonPriority,
                onClick = {
                    coroutineScope.launch {
                        val page = when (it) {
                            ProgressDirection.Previous -> {
                                (pagerState.currentPage - 1)
                                    .let { if (it < 0) pagerState.pageCount - 1 else it }
                            }

                            ProgressDirection.Next -> {
                                (pagerState.currentPage + 1) % pagerState.pageCount
                            }
                        }
                        pagerState.animateScrollToPage(page)
                    }
                },
                // Offset the row so the buttons visually set at end of the progress bar despite the extra
                // touch size padding.
                modifier = Modifier
                    .offset(x = 6.dp)
                    .align(Alignment.CenterEnd),
            )
        }
    }
}

@Composable
private fun ProgressButtons(
    priority: SourceButton.Priority,
    onClick: (progressDirection: ProgressDirection) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        SourceIconButton(
            icon = Source.Icons.Base.ChevronLeft,
            priority = priority,
            size = SourceButton.Size.Small,
            contentDescription = null,
            onClick = { onClick(ProgressDirection.Previous) },
        )
        SourceIconButton(
            icon = Source.Icons.Base.ChevronRight,
            priority = priority,
            size = SourceButton.Size.Small,
            contentDescription = null,
            onClick = { onClick(ProgressDirection.Next) },
        )
    }
}

@PhoneBothModePreviews
@TabletBothModePreviews
@Composable
private fun Preview() {
    AppColourMode {
        val pagerState = rememberPagerState(1) { 10 }

        Column(
            modifier = Modifier.background(
                AppColour(Source.Palette.Neutral100, Source.Palette.Neutral10).current,
            ),
        ) {
            HorizontalPager(state = pagerState) {}
            PagerProgressBar(
                pagerState = pagerState,
                buttonPriority = SourceButton.Priority.TertiaryOnWhite,
            )
        }
    }
}