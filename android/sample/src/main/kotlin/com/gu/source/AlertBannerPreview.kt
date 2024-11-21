package com.gu.source

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
    val text = "You’re on the US Edition Go to UK edition"
    val link = "UK edition"
    val annotatedString = buildAnnotatedString {
        append(text)
        val startIndex = text.indexOf(link)
        val endIndex = startIndex + link.length
        addStyle(
            style = SpanStyle(
                textDecoration = TextDecoration.Underline,
            ),
            start = startIndex,
            end = endIndex,
        )
    }

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
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            val context = LocalContext.current

            Text(text = "Alert Banner variants", style = Source.Typography.TextSansBold17)
            AlertBanner(
                priority = AlertBanner.Priority.Neutral,
                text = "Neutral alert banner",
                onCloseClick = {
                    Toast.makeText(context, "Neutral alert banner dismissed", Toast.LENGTH_SHORT)
                        .show()
                },
                onClick = {
                    Toast.makeText(
                        context,
                        "Neutral alert banner clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
            )

            AlertBanner(
                priority = AlertBanner.Priority.Informative,
                text = "Informative alert banner",
                modifier = Modifier,
                onCloseClick = {
                    Toast.makeText(
                        context,
                        "Informative alert banner dismissed",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
                onClick = {
                    Toast.makeText(
                        context,
                        "Informative alert banner clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
            )

            AlertBanner(
                priority = AlertBanner.Priority.Error,
                text = "Error alert banner",
                onCloseClick = {
                    Toast.makeText(context, "Error alert banner dismissed", Toast.LENGTH_SHORT)
                        .show()
                },
                onClick = {
                    Toast.makeText(
                        context,
                        "Error alert banner clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
            )

            AlertBanner(
                priority = AlertBanner.Priority.Neutral,
                annotatedText = annotatedString,
                onClick = {
                    Toast.makeText(
                        context,
                        "Neutral alert banner clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
                onCloseClick = {
                    Toast.makeText(context, "Neutral alert banner dismissed", Toast.LENGTH_SHORT)
                        .show()
                },
            )

            AlertBanner(
                priority = AlertBanner.Priority.Informative,
                annotatedText = annotatedString,
                onClick = {
                    Toast.makeText(
                        context,
                        "Informative alert banner clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
                onCloseClick = {
                    Toast.makeText(
                        context,
                        "Informative alert banner dismissed",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
            )

            AlertBanner(
                priority = AlertBanner.Priority.Error,
                annotatedText = annotatedString,
                onClick = {
                    Toast.makeText(
                        context,
                        "Error alert banner clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
                onCloseClick = {
                    Toast.makeText(
                        context,
                        "Error alert banner dismissed",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    AlertBannerPreview()
}