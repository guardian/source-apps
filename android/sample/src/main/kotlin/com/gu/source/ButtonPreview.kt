package com.gu.source

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.components.buttons.ButtonColours
import com.gu.source.components.buttons.PlainSourceButton
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.daynight.AppColour
import com.gu.source.icons.Check
import com.gu.source.presets.palette.Culture200
import com.gu.source.presets.palette.Culture800
import com.gu.source.presets.typography.TextSansBold17
import com.gu.source.theme.ReaderRevenueTheme

@Composable
internal fun ButtonPreview(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(text = "Button variants", style = Source.Typography.TextSansBold17)

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            SourceIconButton(
                icon = Source.Icons.Base.Check,
                priority = SourceButton.Priority.PrimaryOnWhite,
                contentDescription = null,
                onClick = {},
                size = SourceButton.Size.XSmall,
            )
            SourceButton(
                text = "Extra small - Core",
                priority = SourceButton.Priority.SecondaryOnWhite,
                onClick = {},
                size = SourceButton.Size.XSmall,
            )
            SourceIconButton(
                icon = Source.Icons.Base.Check,
                priority = SourceButton.Priority.TertiaryOnWhite,
                contentDescription = null,
                onClick = {},
                size = SourceButton.Size.XSmall,
            )
        }

        ReaderRevenueTheme {
            Row(
                modifier = it.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.PrimaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.Small,
                )
                SourceButton(
                    text = "Small - RR",
                    priority = SourceButton.Priority.PrimaryOnWhite,
                    onClick = {},
                    size = SourceButton.Size.Small,
                )
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.TertiaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.Small,
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            SourceIconButton(
                icon = Source.Icons.Base.Check,
                priority = SourceButton.Priority.PrimaryOnWhite,
                contentDescription = null,
                onClick = {},
                size = SourceButton.Size.Medium,
            )
            SourceButton(
                text = "Medium - Core",
                priority = SourceButton.Priority.SecondaryOnWhite,
                onClick = {},
                size = SourceButton.Size.Medium,
            )
            SourceIconButton(
                icon = Source.Icons.Base.Check,
                priority = SourceButton.Priority.TertiaryOnWhite,
                contentDescription = null,
                onClick = {},
                size = SourceButton.Size.Medium,
            )
        }

        PlainSourceButton(
            text = "Custom themed",
            onClick = {},
            modifier = Modifier.align(CenterHorizontally),
            buttonColours = ButtonColours(
                border = AppColour(
                    light = Source.Palette.Culture200,
                    dark = Source.Palette.Culture800,
                ),
                container = AppColour(
                    light = Source.Palette.Culture800,
                    dark = Source.Palette.Culture200,
                ),
                content = AppColour(
                    light = Source.Palette.Culture200,
                    dark = Source.Palette.Culture800,
                ),
            ),
        )
    }
}

@Preview
@Composable
private fun Preview() {
    ButtonPreview()
}