package com.gu.source.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.presets.palette.Brand400

@Suppress("UnusedReceiverParameter", "NamedArguments")
val Source.Icons.Base.AlertTriangle: ImageVector
    get() = _alertTriangle ?: ImageVector.Builder(
        name = "AlertTriangle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = SolidColor(Source.Palette.Brand400),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(11.411f, 2f)
            lineTo(1f, 19.057f)
            lineTo(1.668f, 20f)
            horizontalLineTo(22.332f)
            lineTo(23f, 19.057f)
            lineTo(12.589f, 2f)
            horizontalLineTo(11.411f)
            close()
            moveTo(11.347f, 14.178f)
            horizontalLineTo(12.653f)
            lineTo(13.274f, 7.261f)
            lineTo(12.418f, 6.533f)
            horizontalLineTo(11.583f)
            lineTo(10.726f, 7.261f)
            lineTo(11.347f, 14.178f)
            close()
            moveTo(12f, 15.452f)
            curveTo(12.701f, 15.452f, 13.274f, 16.025f, 13.274f, 16.726f)
            curveTo(13.274f, 17.427f, 12.701f, 18f, 12f, 18f)
            curveTo(11.299f, 18f, 10.726f, 17.427f, 10.726f, 16.726f)
            curveTo(10.726f, 16.025f, 11.299f, 15.452f, 12f, 15.452f)
            close()
        }
    }
        .build()
        .also { _alertTriangle = it }

@Suppress("TopLevelPropertyNaming", "ktlint:standard:backing-property-naming")
private var _alertTriangle: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Icon(
        imageVector = Source.Icons.Base.AlertTriangle,
        contentDescription = null,
    )
}