package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Sort: ImageVector
    get() {
        if (_Sort != null) {
            return _Sort!!
        }
        _Sort = ImageVector.Builder(
            name = "Sort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(7.5f)
                lineTo(20.51f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(7.5f)
                verticalLineTo(6f)
                close()
                moveTo(15.007f, 11.01f)
                horizontalLineTo(3f)
                verticalLineTo(13.01f)
                horizontalLineTo(14.506f)
                lineTo(15.007f, 12.5f)
                verticalLineTo(11.01f)
                close()
                moveTo(8.983f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(8.503f)
                lineTo(8.983f, 17.5f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _Sort!!
    }

@Suppress("ObjectPropertyName")
private var _Sort: ImageVector? = null