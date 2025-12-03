package com.gu.source

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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
import com.gu.source.previews.AlertBannerPreview
import com.gu.source.previews.BadgePreview
import com.gu.source.previews.ButtonPreview
import com.gu.source.previews.ChipsPreview
import com.gu.source.previews.IconsPreview
import com.gu.source.previews.ImagePagerWithProgressIndicator
import com.gu.source.previews.Palette
import com.gu.source.previews.RatingPreview
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.plus
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppColourMode {
                Greeting(modifier = it)
            }
        }
    }
}

private enum class SheetContentType {
    Palette,
    PagerProgressBar,
    Buttons,
    CoreIcons,
    AlertBanner,
    Chips,
    Badges,
    Ratings,
}

@SuppressLint("DiscouragedApi")
@Composable
private fun Greeting(modifier: Modifier = Modifier) {
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()

    var sheetContentType by remember {
        mutableStateOf(SheetContentType.Palette)
    }

    BottomSheetScaffold(
        sheetContent = {
            val sheetModifier = Modifier.safeDrawingPadding()
            when (sheetContentType) {
                SheetContentType.Palette -> Palette(sheetModifier)
                SheetContentType.PagerProgressBar -> ImagePagerWithProgressIndicator(sheetModifier)
                SheetContentType.Buttons -> ButtonPreview(sheetModifier)
                SheetContentType.CoreIcons -> IconsPreview(sheetModifier)
                SheetContentType.AlertBanner -> AlertBannerPreview(sheetModifier)
                SheetContentType.Chips -> ChipsPreview(sheetModifier)
                SheetContentType.Badges -> BadgePreview(sheetModifier)
                SheetContentType.Ratings -> RatingPreview(sheetModifier)
            }
        },
        scaffoldState = scaffoldState,
        sheetPeekHeight = 0.dp,
        sheetDragHandle = { Spacer(Modifier.height(4.dp)) },
        sheetContainerColor = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral10,
        ).current,
        sheetShadowElevation = 8.dp,
        sheetTonalElevation = 8.dp,
        containerColor = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral10,
        ).current,
        modifier = modifier.safeDrawingPadding(),
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues + PaddingValues(16.dp)),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text(
                text = "Welcome to Source.",
                modifier = Modifier,
                style = Source.Typography.HeadlineMedium20,
                color = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral97,
                ).current,
            )
            Text(
                text = "The Guardian's digital design system.",
                modifier = Modifier,
                style = Source.Typography.HeadlineMedium20,
                color = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral97,
                ).current,
            )

            HorizontalDivider()

            SourceButton(
                text = "Open palette",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = {
                    sheetContentType = SheetContentType.Palette
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )

            SourceButton(
                text = "Open pager progress bar sample",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = {
                    sheetContentType = SheetContentType.PagerProgressBar
                    // TODO: 19/07/2024 Close and reexpand if already visible.
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )

            SourceButton(
                text = "Open buttons preview",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = {
                    sheetContentType = SheetContentType.Buttons
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )

            SourceButton(
                text = "Open icons preview",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = {
                    sheetContentType = SheetContentType.CoreIcons
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )

            SourceButton(
                text = "Open Alert banner preview",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = {
                    sheetContentType = SheetContentType.AlertBanner
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )

            SourceButton(
                text = "Open chips preview",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = {
                    sheetContentType = SheetContentType.Chips
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )

            SourceButton(
                text = "Open badges preview",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = {
                    sheetContentType = SheetContentType.Badges
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )

            SourceButton(
                text = "Open ratings preview",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = {
                    sheetContentType = SheetContentType.Ratings
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )
        }
    }
}

@PreviewPhoneBothMode
@Composable
private fun GreetingPreview() {
    AppColourMode {
        Greeting()
    }
}