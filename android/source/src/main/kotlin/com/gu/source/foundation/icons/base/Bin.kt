package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Bin: ImageVector
    get() {
        if (_Bin != null) {
            return _Bin!!
        }
        _Bin = ImageVector.Builder(
            name = "Bin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.364f, 6.5f)
                verticalLineTo(5.5f)
                lineTo(5f, 4.717f)
                lineTo(9.818f, 3.63f)
                verticalLineTo(2.543f)
                lineTo(10.363f, 2f)
                horizontalLineTo(13.636f)
                lineTo(14.182f, 2.543f)
                verticalLineTo(3.63f)
                lineTo(19f, 4.717f)
                lineTo(19.636f, 5.5f)
                lineTo(19.636f, 6.5f)
                horizontalLineTo(4.364f)
                close()
                moveTo(6f, 21f)
                lineTo(4.364f, 7.5f)
                horizontalLineTo(19.636f)
                lineTo(18f, 21f)
                lineTo(17f, 22f)
                lineTo(7f, 21.909f)
                lineTo(6f, 21f)
                close()
                moveTo(14.182f, 17.652f)
                verticalLineTo(11.543f)
                lineTo(14.727f, 11f)
                lineTo(15.273f, 11.543f)
                verticalLineTo(17.652f)
                lineTo(14.727f, 18.196f)
                lineTo(14.182f, 17.652f)
                close()
                moveTo(8.727f, 11.544f)
                verticalLineTo(17.652f)
                lineTo(9.273f, 18.196f)
                lineTo(9.818f, 17.652f)
                verticalLineTo(11.544f)
                lineTo(9.273f, 11f)
                lineTo(8.727f, 11.544f)
                close()
                moveTo(11.454f, 17.652f)
                verticalLineTo(11.543f)
                lineTo(12f, 11f)
                lineTo(12.545f, 11.543f)
                verticalLineTo(17.652f)
                lineTo(12f, 18.196f)
                lineTo(11.454f, 17.652f)
                close()
            }
        }.build()

        return _Bin!!
    }

@Suppress("ObjectPropertyName")
private var _Bin: ImageVector? = null