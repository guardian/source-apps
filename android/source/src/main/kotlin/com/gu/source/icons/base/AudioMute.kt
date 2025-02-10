package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AudioMute: ImageVector
    get() {
        if (_AudioMute != null) {
            return _AudioMute!!
        }
        _AudioMute = ImageVector.Builder(
            name = "AudioMute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 15.75f)
                horizontalLineTo(5.75f)
                lineTo(11f, 21f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                lineTo(5.75f, 8.25f)
                horizontalLineTo(2f)
                lineTo(1f, 9.25f)
                verticalLineTo(14.75f)
                lineTo(2f, 15.75f)
                close()
                moveTo(17.28f, 12f)
                lineTo(13.88f, 15.85f)
                lineTo(14.605f, 16.575f)
                lineTo(18.43f, 13.15f)
                lineTo(22.28f, 16.575f)
                lineTo(23.005f, 15.85f)
                lineTo(19.58f, 12f)
                lineTo(23.005f, 8.15f)
                lineTo(22.28f, 7.425f)
                lineTo(18.43f, 10.85f)
                lineTo(14.605f, 7.425f)
                lineTo(13.88f, 8.15f)
                lineTo(17.28f, 12f)
                close()
            }
        }.build()

        return _AudioMute!!
    }

@Suppress("ObjectPropertyName")
private var _AudioMute: ImageVector? = null