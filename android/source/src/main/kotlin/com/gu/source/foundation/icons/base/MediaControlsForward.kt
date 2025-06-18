package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.MediaControlsForward: ImageVector
    get() {
        if (_MediaControlsForward != null) {
            return _MediaControlsForward!!
        }
        _MediaControlsForward = ImageVector.Builder(
            name = "MediaControlsForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.512f, 11.632f)
                lineTo(1.576f, 5f)
                lineTo(1f, 5.425f)
                verticalLineTo(18.59f)
                lineTo(1.576f, 19.016f)
                lineTo(11.512f, 12.383f)
                verticalLineTo(11.632f)
                close()
                moveTo(23f, 11.632f)
                lineTo(13.039f, 5f)
                lineTo(12.488f, 5.425f)
                verticalLineTo(18.59f)
                lineTo(13.039f, 19.016f)
                lineTo(23f, 12.383f)
                verticalLineTo(11.632f)
                close()
            }
        }.build()

        return _MediaControlsForward!!
    }

@Suppress("ObjectPropertyName")
private var _MediaControlsForward: ImageVector? = null