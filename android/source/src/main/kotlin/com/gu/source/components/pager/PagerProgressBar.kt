@file:OptIn(ExperimentalFoundationApi::class)

package com.gu.source.components.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.buttons.ButtonColours
import com.gu.source.components.buttons.SourceBaseIconButton
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.toColours
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.ChevronLeft
import com.gu.source.icons.ChevronRight
import com.gu.source.presets.palette.*
import com.gu.source.presets.typography.Titlepiece70
import com.gu.source.theme.LocalSourceTheme
import com.gu.source.utils.PhoneBothModePreviews
import com.gu.source.utils.TabletBothModePreviews
import com.gu.source.utils.isTabletDevice
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

private enum class ProgressDirection {
    Previous,
    Next,
}

private val SelectedIndicatorColour = AppColour(
    light = Source.Palette.Neutral0,
    dark = Source.Palette.Neutral100,
)

private val UnSelectedIndicatorColour = AppColour(
    light = Source.Palette.Neutral0.copy(alpha = 0.2f),
    dark = Source.Palette.Neutral100.copy(alpha = 0.3f),
)

private val DefaultButtonColours = ButtonColours(
    border = AppColour(
        light = Source.Palette.Neutral7.copy(alpha = 0.2f),
        dark = Source.Palette.Neutral100.copy(alpha = 0.3f),
    ),
    container = AppColour.Transparent,
    content = AppColour(
        light = Source.Palette.Neutral7,
        dark = Source.Palette.Neutral100,
    ),
)

private val BarHeightPhone = 28.dp
private val BarHeightTablet = 56.dp

@Composable
private fun getBarHeight() = if (isTabletDevice()) BarHeightTablet else BarHeightPhone

/**
 * A progress bar that shows the current page of a [PagerState] and, on tablets, allows the user to
 * navigate between pages using next/prev buttons.
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param modifier
 * @param buttonColours The colours for the next/prev buttons.
 * @param selectedIndicatorColour The colour of the selected indicator item.
 * @param unSelectedIndicatorColour The colour of the unselected indicators items.
 * @param prevButtonContentDescription The content description for the previous button.
 * @param nextButtonContentDescription The content description for the next button.
 * @param showProgressButtons Whether to show the next/prev buttons. By default they are enabled on
 * tablet devices (`sw600dp`).
 */
@Suppress("CognitiveComplexMethod")
@Composable
fun PagerProgressBar(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    buttonColours: ButtonColours = DefaultButtonColours,
    selectedIndicatorColour: AppColour = SelectedIndicatorColour,
    unSelectedIndicatorColour: AppColour = UnSelectedIndicatorColour,
    prevButtonContentDescription: String? = null,
    nextButtonContentDescription: String? = null,
    showProgressButtons: Boolean = isTabletDevice(),
) {
    val coroutineScope = rememberCoroutineScope()

    Box(
        modifier = modifier
            .height(getBarHeight())
            .fillMaxWidth(),
    ) {
        PagerProgressIndicator(
            pagerState = pagerState,
            selectedIndicatorColour = selectedIndicatorColour.current,
            unSelectedIndicatorColour = unSelectedIndicatorColour.current,
            modifier = Modifier.align(Alignment.Center),
        )
        if (showProgressButtons) {
            var isNextButtonEnabled by remember { mutableStateOf(false) }
            var isPrevButtonEnabled by remember { mutableStateOf(false) }

            LaunchedEffect(pagerState) {
                snapshotFlow { pagerState.currentPage }.collect {
                    isNextButtonEnabled = it < pagerState.pageCount - 1
                    isPrevButtonEnabled = it > 0
                }
            }

            ProgressButtons(
                buttonColours = buttonColours,
                onClick = {
                    coroutineScope.launch {
                        val page = when (it) {
                            ProgressDirection.Previous -> {
                                (pagerState.currentPage - 1).coerceAtLeast(0)
                            }

                            ProgressDirection.Next -> {
                                (pagerState.currentPage + 1).coerceAtMost(pagerState.pageCount - 1)
                            }
                        }
                        pagerState.animateScrollToPage(page)
                    }
                },
                prevButtonContentDescription = prevButtonContentDescription,
                nextButtonContentDescription = nextButtonContentDescription,
                isNextEnabled = isNextButtonEnabled,
                isPrevEnabled = isPrevButtonEnabled,
                modifier = Modifier
                    // Offset the row so the buttons visually set at end of the progress bar despite
                    // the extra touch size padding.
                    .offset(x = 6.dp)
                    .align(Alignment.CenterEnd),
            )
        }
    }
}

/**
 * A progress bar that shows the current page of a [PagerState] and, on tablets, allows the user to
 * navigate between pages using next/prev buttons.
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param buttonPriority The priority for the next previous buttons. Priority decides the button
 * colours.
 * @param modifier
 * @param selectedIndicatorColour The colour of the selected indicator item.
 * @param unSelectedIndicatorColour The colour of the unselected indicators items.
 * @param prevButtonContentDescription The content description for the previous button.
 * @param nextButtonContentDescription The content description for the next button.
 * @param showProgressButtons Whether to show the next/prev buttons. By default they are enabled on
 * tablet devices (`sw600dp`).
 */
@Suppress("CognitiveComplexMethod", "Unused")
@Composable
fun PagerProgressBar(
    pagerState: PagerState,
    buttonPriority: SourceButton.Priority,
    modifier: Modifier = Modifier,
    selectedIndicatorColour: AppColour = SelectedIndicatorColour,
    unSelectedIndicatorColour: AppColour = UnSelectedIndicatorColour,
    prevButtonContentDescription: String? = null,
    nextButtonContentDescription: String? = null,
    showProgressButtons: Boolean = isTabletDevice(),
) {
    PagerProgressBar(
        pagerState = pagerState,
        modifier = modifier,
        buttonColours = buttonPriority.toColours(LocalSourceTheme.current),
        selectedIndicatorColour = selectedIndicatorColour,
        unSelectedIndicatorColour = unSelectedIndicatorColour,
        prevButtonContentDescription = prevButtonContentDescription,
        nextButtonContentDescription = nextButtonContentDescription,
        showProgressButtons = showProgressButtons,
    )
}

@Composable
private fun ProgressButtons(
    buttonColours: ButtonColours,
    onClick: (progressDirection: ProgressDirection) -> Unit,
    isNextEnabled: Boolean,
    isPrevEnabled: Boolean,
    prevButtonContentDescription: String?,
    nextButtonContentDescription: String?,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        SourceBaseIconButton(
            size = SourceButton.Size.Small,
            buttonColours = buttonColours,
            onClick = { onClick(ProgressDirection.Previous) },
            enabled = isPrevEnabled,
        ) {
            Icon(
                imageVector = Source.Icons.Base.ChevronLeft,
                contentDescription = prevButtonContentDescription,
                modifier = it,
            )
        }
        SourceBaseIconButton(
            size = SourceButton.Size.Small,
            buttonColours = buttonColours,
            onClick = { onClick(ProgressDirection.Next) },
            enabled = isNextEnabled,
        ) {
            Icon(
                imageVector = Source.Icons.Base.ChevronRight,
                contentDescription = nextButtonContentDescription,
                modifier = it,
            )
        }
    }
}

@Suppress("MagicNumber")
@PhoneBothModePreviews
@TabletBothModePreviews
@Composable
private fun AnimatedPreview() {
    AppColourMode {
        val pagerState = rememberPagerState(0) { 10 }

        LaunchedEffect(pagerState) {
            while (true) {
                delay(timeMillis = 1000)
                pagerState.scrollToPage((pagerState.currentPage + 1) % pagerState.pageCount)
            }
        }

        Column(
            modifier = Modifier
                .padding(8.dp)
                .width(400.dp),
        ) {
            HorizontalPager(state = pagerState) {
                Box(
                    modifier = Modifier
                        .size(400.dp)
                        .background(
                            color = AppColour(
                                light = Source.Palette.Neutral86,
                                dark = Source.Palette.Neutral38,
                            ).current,
                            shape = RoundedCornerShape(8.dp),
                        ),
                ) {
                    Text(
                        text = (it + 1).toString(),
                        style = Source.Typography.Titlepiece70,
                        modifier = Modifier.align(Alignment.Center),
                        color = Source.Palette.Neutral60,
                    )
                }
            }
            PagerProgressBar(
                pagerState = pagerState,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .align(Alignment.CenterHorizontally),
            )
        }
    }
}

@Suppress("MagicNumber")
@PhoneBothModePreviews
@TabletBothModePreviews
@Composable
internal fun PagerProgressBarPreview() {
    AppColourMode {
        val pagerState = rememberPagerState(1) { 10 }

        Column(
            modifier = Modifier
                .background(
                    AppColour(Source.Palette.Neutral100, Source.Palette.Neutral10).current,
                )
                .width(600.dp),
        ) {
            HorizontalPager(state = pagerState) {}
            PagerProgressBar(pagerState = pagerState)
        }
    }
}