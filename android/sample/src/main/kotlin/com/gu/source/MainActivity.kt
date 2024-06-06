package com.gu.source

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.Check
import com.gu.source.presets.palette.Brand400
import com.gu.source.presets.palette.Neutral97
import com.gu.source.presets.typography.TextArticle17
import com.gu.source.theme.ReaderRevenueTheme
import com.gu.source.utils.PhoneBothModePreviews
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
        modifier = modifier,
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            color = MaterialTheme.colorScheme.background,
        ) {
            Column(
                modifier = Modifier.padding(it),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = "Hello $name!\nWe're the Guardian, the world's leading liberal voice.",
                    modifier = Modifier,
                    style = Source.Typography.TextArticle17,
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
                        coroutineScope.launch {
                            scaffoldState.bottomSheetState.expand()
                        }
                    },
                )

                HorizontalDivider()

                Row {
                    SourceIconButton(
                        icon = Source.Icons.Base.Check,
                        priority = SourceButton.Priority.PrimaryOnWhite,
                        contentDescription = null,
                        onClick = {},
                        size = SourceButton.Size.XSmall,
                    )
                    SourceButton(
                        text = "Welcome",
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
                    Row(modifier = it) {
                        SourceIconButton(
                            icon = Source.Icons.Base.Check,
                            priority = SourceButton.Priority.PrimaryOnWhite,
                            contentDescription = null,
                            onClick = {},
                            size = SourceButton.Size.Small,
                        )
                        SourceButton(
                            text = "to",
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

                Row {
                    SourceIconButton(
                        icon = Source.Icons.Base.Check,
                        priority = SourceButton.Priority.PrimaryOnWhite,
                        contentDescription = null,
                        onClick = {},
                        size = SourceButton.Size.Medium,
                    )
                    SourceButton(
                        text = "Source",
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
            }
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