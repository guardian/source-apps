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
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.Checkmark
import com.gu.source.presets.palette.*
import com.gu.source.theme.LocalSourceTheme
import com.gu.source.theme.ReaderRevenueTheme
import com.gu.source.theme.SourceCoreTheme
import com.gu.source.utils.PreviewPhoneBothMode

private const val ReaderRevenueSecondaryThemeErrorMessage =
    "ReaderRevenue theme doesn't have secondary buttons."

/**
 * Source icon-only button. This variant allows providing the icon as a composable slot.
 *
 * @param size The size of the button. Reflects the prominence of the action.
 * @param buttonColours The colours to apply to the button.
 * @param onClick The action to perform when the button is clicked.
 * @param modifier The modifier to apply to the button.
 * @param enabled Whether the button is enabled and can be interacted with.
 * @param disabledButtonColours Optional colours to apply to the button when it is disabled. If not
 * provided, the [buttonColours] will be used with reduced opacity.
 * @param icon The icon to display in the button. Use a material [Icon] component to display the
 * icon.
 */
@Composable
fun SourceBaseIconButton(
    size: SourceButton.Size,
    buttonColours: ButtonColours,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    disabledButtonColours: ButtonColours? = null,
    icon: @Composable (Modifier) -> Unit = {},
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        colors = IconButtonDefaults.iconButtonColors(
            contentColor = buttonColours.content.current,
            disabledContentColor = buttonColours.content.current.whenEnabled(
                enabled = false,
                disabledColour = disabledButtonColours?.content?.current,
            ),
        ),
        enabled = enabled,
    ) {
        Box(
            modifier = Modifier
                .defaultMinSize(
                    minWidth = size.heightDp.dp,
                    minHeight = size.heightDp.dp,
                )
                .background(
                    color = buttonColours.container.current.whenEnabled(
                        enabled = enabled,
                        disabledColour = disabledButtonColours?.container?.current,
                    ),
                    shape = CircleShape,
                )
                .border(
                    width = 1.dp,
                    color = buttonColours.border.current.whenEnabled(
                        enabled = enabled,
                        disabledColour = disabledButtonColours?.border?.current,
                    ),
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
 * @param priority The priority of the button. Informs users of how important an action is.
 * @param contentDescription The content description for the button.
 * @param onClick The action to perform when the button is clicked.
 * @param modifier The modifier to apply to the button.
 * @param enabled Whether the button is enabled and can be interacted with.
 * @param size Optional size for the button. Reflects the prominence of the action. Defaults to
 * [SourceButton.Size.Medium].
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
    priority: SourceButton.Priority,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: SourceButton.Size = SourceButton.Size.Medium,
    theme: Source.Theme? = null,
) {
    val appliedTheme = theme ?: LocalSourceTheme.current

    require(
        !(appliedTheme == Source.Theme.ReaderRevenue && priority.isSecondary()),
    ) { ReaderRevenueSecondaryThemeErrorMessage }

    SourceBaseIconButton(
        size = size,
        buttonColours = priority.toColours(appliedTheme),
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
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
 * @param priority The priority of the button. Informs users of how important an action is.
 * @param contentDescription The content description for the button.
 * @param onClick The action to perform when the button is clicked.
 * @param modifier The modifier to apply to the button.
 * @param enabled Whether the button is enabled and can be interacted with.
 * @param size Optional size for the button. Reflects the prominence of the action. Defaults to
 * [SourceButton.Size.Medium].
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
    priority: SourceButton.Priority,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: SourceButton.Size = SourceButton.Size.Medium,
    theme: Source.Theme? = null,
) {
    val appliedTheme = theme ?: LocalSourceTheme.current

    require(
        !(appliedTheme == Source.Theme.ReaderRevenue && priority.isSecondary()),
    ) { ReaderRevenueSecondaryThemeErrorMessage }

    SourceBaseIconButton(
        size = size,
        buttonColours = priority.toColours(appliedTheme),
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
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
 * @param priority The priority of the button. Informs users of how important an action is.
 * @param contentDescription The content description for the button.
 * @param onClick The action to perform when the button is clicked.
 * @param modifier The modifier to apply to the button.
 * @param enabled Whether the button is enabled and can be interacted with.
 * @param size Optional size for the button. Reflects the prominence of the action. Defaults to
 * [SourceButton.Size.Medium].
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
    priority: SourceButton.Priority,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: SourceButton.Size = SourceButton.Size.Medium,
    theme: Source.Theme? = null,
) {
    val appliedTheme = theme ?: LocalSourceTheme.current

    require(
        !(appliedTheme == Source.Theme.ReaderRevenue && priority.isSecondary()),
    ) { ReaderRevenueSecondaryThemeErrorMessage }

    SourceBaseIconButton(
        size = size,
        buttonColours = priority.toColours(appliedTheme),
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
    ) {
        Icon(
            bitmap = icon,
            contentDescription = contentDescription,
            modifier = it,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PreviewPhoneBothMode
@Composable
internal fun CoreIconButtonPreview() {
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
                            SourceIconButton(
                                icon = Source.Icons.Base.Checkmark,
                                priority = priority,
                                contentDescription = null,
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
internal fun RrIconButtonPreview() {
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
                                SourceIconButton(
                                    icon = Source.Icons.Base.Checkmark,
                                    priority = priority,
                                    contentDescription = null,
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

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@PreviewPhoneBothMode
@Composable
internal fun SourceBaseIconButtonPreview() {
    AppColourMode {
        Column(
            Modifier.background(
                AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral7,
                ).current,
            ),
        ) {
            Row {
                // Variants with default disable state colours - alpha 0.5
                repeat(2) {
                    SourceBaseIconButton(
                        size = SourceButton.Size.Small,
                        buttonColours = ButtonColours(
                            border = AppColour(
                                light = Source.Palette.Culture200,
                                dark = Source.Palette.Culture600,
                            ),
                            container = AppColour.Transparent,
                            content = AppColour(
                                light = Source.Palette.Culture200,
                                dark = Source.Palette.Culture600,
                            ),
                        ),
                        onClick = { },
                        enabled = it % 2 == 0,
                    ) { modifier ->
                        Icon(
                            imageVector = Source.Icons.Base.Checkmark,
                            contentDescription = null,
                            modifier = modifier,
                        )
                    }
                }
            }
            Row {
                // Variants with explicitly provided disabled state colours
                repeat(2) {
                    SourceBaseIconButton(
                        size = SourceButton.Size.Small,
                        buttonColours = ButtonColours(
                            border = AppColour(
                                light = Source.Palette.Culture200,
                                dark = Source.Palette.Culture600,
                            ),
                            container = AppColour.Transparent,
                            content = AppColour(
                                light = Source.Palette.Culture200,
                                dark = Source.Palette.Culture600,
                            ),
                        ),
                        disabledButtonColours = ButtonColours(
                            border = AppColour(
                                light = Source.Palette.Sport200,
                                dark = Source.Palette.Sport600,
                            ),
                            container = AppColour.Transparent,
                            content = AppColour(
                                light = Source.Palette.Sport200,
                                dark = Source.Palette.Sport600,
                            ),
                        ),
                        onClick = { },
                        enabled = it % 2 == 0,
                    ) { modifier ->
                        Icon(
                            imageVector = Source.Icons.Base.Checkmark,
                            contentDescription = null,
                            modifier = modifier,
                        )
                    }
                }
            }
        }
    }
}