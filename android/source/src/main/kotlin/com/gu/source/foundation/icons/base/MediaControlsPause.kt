package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.MediaControlsPause: ImageVector
    get() {
        if (_MediaControlsPause != null) {
            return _MediaControlsPause!!
        }
        _MediaControlsPause = ImageVector.Builder(
            name = "MediaControlsPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(10f, 5f)
                horizontalLineTo(7f)
                lineTo(6f, 6f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                close()
                moveTo(14f, 19f)
                horizontalLineTo(17f)
                lineTo(18f, 18f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _MediaControlsPause!!
    }

@Suppress("ObjectPropertyName")
private var _MediaControlsPause: ImageVector? = null