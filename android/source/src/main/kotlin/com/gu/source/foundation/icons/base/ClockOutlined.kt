package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ClockOutlined: ImageVector
    get() {
        if (_ClockOutlined != null) {
            return _ClockOutlined!!
        }
        _ClockOutlined = ImageVector.Builder(
            name = "ClockOutlined",
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
                curveTo(2f, 17.51f, 6.49f, 22f, 12f, 22f)
                curveTo(17.51f, 22f, 22f, 17.51f, 22f, 12f)
                curveTo(22f, 6.49f, 17.51f, 2f, 12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                close()
                moveTo(3.6f, 12f)
                curveTo(3.6f, 7.37f, 7.37f, 3.6f, 12f, 3.6f)
                curveTo(16.63f, 3.6f, 20.4f, 7.37f, 20.4f, 12f)
                curveTo(20.4f, 16.63f, 16.63f, 20.4f, 12f, 20.4f)
                curveTo(7.37f, 20.4f, 3.6f, 16.63f, 3.6f, 12f)
                close()
                moveTo(18.07f, 12.15f)
                lineTo(13.06f, 11.84f)
                lineTo(12.43f, 4.23f)
                horizontalLineTo(11.6f)
                lineTo(10.92f, 12.38f)
                lineTo(12.06f, 13.52f)
                lineTo(18.07f, 12.98f)
                verticalLineTo(12.15f)
                close()
            }
        }.build()

        return _ClockOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _ClockOutlined: ImageVector? = null