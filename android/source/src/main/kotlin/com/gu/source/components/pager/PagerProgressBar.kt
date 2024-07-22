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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
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

/**
 * A progress bar that shows the current page of a [PagerState] and, on tablets, allows the user to
 * navigate between pages using next/prev buttons.
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param modifier
 * @param buttonColours The colours for the next/prev buttons.
 * @param selectedIndicatorColour The colour of the selected indicator item.
 * @param unSelectedIndicatorColour The colour of the unselected indicators items.
 */
@Suppress("CognitiveComplexMethod")
@Composable
fun PagerProgressBar(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    buttonColours: ButtonColours = DefaultButtonColours,
    selectedIndicatorColour: AppColour = SelectedIndicatorColour,
    unSelectedIndicatorColour: AppColour = UnSelectedIndicatorColour,
) {
    val coroutineScope = rememberCoroutineScope()

    Box(
        modifier = modifier
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
                buttonColours = buttonColours,
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
 */

@Suppress("CognitiveComplexMethod", "Unused")
@Composable
fun PagerProgressBar(
    pagerState: PagerState,
    buttonPriority: SourceButton.Priority,
    modifier: Modifier = Modifier,
    selectedIndicatorColour: AppColour = SelectedIndicatorColour,
    unSelectedIndicatorColour: AppColour = UnSelectedIndicatorColour,
) {
    PagerProgressBar(
        pagerState = pagerState,
        modifier = modifier,
        buttonColours = buttonPriority.toColours(LocalSourceTheme.current),
        selectedIndicatorColour = selectedIndicatorColour,
        unSelectedIndicatorColour = unSelectedIndicatorColour,
    )
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

@Composable
private fun ProgressButtons(
    buttonColours: ButtonColours,
    onClick: (progressDirection: ProgressDirection) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        SourceBaseIconButton(
            buttonColours = buttonColours,
            size = SourceButton.Size.Small,
            onClick = { onClick(ProgressDirection.Previous) },
        ) {
            Icon(
                imageVector = Source.Icons.Base.ChevronLeft,
                contentDescription = null,
                modifier = it,
            )
        }
        SourceBaseIconButton(
            buttonColours = buttonColours,
            size = SourceButton.Size.Small,
            onClick = { onClick(ProgressDirection.Next) },
        ) {
            Icon(
                imageVector = Source.Icons.Base.ChevronRight,
                contentDescription = null,
                modifier = it,
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