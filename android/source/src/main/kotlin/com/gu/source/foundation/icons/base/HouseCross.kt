package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HouseCross: ImageVector
    get() {
        if (_HouseCross != null) {
            return _HouseCross!!
        }
        _HouseCross = ImageVector.Builder(
            name = "HouseCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.5f, 6.561f)
                lineTo(20.798f, 8.859f)
                lineTo(21.859f, 7.798f)
                lineTo(19.561f, 5.5f)
                lineTo(21.859f, 3.202f)
                lineTo(20.798f, 2.141f)
                lineTo(18.5f, 4.439f)
                lineTo(16.202f, 2.141f)
                lineTo(15.141f, 3.202f)
                lineTo(17.439f, 5.5f)
                lineTo(15.141f, 7.798f)
                lineTo(16.202f, 8.859f)
                lineTo(18.5f, 6.561f)
                close()
                moveTo(18.5f, 11.5f)
                curveTo(18.564f, 11.5f, 18.627f, 11.499f, 18.69f, 11.497f)
                verticalLineTo(20.568f)
                lineTo(17.786f, 21.5f)
                horizontalLineTo(12.8f)
                verticalLineTo(14.714f)
                horizontalLineTo(8.277f)
                verticalLineTo(21.5f)
                horizontalLineTo(3.309f)
                lineTo(2.405f, 20.604f)
                verticalLineTo(11.548f)
                horizontalLineTo(1.5f)
                verticalLineTo(11.095f)
                lineTo(2.405f, 10.191f)
                verticalLineTo(10.191f)
                lineTo(10.005f, 2.5f)
                horizontalLineTo(10.91f)
                lineTo(12.63f, 4.201f)
                curveTo(12.545f, 4.6f, 12.5f, 5.032f, 12.5f, 5.5f)
                curveTo(12.5f, 8.538f, 15f, 11.5f, 18.5f, 11.5f)
                close()
            }
        }.build()

        return _HouseCross!!
    }

@Suppress("ObjectPropertyName")
private var _HouseCross: ImageVector? = null