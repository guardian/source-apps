package com.gu.source.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
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

    enum class Size(val testStyle: TextStyle) {
        SMALL(
            testStyle = Source.Typography.TextSansBold17.copy(lineHeight = 22.95.sp),
        ),
        MEDIUM(
            testStyle = Source.Typography.TextSansBold17.copy(
                fontSize = 15.sp,
                lineHeight = 20.25.sp,
            ),
        );
    }

    enum class Priority {
        ON_BLUE_BACKGROUND,
        ON_WHITE_BACKGROUND,
        ON_YELLOW_BACKGROUND,
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
 * @param isUnderlined Whether the text should be underlined or not.
 */
@Composable
fun SourceTextButton(
    text: String,
    priority: SourceTextButton.Priority,
    size: SourceTextButton.Size,
    onClick: () -> Unit,
    isUnderlined: Boolean = false,
) {
    when (size) {
        SourceTextButton.Size.SMALL -> {
            Text(
                text = text,
                style = size.testStyle.copy(
                    color = when (priority) {
                        SourceTextButton.Priority.ON_BLUE_BACKGROUND -> {
                            Source.Palette.Neutral100
                        }

                        SourceTextButton.Priority.ON_WHITE_BACKGROUND -> {
                            Source.Palette.Brand400
                        }

                        SourceTextButton.Priority.ON_YELLOW_BACKGROUND -> {
                            Source.Palette.Neutral0
                        }
                    },
                    textDecoration = if (isUnderlined) TextDecoration.Underline else null,
                ),
                modifier = Modifier.clickable(onClick = onClick, role = Role.Button),
            )
        }

        SourceTextButton.Size.MEDIUM -> {
            Text(
                text = text,
                style = size.testStyle.copy(
                    color = when (priority) {
                        SourceTextButton.Priority.ON_BLUE_BACKGROUND -> {
                            Source.Palette.Neutral100
                        }

                        SourceTextButton.Priority.ON_WHITE_BACKGROUND -> {
                            Source.Palette.Brand400
                        }

                        SourceTextButton.Priority.ON_YELLOW_BACKGROUND -> {
                            Source.Palette.Neutral0
                        }
                    },
                    textDecoration = if (isUnderlined) TextDecoration.Underline else null,
                ),
                modifier = Modifier.clickable(onClick = onClick, role = Role.Button),
            )
        }
    }
}

@Composable
@PreviewPhoneBothMode
@PreviewTabletBothMode
fun SourceTextButtonPreview() {
    Column(
        verticalArrangement = Arrangement.spacedBy(space = 8.dp),
        modifier = Modifier.padding(all = 16.dp),
    ) {
        SourceTextButton.Priority.entries.forEach { priority ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                SourceTextButton.Size.entries.forEach { size ->
                    val background = when (priority) {
                        SourceTextButton.Priority.ON_BLUE_BACKGROUND -> Source.Palette.Brand400
                        SourceTextButton.Priority.ON_WHITE_BACKGROUND -> Source.Palette.Neutral100
                        SourceTextButton.Priority.ON_YELLOW_BACKGROUND -> Source.Palette.BrandAlt400
                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(color = background)
                            .padding(all = 16.dp)
                    ) {
                        SourceTextButton(
                            text = "Hello world",
                            priority = priority,
                            size = size,
                            onClick = {}
                        )
                    }
                }
            }
        }
    }
}