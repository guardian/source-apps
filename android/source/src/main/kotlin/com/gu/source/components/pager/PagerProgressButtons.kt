package com.gu.source.components.pager

import android.annotation.SuppressLint
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.buttons.ButtonColours
import com.gu.source.components.buttons.SourceBaseIconButton
import com.gu.source.components.buttons.SourceButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.ChevronLeftSingle
import com.gu.source.icons.ChevronRightSingle
import com.gu.source.presets.palette.Neutral10
import com.gu.source.presets.palette.Neutral100
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.PreviewTabletBothMode
import kotlinx.coroutines.launch

/**
 * Function to display progress buttons for a pager.
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param prevButtonContentDescription The content description for the previous button.
 * @param nextButtonContentDescription The content description for the next button.
 * @param modifier The [Modifier] to be applied to the Row containing the buttons.
 * @param buttonColours The colours for the buttons.
 * @param disabledButtonColours The colours for the buttons when they are disabled.
 * @param pageSlideAnimationSpec The animation specification for the page slide.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun PagerProgressButtons(
    pagerState: PagerState,
    prevButtonContentDescription: String?,
    nextButtonContentDescription: String?,
    modifier: Modifier = Modifier,
    buttonColours: ButtonColours = DefaultButtonColours,
    disabledButtonColours: ButtonColours? = disabledModeButtonColours(buttonColours),
    pageSlideAnimationSpec: AnimationSpec<Float> = DefaultPageSlideAnimationSpec,
) {
    val coroutineScope = rememberCoroutineScope()

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        SourceBaseIconButton(
            size = SourceButton.Size.Small,
            buttonColours = buttonColours,
            disabledButtonColours = disabledButtonColours,
            onClick = {
                coroutineScope.launch {
                    animateScrollToNext(
                        pagerState,
                        ProgressDirection.Previous,
                        pageSlideAnimationSpec,
                    )
                }
            },
            enabled = pagerState.canScrollBackward,
            modifier = Modifier.offset(x = ProgressButtonTouchAdjustment * 2),
        ) {
            Icon(
                imageVector = Source.Icons.Base.ChevronLeftSingle,
                contentDescription = prevButtonContentDescription,
                modifier = it,
            )
        }
        SourceBaseIconButton(
            size = SourceButton.Size.Small,
            buttonColours = buttonColours,
            disabledButtonColours = disabledButtonColours,
            onClick = {
                coroutineScope.launch {
                    animateScrollToNext(
                        pagerState,
                        ProgressDirection.Next,
                        pageSlideAnimationSpec,
                    )
                }
            },
            enabled = pagerState.canScrollForward,
        ) {
            Icon(
                imageVector = Source.Icons.Base.ChevronRightSingle,
                contentDescription = nextButtonContentDescription,
                modifier = it,
            )
        }
    }
}

/**
 * Function to animate the scroll to the next or previous page.
 *
 * @param pagerState The [PagerState] of the pager.
 * @param direction The direction to scroll (previous or next).
 * @param pageSlideAnimationSpec The animation specification for the page slide.
 */
private suspend fun animateScrollToNext(
    pagerState: PagerState,
    direction: ProgressDirection,
    pageSlideAnimationSpec: AnimationSpec<Float>,
) {
    val page = when (direction) {
        ProgressDirection.Previous -> (pagerState.currentPage - 1).coerceAtLeast(0)
        ProgressDirection.Next -> (pagerState.currentPage + 1)
            .coerceAtMost(pagerState.pageCount - 1)
    }
    pagerState.animateScrollToPage(page, animationSpec = pageSlideAnimationSpec)
}

@Composable
@PreviewPhoneBothMode
@PreviewTabletBothMode
@Suppress("MagicNumber")
internal fun PagerProgressButtonsPreview() {
    val pagerState = rememberPagerState(0) { 10 }
    AppColourMode {
        Box(
            modifier = Modifier.background(
                AppColour(Source.Palette.Neutral100, Source.Palette.Neutral10).current,
            ),
        ) {
            HorizontalPager(state = pagerState) {}
            PagerProgressButtons(
                pagerState = pagerState,
                prevButtonContentDescription = "Previous",
                nextButtonContentDescription = "Next",
            )
        }
    }
}