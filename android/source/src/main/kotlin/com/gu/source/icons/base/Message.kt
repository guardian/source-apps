package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Message: ImageVector
    get() {
        if (_Message != null) {
            return _Message!!
        }
        _Message = ImageVector.Builder(
            name = "Message",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 3.5f)
                lineTo(19f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                horizontalLineTo(19f)
                close()
                moveTo(13.5f, 8.5f)
                lineTo(13.5f, 11f)
                horizontalLineTo(3f)
                lineTo(3f, 8.5f)
                horizontalLineTo(13.5f)
                close()
                moveTo(21f, 16f)
                verticalLineTo(13.5f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                close()
                moveTo(16.5f, 18.5f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(18.5f)
                horizontalLineTo(16.5f)
                close()
            }
        }.build()

        return _Message!!
    }

@Suppress("ObjectPropertyName")
private var _Message: ImageVector? = null