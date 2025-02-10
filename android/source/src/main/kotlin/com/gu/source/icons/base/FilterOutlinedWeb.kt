package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.FilterOutlinedWeb: ImageVector
    get() {
        if (_FilterOutlinedWeb != null) {
            return _FilterOutlinedWeb!!
        }
        _FilterOutlinedWeb = ImageVector.Builder(
            name = "FilterOutlinedWeb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.167f, 12.057f)
                curveTo(21.167f, 17.12f, 17.063f, 21.224f, 12f, 21.224f)
                curveTo(6.937f, 21.224f, 2.833f, 17.12f, 2.833f, 12.057f)
                curveTo(2.833f, 6.995f, 6.937f, 2.891f, 12f, 2.891f)
                curveTo(17.063f, 2.891f, 21.167f, 6.995f, 21.167f, 12.057f)
                close()
                moveTo(22f, 12.057f)
                curveTo(22f, 17.58f, 17.523f, 22.057f, 12f, 22.057f)
                curveTo(6.477f, 22.057f, 2f, 17.58f, 2f, 12.057f)
                curveTo(2f, 6.534f, 6.477f, 2.057f, 12f, 2.057f)
                curveTo(17.523f, 2.057f, 22f, 6.534f, 22f, 12.057f)
                close()
                moveTo(17.985f, 8.005f)
                horizontalLineTo(5.995f)
                verticalLineTo(9.505f)
                lineTo(6.49f, 10.005f)
                horizontalLineTo(17.49f)
                lineTo(17.985f, 9.505f)
                verticalLineTo(8.005f)
                close()
                moveTo(7.99f, 12.01f)
                horizontalLineTo(15.99f)
                verticalLineTo(13.505f)
                lineTo(15.49f, 14.01f)
                horizontalLineTo(8.49f)
                lineTo(7.99f, 13.505f)
                verticalLineTo(12.01f)
                close()
                moveTo(10f, 16.005f)
                horizontalLineTo(13.975f)
                verticalLineTo(17.505f)
                lineTo(13.49f, 18.005f)
                horizontalLineTo(10.49f)
                lineTo(10f, 17.505f)
                verticalLineTo(16.005f)
                close()
            }
        }.build()

        return _FilterOutlinedWeb!!
    }

@Suppress("ObjectPropertyName")
private var _FilterOutlinedWeb: ImageVector? = null