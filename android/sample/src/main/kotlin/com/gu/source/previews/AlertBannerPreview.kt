package com.gu.source.previews

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.components.banner.SourceAlertBanner

@Suppress("StringLiteralDuplication")
@Composable
internal fun AlertBannerPreview(
    onBackPress: () -> Unit,
    modifier: Modifier = Modifier
) {
    PreviewScaffold(
        title = "Alert Banner variants",
        onBackPress = onBackPress,
        modifier = modifier,
    ) {
        Column(
            modifier = it,
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            val context = LocalContext.current

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

            SourceAlertBanner.Priority.entries.forEach { message ->
                SourceAlertBanner(
                    messageText = messageText,
                    priority = message,
                    onMessageClick = { showToast("${message.name} clicked", context) },
                    onDismiss = { showToast("${message.name} dismissed", context) },
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            SourceAlertBanner.Priority.entries.forEach { message ->
                SourceAlertBanner(
                    messageText = annotatedText,
                    priority = message,
                    onMessageClick = { showToast("${message.name} clicked", context) },
                    onDismiss = { showToast("${message.name} dismissed", context) },
                    modifier = Modifier.fillMaxWidth(),
                    showDismiss = false,
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
    AlertBannerPreview({})
}