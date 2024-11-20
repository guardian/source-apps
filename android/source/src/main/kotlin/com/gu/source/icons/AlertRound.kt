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

val Source.Icons.Base.AlertRound: ImageVector
    get() = _alertRound ?: Builder(
        name = "AlertRound",
        defaultWidth = 24.0.dp,
        defaultHeight = 24.0.dp,
        viewportWidth = 24.0f,
        viewportHeight = 24.0f,
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
            moveTo(22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            close()
            moveTo(11.295f, 13.818f)
            horizontalLineTo(12.682f)
            lineTo(13.341f, 5.182f)
            lineTo(12.432f, 4.273f)
            horizontalLineTo(11.545f)
            lineTo(10.636f, 5.182f)
            lineTo(11.295f, 13.818f)
            close()
            moveTo(13.364f, 17.455f)
            curveTo(13.364f, 16.705f, 12.75f, 16.091f, 12f, 16.091f)
            curveTo(11.25f, 16.091f, 10.636f, 16.705f, 10.636f, 17.455f)
            curveTo(10.636f, 18.205f, 11.25f, 18.818f, 12f, 18.818f)
            curveTo(12.75f, 18.818f, 13.364f, 18.205f, 13.364f, 17.455f)
            close()
        }
    }
        .build()
        .also { _alertRound = it }

@Suppress("TopLevelPropertyNaming", "ktlint:standard:backing-property-naming")
private var _alertRound: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Icon(
        imageVector = Source.Icons.Base.AlertRound,
        contentDescription = null,
    )
}