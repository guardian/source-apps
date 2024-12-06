package com.gu.source.components.chips

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.presets.palette.Neutral10
import com.gu.source.presets.palette.Neutral46
import com.gu.source.presets.palette.Neutral93
import com.gu.source.presets.typography.TextSansBold14
import com.gu.source.utils.PreviewPhoneBothMode

/**
 * Object defining property models for `SourceChip`s.
 */
object SourceChip {
    /** Supported `SourceChip` sizes. */
    enum class Size(internal val height: Dp) {
        Small(32.dp),
        Medium(40.dp),
    }

    internal val Shape: Shape = RoundedCornerShape(8.dp)

    /**
     * Represents the visual shape and style of a chip component.
     *
     * @property textColour The color of the text displayed on the chip.
     * @property badgeColour The color of the badge displayed on the chip.
     * @property fillColour The background color of the chip.
     * @property rippleColour Optional color for the ripple effect when the chip is clicked. If not
     * provided, the [textColour] will be used.
     * @property textStyle The style of the text displayed on the chip.
     * @property border The border stroke of the chip, including thickness and color.
     * @property shape The shape of the chip (e.g., rounded corners, rectangle).
     */
    data class Style(
        val textColour: AppColour,
        val badgeColour: AppColour,
        val fillColour: AppColour,
        val rippleColour: AppColour = textColour,
        val textStyle: TextStyle,
        val border: BorderStroke,
        val shape: Shape = Shape,
    ) {
        @Suppress("UndocumentedPublicClass")
        companion object {
            /**
             * Default `SourceChip.Style` properties.
             *
             * Does not display a border, and uses a variant of blue for badge colour.
             */
            val Default = Style(
                textColour = AppColour(
                    light = Source.Palette.Neutral10,
                    dark = Source.Palette.Neutral93,
                ),
                badgeColour = AppColour(Color(0xFF0190F7)),
                textStyle = Source.Typography.TextSansBold14,
                border = BorderStroke(0.dp, Color.Unspecified),
                fillColour = AppColour(
                    light = Source.Palette.Neutral93,
                    dark = Source.Palette.Neutral10,
                ),
            )
        }
    }
}

/**
 * Displays a chip component with the given text.
 *
 * This variant displays the badge using the [badge] slot. [style.badgeColour] is ignored.
 *
 * @param text The text displayed inside the chip.
 * @param size The size of the chip.
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param style The style of the chip, including text color, background color, border, and more.
 * @param allowsMultiSelection Optional - whether the chip allows multiple selections. This is used
 * to set correct semantic role for the chip - checkbox if true, button if false.
 * @param onClickLabel Optional label for the onClick action.
 * @param iconBefore Optional content to display an icon before the title. Usually an [Icon].
 * @param iconAfter Optional content to display an icon after the title. Usually an [Icon].
 * @param badge Optional content to display a badge over the chip. Usually a [Badge].
 */
@Composable
fun SourceChip(
    text: String,
    size: SourceChip.Size,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SourceChip.Style = SourceChip.Style.Default,
    allowsMultiSelection: Boolean = false,
    onClickLabel: String? = null,
    iconBefore: @Composable (() -> Unit)? = null,
    iconAfter: @Composable (() -> Unit)? = null,
    badge: @Composable (() -> Unit)? = null,
) {
    SourceBaseChip(
        height = size.height,
        style = style,
        onClick = onClick,
        modifier = modifier,
        allowsMultiSelection = allowsMultiSelection,
        onClickLabel = onClickLabel,
        iconBefore = iconBefore,
        iconAfter = iconAfter,
        badge = badge,
    ) {
        Text(
            text = text,
            color = style.textColour.current,
            style = style.textStyle,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(horizontal = 16.dp),
        )
    }
}

/**
 * Displays a chip component with the given text and a badge.
 *
 * This variant displays the default badge in a colour defined by the [style].
 *
 * @param text The text displayed inside the chip.
 * @param size The size of the chip.
 * @param showBadge Whether to display a badge on the chip. If true, the badge will be displayed
 * with the colour defined in [style].
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param style The style of the chip, including text color, background color, border, and more.
 * @param allowsMultiSelection Optional - whether the chip allows multiple selections. This is used
 * to set correct semantic role for the chip - checkbox if true, button if false.
 * @param onClickLabel Optional label for the onClick action.
 * @param iconBefore Optional content to display an icon before the title. Usually an [Icon].
 * @param iconAfter Optional content to display an icon after the title. Usually an [Icon].
 */
@Composable
fun SourceChip(
    text: String,
    size: SourceChip.Size,
    showBadge: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SourceChip.Style = SourceChip.Style.Default,
    allowsMultiSelection: Boolean = false,
    onClickLabel: String? = null,
    iconBefore: @Composable (() -> Unit)? = null,
    iconAfter: @Composable (() -> Unit)? = null,
) {
    SourceChip(
        text = text,
        size = size,
        style = style,
        onClick = onClick,
        modifier = modifier,
        allowsMultiSelection = allowsMultiSelection,
        onClickLabel = onClickLabel,
        iconBefore = iconBefore,
        iconAfter = iconAfter,
        badge = if (showBadge) {
            { Badge(containerColor = style.badgeColour.current) }
        } else {
            null
        },
    )
}

@OptIn(ExperimentalLayoutApi::class)
@PreviewPhoneBothMode
@Composable
private fun Preview() {
    AppColourMode {
        Column {
            SourceChip.Size.entries.forEach {
                FlowRow(
                    modifier = Modifier
                        .background(Source.Palette.Neutral46)
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),

                    ) {
                    SourceChip(
                        text = "Label",
                        size = it,
                        onClick = {},
                        badge = {},
                    )

                    SourceChip(
                        text = "Label",
                        showBadge = true,
                        size = it,
                        onClick = {},
                    )

                }
            }
        }
    }
}