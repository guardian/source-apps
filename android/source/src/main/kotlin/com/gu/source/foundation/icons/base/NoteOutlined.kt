package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.NoteOutlined: ImageVector
    get() {
        if (_NoteOutlined != null) {
            return _NoteOutlined!!
        }
        _NoteOutlined = ImageVector.Builder(
            name = "NoteOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17f, 19.504f)
                verticalLineTo(15.875f)
                lineTo(18.25f, 14.637f)
                horizontalLineTo(18.625f)
                verticalLineTo(20.25f)
                lineTo(17.75f, 21.125f)
                horizontalLineTo(6.25f)
                lineTo(5.375f, 20.25f)
                verticalLineTo(3.75f)
                lineTo(6.25f, 2.875f)
                lineTo(15.25f, 2.838f)
                lineTo(18.625f, 6.25f)
                verticalLineTo(7.5f)
                lineTo(17.5f, 8.625f)
                horizontalLineTo(17f)
                verticalLineTo(6.863f)
                lineTo(14.625f, 4.504f)
                horizontalLineTo(7f)
                verticalLineTo(19.504f)
                horizontalLineTo(17f)
                close()
                moveTo(20.808f, 7.5f)
                lineTo(13.883f, 14.425f)
                lineTo(15.063f, 15.604f)
                lineTo(21.987f, 8.679f)
                lineTo(21.692f, 8.383f)
                lineTo(21.104f, 7.796f)
                lineTo(20.808f, 7.5f)
                close()
                moveTo(12.771f, 16.458f)
                lineTo(13.067f, 16.75f)
                lineTo(14.663f, 16.038f)
                lineTo(13.483f, 14.863f)
                lineTo(12.771f, 16.458f)
                close()
                moveTo(15.321f, 9.5f)
                horizontalLineTo(7.821f)
                verticalLineTo(10.75f)
                horizontalLineTo(15.321f)
                verticalLineTo(9.5f)
                close()
                moveTo(13.238f, 12.417f)
                horizontalLineTo(7.821f)
                verticalLineTo(13.667f)
                horizontalLineTo(13.238f)
                verticalLineTo(12.417f)
                close()
                moveTo(7.821f, 15.333f)
                horizontalLineTo(11.571f)
                verticalLineTo(16.583f)
                horizontalLineTo(7.821f)
                verticalLineTo(15.333f)
                close()
            }
        }.build()

        return _NoteOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _NoteOutlined: ImageVector? = null