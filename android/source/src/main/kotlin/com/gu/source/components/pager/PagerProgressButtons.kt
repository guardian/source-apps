package com.gu.source.components.pager

import android.annotation.SuppressLint
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
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
import com.gu.source.icons.ChevronLeft
import com.gu.source.icons.ChevronRight
import com.gu.source.presets.palette.Neutral10
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.palette.Neutral7
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.PreviewTabletBothMode
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@SuppressLint("DiscouragedApi")
@Composable
fun ProgressButtons(
    pagerState: PagerState,
    buttonColours: ButtonColours = DefaultButtonColours,
    prevButtonContentDescription: String?,
    nextButtonContentDescription: String?,
    modifier: Modifier = Modifier,
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
                handlePageTransition(
                    coroutineScope,
                    pagerState,
                    ProgressDirection.Previous,
                    pageSlideAnimationSpec
                )
            },
            enabled = pagerState.canScrollBackward,
            modifier = Modifier.offset(x = ProgressButtonTouchAdjustment * 2),
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
            disabledButtonColours = disabledButtonColours,
            onClick = {
                handlePageTransition(
                    coroutineScope,
                    pagerState,
                    ProgressDirection.Next,
                    pageSlideAnimationSpec
                )
            },
            enabled = pagerState.canScrollForward,
        ) {
            Icon(
                imageVector = Source.Icons.Base.ChevronRight,
                contentDescription = nextButtonContentDescription,
                modifier = it,
            )
        }
    }
}

fun handlePageTransition(
    coroutineScope: CoroutineScope,
    pagerState: PagerState,
    direction: ProgressDirection,
    pageSlideAnimationSpec: AnimationSpec<Float>
) {
    coroutineScope.launch {
        val page = when (direction) {
            ProgressDirection.Previous -> (pagerState.currentPage - 1).coerceAtLeast(0)
            ProgressDirection.Next -> (pagerState.currentPage + 1).coerceAtMost(pagerState.pageCount - 1)
        }
        pagerState.animateScrollToPage(page, animationSpec = pageSlideAnimationSpec)
    }
}

@Composable
@PreviewPhoneBothMode
@PreviewTabletBothMode
fun ProgressButtonsPreview() {
    val pagerState = rememberPagerState(0) { 10 }
    AppColourMode {
        Box(
            modifier = Modifier.background(
                AppColour(Source.Palette.Neutral100, Source.Palette.Neutral10).current,
            ),
        ) {
            HorizontalPager(state = pagerState) {}
            ProgressButtons(
                pagerState = pagerState,
                prevButtonContentDescription = "Previous",
                nextButtonContentDescription = "Next",
            )
        }
    }
}