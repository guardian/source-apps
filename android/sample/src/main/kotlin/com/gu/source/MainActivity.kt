package com.gu.source

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppColourMode {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Hello $name!\nWe're the Guardian, the world's leading liberal voice.",
            modifier = Modifier,
            style = Source.Typography.TextArticle17,
            color = AppColour(
                light = Source.Palette.Brand400,
                dark = Source.Palette.Neutral97,
            ).current,
        )

        Spacer(modifier = Modifier.height(8.dp))

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

        Spacer(modifier = Modifier.height(8.dp))

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

        Spacer(modifier = Modifier.height(8.dp))

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

@PhoneBothModePreviews
@Composable
private fun GreetingPreview() {
    AppColourMode {
        Greeting("Android")
    }
}