package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.StarOutline: ImageVector
    get() {
        if (_StarOutline != null) {
            return _StarOutline!!
        }
        _StarOutline = ImageVector.Builder(
            name = "StarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.381f, 13.196f)
                lineTo(18.244f, 10.359f)
                horizontalLineTo(13.486f)
                lineTo(12.007f, 5.812f)
                lineTo(10.545f, 10.359f)
                horizontalLineTo(5.756f)
                lineTo(9.611f, 13.19f)
                lineTo(8.173f, 17.678f)
                lineTo(12f, 14.879f)
                lineTo(15.856f, 17.699f)
                lineTo(14.381f, 13.196f)
                close()
                moveTo(19.151f, 21.336f)
                lineTo(18.293f, 21.96f)
                lineTo(12f, 17.357f)
                lineTo(5.707f, 21.96f)
                lineTo(4.901f, 21.336f)
                lineTo(7.267f, 13.95f)
                lineTo(1f, 9.348f)
                lineTo(1.312f, 8.359f)
                horizontalLineTo(9.087f)
                lineTo(11.454f, 1f)
                horizontalLineTo(12.546f)
                lineTo(14.939f, 8.359f)
                horizontalLineTo(22.688f)
                lineTo(23f, 9.348f)
                lineTo(16.733f, 13.95f)
                lineTo(19.151f, 21.336f)
                close()
            }
        }.build()

        return _StarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarOutline: ImageVector? = null