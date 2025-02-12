package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.CrossRoundOutlined: ImageVector
    get() {
        if (_CrossRoundOutlined != null) {
            return _CrossRoundOutlined!!
        }
        _CrossRoundOutlined = ImageVector.Builder(
            name = "CrossRoundOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.2f, 12f)
                curveTo(21.2f, 17.081f, 17.081f, 21.2f, 12f, 21.2f)
                curveTo(6.919f, 21.2f, 2.8f, 17.081f, 2.8f, 12f)
                curveTo(2.8f, 6.919f, 6.919f, 2.8f, 12f, 2.8f)
                curveTo(17.081f, 2.8f, 21.2f, 6.919f, 21.2f, 12f)
                close()
                moveTo(22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
                moveTo(17.138f, 7.642f)
                lineTo(16.356f, 6.862f)
                lineTo(12.007f, 10.844f)
                lineTo(7.643f, 6.877f)
                lineTo(6.861f, 7.658f)
                lineTo(10.849f, 12f)
                lineTo(6.861f, 16.342f)
                lineTo(7.643f, 17.123f)
                lineTo(12.007f, 13.156f)
                lineTo(16.356f, 17.138f)
                lineTo(17.138f, 16.358f)
                lineTo(13.165f, 12f)
                lineTo(17.138f, 7.642f)
                close()
            }
        }.build()

        return _CrossRoundOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _CrossRoundOutlined: ImageVector? = null