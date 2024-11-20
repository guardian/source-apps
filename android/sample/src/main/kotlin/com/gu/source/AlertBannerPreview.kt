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
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            val context = LocalContext.current

            Text(text = "Alert Banner variants", style = Source.Typography.TextSansBold17)
            AlertBanner(
                message = AlertBanner.Message.Neutral,
                text = "Neutral alert banner",
                onCancelClick = {
                    Toast.makeText(context, "Neutral alert banner dismissed", Toast.LENGTH_SHORT)
                        .show()
                },
            )

            AlertBanner(
                message = AlertBanner.Message.Informative,
                text = "Informative alert banner",
                modifier = Modifier,
                onCancelClick = {
                    Toast.makeText(
                        context,
                        "Informative alert banner dismissed",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
            )

            AlertBanner(
                message = AlertBanner.Message.Error,
                text = "Error alert banner",
                onCancelClick = {
                    Toast.makeText(context, "Error alert banner dismissed", Toast.LENGTH_SHORT)
                        .show()
                },
            )

            AlertBanner(
                message = AlertBanner.Message.Neutral,
                text = "You’re on the US Edition Go to UK edition",
                linkText = listOf("UK edition"),
                linkTextCallbacks = listOf {
                    Toast.makeText(
                        context,
                        "UK edition clicked - ${AlertBanner.Message.Neutral.name}",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
                onCancelClick = {
                    Toast.makeText(context, "Neutral alert banner dismissed", Toast.LENGTH_SHORT)
                        .show()
                },
            )

            AlertBanner(
                message = AlertBanner.Message.Informative,
                text = "You’re on the US Edition Go to UK edition",
                linkText = listOf("UK edition"),
                linkTextCallbacks = listOf {
                    Toast.makeText(
                        context,
                        "UK edition clicked - ${AlertBanner.Message.Informative.name}",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
                onCancelClick = {
                    Toast.makeText(
                        context,
                        "Informative alert banner dismissed",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
            )

            AlertBanner(
                message = AlertBanner.Message.Error,
                text = "You’re on the US Edition Go to UK edition",
                linkText = listOf("UK edition"),
                linkTextCallbacks = listOf {
                    Toast.makeText(
                        context,
                        "UK edition clicked - ${AlertBanner.Message.Error.name}",
                        Toast.LENGTH_SHORT,
                    ).show()
                },
                onCancelClick = {
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