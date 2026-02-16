package com.gu.source.components.buttons

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.gu.source.Source
import com.gu.source.components.theme.LocalSourceTheme
import com.gu.source.components.theme.ReaderRevenueTheme
import com.gu.source.components.theme.SourceCoreTheme
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Neutral38
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.PreviewTabletBothMode

/**
 * A text button that adheres to the Source design system.
 * This button is intended for use cases where a text-only button is appropriate,
 * it does not support the XSmall size or Primary/Secondary priorities.
 *
 * @param text The text to display inside the button.
 * @param priority The priority level of the button, which determines its visual styling.
 * Only TertiaryOnWhite and TertiaryOnBlue priorities are supported.
 * @param size The size of the button, which determines its dimensions and text style.
 * Only Small and Medium sizes are supported.
 * @param onClick The callback to be invoked when the button is clicked.
 * @param modifier The [Modifier] to be applied to this button.
 * @param hasUnderline Whether the text should have an underline. Default is false.
 * @param theme An optional [Source.Theme] to apply to this button.
 * If not provided, the current theme from [LocalSourceTheme] will be used.
 */
@Composable
fun SourceTextButton(
    text: String,
    priority: SourceButton.Priority,
    size: SourceButton.Size,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    hasUnderline: Boolean = false,
    theme: Source.Theme? = null,
) {
    val appliedTheme = theme ?: LocalSourceTheme.current

    val supportedPriorities = listOf(
        SourceButton.Priority.TertiaryOnWhite,
        SourceButton.Priority.TertiaryOnBlue,
    )

    require(size != SourceButton.Size.XSmall) {
        "SourceTextButtonV2 does not support XSmall size."
    }

    require(priority in supportedPriorities) {
        "SourceTextButtonV2 only supports the following priorities: ${
            supportedPriorities.joinToString(separator = ", ")
        }."
    }

    val buttonColours = priority.toColours(appliedTheme).copy(
        border = AppColour.Transparent,
    )

    PlainSourceContentButton(
        size = size,
        onClick = onClick,
        buttonColours = buttonColours,
        modifier = modifier,
    ) {
        Text(
            text = text,
            style = size.textStyle,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
            maxLines = 1,
            letterSpacing = 0.sp,
            textDecoration = if (hasUnderline) {
                TextDecoration.Underline
            } else {
                null
            },
        )
    }
}

@Composable
@PreviewPhoneBothMode
@PreviewTabletBothMode
@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
internal fun SourceTextButtonPreview() = AppColourMode {
    val validPriorities = listOf(
        SourceButton.Priority.TertiaryOnWhite,
        SourceButton.Priority.TertiaryOnBlue,
    )
    val validSizes = listOf(
        SourceButton.Size.Small,
        SourceButton.Size.Medium,
    )
    Column {
        SourceCoreTheme {
            Column(Modifier.background(color = Source.Palette.Neutral38)) {
                validPriorities.forEach { priority ->
                    Row(
                        modifier = Modifier
                            .background(color = priority.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                    ) {
                        validSizes.forEach { size ->
                            SourceTextButton(
                                text = "txtbtn.${size.shortName}",
                                priority = priority,
                                size = size,
                                onClick = {},
                            )
                        }
                    }
                }
            }
        }
        ReaderRevenueTheme {
            Column(Modifier.background(color = Source.Palette.Neutral38)) {
                validPriorities.forEach { priority ->
                    Row(
                        modifier = Modifier
                            .background(color = priority.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                    ) {
                        validSizes.forEach { size ->
                            SourceTextButton(
                                text = "txtbtn.${size.shortName}",
                                priority = priority,
                                size = size,
                                onClick = {},
                            )
                        }
                    }
                }
            }
        }
    }
}