package com.gu.source.components.buttons

import com.gu.source.Source
import com.gu.source.Source.Theme.Core
import com.gu.source.Source.Theme.ReaderRevenue
import com.gu.source.components.buttons.SourceButton.Priority.*
import com.gu.source.daynight.AppColour
import com.gu.source.presets.palette.*

internal data class ButtonColours(
    val border: AppColour,
    val container: AppColour,
    val content: AppColour,
)

@Suppress("CyclomaticComplexMethod", "LongMethod")
/**
 * Maps a [SourceButton.Priority] to a set of colours based on the theme.
 */
// TODO: 25/05/2024 Dark mode colours
internal fun SourceButton.Priority.toColours(theme: Source.Theme) = when (theme) {
    Core -> when (this) {
        PrimaryOnWhite -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral86,
                ),
                container = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral86,
                ),
                content = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Brand400,
                ),
            )
        }

        SecondaryOnWhite -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Brand800,
                ),
                container = AppColour(
                    light = Source.Palette.Brand800,
                ),
                content = AppColour(
                    light = Source.Palette.Brand400,
                ),
            )
        }

        TertiaryOnWhite -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral86,
                ),
                container = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral0,
                ),
                content = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral86,
                ),
            )
        }

        PrimaryOnBlue -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Neutral100,
                ),
                container = AppColour(
                    light = Source.Palette.Neutral100,
                ),
                content = AppColour(
                    light = Source.Palette.Brand400,
                ),
            )
        }

        SecondaryOnBlue -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Brand600,
                ),
                container = AppColour(
                    light = Source.Palette.Brand600,
                ),
                content = AppColour(
                    light = Source.Palette.Neutral100,
                ),
            )
        }

        TertiaryOnBlue -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral100,
                ),
                container = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral7,
                ),
                content = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral100,
                ),
            )
        }
    }

    ReaderRevenue -> when (this) {
        PrimaryOnWhite -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.BrandAlt400,
                ),
                container = AppColour(
                    light = Source.Palette.BrandAlt400,
                ),
                content = AppColour(
                    light = Source.Palette.Brand400,
                ),
            )
        }

        TertiaryOnWhite -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral86,
                ),
                container = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral0,
                ),
                content = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral86,
                ),
            )
        }

        PrimaryOnBlue -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.BrandAlt400,
                ),
                container = AppColour(
                    light = Source.Palette.BrandAlt400,
                ),
                content = AppColour(
                    light = Source.Palette.Brand400,
                ),
            )
        }

        TertiaryOnBlue -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.BrandAlt400,
                    dark = Source.Palette.BrandAlt400,
                ),
                container = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral7,
                ),
                content = AppColour(
                    light = Source.Palette.BrandAlt400,
                    dark = Source.Palette.BrandAlt400,
                ),
            )
        }

        SecondaryOnBlue, SecondaryOnWhite -> {
            throw IllegalArgumentException("Secondary not supported in ReaderRevenue theme")
        }
    }
}