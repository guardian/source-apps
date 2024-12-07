package com.gu.source.components.chips

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.R
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.Check
import com.gu.source.icons.Plus
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
    @Suppress("UndocumentedPublicProperty")
    enum class Size(internal val height: Dp) {
        Small(32.dp),
        Medium(40.dp),
    }

    internal val Shape: Shape = RoundedCornerShape(8.dp)
    internal val DefaultBadgeColour = AppColour(Color(color = 0xFF0190F7))

    /**
     * Represents the visual shape and style of a chip component.
     *
     * @property contentColour Colour for the text and icons displayed on the chip.
     * @property fillColour Background colour of the chip.
     * @property textStyle The style of the text displayed on the chip.
     * @property border The border stroke of the chip, including thickness and color.
     * @property shape The shape of the chip (e.g., rounded corners, rectangle).
     * @property badgeColour Colour for the badge displayed on the chip. If `Unspecified`, then the
     * default badge colour will be used.
     * @property rippleColour Optional colour for the ripple effect when the chip is clicked. If
     * not provided, the [contentColour] will be used.
     */
    data class Style(
        val contentColour: AppColour,
        val fillColour: AppColour,
        val textStyle: TextStyle,
        val border: BorderStroke,
        val shape: Shape = Shape,
        val badgeColour: AppColour = AppColour.Unspecified,
        val rippleColour: AppColour = contentColour,
    ) {
        @Suppress("UndocumentedPublicClass")
        companion object {
            /**
             * Default `SourceChip.Style` properties.
             *
             * Does not display a border, and uses a variant of blue for badge colour.
             */
            val Default = Style(
                contentColour = AppColour(
                    light = Source.Palette.Neutral10,
                    dark = Source.Palette.Neutral93,
                ),
                fillColour = AppColour(
                    light = Source.Palette.Neutral93,
                    dark = Source.Palette.Neutral10,
                ),
                textStyle = Source.Typography.TextSansBold14,
                border = BorderStroke(0.dp, Color.Unspecified),
                badgeColour = DefaultBadgeColour,
            )
        }
    }

    /** Represents an icon or image displayed before or after the chip's text. */
    sealed class Indicator {
        /**
         * The content to display. The provided modifier _must_ be set on the content.
         * The modifier is used to apply the correct size to the icon/image.
         */
        abstract val content: @Composable RowScope.(Modifier) -> Unit
        internal abstract val height: Dp

        /**
         * Represents an [Icon] displayed before/after the chip's text. Icon will be tinted with
         * the [SourceChip.Style.contentColour] if `tint` is not explicitly specified on the icon.
         */
        data class Icon(
            override val content: @Composable RowScope.(Modifier) -> Unit,
        ) : Indicator() {
            override val height: Dp = 18.dp
        }

        /** Represents an [Image] displayed before/after the chip's text. */
        data class Image(
            override val content: @Composable RowScope.(Modifier) -> Unit
        ) : Indicator() {
            override val height: Dp = 24.dp
        }

        /** Represents no image or icon displayed before/after the chip's text. */
        data object None : Indicator() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {}
            override val height: Dp = 0.dp
        }
    }
}

/**
 * Displays a chip component with the given text.
 *
 * This variant displays the badge using the [badge] slot. [SourceChip.Style.badgeColour] is passed
 * to the [badge] slot - it is recommended to use this as the `container` colour for the badge.
 *
 * @param text The text displayed inside the chip.
 * @param size The size of the chip. See [SourceChip.Size] for available options.
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param style The style of the chip, including content colour, background colour, border, and
 * more. See [SourceChip.Style].
 * @param allowsMultiSelection Optional - whether the chip allows multiple selections. This is used
 * to set correct semantic role for the chip - checkbox if true, button if false.
 * @param onClickLabel Optional label for the onClick action.
 * @param indicatorBefore Optional content to display an icon/image before the title.
 * @param indicatorAfter Optional content to display an icon/image after the title.
 * @param badge Optional content to display a badge over the chip. Usually a [Badge]. Badge colour
 * is passed to the [badge] slot.
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
    indicatorBefore: SourceChip.Indicator = SourceChip.Indicator.None,
    indicatorAfter: SourceChip.Indicator = SourceChip.Indicator.None,
    badge: @Composable ((Color) -> Unit)? = null,
) {
    SourceBaseChip(
        height = size.height,
        style = style,
        onClick = onClick,
        modifier = modifier,
        allowsMultiSelection = allowsMultiSelection,
        onClickLabel = onClickLabel,
        badge = badge?.let { badgeSlot ->
            {
                val badgeColour = if (style.badgeColour.current.isSpecified) {
                    style.badgeColour.current
                } else {
                    SourceChip.DefaultBadgeColour.current
                }
                badgeSlot(badgeColour)
            }
        },
    ) {
        CompositionLocalProvider(LocalContentColor provides style.contentColour.current) {
            Spacer(modifier = Modifier.width(12.dp))
            indicatorBefore.content(this, Modifier.height(indicatorBefore.height))
            Spacer(
                modifier = Modifier.width(
                    when (indicatorBefore) {
                        SourceChip.Indicator.None -> 4.dp
                        is SourceChip.Indicator.Icon -> 4.dp
                        is SourceChip.Indicator.Image -> 8.dp
                    },
                ),
            )
            Text(
                text = text,
                style = style.textStyle,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier,
            )
            Spacer(
                modifier = Modifier.width(
                    if (indicatorAfter is SourceChip.Indicator.None) 4.dp else 8.dp,
                ),
            )
            indicatorAfter.content(this, Modifier.height(indicatorAfter.height))
        }
        Spacer(modifier = Modifier.width(12.dp))
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
 * @param style The style of the chip, including text colour, background colour, border, and more.
 * @param allowsMultiSelection Optional - whether the chip allows multiple selections. This is used
 * to set correct semantic role for the chip - checkbox if true, button if false.
 * @param onClickLabel Optional label for the onClick action.
 * @param indicatorBefore Optional content to display an icon/image before the title.
 * @param indicatorAfter Optional content to display an icon/image after the title.
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
    indicatorBefore: SourceChip.Indicator = SourceChip.Indicator.None,
    indicatorAfter: SourceChip.Indicator = SourceChip.Indicator.None,
) {
    SourceChip(
        text = text,
        size = size,
        style = style,
        onClick = onClick,
        modifier = modifier,
        allowsMultiSelection = allowsMultiSelection,
        onClickLabel = onClickLabel,
        indicatorBefore = indicatorBefore,
        indicatorAfter = indicatorAfter,
        badge = if (showBadge) {
            { Badge(containerColor = it) }
        } else {
            null
        },
    )
}

@SuppressLint("DiscouragedApi")
@OptIn(ExperimentalLayoutApi::class)
@PreviewPhoneBothMode
@Composable
private fun Preview() {
    val previewText = "Label"
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
                        text = previewText,
                        size = it,
                        onClick = {},
                        badge = {},
                    )

                    SourceChip(
                        text = previewText,
                        size = it,
                        onClick = {},
                        badge = {},
                        indicatorBefore = SourceChip.Indicator.Icon {
                            Icon(
                                imageVector = Source.Icons.Base.Plus,
                                contentDescription = null,
                                modifier = it,
                            )
                        },
                    )

                    SourceChip(
                        text = previewText,
                        size = it,
                        onClick = {},
                        badge = {},
                        indicatorBefore = SourceChip.Indicator.Image {
                            Image(
                                painter = painterResource(R.drawable.marina_hyde),
                                contentDescription = null,
                                modifier = it,
                            )
                        },
                    )

                    SourceChip(
                        text = previewText,
                        size = it,
                        onClick = {},
                        badge = {},
                        indicatorBefore = SourceChip.Indicator.Image {
                            Image(
                                painter = painterResource(R.drawable.marina_hyde),
                                contentDescription = null,
                                modifier = it,
                            )
                        },
                        indicatorAfter = SourceChip.Indicator.Icon {
                            Icon(
                                imageVector = Source.Icons.Base.Check,
                                contentDescription = null,
                                modifier = it,
                            )
                        },
                    )

                    SourceChip(
                        text = previewText,
                        showBadge = true,
                        size = it,
                        onClick = {},
                        style = SourceChip.Style.Default.copy(
                            badgeColour = AppColour.Unspecified,
                        ),
                        indicatorAfter = SourceChip.Indicator.Icon {
                            Icon(
                                imageVector = Source.Icons.Base.Check,
                                contentDescription = null,
                                modifier = it,
                            )
                        },
                    )
                }
            }
        }
    }
}