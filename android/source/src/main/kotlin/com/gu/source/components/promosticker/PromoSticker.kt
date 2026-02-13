package com.gu.source.components.promosticker

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

/** Supported sizes for the [PromoSticker]. */
enum class PromoStickerSize(
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

/** Styles for the [PromoSticker]. */
enum class PromoStickerStyle(
    internal val fillColour: AppColour,
    internal val textColour: AppColour,
) {
    /** Sticker style used for new content or information that needs to be highlighted. */
    Info(
        fillColour = AppColour(
            light = Source.Palette.Sport400,
            dark = Source.Palette.Sport800,
        ),
        textColour = AppColour(
            light = Source.Palette.Neutral97,
            dark = Source.Palette.Sport300,
        ),
    ),

    /** Sticker style used to highlight errors or important information that needs attention. */
    Error(
        fillColour = AppColour(
            light = Source.Palette.News400,
            dark = Source.Palette.News800,
        ),
        textColour = AppColour(
            light = Source.Palette.Neutral97,
            dark = Source.Palette.News300,
        ),
    ),

    /** Sticker style used as a softer alternative to [Error]. */
    Lifestyle(
        fillColour = AppColour(
            light = Source.Palette.Lifestyle400,
            dark = Source.Palette.Lifestyle800,
        ),
        textColour = AppColour(
            light = Source.Palette.Neutral97,
            dark = Source.Palette.Lifestyle300,
        ),
    ),

    /** Sticker style used to highlight successful actions or positive information. */
    Success(
        fillColour = AppColour(
            light = Source.Palette.Labs200,
            dark = Source.Palette.Labs700,
        ),
        textColour = AppColour(
            light = Source.Palette.Neutral97,
            dark = Source.Palette.Labs200,
        ),
    ),
}

/**
 * A badge component to highlight important content.
 *
 * See [the design spec](https://www.figma.com/design/HYKpHfksrAD4YE8P8ukN3Q/Supporter-Revenue-Toolkit?node-id=4082-9246&m=dev) for more details.
 *
 * @param text The text to display inside the badge.
 * @param size The size of the badge, see [PromoStickerSize].
 * @param style The style of the badge, see [PromoStickerStyle].
 * @param modifier Optional [Modifier] for this badge.
 * [TextOverflow.Ellipsis].
 */
@Composable
fun PromoSticker(
    text: String,
    size: PromoStickerSize,
    style: PromoStickerStyle,
    modifier: Modifier = Modifier,
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
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.offset(y = (-0.5).dp),
        )
    }
}

@PreviewPhoneBothMode
@Composable
internal fun PromoStickerPreview() {
    AppColourMode {
        Column(
            modifier = Modifier.background(
                AppColour(
                    light = Source.Palette.Neutral100,
                    dark = Source.Palette.Neutral0,
                ).current,
            ),
        ) {
            PromoStickerStyle.entries.forEach { type ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    PromoStickerSize.entries.forEach { size ->
                        PromoSticker(
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
internal fun PromoStickerLongPreview() {
    AppColourMode {
        Column(
            modifier = Modifier.widthIn(max = 100.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            PromoSticker(
                text = "New but very long",
                size = PromoStickerSize.Small,
                style = PromoStickerStyle.Info,
            )
        }
    }
}