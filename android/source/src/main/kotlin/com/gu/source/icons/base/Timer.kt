package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Timer: ImageVector
    get() {
        if (_Timer != null) {
            return _Timer!!
        }
        _Timer = ImageVector.Builder(
            name = "Timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.504f, 13.125f)
                horizontalLineTo(13.129f)
                verticalLineTo(11.496f)
                lineTo(7.574f, 6.817f)
                lineTo(6.817f, 7.574f)
                lineTo(11.504f, 13.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(12.629f, 3.775f)
                verticalLineTo(7.004f)
                horizontalLineTo(11.617f)
                lineTo(11.106f, 2.085f)
                curveTo(11.404f, 2.038f, 11.593f, 2.018f, 11.873f, 2.005f)
                curveTo(11.91f, 2.002f, 11.947f, 2f, 11.984f, 2f)
                curveTo(11.99f, 2f, 11.995f, 2f, 12f, 2f)
                curveTo(17.515f, 2.008f, 21.984f, 6.482f, 21.984f, 12f)
                curveTo(21.984f, 17.523f, 17.507f, 22f, 11.984f, 22f)
                curveTo(6.462f, 22f, 1.984f, 17.523f, 1.984f, 12f)
                curveTo(1.984f, 9.259f, 3.089f, 6.774f, 4.874f, 4.968f)
                lineTo(6.119f, 6.199f)
                curveTo(4.644f, 7.69f, 3.734f, 9.738f, 3.734f, 12f)
                curveTo(3.734f, 16.556f, 7.428f, 20.25f, 11.984f, 20.25f)
                curveTo(16.541f, 20.25f, 20.234f, 16.556f, 20.234f, 12f)
                curveTo(20.234f, 7.661f, 16.884f, 4.104f, 12.629f, 3.775f)
                close()
            }
        }.build()

        return _Timer!!
    }

@Suppress("ObjectPropertyName")
private var _Timer: ImageVector? = null