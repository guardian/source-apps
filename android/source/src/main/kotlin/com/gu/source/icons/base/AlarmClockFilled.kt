package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AlarmClockFilled: ImageVector
    get() {
        if (_AlarmClockFilled != null) {
            return _AlarmClockFilled!!
        }
        _AlarmClockFilled = ImageVector.Builder(
            name = "AlarmClockFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 14.442f, 21.125f, 16.68f, 19.67f, 18.417f)
                lineTo(21.513f, 20.887f)
                lineTo(20.874f, 21.527f)
                lineTo(18.402f, 19.683f)
                curveTo(16.667f, 21.129f, 14.435f, 22f, 12f, 22f)
                curveTo(9.559f, 22f, 7.322f, 21.125f, 5.586f, 19.672f)
                lineTo(3.099f, 21.527f)
                lineTo(2.46f, 20.887f)
                lineTo(4.315f, 18.399f)
                curveTo(2.87f, 16.665f, 2f, 14.434f, 2f, 12f)
                close()
                moveTo(17.973f, 12.93f)
                lineTo(12.067f, 13.518f)
                lineTo(10.91f, 12.351f)
                lineTo(11.593f, 5.182f)
                horizontalLineTo(12.505f)
                lineTo(13.138f, 11.704f)
                lineTo(17.973f, 12.018f)
                verticalLineTo(12.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(3.7f, 4.904f)
                curveTo(2.902f, 3.856f, 3.107f, 2.366f, 4.156f, 1.568f)
                curveTo(5.204f, 0.771f, 6.694f, 0.976f, 7.492f, 2.024f)
                lineTo(3.7f, 4.909f)
                verticalLineTo(4.904f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(20.398f, 4.904f)
                curveTo(21.195f, 3.856f, 20.99f, 2.366f, 19.942f, 1.568f)
                curveTo(18.894f, 0.771f, 17.404f, 0.976f, 16.606f, 2.024f)
                lineTo(20.398f, 4.909f)
                verticalLineTo(4.904f)
                close()
            }
        }.build()

        return _AlarmClockFilled!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClockFilled: ImageVector? = null