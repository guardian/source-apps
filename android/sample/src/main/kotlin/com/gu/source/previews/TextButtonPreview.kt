package com.gu.source.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.buttons.SourceTextButton
import com.gu.source.components.buttons.SourceTextButton.Priority.ON_BLUE_BACKGROUND
import com.gu.source.components.buttons.SourceTextButton.Priority.ON_WHITE_BACKGROUND
import com.gu.source.components.buttons.SourceTextButton.Priority.ON_YELLOW_BACKGROUND
import com.gu.source.components.theme.ReaderRevenueTheme
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.BrandAlt400
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.typography.TextSansBold17

@Composable
internal fun TextButtonPreview(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            text = "Core Theme text button - no underline - variants",
            style = Source.Typography.TextSansBold17,
        )
        TextButtonRows()
        Text(
            text = "Reader Revenue theme text button - no underline - variant",
            style = Source.Typography.TextSansBold17,
        )
        ReaderRevenueTheme {
            TextButtonRows()
        }
        Text(
            text = "Core Theme text button - underline - variants",
            style = Source.Typography.TextSansBold17,
        )
        TextButtonRows(textButtonHasUnderline = true)
        Text(
            text = "Reader Revenue theme text button - underline - variant",
            style = Source.Typography.TextSansBold17,
        )
        ReaderRevenueTheme {
            TextButtonRows(textButtonHasUnderline = true)
        }
    }
}

@Composable
private fun TextButtonRows(textButtonHasUnderline: Boolean = false) {
    Column(horizontalAlignment = CenterHorizontally) {
        SourceTextButton.Priority.entries.forEach { priority ->
            val backgroundColor = when (priority) {
                ON_BLUE_BACKGROUND -> Source.Palette.Brand400
                ON_WHITE_BACKGROUND -> Source.Palette.Neutral100
                ON_YELLOW_BACKGROUND -> Source.Palette.BrandAlt400
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .background(color = backgroundColor)
                    .fillMaxWidth(),
            ) {
                SourceTextButton.Size.entries.forEach { size ->
                    SourceTextButton(
                        text = "text button - ${size.name.lowercase()}",
                        priority = priority,
                        size = size,
                        hasUnderline = textButtonHasUnderline,
                        onClick = {},
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun TextButtonsPreview() {
    TextButtonPreview()
}