package com.gu.source.components.banner

import android.annotation.SuppressLint
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.gu.source.Source
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
    enum class Priority {
        Neutral,
        Informative,
        Error,
        ;

        internal fun getBackdropColour() = when (this) {
            Neutral -> AppColour(
                light = Source.Palette.Neutral7,
                dark = Source.Palette.Neutral20,
            )

            Informative -> AppColour(
                light = Source.Palette.Brand800,
                dark = Source.Palette.Brand400,
            )

            Error -> AppColour(
                light = Source.Palette.News600,
                dark = Source.Palette.News100,
            )
        }

        internal fun getIcon(): ImageVector? = when (this) {
            Informative -> Style.iconInfoRound

            Error -> Style.iconAlertRound

            Neutral -> null
        }

        internal fun getIconTint() = when (this) {
            Informative -> AppColour(
                light = Source.Palette.Brand400,
                dark = Source.Palette.Brand800,
            )

            Error -> AppColour(
                light = Source.Palette.Error400,
                dark = Source.Palette.Error500,
            )

            Neutral -> AppColour.Unspecified
        }

        internal fun getTextColor() = when (this) {
            Neutral -> AppColour(
                light = Source.Palette.Neutral100,
                dark = Source.Palette.Neutral100,
            )

            Informative -> AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            )

            Error -> AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            )
        }

        internal fun getCrossIconTint() = when (this) {
            Neutral -> AppColour(
                light = Source.Palette.Neutral100,
                dark = Source.Palette.Neutral100,
            )

            Informative -> AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            )

            Error -> AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            )
        }
    }
}

/**
 * A composable function that displays an alert banner with optional clickable links.
 *
 * @param text The text to be displayed in the banner.
 * @param priority The type of message to be displayed (Neutral, Informative, Error).
 * @param onCloseClick A callback to be invoked when the cancel icon is clicked.
 * @param onClick A callback to be invoked when the banner is clicked.
 * @param modifier The modifier to be applied to the banner.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun AlertBanner(
    text: String,
    priority: AlertBanner.Priority,
    onCloseClick: () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(priority.getBackdropColour().current)
            .padding(AlertBanner.Style.ContentPadding),
        horizontalArrangement = Arrangement.spacedBy(AlertBanner.Style.crossTextSpacing),
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .clickable { onClick() },
            horizontalArrangement = Arrangement.spacedBy(AlertBanner.Style.iconTextSpacing),
        ) {
            priority.getIcon()?.let {
                Icon(
                    imageVector = it,
                    tint = priority.getIconTint().current,
                    contentDescription = null,
                )
            }

            Text(
                text = text,
                style = AlertBanner.Style.textStyle,
                color = priority.getTextColor().current,
            )
        }
        Icon(
            imageVector = AlertBanner.Style.iconCross,
            tint = priority.getCrossIconTint().current,
            contentDescription = null,
            modifier = Modifier
                .clickable(onClick = onCloseClick),
        )
    }
}

/**
 * A composable function that displays an alert banner with optional clickable links.
 *
 * @param annotatedText The text to be displayed in the banner having link in it.
 * @param priority The type of message to be displayed (Neutral, Informative, Error).
 * @param onCloseClick A callback to be invoked when the cancel icon is clicked.
 * @param onClick A callback to be invoked when the banner is clicked.
 * @param modifier The modifier to be applied to the banner.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun AlertBanner(
    annotatedText: AnnotatedString,
    priority: AlertBanner.Priority,
    onCloseClick: () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(priority.getBackdropColour().current)
            .padding(AlertBanner.Style.ContentPadding),
        horizontalArrangement = Arrangement.spacedBy(AlertBanner.Style.crossTextSpacing),
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .clickable { onClick() },
            horizontalArrangement = Arrangement.spacedBy(AlertBanner.Style.iconTextSpacing),
        ) {
            priority.getIcon()?.let {
                Icon(
                    imageVector = it,
                    tint = priority.getIconTint().current,
                    contentDescription = null,
                )
            }

            Text(
                text = annotatedText,
                style = AlertBanner.Style.textStyle,
                color = priority.getTextColor().current,
            )
        }
        Icon(
            imageVector = AlertBanner.Style.iconCross,
            tint = priority.getCrossIconTint().current,
            contentDescription = null,
            modifier = Modifier
                .clickable(onClick = onCloseClick),
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@SuppressLint("DiscouragedApi")
@PreviewPhoneBothMode
@Composable
internal fun AlertBannerWithTextPreview() {
    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral100)) {
                AlertBanner.Priority.entries.forEach { message ->
                    Row(
                        modifier = Modifier
                            .background(message.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        AlertBanner(
                            text = "You’re on the US Edition Go to UK edition",
                            onClick = { },
                            priority = message,
                            onCloseClick = {},
                        )
                    }
                }
            }
        }
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@SuppressLint("DiscouragedApi")
@PreviewPhoneBothMode
@Composable
internal fun AlertBannerWithAnnotatedStringPreview() {
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

    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral100)) {
                AlertBanner.Priority.entries.forEach { message ->
                    Row(
                        modifier = Modifier
                            .background(message.getBackdropColour().current)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                    ) {
                        AlertBanner(
                            annotatedText = annotatedString,
                            onClick = { },
                            priority = message,
                            onCloseClick = {},
                        )
                    }
                }
            }
        }
    }
}