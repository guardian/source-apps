package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.DragHandle: ImageVector
    get() {
        if (_DragHandle != null) {
            return _DragHandle!!
        }
        _DragHandle = ImageVector.Builder(
            name = "DragHandle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
                moveTo(15f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                close()
                moveTo(7f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                close()
                moveTo(15f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                close()
                moveTo(7f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                close()
                moveTo(15f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                close()
                moveTo(7f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                close()
                moveTo(15f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                close()
                moveTo(7f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                close()
                moveTo(15f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _DragHandle!!
    }

@Suppress("ObjectPropertyName")
private var _DragHandle: ImageVector? = null