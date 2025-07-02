@file:Suppress("TooManyFunctions")

package com.gu.source.foundation.typography

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.foundation.palette.Neutral60

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun HeadlineBoldPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(
            text = "HeadlineBold14",
            style = Source.Typography.HeadlineBold14,
        )
        TextPreview(
            text = "HeadlineBold15",
            style = Source.Typography.HeadlineBold15,
        )
        TextPreview(
            text = "HeadlineBold16",
            style = Source.Typography.HeadlineBold16,
        )
        TextPreview(
            text = "HeadlineBold17",
            style = Source.Typography.HeadlineBold17,
        )
        TextPreview(
            text = "HeadlineBold18",
            style = Source.Typography.HeadlineBold18,
        )
        TextPreview(
            text = "HeadlineBold20",
            style = Source.Typography.HeadlineBold20,
        )
        TextPreview(
            text = "HeadlineBold22",
            style = Source.Typography.HeadlineBold22,
        )
        TextPreview(
            text = "HeadlineBold24",
            style = Source.Typography.HeadlineBold24,
        )
        TextPreview(
            text = "HeadlineBold28",
            style = Source.Typography.HeadlineBold28,
        )
        TextPreview(
            text = "HeadlineBold34",
            style = Source.Typography.HeadlineBold34,
        )
        TextPreview(
            text = "HeadlineBold42",
            style = Source.Typography.HeadlineBold42,
        )
        TextPreview(
            text = "HeadlineBold50",
            style = Source.Typography.HeadlineBold50,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun HeadlineLightPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(
            text = "HeadlineLight14",
            style = Source.Typography.HeadlineLight14,
        )
        TextPreview(
            text = "HeadlineLight15",
            style = Source.Typography.HeadlineLight15,
        )
        TextPreview(
            text = "HeadlineLight16",
            style = Source.Typography.HeadlineLight16,
        )
        TextPreview(
            text = "HeadlineLight17",
            style = Source.Typography.HeadlineLight17,
        )
        TextPreview(
            text = "HeadlineLight18",
            style = Source.Typography.HeadlineLight18,
        )
        TextPreview(
            text = "HeadlineLight20",
            style = Source.Typography.HeadlineLight20,
        )
        TextPreview(
            text = "HeadlineLight22",
            style = Source.Typography.HeadlineLight22,
        )
        TextPreview(
            text = "HeadlineLight24",
            style = Source.Typography.HeadlineLight24,
        )
        TextPreview(
            text = "HeadlineLight28",
            style = Source.Typography.HeadlineLight28,
        )
        TextPreview(
            text = "HeadlineLight34",
            style = Source.Typography.HeadlineLight34,
        )
        TextPreview(
            text = "HeadlineLight42",
            style = Source.Typography.HeadlineLight42,
        )
        TextPreview(
            text = "HeadlineLight50",
            style = Source.Typography.HeadlineLight50,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun HeadlineLightItalicPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(
            text = "HeadlineLightItalic14",
            style = Source.Typography.HeadlineLightItalic14,
        )
        TextPreview(
            text = "HeadlineLightItalic15",
            style = Source.Typography.HeadlineLightItalic15,
        )
        TextPreview(
            text = "HeadlineLightItalic16",
            style = Source.Typography.HeadlineLightItalic16,
        )
        TextPreview(
            text = "HeadlineLightItalic17",
            style = Source.Typography.HeadlineLightItalic17,
        )
        TextPreview(
            text = "HeadlineLightItalic18",
            style = Source.Typography.HeadlineLightItalic18,
        )
        TextPreview(
            text = "HeadlineLightItalic20",
            style = Source.Typography.HeadlineLightItalic20,
        )
        TextPreview(
            text = "HeadlineLightItalic22",
            style = Source.Typography.HeadlineLightItalic22,
        )
        TextPreview(
            text = "HeadlineLightItalic24",
            style = Source.Typography.HeadlineLightItalic24,
        )
        TextPreview(
            text = "HeadlineLightItalic28",
            style = Source.Typography.HeadlineLightItalic28,
        )
        TextPreview(
            text = "HeadlineLightItalic34",
            style = Source.Typography.HeadlineLightItalic34,
        )
        TextPreview(
            text = "HeadlineLightItalic42",
            style = Source.Typography.HeadlineLightItalic42,
        )
        TextPreview(
            text = "HeadlineLightItalic50",
            style = Source.Typography.HeadlineLightItalic50,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun HeadlineMediumPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(
            text = "HeadlineMedium14",
            style = Source.Typography.HeadlineMedium14,
        )
        TextPreview(
            text = "HeadlineMedium15",
            style = Source.Typography.HeadlineMedium15,
        )
        TextPreview(
            text = "HeadlineMedium16",
            style = Source.Typography.HeadlineMedium16,
        )
        TextPreview(
            text = "HeadlineMedium17",
            style = Source.Typography.HeadlineMedium17,
        )
        TextPreview(
            text = "HeadlineMedium18",
            style = Source.Typography.HeadlineMedium18,
        )
        TextPreview(
            text = "HeadlineMedium20",
            style = Source.Typography.HeadlineMedium20,
        )
        TextPreview(
            text = "HeadlineMedium22",
            style = Source.Typography.HeadlineMedium22,
        )
        TextPreview(
            text = "HeadlineMedium24",
            style = Source.Typography.HeadlineMedium24,
        )
        TextPreview(
            text = "HeadlineMedium28",
            style = Source.Typography.HeadlineMedium28,
        )
        TextPreview(
            text = "HeadlineMedium34",
            style = Source.Typography.HeadlineMedium34,
        )
        TextPreview(
            text = "HeadlineMedium42",
            style = Source.Typography.HeadlineMedium42,
        )
        TextPreview(
            text = "HeadlineMedium50",
            style = Source.Typography.HeadlineMedium50,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun HeadlineMediumItalicPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(
            text = "HeadlineMediumItalic14",
            style = Source.Typography.HeadlineMediumItalic14,
        )
        TextPreview(
            text = "HeadlineMediumItalic15",
            style = Source.Typography.HeadlineMediumItalic15,
        )
        TextPreview(
            text = "HeadlineMediumItalic16",
            style = Source.Typography.HeadlineMediumItalic16,
        )
        TextPreview(
            text = "HeadlineMediumItalic17",
            style = Source.Typography.HeadlineMediumItalic17,
        )
        TextPreview(
            text = "HeadlineMediumItalic18",
            style = Source.Typography.HeadlineMediumItalic18,
        )
        TextPreview(
            text = "HeadlineMediumItalic20",
            style = Source.Typography.HeadlineMediumItalic20,
        )
        TextPreview(
            text = "HeadlineMediumItalic22",
            style = Source.Typography.HeadlineMediumItalic22,
        )
        TextPreview(
            text = "HeadlineMediumItalic24",
            style = Source.Typography.HeadlineMediumItalic24,
        )
        TextPreview(
            text = "HeadlineMediumItalic28",
            style = Source.Typography.HeadlineMediumItalic28,
        )
        TextPreview(
            text = "HeadlineMediumItalic34",
            style = Source.Typography.HeadlineMediumItalic34,
        )
        TextPreview(
            text = "HeadlineMediumItalic42",
            style = Source.Typography.HeadlineMediumItalic42,
        )
        TextPreview(
            text = "HeadlineMediumItalic50",
            style = Source.Typography.HeadlineMediumItalic50,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun HeadlineSemiBoldPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(
            text = "HeadlineSemiBold14",
            style = Source.Typography.HeadlineSemiBold14,
        )
        TextPreview(
            text = "HeadlineSemiBold15",
            style = Source.Typography.HeadlineSemiBold15,
        )
        TextPreview(
            text = "HeadlineSemiBold16",
            style = Source.Typography.HeadlineSemiBold16,
        )
        TextPreview(
            text = "HeadlineSemiBold17",
            style = Source.Typography.HeadlineSemiBold17,
        )
        TextPreview(
            text = "HeadlineSemiBold18",
            style = Source.Typography.HeadlineSemiBold18,
        )
        TextPreview(
            text = "HeadlineSemiBold20",
            style = Source.Typography.HeadlineSemiBold20,
        )
        TextPreview(
            text = "HeadlineSemiBold22",
            style = Source.Typography.HeadlineSemiBold22,
        )
        TextPreview(
            text = "HeadlineSemiBold24",
            style = Source.Typography.HeadlineSemiBold24,
        )
        TextPreview(
            text = "HeadlineSemiBold28",
            style = Source.Typography.HeadlineSemiBold28,
        )
        TextPreview(
            text = "HeadlineSemiBold34",
            style = Source.Typography.HeadlineSemiBold34,
        )
        TextPreview(
            text = "HeadlineSemiBold42",
            style = Source.Typography.HeadlineSemiBold42,
        )
        TextPreview(
            text = "HeadlineSemiBold50",
            style = Source.Typography.HeadlineSemiBold50,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun TextArticlePreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(
            text = "TextArticle15",
            style = Source.Typography.TextArticle15,
        )
        TextPreview(
            text = "TextArticle17",
            style = Source.Typography.TextArticle17,
        )
        TextPreview(
            text = "TextArticleBold15",
            style = Source.Typography.TextArticleBold15,
        )
        TextPreview(
            text = "TextArticleBold17",
            style = Source.Typography.TextArticleBold17,
        )
        TextPreview(
            text = "TextArticleItalic15",
            style = Source.Typography.TextArticleItalic15,
        )
        TextPreview(
            text = "TextArticleItalic17",
            style = Source.Typography.TextArticleItalic17,
        )
        TextPreview(
            text = "TextArticleBoldItalic15",
            style = Source.Typography.TextArticleBoldItalic15,
        )
        TextPreview(
            text = "TextArticleBoldItalic17",
            style = Source.Typography.TextArticleBoldItalic17,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun TextEgyptianPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(
            text = "TextEgyptian14",
            style = Source.Typography.TextEgyptian14,
        )
        TextPreview(
            text = "TextEgyptian15",
            style = Source.Typography.TextEgyptian15,
        )
        TextPreview(
            text = "TextEgyptian17",
            style = Source.Typography.TextEgyptian17,
        )
        TextPreview(
            text = "TextEgyptianBold14",
            style = Source.Typography.TextEgyptianBold14,
        )
        TextPreview(
            text = "TextEgyptianBold15",
            style = Source.Typography.TextEgyptianBold15,
        )
        TextPreview(
            text = "TextEgyptianBold17",
            style = Source.Typography.TextEgyptianBold17,
        )
        TextPreview(
            text = "TextEgyptianBoldItalic14",
            style = Source.Typography.TextEgyptianBoldItalic14,
        )
        TextPreview(
            text = "TextEgyptianBoldItalic15",
            style = Source.Typography.TextEgyptianBoldItalic15,
        )
        TextPreview(
            text = "TextEgyptianBoldItalic17",
            style = Source.Typography.TextEgyptianBoldItalic17,
        )
        TextPreview(
            text = "TextEgyptianItalic14",
            style = Source.Typography.TextEgyptianItalic14,
        )
        TextPreview(
            text = "TextEgyptianItalic15",
            style = Source.Typography.TextEgyptianItalic15,
        )
        TextPreview(
            text = "TextEgyptianItalic17",
            style = Source.Typography.TextEgyptianItalic17,
        )
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun TextSansPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(text = "TextSans11", style = Source.Typography.TextSans11)
        TextPreview(text = "TextSans12", style = Source.Typography.TextSans12)
        TextPreview(text = "TextSans14", style = Source.Typography.TextSans14)
        TextPreview(text = "TextSans15", style = Source.Typography.TextSans15)
        TextPreview(text = "TextSans17", style = Source.Typography.TextSans17)
        TextPreview(text = "TextSans20", style = Source.Typography.TextSans20)
        TextPreview(text = "TextSans24", style = Source.Typography.TextSans24)
        TextPreview(text = "TextSans28", style = Source.Typography.TextSans28)
        TextPreview(text = "TextSans34", style = Source.Typography.TextSans34)
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun TextSansBoldPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(text = "TextSansBold11", style = Source.Typography.TextSansBold11)
        TextPreview(text = "TextSansBold12", style = Source.Typography.TextSansBold12)
        TextPreview(text = "TextSansBold14", style = Source.Typography.TextSansBold14)
        TextPreview(text = "TextSansBold15", style = Source.Typography.TextSansBold15)
        TextPreview(text = "TextSansBold17", style = Source.Typography.TextSansBold17)
        TextPreview(text = "TextSansBold20", style = Source.Typography.TextSansBold20)
        TextPreview(text = "TextSansBold24", style = Source.Typography.TextSansBold24)
        TextPreview(text = "TextSansBold28", style = Source.Typography.TextSansBold28)
        TextPreview(text = "TextSansBold34", style = Source.Typography.TextSansBold34)
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun TextSansItalicPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(text = "TextSansItalic11", style = Source.Typography.TextSansItalic11)
        TextPreview(text = "TextSansItalic12", style = Source.Typography.TextSansItalic12)
        TextPreview(text = "TextSansItalic14", style = Source.Typography.TextSansItalic14)
        TextPreview(text = "TextSansItalic15", style = Source.Typography.TextSansItalic15)
        TextPreview(text = "TextSansItalic17", style = Source.Typography.TextSansItalic17)
        TextPreview(text = "TextSansItalic20", style = Source.Typography.TextSansItalic20)
        TextPreview(text = "TextSansItalic24", style = Source.Typography.TextSansItalic24)
        TextPreview(text = "TextSansItalic28", style = Source.Typography.TextSansItalic28)
        TextPreview(text = "TextSansItalic34", style = Source.Typography.TextSansItalic34)
    }
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
internal fun TitlepiecePreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        TextPreview(text = "Titlepiece42", style = Source.Typography.Titlepiece42)
        TextPreview(text = "Titlepiece50", style = Source.Typography.Titlepiece50)
        TextPreview(text = "Titlepiece70", style = Source.Typography.Titlepiece70)
    }
}

@Composable
private fun TextPreview(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text,
        style = style,
        modifier = modifier.border(
            width = 1.dp,
            color = Source.Palette.Neutral60,
        ),
    )
}