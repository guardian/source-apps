package com.gu.source.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.buttons.ButtonColours
import com.gu.source.components.buttons.PlainSourceButton
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.components.theme.ReaderRevenueTheme
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.icons.base.Checkmark
import com.gu.source.foundation.palette.Culture200
import com.gu.source.foundation.palette.Culture800
import com.gu.source.foundation.typography.TextSansBold17

@Composable
internal fun ButtonPreview(
    onBackPress: () -> Unit,
    modifier: Modifier = Modifier
) {
    PreviewScaffold(
        title = "Button variants",
        onBackPress = onBackPress,
        modifier = modifier,
    ) {
        Column(
            modifier = it.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text(text = "Button variants", style = Source.Typography.TextSansBold17)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                SourceIconButton(
                    icon = Source.Icons.Base.Checkmark,
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
                    icon = Source.Icons.Base.Checkmark,
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
                        icon = Source.Icons.Base.Checkmark,
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
                        icon = Source.Icons.Base.Checkmark,
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
                    icon = Source.Icons.Base.Checkmark,
                    priority = SourceButton.Priority.PrimaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    enabled = false,
                    size = SourceButton.Size.Medium,
                )
                SourceButton(
                    text = "Medium - Core",
                    priority = SourceButton.Priority.SecondaryOnWhite,
                    onClick = {},
                    size = SourceButton.Size.Medium,
                    enabled = false,
                )
                SourceIconButton(
                    icon = Source.Icons.Base.Checkmark,
                    priority = SourceButton.Priority.TertiaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    enabled = false,
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
}

@PreviewLightDark
@Composable
private fun Preview() {
    AppColourMode { ButtonPreview({}) }
}