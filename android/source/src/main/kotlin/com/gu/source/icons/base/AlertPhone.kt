package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AlertPhone: ImageVector
    get() {
        if (_AlertPhone != null) {
            return _AlertPhone!!
        }
        _AlertPhone = ImageVector.Builder(
            name = "AlertPhone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.488f, 1f)
                lineTo(18f, 2.512f)
                verticalLineTo(21.488f)
                lineTo(16.488f, 22.976f)
                lineTo(7.512f, 23f)
                lineTo(6f, 21.488f)
                verticalLineTo(2.512f)
                lineTo(7.512f, 1f)
                horizontalLineTo(16.488f)
                close()
                moveTo(12.098f, 21.488f)
                curveTo(12.634f, 21.488f, 13.098f, 21.049f, 13.098f, 20.488f)
                curveTo(13.098f, 19.927f, 12.634f, 19.488f, 12.098f, 19.488f)
                curveTo(11.537f, 19.488f, 11.073f, 19.927f, 11.073f, 20.488f)
                curveTo(11.073f, 21.049f, 11.537f, 21.488f, 12.098f, 21.488f)
                close()
                moveTo(16.073f, 18.488f)
                verticalLineTo(4.488f)
                horizontalLineTo(8.073f)
                verticalLineTo(18.488f)
                horizontalLineTo(16.073f)
                close()
                moveTo(12f, 14.488f)
                curveTo(12.561f, 14.488f, 13f, 14.927f, 13f, 15.488f)
                curveTo(13f, 16.024f, 12.561f, 16.463f, 12f, 16.463f)
                curveTo(11.439f, 16.463f, 11f, 16.024f, 11f, 15.488f)
                curveTo(11f, 14.927f, 11.439f, 14.488f, 12f, 14.488f)
                close()
                moveTo(12.683f, 13.171f)
                horizontalLineTo(11.39f)
                lineTo(10.732f, 7.146f)
                lineTo(11.39f, 6.488f)
                horizontalLineTo(12.683f)
                lineTo(13.342f, 7.146f)
                lineTo(12.683f, 13.171f)
                close()
            }
        }.build()

        return _AlertPhone!!
    }

@Suppress("ObjectPropertyName")
private var _AlertPhone: ImageVector? = null