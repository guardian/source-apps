package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Calendar: ImageVector
    get() {
        if (_Calendar != null) {
            return _Calendar!!
        }
        _Calendar = ImageVector.Builder(
            name = "Calendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.636f, 2f)
                horizontalLineTo(7.455f)
                verticalLineTo(5.636f)
                horizontalLineTo(5.636f)
                verticalLineTo(2f)
                close()
                moveTo(16.545f, 2f)
                horizontalLineTo(18.364f)
                verticalLineTo(5.636f)
                horizontalLineTo(16.545f)
                verticalLineTo(2f)
                close()
                moveTo(20.597f, 3f)
                lineTo(22f, 4.422f)
                lineTo(22f, 20.587f)
                lineTo(20.597f, 21.977f)
                lineTo(3.403f, 22f)
                lineTo(2f, 20.587f)
                verticalLineTo(4.422f)
                lineTo(3.403f, 3f)
                horizontalLineTo(4.727f)
                verticalLineTo(6.545f)
                horizontalLineTo(8.364f)
                verticalLineTo(3f)
                horizontalLineTo(15.636f)
                verticalLineTo(6.545f)
                horizontalLineTo(19.273f)
                verticalLineTo(3f)
                horizontalLineTo(20.597f)
                close()
                moveTo(3.818f, 9.273f)
                horizontalLineTo(20.182f)
                verticalLineTo(20.182f)
                horizontalLineTo(3.818f)
                verticalLineTo(9.273f)
                close()
                moveTo(10.182f, 13.309f)
                lineTo(11.527f, 13.136f)
                verticalLineTo(17.909f)
                horizontalLineTo(13.009f)
                verticalLineTo(11.545f)
                horizontalLineTo(12.182f)
                lineTo(10.182f, 12.373f)
                verticalLineTo(13.309f)
                close()
            }
        }.build()

        return _Calendar!!
    }

@Suppress("ObjectPropertyName")
private var _Calendar: ImageVector? = null