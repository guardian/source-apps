package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.BookOutlined: ImageVector
    get() {
        if (_BookOutlined != null) {
            return _BookOutlined!!
        }
        _BookOutlined = ImageVector.Builder(
            name = "BookOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.818f, 2f)
                curveTo(5.991f, 2f, 4.51f, 3.481f, 4.51f, 5.309f)
                verticalLineTo(18.563f)
                lineTo(4.512f, 18.561f)
                curveTo(4.51f, 18.599f, 4.51f, 18.637f, 4.51f, 18.676f)
                curveTo(4.51f, 20.503f, 5.991f, 21.984f, 7.818f, 21.984f)
                horizontalLineTo(19.625f)
                lineTo(20.5f, 21.123f)
                verticalLineTo(20.359f)
                horizontalLineTo(19.875f)
                curveTo(18.945f, 20.359f, 18.191f, 19.606f, 18.191f, 18.676f)
                curveTo(18.191f, 17.746f, 18.945f, 16.992f, 19.875f, 16.992f)
                horizontalLineTo(20.5f)
                verticalLineTo(2.873f)
                lineTo(19.625f, 2f)
                horizontalLineTo(7.818f)
                close()
                moveTo(16.566f, 18.676f)
                curveTo(16.566f, 19.291f, 16.734f, 19.866f, 17.026f, 20.359f)
                horizontalLineTo(7.818f)
                curveTo(6.889f, 20.359f, 6.135f, 19.606f, 6.135f, 18.676f)
                curveTo(6.135f, 17.746f, 6.889f, 16.992f, 7.818f, 16.992f)
                horizontalLineTo(17.026f)
                curveTo(16.734f, 17.485f, 16.566f, 18.061f, 16.566f, 18.676f)
                close()
                moveTo(18.869f, 3.625f)
                horizontalLineTo(7.869f)
                curveTo(7.057f, 3.625f, 6.244f, 4.375f, 6.244f, 5.375f)
                verticalLineTo(15.813f)
                curveTo(6.244f, 15.813f, 6.869f, 15.375f, 7.744f, 15.375f)
                horizontalLineTo(18.869f)
                verticalLineTo(3.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(7.869f, 5.25f)
                horizontalLineTo(9.494f)
                verticalLineTo(13.75f)
                horizontalLineTo(7.869f)
                verticalLineTo(5.25f)
                close()
            }
        }.build()

        return _BookOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _BookOutlined: ImageVector? = null