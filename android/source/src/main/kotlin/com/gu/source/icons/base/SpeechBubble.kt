package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.SpeechBubble: ImageVector
    get() {
        if (_SpeechBubble != null) {
            return _SpeechBubble!!
        }
        _SpeechBubble = ImageVector.Builder(
            name = "SpeechBubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 6.5f)
                lineTo(19.5f, 5f)
                horizontalLineTo(4.5f)
                lineTo(3f, 6.5f)
                verticalLineTo(15.5f)
                lineTo(4.475f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(7.975f)
                lineTo(11f, 17f)
                horizontalLineTo(19.5f)
                lineTo(21f, 15.5f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()

        return _SpeechBubble!!
    }

@Suppress("ObjectPropertyName")
private var _SpeechBubble: ImageVector? = null