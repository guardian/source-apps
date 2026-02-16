package com.gu.source.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceTextButton
import com.gu.source.components.theme.ReaderRevenueTheme
import com.gu.source.components.theme.SourceCoreTheme
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.PreviewTabletBothMode

@Composable
private fun getBackgroundColour(priority: SourceButton.Priority): Color = when (priority) {
    SourceButton.Priority.TertiaryOnWhite -> AppColour(
        light = Source.Palette.Neutral100,
        dark = Source.Palette.Neutral7,
    ).current

    SourceButton.Priority.TertiaryOnBlue -> AppColour(
        light = Source.Palette.Brand400,
        dark = Source.Palette.Neutral7,
    ).current

    else -> AppColour.Unspecified.current
}

@Composable
internal fun TextButtonPreview(modifier: Modifier = Modifier) = AppColourMode {
    val validPriorities = listOf(
        SourceButton.Priority.TertiaryOnWhite,
        SourceButton.Priority.TertiaryOnBlue,
    )
    val validSizes = listOf(
        SourceButton.Size.Small,
        SourceButton.Size.Medium,
    )

    Column(modifier = modifier) {
        SourceCoreTheme {
            Column {
                validPriorities.forEach { priority ->
                    Row(
                        modifier = Modifier
                            .background(color = getBackgroundColour(priority = priority))
                            .padding(vertical = 4.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        validSizes.forEach { size ->
                            SourceTextButton(
                                text = "txtbtn.${size.name.lowercase()}",
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
            Column {
                validPriorities.forEach { priority ->
                    Row(
                        modifier = Modifier
                            .background(color = getBackgroundColour(priority = priority))
                            .padding(vertical = 4.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        validSizes.forEach { size ->
                            SourceTextButton(
                                text = "txtbtn.${size.name.lowercase()}",
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

@Composable
@PreviewPhoneBothMode
@PreviewTabletBothMode
private fun SourceTextButtonPreview() {
    TextButtonPreview()
}