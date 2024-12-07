package com.gu.source.components

import androidx.compose.animation.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow

/**
 * Text component that appears/hides with an horizontal expansion animation effect.
 *
 * The text will slide in from the left, expand horizontally, and fade in when visible,
 * and slide out, shrink, and fade out when not visible.
 * The sliding effect is dynamic, based on the width of the text.
 *
 * @param text The text to display.
 * @param colour The color of the text.
 * @param style The [TextStyle] to apply to the text.
 * @param isVisible Controls the visibility of the text.
 * @param modifier A [Modifier] to apply to the [Text] composable.
 * @param maxLines Maximum number of lines for the text.
 * @param overflow Defines how the text should handle overflow when the text is too long.
 */
@Composable
fun ExpandingText(
    text: String,
    colour: Color,
    style: TextStyle,
    isVisible: Boolean,
    modifier: Modifier = Modifier,
    maxLines: Int = 1,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    ExpandingText(
        text = AnnotatedString(text),
        color = colour,
        style = style,
        isVisible = isVisible,
        modifier = modifier,
        maxLines = maxLines,
        overflow = overflow,
    )
}

/**
 * Text component that appears/hides with an horizontal expansion animation effect.
 *
 * The text will slide in from the left, expand horizontally, and fade in when visible,
 * and slide out, shrink, and fade out when not visible.
 * The sliding effect is dynamic, based on the width of the text.
 *
 * @param text The text to display.
 * @param color The color of the text.
 * @param style The [TextStyle] to apply to the text.
 * @param isVisible Controls the visibility of the text.
 * @param modifier A [Modifier] to apply to the inner [Text] composable.
 * @param maxLines Maximum number of lines for the text.
 * @param overflow Defines how the text should handle overflow when the text is too long.
 */
@Composable
fun ExpandingText(
    text: AnnotatedString,
    color: Color,
    style: TextStyle,
    isVisible: Boolean,
    modifier: Modifier = Modifier,
    maxLines: Int = 1,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    val textMeasurer = rememberTextMeasurer()
    val density = LocalDensity.current
    val measuredText = remember(text, style, maxLines, overflow) {
        textMeasurer.measure(
            text = text,
            style = style,
            maxLines = maxLines,
            overflow = overflow,
            softWrap = false,
            density = density,
        )
    }

    AnimatedVisibility(
        visible = isVisible,
        enter = slideInHorizontally(initialOffsetX = { -measuredText.size.width }) +
            expandHorizontally(expandFrom = Alignment.End) +
            fadeIn(initialAlpha = 0.3f),
        exit = slideOutHorizontally() + shrinkHorizontally() + fadeOut(),
    ) {
        Text(
            text = text,
            modifier = modifier,
            color = color,
            style = style,
            maxLines = maxLines,
            overflow = overflow,
        )
    }
}