package com.gu.source.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gu.source.Source
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.BrandAlt400
import com.gu.source.foundation.palette.Neutral0
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.typography.TextSansBold17
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.PreviewTabletBothMode

/**
 * SourceTextButton is a text button component that can be used in the Source design system.
 * It is a simple button that contains text and has no background.
 * The color of the text is determined by the priority of the button,
 * which should be chosen based on the background color of the button.
 */
object SourceTextButton {

    /**
     * The size of the button, which determines
     * the typography style of the text and the minimum height of the button.
     *
     * @property textStyle The typography style of the text inside the button.
     * @property minButtonHeight The minimum height of the button.
     */
    enum class Size(
        val textStyle: TextStyle,
        val minButtonHeight: Dp,
    ) {
        SMALL(
            textStyle = Source.Typography.TextSansBold17.copy(
                fontSize = 15.sp,
                lineHeight = 20.25.sp,
            ),
            minButtonHeight = 20.dp,
        ),
        MEDIUM(
            textStyle = Source.Typography.TextSansBold17.copy(
                lineHeight = 22.95.sp,
            ),
            minButtonHeight = 23.dp,
        );
    }

    /**
     * The priority of the button, which determines the color of the text.
     * This should be chosen based on the background color of the button.
     */
    enum class Priority {
        ON_BLUE_BACKGROUND,
        ON_WHITE_BACKGROUND,
        ON_YELLOW_BACKGROUND;

        internal fun textColor(): Color = when (this) {
            ON_BLUE_BACKGROUND -> Source.Palette.Neutral100
            ON_WHITE_BACKGROUND -> Source.Palette.Brand400
            ON_YELLOW_BACKGROUND -> Source.Palette.Neutral0
        }

        internal fun demoBackgroundColor(): Color = when (this) {
            ON_BLUE_BACKGROUND -> Source.Palette.Brand400
            ON_WHITE_BACKGROUND -> Source.Palette.Neutral100
            ON_YELLOW_BACKGROUND -> Source.Palette.BrandAlt400
        }
    }
}

/**
 * A text button is a button that contains text and has no background.
 * It can be used in places where a less prominent action is needed.
 *
 * @param text The text to display inside the button.
 * @param priority The priority of the button, which determines the color of the text.
 * This should be chosen based on the background color of the button.
 * @param size The size of the button, which determines the typography style of the text.
 * @param onClick The callback to be invoked when this button is clicked.
 * @param modifier The [Modifier] to be applied to this button.
 */
@Composable
fun SourceTextButton(
    text: String,
    priority: SourceTextButton.Priority,
    size: SourceTextButton.Size,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    when (size) {
        SourceTextButton.Size.SMALL -> {
            TextButton(
                onClick = onClick,
                modifier = modifier.defaultMinSize(minHeight = size.minButtonHeight),
            ) {
                Text(
                    text = text,
                    style = size.textStyle.copy(
                        color = priority.textColor(),
                    ),
                )
            }
        }

        SourceTextButton.Size.MEDIUM -> {
            TextButton(
                onClick = onClick,
                modifier = modifier.defaultMinSize(minHeight = size.minButtonHeight),
            ) {
                Text(
                    text = text,
                    style = size.textStyle.copy(
                        color = priority.textColor(),
                    ),
                )
            }
        }
    }
}

@Composable
@PreviewPhoneBothMode
@PreviewTabletBothMode
internal fun SourceTextButtonPreview() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        SourceTextButton.Priority.entries.forEach { priority ->
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .background(priority.demoBackgroundColor())
                    .fillMaxWidth(),
            ) {
                SourceTextButton.Size.entries.forEach { size ->
                    SourceTextButton(
                        text = size.name.lowercase(),
                        priority = priority,
                        size = size,
                        onClick = {},
                    )
                }
            }

        }
    }
}