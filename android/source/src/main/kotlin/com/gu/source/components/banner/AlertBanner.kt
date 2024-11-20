package com.gu.source.components.banner

import android.annotation.SuppressLint
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.text.LinkText
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.AlertRound
import com.gu.source.icons.Cross
import com.gu.source.icons.InfoRound
import com.gu.source.presets.palette.*
import com.gu.source.presets.typography.TextSans17
import com.gu.source.theme.SourceCoreTheme
import com.gu.source.utils.PreviewPhoneBothMode

/**
 * Object for property models for the [AlertBanner] component.
 */
object AlertBanner {
    internal object Style {
        internal val ContentPadding = PaddingValues(
            vertical = 16.dp,
            horizontal = 20.dp,
        )

        val iconAlertRound = Source.Icons.Base.AlertRound
        val iconInfoRound = Source.Icons.Base.InfoRound
        val iconCross = Source.Icons.Base.Cross

        val textStyle = Source.Typography.TextSans17

        val iconTextSpacing = 8.dp
        val crossTextSpacing = 20.dp
    }

    /**
     * Enum for the message type of the [AlertBanner]. Informs users of how important an action is.
     *
     * The messages are named based on banner message type and backdrop colour.
     */
    @Suppress("UndocumentedPublicProperty", "StringLiteralDuplication")
    enum class Message {
        Neutral,
        Informative,
        Error,
        ;

        internal fun getBackdropColour() = when (name) {
            "Neutral" -> AppColour(
                light = Source.Palette.Neutral7,
                dark = Source.Palette.Neutral20,
            )

            "Informative" -> AppColour(
                light = Source.Palette.Brand800,
                dark = Source.Palette.Brand400,
            )

            "Error" -> AppColour(
                light = Source.Palette.News600,
                dark = Source.Palette.News100,
            )

            else -> AppColour.Unspecified
        }

        internal fun getIcon(): ImageVector? = when (name) {
            "Informative" -> Style.iconInfoRound

            "Error" -> Style.iconAlertRound

            else -> null
        }

        internal fun getIconTint() = when (name) {
            "Informative" -> AppColour(
                light = Source.Palette.Brand400,
                dark = Source.Palette.Brand800,
            )

            "Error" -> AppColour(
                light = Source.Palette.Error400,
                dark = Source.Palette.Error500,
            )

            else -> AppColour.Unspecified
        }

        internal fun getTextColor() = when (name) {
            "Neutral" -> AppColour(
                light = Source.Palette.Neutral100,
                dark = Source.Palette.Neutral100,
            )

            "Informative" -> AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            )

            "Error" -> AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            )

            else -> AppColour.Unspecified
        }

        internal fun getCrossIconTint() = when (name) {
            "Neutral" -> AppColour(
                light = Source.Palette.Neutral100,
                dark = Source.Palette.Neutral100,
            )

            "Informative" -> AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            )

            "Error" -> AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            )

            else -> AppColour.Unspecified
        }
    }
}

/**
 * A composable function that displays an alert banner with optional clickable links.
 *
 * @param text The text to be displayed in the banner.
 * @param message The type of message to be displayed (Neutral, Informative, Error).
 * @param onCancelClick A callback to be invoked when the cancel icon is clicked.
 * @param modifier The modifier to be applied to the banner.
 * @param linkText A list of substrings within the text that should be clickable links.
 * @param linkTextCallbacks A list of callbacks to be invoked when the corresponding link is clicked.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun AlertBanner(
    text: String,
    message: AlertBanner.Message,
    onCancelClick: () -> Unit,
    modifier: Modifier = Modifier,
    linkText: List<String> = emptyList(),
    linkTextCallbacks: List<() -> Unit> = emptyList(),
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(message.getBackdropColour().current)
            .padding(AlertBanner.Style.ContentPadding),
        horizontalArrangement = Arrangement.spacedBy(AlertBanner.Style.crossTextSpacing),
    ) {
        Row(
            modifier = Modifier
                .weight(1f),
            horizontalArrangement = Arrangement.spacedBy(AlertBanner.Style.iconTextSpacing),
        ) {
            message.getIcon()?.let {
                Icon(
                    imageVector = it,
                    tint = message.getIconTint().current,
                    contentDescription = null,
                )
            }

            LinkText(
                text = text,
                textColor = message.getTextColor().current,
                linkText = linkText,
                textStyle = AlertBanner.Style.textStyle,
                linkTextCallbacks = linkTextCallbacks,
            )
        }
        Icon(
            imageVector = AlertBanner.Style.iconCross,
            tint = message.getCrossIconTint().current,
            contentDescription = null,
            modifier = Modifier
                .clickable(onClick = onCancelClick),
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@SuppressLint("DiscouragedApi")
@PreviewPhoneBothMode
@Composable
internal fun AlertBannerPreview() {
    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral100)) {
                AlertBanner.Message.entries.forEach { message ->
                    Row(
                        modifier = Modifier
                            .background(message.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        AlertBanner(
                            text = "You’re on the US Edition Go to UK edition",
                            linkText = listOf("UK edition"),
                            linkTextCallbacks = listOf(
                                { },
                            ),
                            message = message,
                            onCancelClick = {},
                        )
                    }
                }
            }
        }
    }
}