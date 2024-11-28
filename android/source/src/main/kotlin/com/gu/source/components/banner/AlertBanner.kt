package com.gu.source.components.banner

import android.annotation.SuppressLint
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import com.gu.source.utils.PreviewPhoneBothMode

/**
 * Object for property models for the [AlertBanner] component.
 */
object AlertBanner {
    internal object Style {
        val ContentPaddingVertical = 20.dp
        val ContentPaddingHorizontal = 16.dp

        // Adjust by 10dp to account for min-touch size padding for IconButton. This aligns
        // the close icon with the top of the text.
        val CloseIconButtonPaddingVertical = ContentPaddingVertical - 10.dp


        val textStyle = Source.Typography.TextSans17

        val iconTextSpacing = 8.dp
        val closeTextSpacing = 20.dp
    }

    /**
     * Enum for the message type of the [AlertBanner]. Informs users of how important an action is.
     *
     * The messages are named based on banner message type and backdrop colour.
     */
    enum class Priority(
        internal val backgroundColour: AppColour,
        internal val iconTint: AppColour,
        internal val contentColour: AppColour,
        internal val icon: ImageVector?,
    ) {
        /** Represents a plain alert banner with a message. No icon is displayed. */
        Neutral(
            backgroundColour = AppColour(
                light = Source.Palette.Neutral7,
                dark = Source.Palette.Neutral20,
            ),
            iconTint = AppColour.Unspecified,
            contentColour = AppColour(
                light = Source.Palette.Neutral100,
                dark = Source.Palette.Neutral100,
            ),
            icon = null,
        ),

        /** Represents an informative alert banner with a message. An info icon is displayed. */
        Informative(
            backgroundColour = AppColour(
                light = Source.Palette.Brand800,
                dark = Source.Palette.Brand400,
            ),
            iconTint = AppColour(
                light = Source.Palette.Brand400,
                dark = Source.Palette.Brand800,
            ),
            contentColour = AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            ),
            icon = Source.Icons.Base.InfoRound,
        ),

        /** Represents an error alert banner with a message. An error icon is displayed. */
        Error(
            backgroundColour = AppColour(
                light = Source.Palette.News600,
                dark = Source.Palette.News100,
            ),
            iconTint = AppColour(
                light = Source.Palette.Error400,
                dark = Source.Palette.Error500,
            ),
            contentColour = AppColour(
                light = Source.Palette.Neutral0,
                dark = Source.Palette.Neutral100,
            ),
            icon = Source.Icons.Base.AlertRound,
        ),
    }
}

/**
 * A banner component that displays an alert message with styling based on provided priority.
 *
 * @param messageText The text to be displayed in the banner.
 * @param priority The type of message to be displayed (Neutral, Informative, Error).
 * @param onDismiss A callback to be invoked when the cancel icon is clicked.
 * @param onMessageClick A callback to be invoked when the banner is clicked.
 * @param modifier The modifier to be applied to the banner.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun AlertBanner(
    messageText: String,
    priority: AlertBanner.Priority,
    onDismiss: () -> Unit,
    onMessageClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    AlertBanner(
        messageText = AnnotatedString(messageText),
        priority = priority,
        onDismiss = onDismiss,
        onMessageClick = onMessageClick,
        modifier = modifier,
    )
}

/**
 * A composable function that displays an alert banner with optional clickable links.
 *
 * @param messageText The text to be displayed in the banner having link in it.
 * @param priority The type of message to be displayed (Neutral, Informative, Error).
 * @param onDismiss A callback to be invoked when the cancel icon is clicked.
 * @param onMessageClick A callback to be invoked when the banner is clicked.
 * @param modifier The modifier to be applied to the banner.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun AlertBanner(
    messageText: AnnotatedString,
    priority: AlertBanner.Priority,
    onDismiss: () -> Unit,
    onMessageClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier.background(priority.backgroundColour.current)) {
        Row(
            modifier = Modifier
                .weight(1f)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = ripple(),
                    onClick = onMessageClick,
                )
                .padding(
                    top = AlertBanner.Style.ContentPaddingVertical,
                    bottom = AlertBanner.Style.ContentPaddingVertical,
                    start = AlertBanner.Style.ContentPaddingHorizontal,
                ),
        ) {
            priority.icon?.let {
                Icon(
                    imageVector = it,
                    tint = priority.iconTint.current,
                    contentDescription = null,
                )

                Spacer(modifier = Modifier.width(AlertBanner.Style.iconTextSpacing))
            }

            Text(
                text = messageText,
                style = AlertBanner.Style.textStyle,
                color = priority.contentColour.current,
            )
        }

        Spacer(modifier = Modifier.width(AlertBanner.Style.closeTextSpacing))

        IconButton(
            onClick = onDismiss,
            modifier = Modifier.padding(
                end = AlertBanner.Style.ContentPaddingHorizontal,
                top = AlertBanner.Style.CloseIconButtonPaddingVertical,
                bottom = AlertBanner.Style.CloseIconButtonPaddingVertical,
            ),
        ) {
            Icon(
                imageVector = Source.Icons.Base.Cross,
                tint = priority.contentColour.current,
                contentDescription = null,
            )
        }
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@SuppressLint("DiscouragedApi")
@PreviewPhoneBothMode
@Composable
internal fun AlertBannerWithTextPreview() {
    AppColourMode {
        Column(Modifier.background(Source.Palette.Neutral100)) {
            AlertBanner.Priority.entries.forEach { message ->
                Row(
                    modifier = Modifier
                        .background(message.backgroundColour.current)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    AlertBanner(
                        modifier = Modifier.fillMaxWidth(),
                        messageText = "You’re on the US Edition Go to UK edition",
                        onMessageClick = { },
                        priority = message,
                        onDismiss = {},
                    )
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
        Column(Modifier.background(Source.Palette.Neutral100)) {
            AlertBanner.Priority.entries.forEach { message ->
                Row(
                    modifier = Modifier
                        .background(message.backgroundColour.current)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    AlertBanner(
                        modifier = Modifier.fillMaxWidth(),
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