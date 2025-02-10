package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.BookmarkOutlined: ImageVector
    get() {
        if (_BookmarkOutlined != null) {
            return _BookmarkOutlined!!
        }
        _BookmarkOutlined = ImageVector.Builder(
            name = "BookmarkOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(15.006f, 4.629f)
                lineTo(15.375f, 5.004f)
                verticalLineTo(19f)
                lineTo(12f, 17.129f)
                lineTo(8.625f, 19f)
                verticalLineTo(5.004f)
                lineTo(9f, 4.629f)
                horizontalLineTo(15.006f)
                close()
                moveTo(15.625f, 3f)
                lineTo(8.375f, 3.013f)
                lineTo(7f, 4.375f)
                verticalLineTo(21.333f)
                lineTo(7.467f, 21.629f)
                lineTo(12f, 19.029f)
                lineTo(16.529f, 21.629f)
                lineTo(16.996f, 21.329f)
                verticalLineTo(4.375f)
                lineTo(15.625f, 3f)
                close()
            }
        }.build()

        return _BookmarkOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkOutlined: ImageVector? = null