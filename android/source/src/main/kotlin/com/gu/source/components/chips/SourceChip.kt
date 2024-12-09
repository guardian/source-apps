package com.gu.source.components.chips

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.gu.source.components.HorizontalExpandingText
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.Check
import com.gu.source.icons.Plus
import com.gu.source.presets.palette.Neutral10
import com.gu.source.presets.palette.Neutral38
import com.gu.source.presets.palette.Neutral86
import com.gu.source.presets.palette.Neutral93
import com.gu.source.presets.typography.TextSans14
import com.gu.source.presets.typography.TextSansBold14
import com.gu.source.presets.typography.TextSansBold17
import com.gu.source.utils.PreviewPhoneBothMode
import kotlinx.coroutines.delay

/**
 * Object defining property models for `SourceChip`s.
 */
object SourceChip {
    /** Supported `SourceChip` sizes. */
    @Suppress("UndocumentedPublicProperty")
    enum class Size(
        internal val height: Dp,
    ) {
        Small(32.dp),
        Medium(40.dp),
    }

    internal val Shape: Shape = RoundedCornerShape(8.dp)
    internal val DefaultBadgeColour = AppColour(Color(color = 0xFF0190F7))

    /**
     * Represents the visual shape and style of a chip component.
     *
     * @property contentColourUnselected Colour for the text and icons displayed on the chip when it
     * is not selected.
     * @property contentColourSelected Colour for the text and icons displayed on the chip when it
     * is selected.
     * @property fillColourUnselected Background colour of the chip when it is not selected.
     * @property fillColourSelected Background colour of the chip when it is selected.
     * @property textStyle The style of the text displayed on the chip.
     * @property borderColourUnselected Border colour of the chip when it is not selected.
     * @property borderColourSelected Border colour of the chip when it is selected.
     * @property borderWidth Thickness of the border stroke.
     * @property shape Shape of the chip.
     * @property badgeColour Colour for the badge displayed on the chip. If `Unspecified`, then the
     * default badge colour will be used.
     */
    data class Style(
        val contentColourUnselected: AppColour,
        val contentColourSelected: AppColour,
        val fillColourUnselected: AppColour,
        val fillColourSelected: AppColour,
        val textStyle: TextStyle = Source.Typography.TextSansBold14,
        val borderColourUnselected: AppColour = AppColour.Unspecified,
        val borderColourSelected: AppColour = borderColourUnselected,
        val borderWidth: Dp = Dp.Unspecified,
        val shape: Shape = Shape,
        val badgeColour: AppColour = DefaultBadgeColour,
    ) {
        @Composable
        internal fun toSourceBaseChipStyle(isSelected: Boolean) = SourceBaseChip.Style(
            fillColour = if (isSelected) {
                fillColourSelected.current
            } else {
                fillColourUnselected.current
            },
            border = BorderStroke(
                width = borderWidth,
                color = if (isSelected) {
                    borderColourSelected.current
                } else {
                    borderColourUnselected.current
                },
            ),
            shape = shape,
            rippleColour = if (isSelected) {
                contentColourSelected.current
            } else {
                contentColourUnselected.current
            },
        )

        @Suppress("UndocumentedPublicClass")
        companion object {
            /**
             * Default `SourceChip.Style` properties.
             *
             * Does not display a border, and uses a variant of blue for badge colour.
             */
            val Default = Style(
                contentColourUnselected = AppColour(
                    light = Source.Palette.Neutral10,
                    dark = Source.Palette.Neutral93,
                ),
                contentColourSelected = AppColour(
                    light = Source.Palette.Neutral93,
                    dark = Source.Palette.Neutral10,
                ),
                fillColourUnselected = AppColour(
                    light = Source.Palette.Neutral93,
                    dark = Source.Palette.Neutral10,
                ),
                fillColourSelected = AppColour(
                    light = Source.Palette.Neutral10,
                    dark = Source.Palette.Neutral93,
                ),
            )

            /**
             * `SourceChip.Style` for the [SourceChipSupportingButton] component.
             *
             * Displays a border, has no fill colour, and does not support displaying a badge.
             */
            val SupportingButton = Style(
                contentColourUnselected = AppColour(
                    light = Source.Palette.Neutral10,
                    dark = Source.Palette.Neutral93,
                ),
                contentColourSelected = AppColour(
                    light = Source.Palette.Neutral10,
                    dark = Source.Palette.Neutral93,
                ),
                fillColourUnselected = AppColour.Transparent,
                fillColourSelected = AppColour.Transparent,
                borderColourUnselected = AppColour(
                    light = Source.Palette.Neutral86,
                    dark = Source.Palette.Neutral38,
                ),
                borderColourSelected = AppColour(
                    light = Source.Palette.Neutral86,
                    dark = Source.Palette.Neutral38,
                ),
                borderWidth = 1.dp,
                shape = Shape,
                badgeColour = AppColour.Transparent,
            )
        }
    }
}

/**
 * Single-selection variant of the [SourceChip] component. This chip is designed to be used in a row
 * of chips where only one chip can be selected at a time.
 *
 * @param text The text displayed inside the chip.
 * @param isSelected Whether the chip is selected.
 * @param size The size of the chip. See [SourceChip.Size] for available options.
 * @param showBadge Whether to display a badge on the chip. If true, the badge will be displayed
 * with the colour defined in [style].
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param style The style of the chip, including content colour, background colour, border, and
 * more. See [SourceChip.Style]. Defaults to [SourceChip.Style.Default].
 * @param onClickLabel Optional label for the onClick action.
 * @param indicatorBefore Optional content to display an icon/image before the title.
 */
@Composable
fun SourceChip(
    text: String,
    isSelected: Boolean,
    size: SourceChip.Size,
    showBadge: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SourceChip.Style = SourceChip.Style.Default,
    onClickLabel: String? = null,
    indicatorBefore: ChipIndicator = ChipIndicator.None,
) {
    SourceChip(
        text = text,
        isSelected = isSelected,
        size = size,
        showBadge = showBadge,
        onClick = onClick,
        modifier = modifier,
        style = style,
        onClickLabel = onClickLabel,
        indicatorBefore = indicatorBefore,
        indicatorAfter = ChipIndicator.None,
    )
}

/**
 * Multi-select version of the [SourceChip] component. This chip is designed to be used in a row of
 * chips where multiple chips can be selected at once. When [isSelected] is true, a check icon will
 * be displayed after the title.
 *
 * @param text The text displayed inside the chip.
 * @param isSelected Whether the chip is selected.
 * @param size The size of the chip. See [SourceChip.Size] for available options.
 * @param showBadge Whether to display a badge on the chip. If true, the badge will be displayed
 * with the colour defined in [style].
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param style The style of the chip, including content colour, background colour, border, and
 * more. See [SourceChip.Style]. Defaults to [SourceChip.Style.Default].
 * @param onClickLabel Optional label for the onClick action.
 * @param indicatorBefore Optional content to display an icon/image before the title.
 */
@Composable
fun SourceMultiSelectChip(
    text: String,
    isSelected: Boolean,
    size: SourceChip.Size,
    showBadge: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SourceChip.Style = SourceChip.Style.Default,
    onClickLabel: String? = null,
    indicatorBefore: ChipIndicator = ChipIndicator.None,
) {
    SourceChip(
        text = text,
        isSelected = isSelected,
        size = size,
        showBadge = showBadge,
        onClick = onClick,
        modifier = modifier,
        style = style,
        allowsMultiSelection = true,
        onClickLabel = onClickLabel,
        indicatorBefore = indicatorBefore,
        indicatorAfter = if (isSelected) {
            ChipIndicator.Icon.Vector(imageVector = Source.Icons.Base.Check)
        } else {
            ChipIndicator.None
        },
    )
}

/**
 * Displays a chip component with the given text and a badge.
 *
 * This variant displays the default badge in a colour defined by the [style].
 *
 * @param text The text displayed inside the chip.
 * @param isSelected Whether the chip is selected.
 * @param size The size of the chip. See [SourceChip.Size] for available options.
 * @param showBadge Whether to display a badge on the chip. If true, the badge will be displayed
 * with the colour defined in [style].
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param style The style of the chip, including content colour, background colour, border, and
 * more. See [SourceChip.Style]. Defaults to [SourceChip.Style.Default].
 * @param allowsMultiSelection Optional - whether the chip allows multiple selections. This is used
 * to set correct semantic role for the chip - checkbox if true, button if false.
 * @param onClickLabel Optional label for the onClick action.
 * @param indicatorBefore Optional content to display an icon/image before the title.
 * @param indicatorAfter Optional content to display an icon/image after the title.
 */
@Composable
fun SourceChip(
    text: String,
    isSelected: Boolean,
    size: SourceChip.Size,
    showBadge: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SourceChip.Style = SourceChip.Style.Default,
    allowsMultiSelection: Boolean = false,
    onClickLabel: String? = null,
    indicatorBefore: ChipIndicator = ChipIndicator.None,
    indicatorAfter: ChipIndicator = ChipIndicator.None,
) {
    SourceChip(
        text = text,
        isSelected = isSelected,
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

/**
 * Displays a chip component with the given text.
 *
 * This variant displays the badge using the [badge] slot. [SourceChip.Style.badgeColour] is passed
 * to the [badge] slot - it is recommended to use this as the `container` colour for the badge.
 *
 * @param text The text displayed inside the chip.
 * @param isSelected Whether the chip is selected.
 * @param size The size of the chip. See [SourceChip.Size] for available options.
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param style The style of the chip, including content colour, background colour, border, and
 * more. See [SourceChip.Style]. Defaults to [SourceChip.Style.Default].
 * @param allowsMultiSelection Optional - whether the chip allows multiple selections. This is used
 * to set correct semantic role for the chip - checkbox if true, button if false.
 * @param onClickLabel Optional label for the onClick action.
 * @param indicatorBefore Optional content to display an icon/image before the title.
 * @param indicatorAfter Optional content to display an icon/image after the title.
 * @param badge Optional content to display a badge over the chip. Usually a [Badge]. Badge colour
 * is passed to the [badge] slot.
 */
@SuppressLint("DiscouragedApi")
@Suppress("CognitiveComplexMethod")
@Composable
fun SourceChip(
    text: String,
    isSelected: Boolean,
    size: SourceChip.Size,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SourceChip.Style = SourceChip.Style.Default,
    allowsMultiSelection: Boolean = false,
    onClickLabel: String? = null,
    indicatorBefore: ChipIndicator = ChipIndicator.None,
    indicatorAfter: ChipIndicator = ChipIndicator.None,
    badge: @Composable ((Color) -> Unit)? = null,
) {
    SourceBaseChip(
        height = size.height,
        style = style.toSourceBaseChipStyle(isSelected),
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
        val contentColour = if (isSelected) {
            style.contentColourSelected.current
        } else {
            style.contentColourUnselected.current
        }
        CompositionLocalProvider(LocalContentColor provides contentColour) {
            Spacer(modifier = Modifier.width(12.dp))
            indicatorBefore.content(this, Modifier.height(indicatorBefore.height))

            AnimatedVisibility(visible = text.isNotBlank()) {
                Spacer(
                    modifier = Modifier.width(
                        when (indicatorBefore) {
                            ChipIndicator.None -> 4.dp
                            is ChipIndicator.Icon -> 4.dp
                            is ChipIndicator.Image -> 8.dp
                        },
                    ),
                )
            }

            HorizontalExpandingText(
                text = text,
                colour = contentColour,
                style = style.textStyle,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )

            AnimatedVisibility(visible = text.isNotBlank()) {
                Spacer(
                    modifier = Modifier.width(
                        if (indicatorAfter is ChipIndicator.None) 4.dp else 8.dp,
                    ),
                )
            }

            indicatorAfter.content(this, Modifier.height(indicatorAfter.height))
            Spacer(modifier = Modifier.width(12.dp))
        }
    }
}

/**
 * Displays a [SourceChip] component that acts as a button. This button is designed to be used
 * inline with a row of chips.
 *
 * The sizing and style of the button is same as the chips.
 *
 * @param text The text displayed inside the button.
 * @param size The size of the button. See [SourceChip.Size] for available options.
 * @param onClick Callback triggered when the button is clicked.
 * @param modifier Modifier to adjust the button layout or appearance.
 * @param style The style of the button, including text colour, background colour, border, and more.
 * Defaults to [SourceChip.Style.SupportingButton].
 * @param indicatorBefore Optional content to display an icon/image before the title.
 */
@Composable
fun SourceChipSupportingButton(
    text: String,
    size: SourceChip.Size,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: SourceChip.Style = SourceChip.Style.SupportingButton,
    indicatorBefore: ChipIndicator = ChipIndicator.None,
) {
    SourceChip(
        text = text,
        isSelected = false,
        size = size,
        style = style,
        onClick = onClick,
        modifier = modifier,
        indicatorBefore = indicatorBefore,
        indicatorAfter = ChipIndicator.None,
    )
}

@Suppress("CognitiveComplexMethod")
@OptIn(ExperimentalLayoutApi::class)
@PreviewPhoneBothMode
@Composable
internal fun SourceChipPreview(modifier: Modifier = Modifier) {
    AppColourMode {
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
}