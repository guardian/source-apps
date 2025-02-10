package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.BookmarkRoundOutlined: ImageVector
    get() {
        if (_BookmarkRoundOutlined != null) {
            return _BookmarkRoundOutlined!!
        }
        _BookmarkRoundOutlined = ImageVector.Builder(
            name = "BookmarkRoundOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.167f, 12f)
                curveTo(21.167f, 17.063f, 17.063f, 21.167f, 12f, 21.167f)
                curveTo(6.937f, 21.167f, 2.833f, 17.063f, 2.833f, 12f)
                curveTo(2.833f, 6.937f, 6.937f, 2.833f, 12f, 2.833f)
                curveTo(17.063f, 2.833f, 21.167f, 6.937f, 21.167f, 12f)
                close()
                moveTo(22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
                moveTo(13.954f, 7.95f)
                lineTo(13.74f, 7.733f)
                horizontalLineTo(10.263f)
                lineTo(10.046f, 7.95f)
                verticalLineTo(16.053f)
                lineTo(12f, 14.969f)
                lineTo(13.954f, 16.053f)
                verticalLineTo(7.95f)
                close()
                moveTo(9.901f, 6.797f)
                lineTo(14.099f, 6.789f)
                lineTo(14.892f, 7.586f)
                verticalLineTo(17.401f)
                lineTo(14.622f, 17.575f)
                lineTo(12f, 16.069f)
                lineTo(9.375f, 17.575f)
                lineTo(9.105f, 17.403f)
                verticalLineTo(7.586f)
                lineTo(9.901f, 6.797f)
                close()
            }
        }.build()

        return _BookmarkRoundOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkRoundOutlined: ImageVector? = null