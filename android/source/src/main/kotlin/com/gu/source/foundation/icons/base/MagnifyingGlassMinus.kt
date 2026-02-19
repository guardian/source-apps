package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.MagnifyingGlassMinus: ImageVector
    get() {
        if (_MagnifyingGlassMinus != null) {
            return _MagnifyingGlassMinus!!
        }
        _MagnifyingGlassMinus = ImageVector.Builder(
            name = "MagnifyingGlassMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(9.273f, 2f)
                curveTo(13.295f, 2f, 16.523f, 5.295f, 16.523f, 9.273f)
                curveTo(16.523f, 13.295f, 13.295f, 16.523f, 9.273f, 16.523f)
                curveTo(5.25f, 16.523f, 2f, 13.295f, 2f, 9.273f)
                curveTo(2f, 5.295f, 5.25f, 2f, 9.273f, 2f)
                close()
                moveTo(9.273f, 3.841f)
                curveTo(6.25f, 3.841f, 3.841f, 6.25f, 3.841f, 9.273f)
                curveTo(3.841f, 12.273f, 6.25f, 14.727f, 9.273f, 14.727f)
                curveTo(12.273f, 14.727f, 14.727f, 12.273f, 14.727f, 9.273f)
                curveTo(14.727f, 6.25f, 12.273f, 3.841f, 9.273f, 3.841f)
                close()
                moveTo(5.636f, 9.955f)
                verticalLineTo(8.591f)
                horizontalLineTo(12.909f)
                verticalLineTo(9.955f)
                horizontalLineTo(5.636f)
                close()
                moveTo(16.568f, 14.727f)
                lineTo(22f, 20.159f)
                lineTo(20.159f, 22f)
                lineTo(14.727f, 16.568f)
                verticalLineTo(15.636f)
                lineTo(15.636f, 14.727f)
                horizontalLineTo(16.568f)
                close()
            }
        }.build()

        return _MagnifyingGlassMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassMinus: ImageVector? = null