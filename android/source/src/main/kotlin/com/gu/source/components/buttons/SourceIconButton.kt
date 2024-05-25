package com.gu.source.components.buttons

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.Check
import com.gu.source.presets.palette.Neutral38
import com.gu.source.theme.LocalSourceTheme
import com.gu.source.theme.ReaderRevenueTheme
import com.gu.source.theme.SourceCoreTheme
import com.gu.source.utils.PhoneBothModePreviews

/**
 * Source icon-only button. This variant allows providing the icon as a composable slot.
 *
 * @param size The size of the button.
 * @param style The style of the button.
 * @param onClick The action to perform when the button is clicked.
 * @param modifier The modifier to apply to the button.
 * @param theme Optional [Source.Theme] to apply to the button. If not provided, the current theme
 * from [LocalSourceTheme] will be used.
 *
 * Unless using the button as a standalone component, it is recommended to wrap the whole
 * screen/sheet with [SourceCoreTheme] or [ReaderRevenueTheme] to provide consistent theme to all
 * child components once.
 * @param icon The icon to display in the button. Use a material [Icon] component to display the
 * icon.
 */
@Composable
fun SourceBaseIconButton(
    size: SourceButton.Size,
    style: SourceButton.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: Source.Theme? = null,
    icon: @Composable (Modifier) -> Unit = {},
) {
    val appliedTheme = theme ?: LocalSourceTheme.current

    require(
        !(appliedTheme == Source.Theme.ReaderRevenue && style.isSecondary()),
    ) { "ReaderRevenue theme doesn't have secondary buttons." }

    val buttonColours = style.toColours(appliedTheme)

    IconButton(
        onClick = onClick,
        modifier = modifier,
        colors = IconButtonDefaults.iconButtonColors(
            contentColor = buttonColours.content.current,
        ),
    ) {
        Box(
            modifier = Modifier
                .defaultMinSize(
                    minWidth = size.heightDp.dp,
                    minHeight = size.heightDp.dp,
                )
                .background(buttonColours.container.current, CircleShape)
                .border(
                    width = 1.dp,
                    color = buttonColours.border.current,
                    shape = CircleShape,
                ),
        ) {
            icon(
                Modifier
                    .align(Alignment.Center)
                    .size(size.iconSizeDp.dp),
            )
        }
    }
}

/**
 * Source icon-only button.
 *
 * @param icon The icon to display in the button. Use an icon from [Source.Icons] or Material
 * [Icons].
 * @param size The size of the button.
 * @param style The style of the button.
 * @param contentDescription The content description for the button.
 * @param onClick The action to perform when the button is clicked.
 * @param modifier The modifier to apply to the button.
 * @param theme Optional [Source.Theme] to apply to the button. If not provided, the current theme
 * from [LocalSourceTheme] will be used.
 *
 * Unless using the button as a standalone component, it is recommended to wrap the whole
 * screen/sheet with [SourceCoreTheme] or [ReaderRevenueTheme] to provide consistent theme to all
 * child components once.
 */
@Composable
fun SourceIconButton(
    icon: ImageVector,
    size: SourceButton.Size,
    style: SourceButton.Style,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: Source.Theme? = null,
) {
    SourceBaseIconButton(
        size = size,
        style = style,
        onClick = onClick,
        modifier = modifier,
        theme = theme,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = it,
        )
    }
}

/**
 * Source icon-only button.
 *
 * @param painter The icon to display in the button.
 * @param size The size of the button.
 * @param style The style of the button.
 * @param contentDescription The content description for the button.
 * @param onClick The action to perform when the button is clicked.
 * @param modifier The modifier to apply to the button.
 * @param theme Optional [Source.Theme] to apply to the button. If not provided, the current theme
 * from [LocalSourceTheme] will be used.
 *
 * Unless using the button as a standalone component, it is recommended to wrap the whole
 * screen/sheet with [SourceCoreTheme] or [ReaderRevenueTheme] to provide consistent theme to all
 * child components once.
 */
@Composable
fun SourceIconButton(
    painter: Painter,
    size: SourceButton.Size,
    style: SourceButton.Style,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: Source.Theme? = null,
) {
    SourceBaseIconButton(
        size = size,
        style = style,
        onClick = onClick,
        modifier = modifier,
        theme = theme,
    ) {
        Icon(
            painter = painter,
            contentDescription = contentDescription,
            modifier = it,
        )
    }
}

/**
 * Source icon-only button.
 *
 * @param icon The icon to display in the button.
 * @param size The size of the button.
 * @param style The style of the button.
 * @param contentDescription The content description for the button.
 * @param onClick The action to perform when the button is clicked.
 * @param modifier The modifier to apply to the button.
 * @param theme Optional [Source.Theme] to apply to the button. If not provided, the current theme
 * from [LocalSourceTheme] will be used.
 *
 * Unless using the button as a standalone component, it is recommended to wrap the whole
 * screen/sheet with [SourceCoreTheme] or [ReaderRevenueTheme] to provide consistent theme to all
 * child components once.
 */
@Composable
fun SourceIconButton(
    icon: ImageBitmap,
    size: SourceButton.Size,
    style: SourceButton.Style,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: Source.Theme? = null,
) {
    SourceBaseIconButton(
        size = size,
        style = style,
        onClick = onClick,
        modifier = modifier,
        theme = theme,
    ) {
        Icon(
            bitmap = icon,
            contentDescription = contentDescription,
            modifier = it,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PhoneBothModePreviews
@Composable
internal fun CoreIconButtonPreview() {
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
                            SourceIconButton(
                                icon = Source.Icons.Base.Check,
                                size = size,
                                style = style,
                                contentDescription = null,
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
internal fun RrIconButtonPreview() {
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
                                SourceIconButton(
                                    icon = Source.Icons.Base.Check,
                                    size = size,
                                    style = style,
                                    contentDescription = null,
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