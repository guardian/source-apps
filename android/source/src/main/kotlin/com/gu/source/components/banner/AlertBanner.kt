package com.gu.source.components.banner

import android.annotation.SuppressLint
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.gu.source.icons.AlertRound
import com.gu.source.icons.Cross
import com.gu.source.icons.InfoRound
import com.gu.source.presets.palette.Brand400
import com.gu.source.presets.palette.Brand800
import com.gu.source.presets.palette.Error400
import com.gu.source.presets.palette.Error500
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.palette.Neutral20
import com.gu.source.presets.palette.Neutral7
import com.gu.source.presets.palette.News100
import com.gu.source.presets.palette.News600
import com.gu.source.presets.typography.TextSans17
import com.gu.source.utils.PreviewPhoneBothMode

/**
 * Object for property models for the [AlertBanner] component.
 */
object AlertBanner {
    internal object Style {
        internal val ContentPadding = PaddingValues(
            vertical = 20.dp,
            horizontal = 16.dp,
        )

        val textStyle = Source.Typography.TextSans17

        val iconTextSpacing = 8.dp
        val crossTextSpacing = 20.dp
        val crossIconSize = 24.dp
    }

    /**
     * Enum for the message type of the [AlertBanner]. Informs users of how important an action is.
     *
     * The messages are named based on banner message type and backdrop colour.
     */
    @Suppress("UndocumentedPublicProperty", "StringLiteralDuplication")
    enum class Priority(
        internal val backgroundColour: AppColour,
        internal val iconTint: AppColour,
        internal val contentColour: AppColour,
        internal val icon: ImageVector?,
    ) {
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
 * @param text The text to be displayed in the banner.
 * @param priority The type of message to be displayed (Neutral, Informative, Error).
 * @param onDismiss A callback to be invoked when the cancel icon is clicked.
 * @param onClick A callback to be invoked when the banner is clicked.
 * @param modifier The modifier to be applied to the banner.
 */
@SuppressLint("DiscouragedApi")
@Composable
fun AlertBanner(
    text: String,
    priority: AlertBanner.Priority,
    onDismiss: () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    AlertBanner(
        annotatedText = AnnotatedString(text),
        priority = priority,
        onCloseClick = onDismiss,
        onClick = onClick,
        modifier = modifier,
    )
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
            .background(priority.backgroundColour.current)
            .padding(AlertBanner.Style.ContentPadding),
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = ripple(),
                    onClick = onClick,
                ),
        ) {
            priority.icon?.let {
                Icon(
                    imageVector = it,
                    tint = priority.iconTint.current,
                    contentDescription = null,
                )

                Spacer(
                    modifier = Modifier.width(AlertBanner.Style.iconTextSpacing),
                )
            }

            Text(
                text = annotatedText,
                style = AlertBanner.Style.textStyle,
                color = priority.contentColour.current,
            )
        }

        Spacer(
            modifier = Modifier.width(AlertBanner.Style.crossTextSpacing),
        )

        IconButton(
            onClick = onCloseClick,
            modifier = Modifier.size(AlertBanner.Style.crossIconSize),
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
                        text = "You’re on the US Edition Go to UK edition",
                        onClick = { },
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