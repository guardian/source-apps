package com.gu.source.components.buttons

import androidx.compose.ui.graphics.Color
import com.gu.source.Source
import com.gu.source.Source.Theme.Core
import com.gu.source.Source.Theme.ReaderRevenue
import com.gu.source.components.buttons.SourceButton.Priority.PrimaryOnBlue
import com.gu.source.components.buttons.SourceButton.Priority.PrimaryOnWhite
import com.gu.source.components.buttons.SourceButton.Priority.SecondaryOnBlue
import com.gu.source.components.buttons.SourceButton.Priority.SecondaryOnWhite
import com.gu.source.components.buttons.SourceButton.Priority.TertiaryOnBlue
import com.gu.source.components.buttons.SourceButton.Priority.TertiaryOnWhite
import com.gu.source.daynight.AppColour
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.Brand600
import com.gu.source.foundation.palette.Brand800
import com.gu.source.foundation.palette.BrandAlt200
import com.gu.source.foundation.palette.BrandAlt400
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral86
import com.gu.source.foundation.palette.Neutral97
import com.gu.source.foundation.palette.SpecialReport400

/**
 * Model to provide colours for a button.
 * @property border
 * @property container
 * @property content Colour for the content of the button including text and icons.
 */
data class ButtonColours(
    val border: AppColour,
    val container: AppColour,
    val content: AppColour,
) {
    /**
     * Secondary constructor to allow creating an instance without using `AppColour`. This can be
     * used when loading colours from resources using `colourResource`.
     */
    constructor(
        border: Color,
        container: Color,
        content: Color,
    ) : this(
        border = AppColour(light = border),
        container = AppColour(container),
        content = AppColour(content),
    )
}

@Suppress("CyclomaticComplexMethod", "LongMethod")
/**
 * Maps a [SourceButton.Priority] to a set of colours based on the theme.
 */
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
                    dark = Source.Palette.Brand600,
                ),
                container = AppColour(
                    light = Source.Palette.Brand800,
                    dark = Source.Palette.Brand600,
                ),
                content = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral97,
                ),
            )
        }

        TertiaryOnWhite -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral86,
                ),
                container = AppColour.Transparent,
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
                    dark = Source.Palette.Neutral86,
                ),
                container = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral86,
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
                    dark = Source.Palette.SpecialReport400,
                ),
                container = AppColour(
                    light = Source.Palette.Brand600,
                    dark = Source.Palette.SpecialReport400,
                ),
                content = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral97,
                ),
            )
        }

        TertiaryOnBlue -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral86,
                ),
                container = AppColour.Transparent,
                content = AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral86,
                ),
            )
        }
    }

    ReaderRevenue -> when (this) {
        PrimaryOnWhite -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.BrandAlt400,
                    dark = Source.Palette.BrandAlt200,
                ),
                container = AppColour(
                    light = Source.Palette.BrandAlt400,
                    dark = Source.Palette.BrandAlt200,
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
                    dark = Source.Palette.BrandAlt200,
                ),
                container = AppColour.Transparent,
                content = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.BrandAlt200,
                ),
            )
        }

        PrimaryOnBlue -> {
            ButtonColours(
                border = AppColour(
                    light = Source.Palette.BrandAlt400,
                    dark = Source.Palette.BrandAlt200,
                ),
                container = AppColour(
                    light = Source.Palette.BrandAlt400,
                    dark = Source.Palette.BrandAlt200,
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
                    dark = Source.Palette.BrandAlt200,
                ),
                container = AppColour.Transparent,
                content = AppColour(
                    light = Source.Palette.BrandAlt400,
                    dark = Source.Palette.BrandAlt200,
                ),
            )
        }

        SecondaryOnBlue, SecondaryOnWhite -> {
            throw IllegalArgumentException("Secondary not supported in ReaderRevenue theme")
        }
    }
}