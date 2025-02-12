package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.MediaControlsStop: ImageVector
    get() {
        if (_MediaControlsStop != null) {
            return _MediaControlsStop!!
        }
        _MediaControlsStop = ImageVector.Builder(
            name = "MediaControlsStop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 18f)
                verticalLineTo(6f)
                lineTo(18f, 5f)
                horizontalLineTo(6f)
                lineTo(5f, 6f)
                verticalLineTo(18f)
                lineTo(6f, 19f)
                horizontalLineTo(18f)
                lineTo(19f, 18f)
                close()
            }
        }.build()

        return _MediaControlsStop!!
    }

@Suppress("ObjectPropertyName")
private var _MediaControlsStop: ImageVector? = null