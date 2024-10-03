package com.gu.source

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.components.buttons.SourceButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.presets.palette.Brand400
import com.gu.source.presets.palette.Neutral10
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.palette.Neutral97
import com.gu.source.presets.typography.HeadlineMedium20
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
                SheetContentType.CoreIcons -> Icons(sheetModifier)
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