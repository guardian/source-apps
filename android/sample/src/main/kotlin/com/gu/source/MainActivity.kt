package com.gu.source

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
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
        setContent {
            AppColourMode {
                Greeting("Android")
            }
        }
    }
}

@SuppressLint("DiscouragedApi")
@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    val coroutineScope = rememberCoroutineScope()
    val sheetState = rememberStandardBottomSheetState(skipHiddenState = true)
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState,
    )

    BottomSheetScaffold(
        sheetContent = { Palette() },
        scaffoldState = scaffoldState,
        sheetPeekHeight = 0.dp,
        sheetDragHandle = { Spacer(Modifier.height(4.dp)) },
        containerColor = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral0,
        ).current,
        modifier = modifier,
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

            Row {
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.PrimaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.XSmall,
                    modifier = Modifier.weight(1f),
                )
                SourceButton(
                    text = "Xsm core",
                    priority = SourceButton.Priority.SecondaryOnWhite,
                    onClick = {},
                    size = SourceButton.Size.XSmall,
                    modifier = Modifier.weight(1f),
                )
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.TertiaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.XSmall,
                    modifier = Modifier.weight(1f),
                )
            }

            ReaderRevenueTheme {
                Row(modifier = it) {
                    SourceIconButton(
                        icon = Source.Icons.Base.Check,
                        priority = SourceButton.Priority.PrimaryOnWhite,
                        contentDescription = null,
                        onClick = {},
                        size = SourceButton.Size.Small,
                        modifier = Modifier.weight(1f),
                    )
                    SourceButton(
                        text = "Sm RR",
                        priority = SourceButton.Priority.PrimaryOnWhite,
                        onClick = {},
                        size = SourceButton.Size.Small,
                        modifier = Modifier.weight(1f),
                    )
                    SourceIconButton(
                        icon = Source.Icons.Base.Check,
                        priority = SourceButton.Priority.TertiaryOnWhite,
                        contentDescription = null,
                        onClick = {},
                        size = SourceButton.Size.Small,
                        modifier = Modifier.weight(1f),
                    )
                }
            }

            Row {
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.PrimaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.Medium,
                    modifier = Modifier.weight(1f),
                )
                SourceButton(
                    text = "Md Core",
                    priority = SourceButton.Priority.SecondaryOnWhite,
                    onClick = {},
                    size = SourceButton.Size.Medium,
                    modifier = Modifier.weight(1f),
                )
                SourceIconButton(
                    icon = Source.Icons.Base.Check,
                    priority = SourceButton.Priority.TertiaryOnWhite,
                    contentDescription = null,
                    onClick = {},
                    size = SourceButton.Size.Medium,
                    modifier = Modifier.weight(1f),
                )
            }

            PlainSourceButton(
                text = "Un-themed",
                size = SourceButton.Size.Small,
                onClick = {},
                modifier = Modifier.align(CenterHorizontally),
                buttonColours = ButtonColours(
                    border = AppColour(Source.Palette.Culture200, Source.Palette.Culture800),
                    container = AppColour(Source.Palette.Culture800, Source.Palette.Culture200),
                    content = AppColour(Source.Palette.Culture200, Source.Palette.Culture800),
                ),
            )
        }
    }
}

@PhoneBothModePreviews
@Composable
private fun GreetingPreview() {
    AppColourMode {
        Greeting("Android")
    }
}