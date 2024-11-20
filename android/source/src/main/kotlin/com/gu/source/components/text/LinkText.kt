package com.gu.source.components.text

import android.annotation.SuppressLint
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import com.gu.source.Source
import com.gu.source.daynight.AppColourMode
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.typography.TextSans17
import com.gu.source.theme.SourceCoreTheme
import com.gu.source.utils.PreviewPhoneBothMode

/**
 * A composable function that displays text with clickable links.
 *
 * @param text The full text to be displayed.
 * @param textColor The color of the text.
 * @param linkText A list of substrings within the text that should be clickable links.
 * @param textStyle The style to be applied to the text.
 * @param modifier The modifier to be applied to the Text composable.
 * @param linkTextDecoration The text decoration to be applied to the link text.
 * @param linkTextCallbacks A list of callbacks to be invoked when the corresponding link is clicked.
 */
@Composable
fun LinkText(
    text: String,
    textColor: Color,
    linkText: List<String>,
    textStyle: TextStyle,
    modifier: Modifier = Modifier,
    linkTextDecoration: TextDecoration = TextDecoration.Underline,
    linkTextCallbacks: List<() -> Unit> = emptyList(),
) {
    val annotatedString = buildAnnotatedString {
        append(text)
        linkText.forEachIndexed { index, link ->
            val startIndex = text.indexOf(link)
            val endIndex = startIndex + link.length
            addStyle(
                style = SpanStyle(

                    textDecoration = linkTextDecoration,
                ),
                start = startIndex,
                end = endIndex,
            )
            addLink(
                clickable = LinkAnnotation.Clickable(
                    tag = "link$index",
                    linkInteractionListener = { offset ->
                        linkTextCallbacks[index]()
                    },
                ),
                start = startIndex,
                end = endIndex,
            )
        }
        addStyle(
            style = textStyle.toSpanStyle(),
            start = 0,
            end = text.length,
        )
    }

    Text(
        modifier = modifier,
        text = annotatedString,
        style = textStyle,
        color = textColor,
    )
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@SuppressLint("DiscouragedApi")
@PreviewPhoneBothMode
@Composable
internal fun LinkTextPreview() {
    AppColourMode {
        SourceCoreTheme {
            Column(Modifier.background(Source.Palette.Neutral100)) {
                LinkText(
                    text = "You’re on the US Edition Go to UK edition",
                    linkText = listOf("UK edition"),
                    textStyle = Source.Typography.TextSans17,
                    linkTextDecoration = TextDecoration.Underline,
                    textColor = Source.Palette.Neutral0,
                    linkTextCallbacks = listOf(
                        { /* Do something */ },
                    ),
                )
            }
        }
    }
}