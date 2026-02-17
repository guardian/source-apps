package com.gu.source.components.buttons

import android.annotation.SuppressLint
import androidx.annotation.Discouraged
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gu.source.Source
import com.gu.source.components.theme.LocalSourceTheme
import com.gu.source.components.theme.ReaderRevenueTheme
import com.gu.source.components.theme.SourceCoreTheme
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.icons.base.Checkmark
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral38
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.foundation.typography.TextSansBold14
import com.gu.source.foundation.typography.TextSansBold15
import com.gu.source.foundation.typography.TextSansBold17
import com.gu.source.utils.PreviewPhoneBothMode

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
        internal val textButtonTextStyle: TextStyle = textStyle,
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
            textButtonTextStyle = Source.Typography.TextSansBold15.copy(letterSpacing = 0.sp),
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

    /**
     * Enum for the priority of the [SourceButton]. Informs users of how important an action is.
     *
     * The priorities are named based on button priority and backdrop colour.
     */
    @Suppress("UndocumentedPublicProperty")
    enum class Priority {
        PrimaryOnBlue,
        SecondaryOnBlue,
        TertiaryOnBlue,
        PrimaryOnWhite,
        SecondaryOnWhite,
        TertiaryOnWhite,
        ;

        internal fun isSecondary() = this in setOf(SecondaryOnWhite, SecondaryOnBlue)

        internal fun isTertiary() = this in setOf(TertiaryOnWhite, TertiaryOnBlue)

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
    @Suppress("UndocumentedPublicProperty")
    enum class IconSide {
        Left,
        Right,
    }
}

/**
 * A basic Source compatible button component.
 * This is a low-level component and should be sparingly used only for custom buttons. Prefer to
 * use [SourceButton] or [SourceIconButton] instead.
 *
 * @param size Button size from [SourceButton.Size]s. Reflects the prominence of the action.
 * @param priority Button priority from [SourceButton.Priority]s. Informs users of how important an
 * action is.
 * @param onClick Callback for action to take when user clicks the button.
 * @param modifier Optional [Modifier]
 * @param enabled Whether the button is enabled and can be interacted with.
 * @param theme Optional [Source.Theme] to apply to the button. If not provided, the current theme
 * from [LocalSourceTheme] will be used.
 *
 * Unless using the button as a standalone component, it is recommended to wrap the whole
 * screen/sheet with [SourceCoreTheme] or [ReaderRevenueTheme] to provide consistent theme to all
 * child components once.
 * @param content Slot for composable content to present inside the button.
 */
@SuppressLint("DiscouragedApi")
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
    enabled: Boolean = true,
    theme: Source.Theme? = null,
    content: @Composable () -> Unit,
) {
    val appliedTheme = theme ?: LocalSourceTheme.current

    require(
        !(appliedTheme == Source.Theme.ReaderRevenue && priority.isSecondary()),
    ) { "ReaderRevenue theme doesn't have secondary buttons." }

    val buttonColours = priority.toColours(appliedTheme)

    PlainSourceContentButton(
        size = size,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        buttonColours = buttonColours,
        content = content,
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
 * @param enabled Whether the button is enabled and can be interacted with.
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
    enabled: Boolean = true,
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
        enabled = enabled,
        theme = theme,
    ) {
        val iconComponent = remember { movableContentOf(icon) }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (iconSide == SourceButton.IconSide.Left) {
                iconComponent(Modifier.size(size.textStyle.fontSize.value.dp))
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
                iconComponent(Modifier.size(size.textStyle.fontSize.value.dp))
            }
        }
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@SuppressLint("DiscouragedApi")
@PreviewPhoneBothMode
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
                                        imageVector = Source.Icons.Base.Checkmark,
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
@Suppress("StringLiteralDuplication")
@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PreviewPhoneBothMode
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
                                            imageVector = Source.Icons.Base.Checkmark,
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
@PreviewPhoneBothMode
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
@PreviewPhoneBothMode
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
@PreviewPhoneBothMode
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
                                        imageVector = Source.Icons.Base.Checkmark,
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
@PreviewPhoneBothMode
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
                                            imageVector = Source.Icons.Base.Checkmark,
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