package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 5f)
                lineTo(1f, 7f)
                verticalLineTo(17f)
                lineTo(3f, 19f)
                horizontalLineTo(14.5f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
                moveTo(21.5f, 5.5f)
                lineTo(16.5f, 10.5f)
                verticalLineTo(13.5f)
                lineTo(21.5f, 18.5f)
                horizontalLineTo(23f)
                verticalLineTo(5.5f)
                horizontalLineTo(21.5f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null