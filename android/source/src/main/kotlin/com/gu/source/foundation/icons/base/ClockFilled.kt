package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ClockFilled: ImageVector
    get() {
        if (_ClockFilled != null) {
            return _ClockFilled!!
        }
        _ClockFilled = ImageVector.Builder(
            name = "ClockFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
                moveTo(13.091f, 11.682f)
                lineTo(12.432f, 3.818f)
                horizontalLineTo(11.546f)
                lineTo(10.864f, 12.341f)
                lineTo(12.023f, 13.5f)
                lineTo(18.364f, 12.909f)
                verticalLineTo(12f)
                lineTo(13.091f, 11.682f)
                close()
            }
        }.build()

        return _ClockFilled!!
    }

@Suppress("ObjectPropertyName")
private var _ClockFilled: ImageVector? = null