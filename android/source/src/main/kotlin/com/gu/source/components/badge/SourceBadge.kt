package com.gu.source.components.badge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Labs200
import com.gu.source.foundation.palette.Labs700
import com.gu.source.foundation.palette.Lifestyle300
import com.gu.source.foundation.palette.Lifestyle400
import com.gu.source.foundation.palette.Lifestyle800
import com.gu.source.foundation.palette.Neutral0
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral97
import com.gu.source.foundation.palette.News300
import com.gu.source.foundation.palette.News400
import com.gu.source.foundation.palette.News800
import com.gu.source.foundation.palette.Sport300
import com.gu.source.foundation.palette.Sport400
import com.gu.source.foundation.palette.Sport800
import com.gu.source.foundation.typography.TextSansBold12
import com.gu.source.foundation.typography.TextSansBold15
import com.gu.source.utils.PreviewPhoneBothMode
import com.gu.source.utils.toDp

/** Supported sizes for the [SourceBadge]. */
enum class SourceBadgeSizes(
    internal val height: TextUnit,
    internal val padding: PaddingValues,
    internal val textStyle: TextStyle,
) {
    Small(
        height = 16.sp,
        padding = PaddingValues(horizontal = 4.dp),
        textStyle = Source.Typography.TextSansBold12,
    ),
    Large(
        height = 24.sp,
        padding = PaddingValues(horizontal = 8.dp),
        textStyle = Source.Typography.TextSansBold15,
    ),
}

/** Supported styles for the [SourceBadge]. */
enum class SourceBadgeStyle(
    internal val fillColour: AppColour,
    internal val textColour: AppColour,
) {
    Info(
        fillColour = AppColour(Source.Palette.Sport400, Source.Palette.Sport800),
        textColour = AppColour(Source.Palette.Neutral97, Source.Palette.Sport300),
    ),
    Error(
        fillColour = AppColour(Source.Palette.News400, Source.Palette.News800),
        textColour = AppColour(Source.Palette.Neutral97, Source.Palette.News300),
    ),
    Lifestyle(
        fillColour = AppColour(Source.Palette.Lifestyle400, Source.Palette.Lifestyle800),
        textColour = AppColour(Source.Palette.Neutral97, Source.Palette.Lifestyle300),
    ),
    Success(
        fillColour = AppColour(Source.Palette.Labs200, Source.Palette.Labs700),
        textColour = AppColour(Source.Palette.Neutral97, Source.Palette.Labs200),
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
            .height(size.height.toDp())
            .padding(size.padding),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            color = style.textColour.current,
            style = size.textStyle,
            maxLines = maxLines,
            overflow = textOverflow,
            modifier = Modifier.offset(y = (-0.5).dp),
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
                style = SourceBadgeStyle.Info,
            )
            SourceBadge(
                text = "New but very long",
                size = SourceBadgeSizes.Small,
                style = SourceBadgeStyle.Info,
                maxLines = 2,
            )
        }
    }
}