package com.gu.source.components.buttons

import android.annotation.SuppressLint
import androidx.annotation.Discouraged
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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

    /** Enum for the size of the [SourceButton]. Reflects the prominence of the action. */
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

    /** Enum for the priority of the [SourceButton]. Informs users of how important an action is. */
    enum class Priority {
        PrimaryOnBlue,
        SecondaryOnBlue,
        TertiaryOnBlue,
        PrimaryOnWhite,
        SecondaryOnWhite,
        TertiaryOnWhite,
        ;

        internal fun isSecondary() = this in setOf(SecondaryOnWhite, SecondaryOnBlue)

        internal fun getBackdropColour() = when {
            name.endsWith("OnWhite") -> AppColour(
                light = Source.Palette.Neutral100,
                dark = Source.Palette.Neutral7,
            )
            name.endsWith("OnBlue") -> AppColour(
                light = Source.Palette.Brand400,
                dark = Source.Palette.Neutral7,
            )
            else -> AppColour.Unspecified
        }
    }

    /** Enum for the side of the button on which the icon appears. */
    enum class IconSide {
        Left,
        Right,
    }
}

/**
 * A basic Source compatible button component.
 * This is a low-level component and should be sparingly used only for custom buttons. Prefer to
 * use [SourceButton] or [SourceBaseIconButton] instead.
 *
 * @param size Button size from [SourceButton.Size]s. Reflects the prominence of the action.
 * @param priority Button priority from [SourceButton.Priority]s. Informs users of how important an
 * action is.
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
    "Preferably use `SourceButton`." +
        " It provides correct styling & size for text and icons." +
        " This variant is for supporting custom button designs only.",
)
@Composable
fun SourceContentButton(
    size: SourceButton.Size,
    priority: SourceButton.Priority,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: Source.Theme? = null,
    content: @Composable () -> Unit,
) {
    val appliedTheme = theme ?: LocalSourceTheme.current

    require(
        !(appliedTheme == Source.Theme.ReaderRevenue && priority.isSecondary()),
    ) { "ReaderRevenue theme doesn't have secondary buttons." }

    val buttonColours = priority.toColours(appliedTheme)

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
 * @param priority Button priority from [SourceButton.Priority]s. Informs users of how important an
 * action is.
 * @param onClick Callback for action to take when user clicks the button.
 * @param modifier Optional [Modifier]
 * @param size Optional button size from [SourceButton.Size]s. Reflects the prominence of the
 * action. Defaults to [SourceButton.Size.Small].
 * @param theme Optional [Source.Theme] to apply to the button. If not provided, the current theme
 * from [LocalSourceTheme] will be used.
 *
 * Unless using the button as a standalone component, it is recommended to wrap the whole
 * screen/sheet with [SourceCoreTheme] or [ReaderRevenueTheme] to provide consistent theme to all
 * child components once.
 * @param iconSide Optional the side of the button on which the icon appears. Defaults to
 * [SourceButton.IconSide.Left].
 * @param icon Optional icon to display on the button.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun SourceButton(
    text: String,
    priority: SourceButton.Priority,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: SourceButton.Size = SourceButton.Size.Small,
    theme: Source.Theme? = null,
    iconSide: SourceButton.IconSide = SourceButton.IconSide.Left,
    icon: @Composable (Modifier) -> Unit = {},
) {
    SourceContentButton(
        size = size,
        priority = priority,
        onClick = onClick,
        modifier = modifier,
        theme = theme,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (iconSide == SourceButton.IconSide.Left) {
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

            if (iconSide == SourceButton.IconSide.Right) {
                icon(Modifier.size(size.textStyle.fontSize.value.dp))
            }
        }
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@SuppressLint("DiscouragedApi")
@PhoneBothModePreviews
@Composable
internal fun CoreButtonIconBeforePreview() {
    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Priority.entries.forEach { priority ->
                    Row(
                        modifier = Modifier
                            .background(priority.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        SourceButton.Size.entries.forEach { size ->
                            SourceButton(
                                text = priority.getPreviewName(size),
                                priority = priority,
                                onClick = {},
                                size = size,
                                iconSide = SourceButton.IconSide.Left,
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

@SuppressLint("DiscouragedApi")
@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun RrButtonIconBeforePreview() {
    AppColourMode {
        ReaderRevenueTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Priority.entries.forEach { priority ->
                    if (!priority.name.contains("Secondary")) {
                        Row(
                            modifier = Modifier
                                .background(priority.getBackdropColour().current)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                        ) {
                            SourceButton.Size.entries.forEach { size ->
                                SourceButton(
                                    text = priority.getPreviewName(size),
                                    priority = priority,
                                    onClick = {},
                                    size = size,
                                    iconSide = SourceButton.IconSide.Left,
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
                SourceButton.Priority.entries.forEach { priority ->
                    Row(
                        modifier = Modifier
                            .background(priority.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        SourceButton.Size.entries.forEach { size ->
                            SourceButton(
                                text = priority.getPreviewName(size),
                                priority = priority,
                                onClick = {},
                                size = size,
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
                SourceButton.Priority.entries.forEach { priority ->
                    if (!priority.name.contains("Secondary")) {
                        Row(
                            modifier = Modifier
                                .background(priority.getBackdropColour().current)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                        ) {
                            SourceButton.Size.entries.forEach { size ->
                                SourceButton(
                                    text = priority.getPreviewName(size),
                                    priority = priority,
                                    onClick = {},
                                    size = size,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@SuppressLint("DiscouragedApi")
@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun CoreButtonIconAfterPreview() {
    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Priority.entries.forEach { priority ->
                    Row(
                        modifier = Modifier
                            .background(priority.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        SourceButton.Size.entries.forEach { size ->
                            SourceButton(
                                text = priority.getPreviewName(size),
                                priority = priority,
                                onClick = {},
                                size = size,
                                iconSide = SourceButton.IconSide.Right,
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

@SuppressLint("DiscouragedApi")
@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun RrButtonIconAfterPreview() {
    AppColourMode {
        ReaderRevenueTheme {
            Column(Modifier.background(Source.Palette.Neutral38)) {
                SourceButton.Priority.entries.forEach { priority ->
                    if (!priority.name.contains("Secondary")) {
                        Row(
                            modifier = Modifier
                                .background(priority.getBackdropColour().current)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                        ) {
                            SourceButton.Size.entries.forEach { size ->
                                SourceButton(
                                    text = priority.getPreviewName(size),
                                    priority = priority,
                                    onClick = {},
                                    size = size,
                                    iconSide = SourceButton.IconSide.Right,
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

private fun SourceButton.Priority.getPreviewName(size: SourceButton.Size) =
    "${name.take(n = 3).lowercase()}.${size.shortName}"