package com.gu.source.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.presets.palette.Brand400

val Source.Icons.Base.Cross: ImageVector
    get() = _cross ?: Builder(
        name = "Cross",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = SolidColor(Source.Palette.Brand400),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 1.0f,
            pathFillType = EvenOdd,
        ) {
            moveTo(12.015f, 14.042f)
            lineTo(20.707f, 22f)
            lineTo(22f, 20.709f)
            lineTo(14.06f, 12f)
            lineTo(22f, 3.291f)
            lineTo(20.707f, 2f)
            lineTo(12.015f, 9.958f)
            lineTo(3.293f, 2.03f)
            lineTo(2f, 3.321f)
            lineTo(9.97f, 12f)
            lineTo(2f, 20.679f)
            lineTo(3.293f, 21.97f)
            lineTo(12.015f, 14.042f)
            close()
        }
    }
        .build()
        .also { _cross = it }

@Suppress("TopLevelPropertyNaming", "ktlint:standard:backing-property-naming")
private var _cross: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Icon(
        imageVector = Source.Icons.Base.Cross,
        contentDescription = null,
    )
}