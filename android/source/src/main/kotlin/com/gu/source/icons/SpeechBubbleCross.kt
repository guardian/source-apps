package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.SpeechBubbleCross: ImageVector
    get() {
        if (_SpeechBubbleCross != null) {
            return _SpeechBubbleCross!!
        }
        _SpeechBubbleCross = ImageVector.Builder(
            name = "SpeechBubbleCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.3f, 9.7f)
                lineTo(20f, 7.4f)
                lineTo(17.7f, 9.7f)
                lineTo(16.65f, 8.65f)
                lineTo(18.95f, 6.35f)
                lineTo(16.65f, 4.05f)
                lineTo(17.7f, 3f)
                lineTo(20f, 5.3f)
                lineTo(22.3f, 3f)
                lineTo(23.35f, 4.05f)
                lineTo(21.05f, 6.35f)
                lineTo(23.35f, 8.65f)
                lineTo(22.3f, 9.7f)
                close()
                moveTo(14f, 6.35f)
                curveTo(14f, 9.65f, 16.7f, 12.35f, 20f, 12.35f)
                verticalLineTo(15.85f)
                lineTo(18.5f, 17.35f)
                horizontalLineTo(10f)
                lineTo(6.975f, 22.35f)
                horizontalLineTo(6f)
                verticalLineTo(17.35f)
                horizontalLineTo(3.475f)
                lineTo(2f, 15.85f)
                verticalLineTo(6.85f)
                lineTo(3.5f, 5.35f)
                horizontalLineTo(14.075f)
                curveTo(14.025f, 5.675f, 14f, 6.025f, 14f, 6.35f)
                close()
            }
        }.build()

        return _SpeechBubbleCross!!
    }

@Suppress("ObjectPropertyName")
private var _SpeechBubbleCross: ImageVector? = null