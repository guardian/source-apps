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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.components.buttons.ButtonColours
import com.gu.source.components.buttons.PlainSourceButton
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.Check
import com.gu.source.presets.palette.*
import com.gu.source.presets.typography.HeadlineMedium20
import com.gu.source.presets.typography.TextSansBold17
import com.gu.source.theme.ReaderRevenueTheme
import com.gu.source.utils.PhoneBothModePreviews
import com.gu.source.utils.plus
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppColourMode {
                Greeting(name = "Android", modifier = it)
            }
        }
    }
}

@SuppressLint("DiscouragedApi")
@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()

    BottomSheetScaffold(
        sheetContent = { Palette() },
        scaffoldState = scaffoldState,
        sheetPeekHeight = 0.dp,
        sheetDragHandle = { Spacer(Modifier.height(4.dp)) },
        sheetContainerColor = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral0,
        ).current,
        sheetShadowElevation = 8.dp,
        sheetTonalElevation = 8.dp,
        containerColor = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral0,
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
                text = "Hello $name!",
                modifier = Modifier,
                style = Source.Typography.HeadlineMedium20,
                color = AppColour(
                    light = Source.Palette.Brand400,
                    dark = Source.Palette.Neutral97,
                ).current,
            )
            Text(
                text = "We're Guardian, the world's leading liberal voice.",
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
                modifier = Modifier.align(CenterHorizontally),
                onClick = {
                    coroutineScope.launch {
                        scaffoldState.bottomSheetState.expand()
                    }
                },
            )

            HorizontalDivider()

            Text(text = "Button variants", style = Source.Typography.TextSansBold17)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.PrimaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.XSmall,
                )
                SourceButton(
                    text = "Extra small - Core",
                    priority = SourceButton.Priority.SecondaryOnWhite,
                    onClick = {},
                    size = SourceButton.Size.XSmall,
                )
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.TertiaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.XSmall,
                )
            }

            ReaderRevenueTheme {
                Row(
                    modifier = it.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    SourceIconButton(
                        icon = Source.Icons.Base.Check,
                        priority = SourceButton.Priority.PrimaryOnWhite,
                        contentDescription = null,
                        onClick = {},
                        size = SourceButton.Size.Small,
                    )
                    SourceButton(
                        text = "Small - RR",
                        priority = SourceButton.Priority.PrimaryOnWhite,
                        onClick = {},
                        size = SourceButton.Size.Small,
                    )
                    SourceIconButton(
                        icon = Source.Icons.Base.Check,
                        priority = SourceButton.Priority.TertiaryOnWhite,
                        contentDescription = null,
                        onClick = {},
                        size = SourceButton.Size.Small,
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.PrimaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.Medium,
                )
                SourceButton(
                    text = "Medium - Core",
                    priority = SourceButton.Priority.SecondaryOnWhite,
                    onClick = {},
                    size = SourceButton.Size.Medium,
                )
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.TertiaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.Medium,
                )
            }

            PlainSourceButton(
                text = "Custom themed",
                onClick = {},
                modifier = Modifier.align(CenterHorizontally),
                buttonColours = ButtonColours(
                    border = AppColour(
                        light = Source.Palette.Culture200,
                        dark = Source.Palette.Culture800,
                    ),
                    container = AppColour(
                        light = Source.Palette.Culture800,
                        dark = Source.Palette.Culture200,
                    ),
                    content = AppColour(
                        light = Source.Palette.Culture200,
                        dark = Source.Palette.Culture800,
                    ),
                ),
            )
        }
    }

    LaunchedEffect(key1 = Unit) {
        scaffoldState.bottomSheetState.expand()
    }
}

@PhoneBothModePreviews
@Composable
private fun GreetingPreview() {
    AppColourMode {
        Greeting("Android")
    }
}