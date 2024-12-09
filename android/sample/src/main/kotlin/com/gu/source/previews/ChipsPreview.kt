package com.gu.source.previews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gu.source.R
import com.gu.source.Source
import com.gu.source.components.chips.ChipIndicator
import com.gu.source.components.chips.SourceChip
import com.gu.source.components.chips.SourceChipSupportingButton
import com.gu.source.daynight.AppColour
import com.gu.source.icons.Check
import com.gu.source.icons.Plus
import com.gu.source.presets.typography.TextSans14
import com.gu.source.presets.typography.TextSansBold17
import kotlinx.coroutines.delay

@OptIn(ExperimentalLayoutApi::class)
@Composable
internal fun ChipsPreview(modifier: Modifier = Modifier) {
    val previewText = "Label"
    val labelColour = AppColour(light = Color.Black, dark = Color.White)
    Column(
        modifier = modifier.padding(horizontal = 8.dp, vertical = 4.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        SourceChip.Size.entries.forEach { size ->
            Text(
                text = size.name,
                style = Source.Typography.TextSansBold17,
                color = labelColour.current,
            )

            listOf(false, true).forEach { isSelected ->
                Text(
                    text = if (isSelected) "Selected" else "Unselected",
                    style = Source.Typography.TextSans14,
                    color = labelColour.current,
                    modifier = Modifier.padding(top = 8.dp),
                )

                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    SourceChip(
                        text = previewText,
                        isSelected = isSelected,
                        size = size,
                        onClick = {},
                        badge = {},
                    )

                    SourceChip(
                        text = previewText,
                        isSelected = isSelected,
                        size = size,
                        onClick = {},
                        badge = {},
                        indicatorBefore = ChipIndicator.Icon.Component {
                            Icon(
                                imageVector = Source.Icons.Base.Plus,
                                contentDescription = null,
                                modifier = it,
                            )
                        },
                    )

                    SourceChip(
                        text = previewText,
                        isSelected = isSelected,
                        size = size,
                        onClick = {},
                        badge = {},
                        indicatorBefore = ChipIndicator.Image.Component {
                            Image(
                                painter = painterResource(R.drawable.marina_hyde),
                                contentDescription = null,
                                modifier = it,
                            )
                        },
                    )

                    SourceChip(
                        text = previewText,
                        isSelected = isSelected,
                        size = size,
                        onClick = {},
                        badge = {},
                        indicatorBefore = ChipIndicator.Image.Painter(
                            painter = painterResource(R.drawable.marina_hyde),
                            contentDescription = null,
                        ),
                        indicatorAfter = ChipIndicator.Icon.Vector(
                            imageVector = Source.Icons.Base.Check,
                            contentDescription = null,
                        ),
                    )

                    SourceChip(
                        text = previewText,
                        isSelected = isSelected,
                        showBadge = true,
                        size = size,
                        onClick = {},
                        style = SourceChip.Style.Default.copy(
                            badgeColour = AppColour.Unspecified,
                        ),
                        indicatorAfter = ChipIndicator.Icon.Vector(
                            imageVector = Source.Icons.Base.Check,
                            contentDescription = null,
                        ),
                    )
                }
            }
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        }

        Text(
            text = "Collapsed icon-only",
            style = Source.Typography.TextSansBold17,
            color = labelColour.current,
        )

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            listOf(false, true).forEach { isSelected ->
                var text by remember { mutableStateOf("") }
                LaunchedEffect(Unit) {
                    while (true) {
                        delay(timeMillis = 1000)
                        text = if (text.isBlank()) "Label" else ""
                    }
                }
                SourceChip(
                    text = text,
                    isSelected = isSelected,
                    showBadge = false,
                    size = SourceChip.Size.Medium,
                    onClick = {},
                    style = SourceChip.Style.Default,
                    indicatorBefore = ChipIndicator.Icon.Painter(
                        painter = painterResource(R.drawable.ic_list),
                    ),
                )
            }
        }

        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

        Text(
            text = "Supporting chip",
            style = Source.Typography.TextSansBold17,
            color = labelColour.current,
        )

        SourceChipSupportingButton(
            text = "Follow",
            size = SourceChip.Size.Medium,
            onClick = {},
            indicatorBefore = ChipIndicator.Icon.Vector(
                imageVector = Source.Icons.Base.Plus,
            ),
        )
    }
}