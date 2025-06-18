package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HomeHouseOutlined: ImageVector
    get() {
        if (_HomeHouseOutlined != null) {
            return _HomeHouseOutlined!!
        }
        _HomeHouseOutlined = ImageVector.Builder(
            name = "HomeHouseOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.359f, 2.5f)
                horizontalLineTo(11.455f)
                lineTo(3.855f, 10.191f)
                lineTo(2.95f, 11.095f)
                verticalLineTo(11.548f)
                horizontalLineTo(3.855f)
                verticalLineTo(20.604f)
                lineTo(4.759f, 21.5f)
                horizontalLineTo(10.631f)
                verticalLineTo(15.167f)
                horizontalLineTo(13.346f)
                verticalLineTo(21.5f)
                horizontalLineTo(19.236f)
                lineTo(20.14f, 20.568f)
                verticalLineTo(11.548f)
                horizontalLineTo(21.045f)
                verticalLineTo(11.095f)
                lineTo(19.688f, 9.738f)
                lineTo(19.687f, 9.743f)
                lineTo(12.359f, 2.5f)
                close()
                moveTo(18.331f, 10.947f)
                lineTo(11.918f, 4.607f)
                lineTo(5.664f, 10.933f)
                verticalLineTo(19.691f)
                horizontalLineTo(8.822f)
                verticalLineTo(13.809f)
                lineTo(9.274f, 13.357f)
                horizontalLineTo(14.712f)
                lineTo(15.155f, 13.809f)
                verticalLineTo(19.691f)
                horizontalLineTo(18.331f)
                verticalLineTo(10.947f)
                close()
            }
        }.build()

        return _HomeHouseOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _HomeHouseOutlined: ImageVector? = null