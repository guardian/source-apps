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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.icons.Check
import com.gu.source.presets.palette.Brand400
import com.gu.source.presets.typography.TextArticle17
import com.gu.source.theme.ReaderRevenueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background,
            ) {
                Greeting("Android")
            }
        }
    }
}

@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!\nWe're the Guardian, the world's leading liberal voice.",
            modifier = modifier,
            style = Source.Typography.TextArticle17,
            color = Source.Palette.Brand400,
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

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    Greeting("Android")
}