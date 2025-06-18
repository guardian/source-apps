package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.MediaControlsBack: ImageVector
    get() {
        if (_MediaControlsBack != null) {
            return _MediaControlsBack!!
        }
        _MediaControlsBack = ImageVector.Builder(
            name = "MediaControlsBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.488f, 12.383f)
                lineTo(22.424f, 19.016f)
                lineTo(23f, 18.59f)
                verticalLineTo(5.425f)
                lineTo(22.424f, 5f)
                lineTo(12.488f, 11.632f)
                lineTo(12.488f, 12.383f)
                close()
                moveTo(1f, 12.383f)
                lineTo(10.961f, 19.016f)
                lineTo(11.512f, 18.59f)
                lineTo(11.512f, 5.425f)
                lineTo(10.961f, 5f)
                lineTo(1f, 11.632f)
                lineTo(1f, 12.383f)
                close()
            }
        }.build()

        return _MediaControlsBack!!
    }

@Suppress("ObjectPropertyName")
private var _MediaControlsBack: ImageVector? = null