package com.gu.source

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.components.buttons.SourceButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.Neutral10
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral97
import com.gu.source.foundation.typography.HeadlineMedium20
import com.gu.source.navigation.Destination
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.plus

@SuppressLint("DiscouragedApi")
@Composable
internal fun Home(modifier: Modifier = Modifier, navigate: (Destination) -> Unit) {
    Scaffold(
        modifier = modifier,
        topBar = {
            SampleTopAppBar {
                Text(
                    text = "Welcome to Source.",
                    style = Source.Typography.HeadlineMedium20,
                    color = AppColour(
                        light = Source.Palette.Brand400,
                        dark = Source.Palette.Neutral97,
                    ).current,
                )
            }
        },
        containerColor = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral10,
        ).current,
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues + PaddingValues(16.dp)),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text(
                text = "The Guardian's digital design system.",
                style = Source.Typography.HeadlineMedium20,
                color = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral97,
                ).current,
            )

            HorizontalDivider()

            SourceButton(
                text = "Palette",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.PalettePreview) },
            )

            SourceButton(
                text = "Icons",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.IconsPreview) },
            )

            SourceButton(
                text = "Buttons",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.ButtonsPreview) },
            )

            SourceButton(
                text = "Chips",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.ChipsPreview) },
            )

            SourceButton(
                text = "Promo sticker",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.BadgesPreview) },
            )

            SourceButton(
                text = "Ratings",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.StarRatingsPreview) },
            )

            SourceButton(
                text = "Pager progress bar",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.PagerProgressBarPreview) },
            )

            SourceButton(
                text = "Alert banner",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.AlertBannerPreview) },
            )
        }
    }
}

@PreviewPhoneBothMode
@Composable
private fun HomePreview() {
    AppColourMode {
        Home {}
    }
}