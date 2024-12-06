package com.gu.source.components.chips

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Badge
import androidx.compose.material3.Icon
import androidx.compose.material3.ripple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.ExpandingText
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.AlertRound
import com.gu.source.icons.Check
import com.gu.source.presets.palette.Neutral10
import com.gu.source.presets.palette.Neutral46
import com.gu.source.presets.palette.Neutral93
import com.gu.source.presets.palette.Sport400
import com.gu.source.presets.typography.TextSansBold14
import com.gu.source.utils.PreviewPhoneBothMode
import kotlinx.coroutines.delay

/**
 * Composable function to render a customizable chip component with optional icons, image, and badge.
 * The chip can display an expandable or collapsible text title depending on the visibility state.
 *
 * @param height Height of the chip container in Dp.
 * @param style Styling information for the chip.
 * @param rippleColour Color of the ripple effect when the chip is clicked.
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param allowsMultiSelection Optional - whether the chip allows multiple selections. This is used
 * to set correct semantic role for the chip - checkbox if true, button if false.
 * @param onClickLabel Optional label for the onClick action.
 * @param iconBefore Optional content to display an icon before the title. Usually an [Icon].
 * @param iconAfter Optional content to display an icon after the title. Usually an [Icon].
 * @param badge Optional content to display a badge over the chip. Usually a [Badge].
 * @param text The text displayed inside the chip.
 */
@Composable
fun SourceBaseChip(
    height: Dp,
    style: SourceChip.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    allowsMultiSelection: Boolean = false,
    onClickLabel: String? = null,
    iconBefore: @Composable (() -> Unit)? = null,
    iconAfter: @Composable (() -> Unit)? = null,
    badge: @Composable (() -> Unit)? = null,
    text: @Composable () -> Unit,
) {
    Box(modifier = modifier) {
        Row(
            modifier = Modifier
                // Padding to allow Badge to overflow a bit
                .padding(top = 2.dp)
                .heightIn(min = height)
                .background(color = style.fillColour.current, shape = style.shape)
                .border(border = style.border, shape = style.shape)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = ripple(color = style.rippleColour.current),
                    onClickLabel = onClickLabel,
                    role = if (allowsMultiSelection) Role.Checkbox else Role.Button,
                    onClick = onClick,
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            iconBefore?.invoke()
            text()
            iconAfter?.invoke()
        }
        badge?.invoke()
    }
}

/**
 * Preview function to display the BaseChipView with various configurations.
 */
@PreviewPhoneBothMode
@Composable
internal fun SourceBaseChipPreview() {
    val textColor = AppColour(
        light = Source.Palette.Neutral10,
        dark = Source.Palette.Neutral93,
    )
    var showText by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(timeMillis = 1000)
            showText = !showText
        }
    }

    AppColourMode {
        Box(modifier = it.background(Source.Palette.Neutral46)) {
            SourceBaseChip(
                height = SourceChip.Size.Medium.height,
                style = SourceChip.Style.Default,
                onClick = { },
                iconBefore = {
                    Icon(
                        imageVector = Source.Icons.Base.AlertRound,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = textColor.current,
                    )
                },
                iconAfter = {
                    Icon(
                        imageVector = Source.Icons.Base.Check,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = textColor.current,
                    )
                },
                badge = {
                    Badge(containerColor = Source.Palette.Sport400)
                },
            ) {
                ExpandingText(
                    text = "Chip Title",
                    style = Source.Typography.TextSansBold14,
                    colour = textColor.current,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    isVisible = showText,
                )
            }
        }
    }
}