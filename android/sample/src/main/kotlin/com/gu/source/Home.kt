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
import com.gu.source.navigation.Destination
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.plus
import kotlinx.coroutines.launch

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
internal fun Home(
    modifier: Modifier = Modifier,
    navigate: (Destination) -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()

    var sheetContentType by remember {
        mutableStateOf(SheetContentType.Palette)
    }

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
                text = "Open palette",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.PalettePreview) },
            )

            SourceButton(
                text = "Open pager progress bar sample",
                priority = SourceButton.Priority.TertiaryOnWhite,
                onClick = { navigate(Destination.PagerProgressBarPreview) },
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


//    BottomSheetScaffold(
//        sheetContent = {
//            val sheetModifier = Modifier.safeDrawingPadding()
//            when (sheetContentType) {
//                SheetContentType.Palette -> Palette(sheetModifier)
//                SheetContentType.PagerProgressBar -> ImagePagerWithProgressIndicator(sheetModifier)
//                SheetContentType.Buttons -> ButtonPreview(sheetModifier)
//                SheetContentType.CoreIcons -> IconsPreview(sheetModifier)
//                SheetContentType.AlertBanner -> AlertBannerPreview(sheetModifier)
//                SheetContentType.Chips -> ChipsPreview(sheetModifier)
//                SheetContentType.Badges -> BadgePreview(sheetModifier)
//                SheetContentType.Ratings -> RatingPreview(sheetModifier)
//            }
//        },
//        scaffoldState = scaffoldState,
//        sheetPeekHeight = 0.dp,
//        sheetDragHandle = { Spacer(Modifier.height(4.dp)) },
//        sheetContainerColor = AppColour(
//            Source.Palette.Neutral100,
//            Source.Palette.Neutral10,
//        ).current,
//        sheetShadowElevation = 8.dp,
//        sheetTonalElevation = 8.dp,
//        containerColor = AppColour(
//            Source.Palette.Neutral100,
//            Source.Palette.Neutral10,
//        ).current,
//        modifier = modifier.safeDrawingPadding(),
//    ) { paddingValues ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues + PaddingValues(16.dp)),
//            verticalArrangement = Arrangement.spacedBy(8.dp),
//        ) {
//            Text(
//                text = "Welcome to Source.",
//                modifier = Modifier,
//                style = Source.Typography.HeadlineMedium20,
//                color = AppColour(
//                    light = Source.Palette.Brand400,
//                    dark = Source.Palette.Neutral97,
//                ).current,
//            )
//            Text(
//                text = "The Guardian's digital design system.",
//                modifier = Modifier,
//                style = Source.Typography.HeadlineMedium20,
//                color = AppColour(
//                    light = Source.Palette.Brand400,
//                    dark = Source.Palette.Neutral97,
//                ).current,
//            )
//
//            HorizontalDivider()
//
//            SourceButton(
//                text = "Open palette",
//                priority = SourceButton.Priority.TertiaryOnWhite,
//                onClick = {
//                    sheetContentType = SheetContentType.Palette
//                    coroutineScope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                },
//            )
//
//            SourceButton(
//                text = "Open pager progress bar sample",
//                priority = SourceButton.Priority.TertiaryOnWhite,
//                onClick = {
//                    sheetContentType = SheetContentType.PagerProgressBar
//                    // TODO: 19/07/2024 Close and reexpand if already visible.
//                    coroutineScope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                },
//            )
//
//            SourceButton(
//                text = "Open buttons preview",
//                priority = SourceButton.Priority.TertiaryOnWhite,
//                onClick = {
//                    sheetContentType = SheetContentType.Buttons
//                    coroutineScope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                },
//            )
//
//            SourceButton(
//                text = "Open icons preview",
//                priority = SourceButton.Priority.TertiaryOnWhite,
//                onClick = {
//                    sheetContentType = SheetContentType.CoreIcons
//                    coroutineScope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                },
//            )
//
//            SourceButton(
//                text = "Open Alert banner preview",
//                priority = SourceButton.Priority.TertiaryOnWhite,
//                onClick = {
//                    sheetContentType = SheetContentType.AlertBanner
//                    coroutineScope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                },
//            )
//
//            SourceButton(
//                text = "Open chips preview",
//                priority = SourceButton.Priority.TertiaryOnWhite,
//                onClick = {
//                    sheetContentType = SheetContentType.Chips
//                    coroutineScope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                },
//            )
//
//            SourceButton(
//                text = "Open badges preview",
//                priority = SourceButton.Priority.TertiaryOnWhite,
//                onClick = {
//                    sheetContentType = SheetContentType.Badges
//                    coroutineScope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                },
//            )
//
//            SourceButton(
//                text = "Open ratings preview",
//                priority = SourceButton.Priority.TertiaryOnWhite,
//                onClick = {
//                    sheetContentType = SheetContentType.Ratings
//                    coroutineScope.launch {
//                        scaffoldState.bottomSheetState.expand()
//                    }
//                },
//            )
//        }
//    }
}

@PreviewPhoneBothMode
@Composable
private fun HomePreview() {
    AppColourMode {
        Home {}
    }
}