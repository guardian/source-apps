package com.gu.source.components.pager

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.buttons.ButtonColours
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.toColours
import com.gu.source.components.theme.LocalSourceTheme
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Neutral0
import com.gu.source.foundation.palette.Neutral10
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral20
import com.gu.source.foundation.palette.Neutral38
import com.gu.source.foundation.palette.Neutral46
import com.gu.source.foundation.palette.Neutral60
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.foundation.palette.Neutral86
import com.gu.source.foundation.palette.Neutral93
import com.gu.source.foundation.palette.Neutral97
import com.gu.source.foundation.palette.Sport500
import com.gu.source.foundation.typography.Titlepiece70
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.PreviewTabletBothMode
import com.gu.source.utils.isTabletDevice
import kotlinx.coroutines.delay

internal enum class ProgressDirection {
    Previous,
    Next,
}

private val DefaultSelectedIndicatorColour = AppColour(
    light = Source.Palette.Neutral0,
    dark = Source.Palette.Neutral100,
)

private val DefaultUnSelectedIndicatorColour = AppColour(
    light = Source.Palette.Neutral0.copy(alpha = 0.2f),
    dark = Source.Palette.Neutral100.copy(alpha = 0.3f),
)

internal val DefaultButtonColours = ButtonColours(
    border = AppColour(
        light = Source.Palette.Neutral7.copy(alpha = 0.2f),
        dark = Source.Palette.Neutral100.copy(alpha = 0.4f),
    ),
    container = AppColour.Transparent,
    content = AppColour(
        light = Source.Palette.Neutral7,
        dark = Source.Palette.Neutral100,
    ),
)

internal val DefaultPageSlideAnimationSpec = spring<Float>(stiffness = Spring.StiffnessMediumLow)

internal const val DisabledButtonAlphaLight = 0.2f
internal const val DisabledButtonAlphaDark = 0.4f

internal fun AppColour.setDisabledAlpha() = AppColour(
    light = light.copy(alpha = DisabledButtonAlphaLight.coerceAtMost(light.alpha)),
    dark = dark.copy(alpha = DisabledButtonAlphaDark.coerceAtMost(light.alpha)),
)

internal fun disabledModeButtonColours(enabledColours: ButtonColours = DefaultButtonColours) =
    ButtonColours(
        border = enabledColours.border.setDisabledAlpha(),
        container = enabledColours.container.setDisabledAlpha(),
        content = enabledColours.content.setDisabledAlpha(),
    )

// The progress buttons get a min touch size padding of 12.dp, so we need to things by half that to
// get the correct offset and padding
internal val ProgressButtonTouchAdjustment = 6.dp

/**
 * Applies the size and padding for the progress bar. Size is explicitly required because if this
 * is used inside a lazy column, then intrinsic size can't be measured. Padding is used to position
 * the items correctly vertically.
 */
@Composable
private fun Modifier.progressBarPadding() = this
    .then(
        if (isTabletDevice()) {
            Modifier
                .height(56.dp)
                .padding(
                    top = 8.dp - ProgressButtonTouchAdjustment,
                    bottom = 12.dp - ProgressButtonTouchAdjustment,
                )
        } else {
            Modifier
                .height(28.dp)
                .padding(top = 8.dp, bottom = 12.dp)
        },
    )

/**
 * A progress bar that shows the current page of a [PagerState] and, on tablets, allows the user to
 * navigate between pages using next/prev buttons.
 *
 * @sample AnimatedPreview
 *
 * @param pagerState The [PagerState] that this indicator should be bound to.
 * @param modifier
 * @param buttonColours The colours for the next/prev buttons.
 * @param disabledButtonColours The colours for the next/prev buttons when they are disabled.
 * @param selectedIndicatorColour The colour of the selected indicator item.
 * @param unSelectedIndicatorColour The colour of the unselected indicators items.
 * @param prevButtonContentDescription The content description for the previous button.
 * @param nextButtonContentDescription The content description for the next button.
 * @param showProgressButtons Whether to show the next/prev buttons. By default they are enabled on
 * tablet devices (`sw600dp`).
 * This is only used when the user uses prev/next buttons to navigate between pages.
 */
@Suppress("CognitiveComplexMethod")
@Composable
fun PagerProgressBar(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    buttonColours: ButtonColours = DefaultButtonColours,
    disabledButtonColours: ButtonColours? = disabledModeButtonColours(buttonColours),
    selectedIndicatorColour: AppColour = DefaultSelectedIndicatorColour,
    unSelectedIndicatorColour: AppColour = DefaultUnSelectedIndicatorColour,
    prevButtonContentDescription: String? = null,
    nextButtonContentDescription: String? = null,
    showProgressButtons: Boolean = isTabletDevice(),
) {
    Box(
        modifier = modifier
            .progressBarPadding()
            .fillMaxWidth(),
    ) {
        PagerProgressIndicator(
            pagerState = pagerState,
            selectedIndicatorColour = selectedIndicatorColour.current,
            unSelectedIndicatorColour = unSelectedIndicatorColour.current,
            modifier = Modifier.align(Alignment.Center),
        )
        if (showProgressButtons) {
            PagerProgressButtons(
                pagerState = pagerState,
                buttonColours = DefaultButtonColours,
                prevButtonContentDescription = prevButtonContentDescription,
                nextButtonContentDescription = nextButtonContentDescription,
                modifier = Modifier
                    .offset(x = ProgressButtonTouchAdjustment)
                    .align(Alignment.CenterEnd),
                disabledButtonColours = disabledButtonColours,
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
 * This is only used when the user uses prev/next buttons to navigate between pages.
 */
@Suppress("CognitiveComplexMethod", "Unused")
@Composable
fun PagerProgressBar(
    pagerState: PagerState,
    buttonPriority: SourceButton.Priority,
    modifier: Modifier = Modifier,
    selectedIndicatorColour: AppColour = DefaultSelectedIndicatorColour,
    unSelectedIndicatorColour: AppColour = DefaultUnSelectedIndicatorColour,
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

@Suppress("MagicNumber")
@PreviewPhoneBothMode
@PreviewTabletBothMode
@Composable
private fun AnimatedPreview() {
    AppColourMode {
        val pagerState = rememberPagerState(0) { 10 }

        val animationSpec = spring<Float>(stiffness = Spring.StiffnessMediumLow)

        LaunchedEffect(pagerState) {
            while (true) {
                delay(timeMillis = 1000)
                pagerState.animateScrollToPage(
                    page = (pagerState.currentPage + 1) % pagerState.pageCount,
                    animationSpec = animationSpec,
                )
            }
        }

        val backgrounds = listOf(
            Source.Palette.Neutral0,
            Source.Palette.Neutral10,
            Source.Palette.Neutral20,
            Source.Palette.Neutral38,
            Source.Palette.Neutral46,
            Source.Palette.Neutral60,
            Source.Palette.Neutral86,
            Source.Palette.Neutral93,
            Source.Palette.Neutral97,
            Source.Palette.Neutral100,
        )

        Column(
            modifier = Modifier
                .padding(top = 8.dp, start = 8.dp, end = 8.dp)
                .width(400.dp),
        ) {
            HorizontalPager(state = pagerState) {
                Box(
                    modifier = Modifier
                        .size(400.dp)
                        .background(
                            color = AppColour(light = backgrounds[(it + 3) % backgrounds.size])
                                .current,
                            shape = RoundedCornerShape(8.dp),
                        ),
                ) {
                    Text(
                        text = (it + 1).toString(),
                        style = Source.Typography.Titlepiece70,
                        modifier = Modifier.align(Alignment.Center),
                        color = Source.Palette.Sport500,
                    )
                }
            }
            PagerProgressBar(
                pagerState = pagerState,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
        }
    }
}

@Suppress("MagicNumber")
@PreviewPhoneBothMode
@PreviewTabletBothMode
@Composable
internal fun PagerProgressBarPreview() {
    AppColourMode {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Column(
                modifier = Modifier
                    .background(
                        AppColour(Source.Palette.Neutral100, Source.Palette.Neutral10).current,
                    )
                    .width(600.dp),
            ) {
                val pagerState = rememberPagerState(2) { 10 }
                HorizontalPager(state = pagerState) {}
                PagerProgressBar(pagerState = pagerState)
            }

            Column(
                modifier = Modifier
                    .background(
                        AppColour(Source.Palette.Neutral100, Source.Palette.Neutral10).current,
                    )
                    .width(600.dp),
            ) {
                val pagerState = rememberPagerState(0) { 10 }
                HorizontalPager(state = pagerState) {}
                PagerProgressBar(pagerState = pagerState)
            }
        }
    }
}