package com.theguardian.source.typography

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Preview(device = Devices.PIXEL_C, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun Preview() {
    Column {
        FlowRow {
            Text(
                text = "headlineBold14",
                style = Typography.headlineBold14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold15",
                style = Typography.headlineBold15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold16",
                style = Typography.headlineBold16,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold17",
                style = Typography.headlineBold17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold18",
                style = Typography.headlineBold18,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold20",
                style = Typography.headlineBold20,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold22",
                style = Typography.headlineBold22,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold24",
                style = Typography.headlineBold24,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold28",
                style = Typography.headlineBold28,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold34",
                style = Typography.headlineBold34,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineBold42",
                style = Typography.headlineBold42,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "headlineLight14",
                style = Typography.headlineLight14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight15",
                style = Typography.headlineLight15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight16",
                style = Typography.headlineLight16,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight17",
                style = Typography.headlineLight17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight18",
                style = Typography.headlineLight18,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight20",
                style = Typography.headlineLight20,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight22",
                style = Typography.headlineLight22,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight24",
                style = Typography.headlineLight24,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight28",
                style = Typography.headlineLight28,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight34",
                style = Typography.headlineLight34,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineLight42",
                style = Typography.headlineLight42,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "headlineMedium14",
                style = Typography.headlineMedium14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium15",
                style = Typography.headlineMedium15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium16",
                style = Typography.headlineMedium16,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium17",
                style = Typography.headlineMedium17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium18",
                style = Typography.headlineMedium18,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium20",
                style = Typography.headlineMedium20,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium22",
                style = Typography.headlineMedium22,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium24",
                style = Typography.headlineMedium24,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium28",
                style = Typography.headlineMedium28,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium34",
                style = Typography.headlineMedium34,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMedium42",
                style = Typography.headlineMedium42,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "headlineMediumItalic14",
                style = Typography.headlineMediumItalic14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic15",
                style = Typography.headlineMediumItalic15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic16",
                style = Typography.headlineMediumItalic16,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic17",
                style = Typography.headlineMediumItalic17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic18",
                style = Typography.headlineMediumItalic18,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic20",
                style = Typography.headlineMediumItalic20,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic22",
                style = Typography.headlineMediumItalic22,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic24",
                style = Typography.headlineMediumItalic24,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic28",
                style = Typography.headlineMediumItalic28,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic34",
                style = Typography.headlineMediumItalic34,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineMediumItalic42",
                style = Typography.headlineMediumItalic42,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "headlineSemiBold14",
                style = Typography.headlineSemiBold14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineSemiBold15",
                style = Typography.headlineSemiBold15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineSemiBold16",
                style = Typography.headlineSemiBold16,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineSemiBold18",
                style = Typography.headlineSemiBold18,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineSemiBold24",
                style = Typography.headlineSemiBold24,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "headlineSemiBold28",
                style = Typography.headlineSemiBold28,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "textArticle15",
                style = Typography.textArticle15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textArticle17",
                style = Typography.textArticle17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textArticleBold15",
                style = Typography.textArticleBold15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textArticleBold17",
                style = Typography.textArticleBold17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textArticleItalic15",
                style = Typography.textArticleItalic15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textArticleItalic17",
                style = Typography.textArticleItalic17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textArticleBoldItalic15",
                style = Typography.textArticleBoldItalic15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textArticleBoldItalic17",
                style = Typography.textArticleBoldItalic17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "textEgyptian14",
                style = Typography.textEgyptian14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptian15",
                style = Typography.textEgyptian15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptian17",
                style = Typography.textEgyptian17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianBold14",
                style = Typography.textEgyptianBold14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianBold15",
                style = Typography.textEgyptianBold15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianBold17",
                style = Typography.textEgyptianBold17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianBoldItalic14",
                style = Typography.textEgyptianBoldItalic14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianBoldItalic15",
                style = Typography.textEgyptianBoldItalic15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianBoldItalic17",
                style = Typography.textEgyptianBoldItalic17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianItalic14",
                style = Typography.textEgyptianItalic14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianItalic15",
                style = Typography.textEgyptianItalic15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textEgyptianItalic17",
                style = Typography.textEgyptianItalic17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "textSans11",
                style = Typography.textSans11,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSans12",
                style = Typography.textSans12,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSans14",
                style = Typography.textSans14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSans15",
                style = Typography.textSans15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSans17",
                style = Typography.textSans17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSans20",
                style = Typography.textSans20,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSans24",
                style = Typography.textSans24,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSans28",
                style = Typography.textSans28,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSans34",
                style = Typography.textSans34,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "textSansBold11",
                style = Typography.textSansBold11,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansBold12",
                style = Typography.textSansBold12,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansBold14",
                style = Typography.textSansBold14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansBold15",
                style = Typography.textSansBold15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansBold17",
                style = Typography.textSansBold17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansBold20",
                style = Typography.textSansBold20,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansBold24",
                style = Typography.textSansBold24,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansBold28",
                style = Typography.textSansBold28,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansBold34",
                style = Typography.textSansBold34,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "textSansItalic11",
                style = Typography.textSansItalic11,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansItalic12",
                style = Typography.textSansItalic12,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansItalic14",
                style = Typography.textSansItalic14,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansItalic15",
                style = Typography.textSansItalic15,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansItalic17",
                style = Typography.textSansItalic17,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansItalic20",
                style = Typography.textSansItalic20,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansItalic24",
                style = Typography.textSansItalic24,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansItalic28",
                style = Typography.textSansItalic28,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "textSansItalic34",
                style = Typography.textSansItalic34,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }

        FlowRow {
            Text(
                text = "titlepiece42",
                style = Typography.titlepiece42,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "titlepiece50",
                style = Typography.titlepiece50,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )

            Text(
                text = "titlepiece70",
                style = Typography.titlepiece70,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            )
        }
    }
}