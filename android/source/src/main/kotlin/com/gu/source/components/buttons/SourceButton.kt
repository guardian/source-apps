package com.gu.source.components.buttons

import androidx.annotation.Discouraged
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gu.source.Source
import com.gu.source.components.buttons.SourceButton.MinButtonWidth
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.Check
import com.gu.source.presets.palette.Brand400
import com.gu.source.presets.palette.BrandAlt200
import com.gu.source.presets.palette.BrandAlt400
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.palette.Neutral38
import com.gu.source.presets.palette.Neutral7
import com.gu.source.presets.typography.TextSansBold14
import com.gu.source.presets.typography.TextSansBold17
import com.gu.source.theme.LocalSourceTheme
import com.gu.source.theme.ReaderRevenueTheme
import com.gu.source.theme.SourceCoreTheme
import com.gu.source.utils.PhoneBothModePreviews

/**
 * Object for property models for the [SourceButton] component.
 */
object SourceButton {
    // Horizontal padding updated to match M2 button padding. In M3, the horizontal padding has
    // increased to 24.dp.
    internal val ContentPadding = PaddingValues(
        vertical = 8.dp,
        horizontal = 20.dp,
    )
    internal val ContentPaddingXSmall = PaddingValues(
        vertical = 0.dp,
        horizontal = 20.dp,
    )
    internal val MinButtonWidth = 66.dp

    /** Enum for the size of the [SourceButton]. */
    enum class Size(
        internal val heightDp: Int,
        /** This icon size is used for icons in [SourceIconButton]. */
        internal val iconSizeDp: Int,
        internal val textStyle: TextStyle,
        internal val contentPadding: PaddingValues,
        internal val shortName: String,
    ) {
        /** Thin button, 24dp tall. */
        XSmall(
            heightDp = 24,
            iconSizeDp = 14,
            textStyle = Source.Typography.TextSansBold14.copy(letterSpacing = 0.sp),
            contentPadding = ContentPaddingXSmall,
            shortName = "xsm",
        ),

        /** Normal button, 36dp tall. */
        Small(
            heightDp = 36,
            iconSizeDp = 18,
            textStyle = Source.Typography.TextSansBold17.copy(letterSpacing = 0.sp),
            contentPadding = ContentPadding,
            shortName = "sm",
        ),

        /** Large button, 44dp tall. */
        Medium(
            heightDp = 44,
            iconSizeDp = 22,
            textStyle = Source.Typography.TextSansBold17.copy(letterSpacing = 0.sp),
            contentPadding = ContentPadding,
            shortName = "md",
        ),
    }

    /** Enum for the style of the [SourceButton]. */
    enum class Style {
        PrimaryOnBlue,
        SecondaryOnBlue,
        TertiaryOnBlue,
        PrimaryOnYellow,
        SecondaryOnYellow,
        TertiaryOnYellow,
        PrimaryOnWhite,
        SecondaryOnWhite,
        TertiaryOnWhite,
        ;

        internal fun isSecondary() = this in setOf(
            SecondaryOnWhite,
            SecondaryOnBlue,
            SecondaryOnYellow,
        )

        internal fun getBackdropColour() = when {
            name.endsWith("OnWhite") -> AppColour(
                light = Source.Palette.Neutral100,
                dark = Source.Palette.Neutral0,
            )
            name.endsWith("OnBlue") -> AppColour(
                light = Source.Palette.Brand400,
                dark = Source.Palette.Neutral7,
            )
            name.endsWith("OnYellow") -> AppColour(
                light = Source.Palette.BrandAlt400,
                dark = Source.Palette.BrandAlt200,
            )
            else -> AppColour.Unspecified
        }
    }

    /** Enum for the position of icon relative to the button text. */
    enum class IconPosition {
        Left, Right,
    }
}

/**
 * A basic Source compatible button component.
 * This is a low-level component and should be sparingly used only for custom buttons. Prefer to
 * use [SourceButton] or [SourceBaseIconButton] instead.
 *
 * @param size Button size from [SourceButton.Size]s.
 * @param style Button style from [SourceButton.Style]s.
 * @param onClick Callback for action to take when user clicks the button.
 * @param modifier Optional [Modifier]
 * @param theme Optional [Source.Theme] to apply to the button. If not provided, the current theme
 * from [LocalSourceTheme] will be used.
 *
 * Unless using the button as a standalone component, it is recommended to wrap the whole
 * screen/sheet with [SourceCoreTheme] or [ReaderRevenueTheme] to provide consistent theme to all
 * child components once.
 * @param content Slot for composable content to present inside the button.
 */
@Discouraged(
    "Prefer to use `SourceButton`." +
        " It provide correct correct styling & size for text and icons." +
        " This variant is for custom button designs only.",
)
@Composable
fun SourceBaseButton(
    size: SourceButton.Size,
    style: SourceButton.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: Source.Theme? = null,
    content: @Composable () -> Unit,
) {
    val appliedTheme = theme ?: LocalSourceTheme.current

    require(
        !(appliedTheme == Source.Theme.ReaderRevenue && style.isSecondary()),
    ) { "ReaderRevenue theme doesn't have secondary buttons." }

    val buttonColours = style.toColours(appliedTheme)

    Button(
        onClick = onClick,
        modifier = modifier.defaultMinSize(
            minWidth = MinButtonWidth,
            minHeight = size.heightDp.dp,
        ),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColours.container.current,
            contentColor = buttonColours.content.current,
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            focusedElevation = 0.dp,
            hoveredElevation = 0.dp,
            disabledElevation = 0.dp,
        ),
        border = BorderStroke(
            width = 1.dp,
            color = buttonColours.border.current,
        ),
        contentPadding = size.contentPadding,
        content = { content() },
    )
}

/**
 * A Source button component with text and an optional icon.
 *
 * @param text Text to display on the button.
 * @param size Button size from [SourceButton.Size]s.
 * @param style Button style from [SourceButton.Style]s.
 * @param onClick Callback for action to take when user clicks the button.
 * @param modifier Optional [Modifier]
 * @param theme Optional [Source.Theme] to apply to the button. If not provided, the current theme
 * from [LocalSourceTheme] will be used.
 *
 * Unless using the button as a standalone component, it is recommended to wrap the whole
 * screen/sheet with [SourceCoreTheme] or [ReaderRevenueTheme] to provide consistent theme to all
 * child components once.
 * @param iconPosition Optional position of the icon relative to the button text. Defaults to
 * [SourceButton.IconPosition.Left].
 * @param icon Optional icon to display on the button.
 */
@Composable
fun SourceButton(
    text: String,
    size: SourceButton.Size,
    style: SourceButton.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @Discouraged("Wrap the whole composition in the theme local composition instead.")
    theme: Source.Theme? = null,
    iconPosition: SourceButton.IconPosition = SourceButton.IconPosition.Left,
    icon: @Composable (Modifier) -> Unit = {},
) {
    SourceBaseButton(
        size = size,
        style = style,
        onClick = onClick,
        modifier = modifier,
        theme = theme,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (iconPosition == SourceButton.IconPosition.Left) {
                icon(Modifier.size(size.textStyle.fontSize.value.dp))
            }

            Text(
                text = text,
                style = size.textStyle,
                overflow = TextOverflow.Ellipsis,
                softWrap = false,
                maxLines = 1,
                letterSpacing = 0.sp,
                modifier = Modifier.offset(y = (-1).dp),
            )

            if (iconPosition == SourceButton.IconPosition.Right) {
                icon(Modifier.size(size.textStyle.fontSize.value.dp))
            }
        }
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun CoreButtonIconBeforePreview() {
    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Style.entries.forEach { style ->
                    Row(
                        modifier = Modifier
                            .background(style.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        SourceButton.Size.entries.forEach { size ->
                            SourceButton(
                                text = style.getPreviewName(size),
                                size = size,
                                style = style,
                                onClick = {},
                                iconPosition = SourceButton.IconPosition.Left,
                                icon = {
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
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun RrButtonIconBeforePreview() {
    AppColourMode {
        ReaderRevenueTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Style.entries.forEach { style ->
                    if (!style.name.contains("Secondary")) {
                        Row(
                            modifier = Modifier
                                .background(style.getBackdropColour().current)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                        ) {
                            SourceButton.Size.entries.forEach { size ->
                                SourceButton(
                                    text = style.getPreviewName(size),
                                    size = size,
                                    style = style,
                                    onClick = {},
                                    iconPosition = SourceButton.IconPosition.Left,
                                    icon = {
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
        }
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun CoreButtonTextOnlyPreview() {
    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Style.entries.forEach { style ->
                    Row(
                        modifier = Modifier
                            .background(style.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        SourceButton.Size.entries.forEach { size ->
                            SourceButton(
                                text = style.getPreviewName(size),
                                size = size,
                                style = style,
                                onClick = {},
                            )
                        }
                    }
                }
            }
        }
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun RrButtonTextOnlyPreview() {
    AppColourMode {
        ReaderRevenueTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Style.entries.forEach { style ->
                    if (!style.name.contains("Secondary")) {
                        Row(
                            modifier = Modifier
                                .background(style.getBackdropColour().current)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                        ) {
                            SourceButton.Size.entries.forEach { size ->
                                SourceButton(
                                    text = style.getPreviewName(size),
                                    size = size,
                                    style = style,
                                    onClick = {},
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun CoreButtonIconAfterPreview() {
    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Style.entries.forEach { style ->
                    Row(
                        modifier = Modifier
                            .background(style.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        SourceButton.Size.entries.forEach { size ->
                            SourceButton(
                                text = style.getPreviewName(size),
                                size = size,
                                style = style,
                                onClick = {},
                                iconPosition = SourceButton.IconPosition.Right,
                                icon = {
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
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun RrButtonIconAfterPreview() {
    AppColourMode {
        ReaderRevenueTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Style.entries.forEach { style ->
                    if (!style.name.contains("Secondary")) {
                        Row(
                            modifier = Modifier
                                .background(style.getBackdropColour().current)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                        ) {
                            SourceButton.Size.entries.forEach { size ->
                                SourceButton(
                                    text = style.getPreviewName(size),
                                    size = size,
                                    style = style,
                                    onClick = {},
                                    iconPosition = SourceButton.IconPosition.Right,
                                    icon = {
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
        }
    }
}

private fun SourceButton.Style.getPreviewName(size: SourceButton.Size) =
    "${name.take(n = 3).lowercase()}.${size.shortName}"