package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.SpeechBubblePlus: ImageVector
    get() {
        if (_SpeechBubblePlus != null) {
            return _SpeechBubblePlus!!
        }
        _SpeechBubblePlus = ImageVector.Builder(
            name = "SpeechBubblePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.25f, 10f)
                verticalLineTo(6.75f)
                horizontalLineTo(16f)
                verticalLineTo(5.25f)
                horizontalLineTo(19.25f)
                verticalLineTo(2f)
                horizontalLineTo(20.75f)
                verticalLineTo(5.25f)
                horizontalLineTo(24f)
                verticalLineTo(6.75f)
                horizontalLineTo(20.75f)
                verticalLineTo(10f)
                horizontalLineTo(19.25f)
                close()
                moveTo(14f, 6f)
                curveTo(14f, 9.3f, 16.7f, 12f, 20f, 12f)
                verticalLineTo(15.5f)
                lineTo(18.5f, 17f)
                horizontalLineTo(10f)
                lineTo(6.975f, 22f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(3.475f)
                lineTo(2f, 15.5f)
                verticalLineTo(6.5f)
                lineTo(3.5f, 5f)
                horizontalLineTo(14.075f)
                curveTo(14.025f, 5.325f, 14f, 5.675f, 14f, 6f)
                close()
            }
        }.build()

        return _SpeechBubblePlus!!
    }

@Suppress("ObjectPropertyName")
private var _SpeechBubblePlus: ImageVector? = null