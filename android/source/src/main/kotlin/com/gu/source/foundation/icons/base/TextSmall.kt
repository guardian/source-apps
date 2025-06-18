package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.TextSmall: ImageVector
    get() {
        if (_TextSmall != null) {
            return _TextSmall!!
        }
        _TextSmall = ImageVector.Builder(
            name = "TextSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.345f, 17.69f)
                lineTo(14.82f, 17.365f)
                lineTo(13.82f, 14.265f)
                horizontalLineTo(9.495f)
                lineTo(8.445f, 17.365f)
                lineTo(9.97f, 17.69f)
                verticalLineTo(18.465f)
                horizontalLineTo(5.87f)
                verticalLineTo(17.69f)
                lineTo(7.17f, 17.365f)
                lineTo(11.295f, 5.54f)
                horizontalLineTo(12.845f)
                lineTo(16.845f, 17.365f)
                lineTo(18.12f, 17.69f)
                verticalLineTo(18.465f)
                horizontalLineTo(13.345f)
                verticalLineTo(17.69f)
                close()
                moveTo(9.82f, 13.315f)
                horizontalLineTo(13.52f)
                lineTo(11.77f, 7.865f)
                horizontalLineTo(11.67f)
                lineTo(9.82f, 13.315f)
                close()
            }
        }.build()

        return _TextSmall!!
    }

@Suppress("ObjectPropertyName")
private var _TextSmall: ImageVector? = null