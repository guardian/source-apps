package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HomeSquareOutlined: ImageVector
    get() {
        if (_HomeSquareOutlined != null) {
            return _HomeSquareOutlined!!
        }
        _HomeSquareOutlined = ImageVector.Builder(
            name = "HomeSquareOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.75f, 2.875f)
                horizontalLineTo(10.25f)
                lineTo(11.125f, 3.75f)
                verticalLineTo(10.25f)
                lineTo(10.25f, 11.125f)
                horizontalLineTo(3.75f)
                lineTo(2.875f, 10.25f)
                verticalLineTo(3.75f)
                lineTo(3.75f, 2.875f)
                close()
                moveTo(4.5f, 9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(2.875f, 12.875f)
                horizontalLineTo(11.125f)
                verticalLineTo(14.5f)
                horizontalLineTo(2.875f)
                verticalLineTo(12.875f)
                close()
                moveTo(11.125f, 19.5f)
                horizontalLineTo(2.875f)
                verticalLineTo(21.125f)
                horizontalLineTo(11.125f)
                verticalLineTo(19.5f)
                close()
                moveTo(2.875f, 16.188f)
                horizontalLineTo(11.125f)
                verticalLineTo(17.813f)
                horizontalLineTo(2.875f)
                verticalLineTo(16.188f)
                close()
                moveTo(20.25f, 12.875f)
                horizontalLineTo(13.75f)
                lineTo(12.875f, 13.75f)
                verticalLineTo(20.25f)
                lineTo(13.75f, 21.125f)
                horizontalLineTo(20.25f)
                lineTo(21.125f, 20.25f)
                verticalLineTo(13.75f)
                lineTo(20.25f, 12.875f)
                close()
                moveTo(19.5f, 19.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.5f)
                close()
                moveTo(13.75f, 2.875f)
                horizontalLineTo(20.25f)
                lineTo(21.125f, 3.75f)
                verticalLineTo(10.25f)
                lineTo(20.25f, 11.125f)
                horizontalLineTo(13.75f)
                lineTo(12.875f, 10.25f)
                verticalLineTo(3.75f)
                lineTo(13.75f, 2.875f)
                close()
            }
        }.build()

        return _HomeSquareOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSquareOutlined: ImageVector? = null