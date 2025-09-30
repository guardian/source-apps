package com.gu.source.components.badge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.Neutral0
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral20
import com.gu.source.foundation.palette.Neutral86
import com.gu.source.foundation.palette.Neutral97
import com.gu.source.foundation.palette.News400
import com.gu.source.foundation.palette.Sport400
import com.gu.source.foundation.typography.TextSansBold12
import com.gu.source.foundation.typography.TextSansBold15
import com.gu.source.utils.PreviewPhoneBothMode

/** Supported sizes for the [SourceBadge]. */
enum class SourceBadgeSizes(
    internal val padding: PaddingValues,
    internal val textStyle: TextStyle,
) {
    Small(
        padding = PaddingValues(horizontal = 4.dp),
        textStyle = Source.Typography.TextSansBold12,
    ),
    Large(
        padding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
        textStyle = Source.Typography.TextSansBold15,
    ),
}

/** Supported styles for the [SourceBadge]. */
enum class SourceBadgeStyle(
    internal val fillColour: AppColour,
    internal val textColour: AppColour,
) {
    Gray(
        fillColour = AppColour(Source.Palette.Neutral86),
        textColour = AppColour(Source.Palette.Neutral20),
    ),
    LightBlue(
        fillColour = AppColour(Source.Palette.Sport400),
        textColour = AppColour(Source.Palette.Neutral97),
    ),
    DarkBlue(
        fillColour = AppColour(Source.Palette.Brand400),
        textColour = AppColour(Source.Palette.Neutral100),
    ),
    Red(
        fillColour = AppColour(Source.Palette.News400),
        textColour = AppColour(Source.Palette.Neutral100),
    ),
}

/**
 * A badge component to highlight important content.
 *
 * See [the design spec](https://www.figma.com/design/HYKpHfksrAD4YE8P8ukN3Q/Supporter-Revenue-Toolkit?node-id=4082-9246&m=dev) for more details.
 *
 * @param text The text to display inside the badge.
 * @param size The size of the badge, see [SourceBadgeSizes].
 * @param style The style of the badge, see [SourceBadgeStyle].
 * @param modifier Optional [Modifier] for this badge.
 * @param maxLines Optional - Maximum number of lines to display. Default is 1.
 * @param textOverflow Optional - Overflow behaviour of the text. Default is
 * [TextOverflow.Ellipsis].
 */
@Composable
fun SourceBadge(
    text: String,
    size: SourceBadgeSizes,
    style: SourceBadgeStyle,
    modifier: Modifier = Modifier,
    maxLines: Int = 1,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
) {
    Box(
        modifier = modifier
            .background(
                color = style.fillColour.current,
                shape = RoundedCornerShape(4.dp),
            )
            .padding(size.padding),
    ) {
        Text(
            text = text,
            color = style.textColour.current,
            style = size.textStyle,
            maxLines = maxLines,
            overflow = textOverflow,
        )
    }
}

@PreviewPhoneBothMode
@Composable
internal fun SourceBadgePreview() {
    AppColourMode {
        Column(
            modifier = Modifier.background(
                AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral0,
                ).current,
            ),
        ) {
            SourceBadgeStyle.entries.forEach { type ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    SourceBadgeSizes.entries.forEach { size ->
                        SourceBadge(
                            text = "New",
                            size = size,
                            style = type,
                            modifier = Modifier.padding(8.dp),
                        )
                    }
                }
            }
        }
    }
}

@PreviewPhoneBothMode
@Composable
internal fun SourceBadgeLongPreview() {
    AppColourMode {
        Column(
            modifier = Modifier.widthIn(max = 100.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            SourceBadge(
                text = "New but very long",
                size = SourceBadgeSizes.Small,
                style = SourceBadgeStyle.LightBlue,
            )
            SourceBadge(
                text = "New but very long",
                size = SourceBadgeSizes.Small,
                style = SourceBadgeStyle.LightBlue,
                maxLines = 2,
            )
        }
    }
}