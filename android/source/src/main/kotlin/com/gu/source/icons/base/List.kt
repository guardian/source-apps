package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.List: ImageVector
    get() {
        if (_List != null) {
            return _List!!
        }
        _List = ImageVector.Builder(
            name = "List",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 5f)
                horizontalLineTo(5.8f)
                verticalLineTo(7.8f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                close()
                moveTo(21.05f, 5.31f)
                horizontalLineTo(8.05f)
                verticalLineTo(7.31f)
                horizontalLineTo(20.66f)
                lineTo(21.05f, 6.81f)
                verticalLineTo(5.31f)
                close()
                moveTo(21.05f, 11.51f)
                horizontalLineTo(8.05f)
                verticalLineTo(13.51f)
                horizontalLineTo(20.66f)
                lineTo(21.05f, 13.01f)
                verticalLineTo(11.51f)
                close()
                moveTo(8.05f, 17.71f)
                horizontalLineTo(21.05f)
                verticalLineTo(19.21f)
                lineTo(20.66f, 19.71f)
                horizontalLineTo(8.05f)
                verticalLineTo(17.71f)
                close()
                moveTo(5.8f, 11.41f)
                horizontalLineTo(3f)
                verticalLineTo(14.21f)
                horizontalLineTo(5.8f)
                verticalLineTo(11.41f)
                close()
                moveTo(3.01f, 17.38f)
                horizontalLineTo(5.81f)
                verticalLineTo(20.18f)
                horizontalLineTo(3.01f)
                verticalLineTo(17.38f)
                close()
            }
        }.build()

        return _List!!
    }

@Suppress("ObjectPropertyName")
private var _List: ImageVector? = null