package com.gu.source

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.components.banner.AlertBanner
import com.gu.source.daynight.AppColour
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.typography.TextSansBold17

@Suppress("StringLiteralDuplication")
@Composable
internal fun AlertBannerPreview(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = AppColour(
            Source.Palette.Neutral100,
            Source.Palette.Neutral0,
        ).current,
        contentColor = AppColour(
            Source.Palette.Neutral0,
            Source.Palette.Neutral100,
        ).current,
    ) {
        Column(
            modifier = Modifier.padding(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            val context = LocalContext.current

            Text(
                text = "Alert Banner variants",
                style = Source.Typography.TextSansBold17,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            )

            val messageText = "You’re on the US Edition Go to UK edition"
            val annotatedText = buildAnnotatedString {
                val link = "UK edition"
                append(messageText)
                val startIndex = messageText.indexOf(link)
                val endIndex = startIndex + link.length
                addStyle(
                    style = SpanStyle(textDecoration = TextDecoration.Underline),
                    start = startIndex,
                    end = endIndex,
                )
            }

            AlertBanner.Priority.entries.forEach { message ->
                AlertBanner(
                    messageText = messageText,
                    priority = message,
                    onMessageClick = { showToast("${message.name} clicked", context) },
                    onDismiss = { showToast("${message.name} dismissed", context) },
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            AlertBanner.Priority.entries.forEach { message ->
                AlertBanner(
                    messageText = annotatedText,
                    priority = message,
                    onMessageClick = { showToast("${message.name} clicked", context) },
                    onDismiss = { showToast("${message.name} dismissed", context) },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}

private fun showToast(message: String, context: Context) {
    Toast.makeText(
        context,
        message,
        Toast.LENGTH_SHORT,
    ).show()
}

@Preview
@Composable
private fun Preview() {
    AlertBannerPreview()
}