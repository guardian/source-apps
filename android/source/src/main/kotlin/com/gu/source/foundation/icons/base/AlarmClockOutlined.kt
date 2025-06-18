package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AlarmClockOutlined: ImageVector
    get() {
        if (_AlarmClockOutlined != null) {
            return _AlarmClockOutlined!!
        }
        _AlarmClockOutlined = ImageVector.Builder(
            name = "AlarmClockOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.7f, 4.904f)
                curveTo(2.902f, 3.856f, 3.107f, 2.366f, 4.156f, 1.568f)
                curveTo(5.204f, 0.771f, 6.694f, 0.976f, 7.492f, 2.024f)
                lineTo(3.7f, 4.909f)
                verticalLineTo(4.904f)
                close()
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 14.434f, 2.87f, 16.665f, 4.315f, 18.399f)
                lineTo(2.46f, 20.887f)
                lineTo(3.099f, 21.527f)
                lineTo(5.586f, 19.672f)
                curveTo(7.322f, 21.125f, 9.559f, 22f, 12f, 22f)
                curveTo(14.435f, 22f, 16.667f, 21.129f, 18.402f, 19.683f)
                lineTo(20.874f, 21.527f)
                lineTo(21.513f, 20.887f)
                lineTo(19.67f, 18.417f)
                curveTo(21.125f, 16.68f, 22f, 14.442f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(20.25f, 12f)
                curveTo(20.25f, 7.449f, 16.551f, 3.75f, 12f, 3.75f)
                curveTo(7.449f, 3.75f, 3.75f, 7.449f, 3.75f, 12f)
                curveTo(3.75f, 16.551f, 7.449f, 20.25f, 12f, 20.25f)
                curveTo(16.551f, 20.25f, 20.25f, 16.551f, 20.25f, 12f)
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
                moveTo(19.942f, 1.568f)
                curveTo(20.99f, 2.366f, 21.195f, 3.856f, 20.398f, 4.904f)
                verticalLineTo(4.909f)
                lineTo(16.606f, 2.024f)
                curveTo(17.404f, 0.976f, 18.894f, 0.771f, 19.942f, 1.568f)
                close()
            }
        }.build()

        return _AlarmClockOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClockOutlined: ImageVector? = null