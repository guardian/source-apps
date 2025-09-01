package com.gu.source.components.banner

import android.annotation.SuppressLint
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.gu.source.foundation.icons.base.AlertRound
import com.gu.source.foundation.icons.base.Cross
import com.gu.source.foundation.icons.base.InfoRound
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.Brand800
import com.gu.source.foundation.palette.Error400
import com.gu.source.foundation.palette.Error500
import com.gu.source.foundation.palette.Neutral0
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral20
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.foundation.palette.News100
import com.gu.source.foundation.palette.News600
import com.gu.source.foundation.typography.TextSans17
import com.gu.source.utils.PreviewPhoneBothMode

/**
 * Object for property models for the [SourceAlertBanner] component.
 */
object SourceAlertBanner {
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
     * Enum for the message type of the [SourceAlertBanner]. Informs users of how important an action is.
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
        Info(
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
 * @see <img src="/docAssets/alert-example.png">
 *
 * @param messageText The text to be displayed in the banner.
 * @param priority The type of message to be displayed (Neutral, Informative, Error).
 * @param onMessageClick A callback to be invoked when the banner is clicked.
 * @param onDismiss A callback to be invoked when the cancel icon is clicked.
 * @param modifier The modifier to be applied to the banner.
 * @param showDismiss Whether to show the dismiss icon.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun SourceAlertBanner(
    messageText: String,
    priority: SourceAlertBanner.Priority,
    onMessageClick: () -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    showDismiss: Boolean = true,
) {
    SourceAlertBanner(
        messageText = AnnotatedString(messageText),
        priority = priority,
        onMessageClick = onMessageClick,
        onDismiss = onDismiss,
        modifier = modifier,
        showDismiss = showDismiss,
    )
}

/**
 * A composable function that displays an alert banner with optional clickable links.
 *
 * @see <img src="/docAssets/alert-example.png">
 *
 * @param messageText The text to be displayed in the banner having link in it.
 * @param priority The type of message to be displayed (Neutral, Informative, Error).
 * @param onMessageClick A callback to be invoked when the banner is clicked.
 * @param onDismiss A callback to be invoked when the cancel icon is clicked.
 * @param modifier The modifier to be applied to the banner.
 * @param showDismiss Whether to show the dismiss icon.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun SourceAlertBanner(
    messageText: AnnotatedString,
    priority: SourceAlertBanner.Priority,
    onMessageClick: () -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    showDismiss: Boolean = true,
) {
    Row(modifier = modifier.background(priority.backgroundColour.current)) {
        Row(
            modifier = Modifier
                .weight(1f)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = ripple(color = priority.contentColour.current),
                    onClick = onMessageClick,
                )
                .padding(
                    top = SourceAlertBanner.Style.ContentPaddingVertical,
                    bottom = SourceAlertBanner.Style.ContentPaddingVertical,
                    start = SourceAlertBanner.Style.ContentPaddingHorizontal,
                ),
        ) {
            priority.icon?.let {
                Icon(
                    imageVector = it,
                    tint = priority.iconTint.current,
                    contentDescription = null,
                )

                Spacer(modifier = Modifier.width(SourceAlertBanner.Style.iconTextSpacing))
            }

            Text(
                text = messageText,
                style = SourceAlertBanner.Style.textStyle,
                color = priority.contentColour.current,
            )
        }

        Spacer(modifier = Modifier.width(SourceAlertBanner.Style.closeTextSpacing))

        if (showDismiss) {
            IconButton(
                onClick = onDismiss,
                modifier = Modifier.padding(
                    end = SourceAlertBanner.Style.ContentPaddingHorizontal,
                    top = SourceAlertBanner.Style.CloseIconButtonPaddingVertical,
                    bottom = SourceAlertBanner.Style.CloseIconButtonPaddingVertical,
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
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@SuppressLint("DiscouragedApi")
@PreviewPhoneBothMode
@Composable
internal fun SourceAlertBannerPreview() {
    val text = "You’re on the US Edition. Go to the UK edition."
    val annotatedText = buildAnnotatedString {
        val link = "UK edition"
        append(text)
        val startIndex = text.indexOf(link)
        val endIndex = startIndex + link.length
        addStyle(
            style = SpanStyle(textDecoration = TextDecoration.Underline),
            start = startIndex,
            end = endIndex,
        )
    }

    AppColourMode {
        Column {
            SourceAlertBanner.Priority.entries.forEach { message ->
                SourceAlertBanner(
                    messageText = text,
                    priority = message,
                    onMessageClick = { },
                    onDismiss = {},
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            SourceAlertBanner.Priority.entries.forEach { message ->
                SourceAlertBanner(
                    messageText = annotatedText,
                    priority = message,
                    onMessageClick = { },
                    onDismiss = {},
                    modifier = Modifier.fillMaxWidth(),
                    showDismiss = false,
                )
            }
        }
    }
}