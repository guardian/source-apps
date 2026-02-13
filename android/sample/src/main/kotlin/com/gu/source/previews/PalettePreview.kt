@file:OptIn(ExperimentalStdlibApi::class)

package com.gu.source.previews

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.palette.Brand100
import com.gu.source.foundation.palette.Brand300
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.Brand500
import com.gu.source.foundation.palette.Brand600
import com.gu.source.foundation.palette.Brand800
import com.gu.source.foundation.palette.BrandAlt200
import com.gu.source.foundation.palette.BrandAlt300
import com.gu.source.foundation.palette.BrandAlt400
import com.gu.source.foundation.palette.Culture100
import com.gu.source.foundation.palette.Culture200
import com.gu.source.foundation.palette.Culture300
import com.gu.source.foundation.palette.Culture400
import com.gu.source.foundation.palette.Culture450
import com.gu.source.foundation.palette.Culture50
import com.gu.source.foundation.palette.Culture500
import com.gu.source.foundation.palette.Culture600
import com.gu.source.foundation.palette.Culture700
import com.gu.source.foundation.palette.Culture800
import com.gu.source.foundation.palette.Error400
import com.gu.source.foundation.palette.Error500
import com.gu.source.foundation.palette.Labs100
import com.gu.source.foundation.palette.Labs200
import com.gu.source.foundation.palette.Labs300
import com.gu.source.foundation.palette.Labs400
import com.gu.source.foundation.palette.Labs500
import com.gu.source.foundation.palette.Labs600
import com.gu.source.foundation.palette.Labs700
import com.gu.source.foundation.palette.Lifestyle100
import com.gu.source.foundation.palette.Lifestyle200
import com.gu.source.foundation.palette.Lifestyle300
import com.gu.source.foundation.palette.Lifestyle400
import com.gu.source.foundation.palette.Lifestyle450
import com.gu.source.foundation.palette.Lifestyle500
import com.gu.source.foundation.palette.Lifestyle600
import com.gu.source.foundation.palette.Lifestyle800
import com.gu.source.foundation.palette.Neutral0
import com.gu.source.foundation.palette.Neutral10
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.palette.Neutral20
import com.gu.source.foundation.palette.Neutral38
import com.gu.source.foundation.palette.Neutral46
import com.gu.source.foundation.palette.Neutral60
import com.gu.source.foundation.palette.Neutral7
import com.gu.source.foundation.palette.Neutral73
import com.gu.source.foundation.palette.Neutral86
import com.gu.source.foundation.palette.Neutral93
import com.gu.source.foundation.palette.Neutral97
import com.gu.source.foundation.palette.News100
import com.gu.source.foundation.palette.News200
import com.gu.source.foundation.palette.News300
import com.gu.source.foundation.palette.News400
import com.gu.source.foundation.palette.News500
import com.gu.source.foundation.palette.News550
import com.gu.source.foundation.palette.News600
import com.gu.source.foundation.palette.News700
import com.gu.source.foundation.palette.News800
import com.gu.source.foundation.palette.NotificationBlue400
import com.gu.source.foundation.palette.Opinion100
import com.gu.source.foundation.palette.Opinion200
import com.gu.source.foundation.palette.Opinion300
import com.gu.source.foundation.palette.Opinion400
import com.gu.source.foundation.palette.Opinion450
import com.gu.source.foundation.palette.Opinion500
import com.gu.source.foundation.palette.Opinion550
import com.gu.source.foundation.palette.Opinion600
import com.gu.source.foundation.palette.Opinion700
import com.gu.source.foundation.palette.Opinion800
import com.gu.source.foundation.palette.SpecialReport100
import com.gu.source.foundation.palette.SpecialReport200
import com.gu.source.foundation.palette.SpecialReport300
import com.gu.source.foundation.palette.SpecialReport400
import com.gu.source.foundation.palette.SpecialReport450
import com.gu.source.foundation.palette.SpecialReport500
import com.gu.source.foundation.palette.SpecialReport700
import com.gu.source.foundation.palette.SpecialReport800
import com.gu.source.foundation.palette.SpecialReportAlt100
import com.gu.source.foundation.palette.SpecialReportAlt200
import com.gu.source.foundation.palette.SpecialReportAlt300
import com.gu.source.foundation.palette.SpecialReportAlt700
import com.gu.source.foundation.palette.SpecialReportAlt800
import com.gu.source.foundation.palette.Sport100
import com.gu.source.foundation.palette.Sport200
import com.gu.source.foundation.palette.Sport300
import com.gu.source.foundation.palette.Sport400
import com.gu.source.foundation.palette.Sport500
import com.gu.source.foundation.palette.Sport600
import com.gu.source.foundation.palette.Sport700
import com.gu.source.foundation.palette.Sport800
import com.gu.source.foundation.palette.Success300
import com.gu.source.foundation.palette.Success400
import com.gu.source.foundation.palette.Success500
import com.gu.source.foundation.typography.TextSans11
import com.gu.source.foundation.typography.TextSansBold14
import com.gu.source.foundation.typography.TextSansBold15

private data class Colour(
    val name: String,
    val colour: Color,
    val colourValue: String = colour
        .toArgb()
        .toHexString(HexFormat.UpperCase)
        .substring(2),
)

private const val ContentColourThreshold = 0.5f

private val colours = mapOf(
    "Brand" to listOf(
        Colour("Brand100", Source.Palette.Brand100),
        Colour("Brand300", Source.Palette.Brand300),
        Colour("Brand400", Source.Palette.Brand400),
        Colour("Brand500", Source.Palette.Brand500),
        Colour("Brand600", Source.Palette.Brand600),
        Colour("Brand800", Source.Palette.Brand800),
    ),
    "BrandAlt" to listOf(
        Colour("BrandAlt200", Source.Palette.BrandAlt200),
        Colour("BrandAlt300", Source.Palette.BrandAlt300),
        Colour("BrandAlt400", Source.Palette.BrandAlt400),
    ),
    "Neutral" to listOf(
        Colour("Neutral0", Source.Palette.Neutral0),
        Colour("Neutral7", Source.Palette.Neutral7),
        Colour("Neutral10", Source.Palette.Neutral10),
        Colour("Neutral20", Source.Palette.Neutral20),
        Colour("Neutral38", Source.Palette.Neutral38),
        Colour("Neutral46", Source.Palette.Neutral46),
        Colour("Neutral60", Source.Palette.Neutral60),
        Colour("Neutral73", Source.Palette.Neutral73),
        Colour("Neutral86", Source.Palette.Neutral86),
        Colour("Neutral93", Source.Palette.Neutral93),
        Colour("Neutral97", Source.Palette.Neutral97),
        Colour("Neutral100", Source.Palette.Neutral100),
    ),
    "Error" to listOf(
        Colour("Error400", Source.Palette.Error400),
        Colour("Error500", Source.Palette.Error500),
    ),
    "Success" to listOf(
        Colour("Success300", Source.Palette.Success300),
        Colour("Success400", Source.Palette.Success400),
        Colour("Success500", Source.Palette.Success500),
    ),
    "News" to listOf(
        Colour("News100", Source.Palette.News100),
        Colour("News200", Source.Palette.News200),
        Colour("News300", Source.Palette.News300),
        Colour("News400", Source.Palette.News400),
        Colour("News500", Source.Palette.News500),
        Colour("News550", Source.Palette.News550),
        Colour("News600", Source.Palette.News600),
        Colour("News700", Source.Palette.News700),
        Colour("News800", Source.Palette.News800),
    ),
    "Opinion" to listOf(
        Colour("Opinion100", Source.Palette.Opinion100),
        Colour("Opinion200", Source.Palette.Opinion200),
        Colour("Opinion300", Source.Palette.Opinion300),
        Colour("Opinion400", Source.Palette.Opinion400),
        Colour("Opinion450", Source.Palette.Opinion450),
        Colour("Opinion500", Source.Palette.Opinion500),
        Colour("Opinion550", Source.Palette.Opinion550),
        Colour("Opinion600", Source.Palette.Opinion600),
        Colour("Opinion700", Source.Palette.Opinion700),
        Colour("Opinion800", Source.Palette.Opinion800),
    ),
    "Sport" to listOf(
        Colour("Sport100", Source.Palette.Sport100),
        Colour("Sport200", Source.Palette.Sport200),
        Colour("Sport300", Source.Palette.Sport300),
        Colour("Sport400", Source.Palette.Sport400),
        Colour("Sport500", Source.Palette.Sport500),
        Colour("Sport600", Source.Palette.Sport600),
        Colour("Sport700", Source.Palette.Sport700),
        Colour("Sport800", Source.Palette.Sport800),
    ),
    "Culture" to listOf(
        Colour("Culture50", Source.Palette.Culture50),
        Colour("Culture100", Source.Palette.Culture100),
        Colour("Culture200", Source.Palette.Culture200),
        Colour("Culture300", Source.Palette.Culture300),
        Colour("Culture400", Source.Palette.Culture400),
        Colour("Culture450", Source.Palette.Culture450),
        Colour("Culture500", Source.Palette.Culture500),
        Colour("Culture600", Source.Palette.Culture600),
        Colour("Culture700", Source.Palette.Culture700),
        Colour("Culture800", Source.Palette.Culture800),
    ),
    "Lifestyle" to listOf(
        Colour("Lifestyle100", Source.Palette.Lifestyle100),
        Colour("Lifestyle200", Source.Palette.Lifestyle200),
        Colour("Lifestyle300", Source.Palette.Lifestyle300),
        Colour("Lifestyle400", Source.Palette.Lifestyle400),
        Colour("Lifestyle450", Source.Palette.Lifestyle450),
        Colour("Lifestyle500", Source.Palette.Lifestyle500),
        Colour("Lifestyle600", Source.Palette.Lifestyle600),
        Colour("Lifestyle800", Source.Palette.Lifestyle800),
    ),
    "SpecialReport" to listOf(
        Colour("SpecialReport100", Source.Palette.SpecialReport100),
        Colour("SpecialReport200", Source.Palette.SpecialReport200),
        Colour("SpecialReport300", Source.Palette.SpecialReport300),
        Colour("SpecialReport400", Source.Palette.SpecialReport400),
        Colour("SpecialReport450", Source.Palette.SpecialReport450),
        Colour("SpecialReport500", Source.Palette.SpecialReport500),
        Colour("SpecialReport700", Source.Palette.SpecialReport700),
        Colour("SpecialReport800", Source.Palette.SpecialReport800),
    ),
    "SpecialReportAlt" to listOf(
        Colour("SpecialReportAlt100", Source.Palette.SpecialReportAlt100),
        Colour("SpecialReportAlt200", Source.Palette.SpecialReportAlt200),
        Colour("SpecialReportAlt300", Source.Palette.SpecialReportAlt300),
        Colour("SpecialReportAlt700", Source.Palette.SpecialReportAlt700),
        Colour("SpecialReportAlt800", Source.Palette.SpecialReportAlt800),
    ),
    "Labs" to listOf(
        Colour("Labs100", Source.Palette.Labs100),
        Colour("Labs200", Source.Palette.Labs200),
        Colour("Labs300", Source.Palette.Labs300),
        Colour("Labs400", Source.Palette.Labs400),
        Colour("Labs500", Source.Palette.Labs500),
        Colour("Labs600", Source.Palette.Labs600),
        Colour("Labs700", Source.Palette.Labs700),
    ),
    "NotificationBlue" to listOf(
        Colour("NotificationBlue400", Source.Palette.NotificationBlue400),
    ),
)

@Composable
internal fun PalettePreview(onBackPress: () -> Unit, modifier: Modifier = Modifier) {
    val gridCount = getGridCount()
    PreviewScaffold(
        title = "Palette",
        onBackPress = onBackPress,
        modifier = modifier,
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(gridCount),
            modifier = it,
        ) {
            colours.keys.forEachIndexed { _, palette ->
                item(span = { GridItemSpan(gridCount) }) {
                    Column {
                        Spacer(modifier = Modifier.height(8.dp))
                        HorizontalDivider()
                        Text(
                            text = palette,
                            style = Source.Typography.TextSansBold14,
                            modifier = Modifier.padding(8.dp),
                        )
                    }
                }
                items(colours[palette].orEmpty()) { colour ->
                    val contentColour =
                        if (colour.colour.luminance() > ContentColourThreshold) {
                            Color.Black
                        } else {
                            Color.White
                        }

                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .fillMaxWidth()
                            .background(colour.colour),
                    ) {
                        Text(
                            text = colour.name,
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                                .padding(top = 8.dp),
                            style = Source.Typography.TextSansBold15,
                            color = contentColour,
                        )
                        Text(
                            text = "#${colour.colourValue}",
                            color = contentColour,
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .padding(bottom = 8.dp),
                            style = Source.Typography.TextSans11,
                        )
                    }
                }
            }
        }
    }
}

@Preview(device = "spec:width=2160px,height=8340px,dpi=440")
@Preview(
    device = "spec:width=2160px,height=8340px,dpi=440",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL,
)
@Composable
private fun Preview() {
    AppColourMode {
        PalettePreview({})
    }
}