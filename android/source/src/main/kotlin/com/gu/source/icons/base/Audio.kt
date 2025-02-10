package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Audio: ImageVector
    get() {
        if (_Audio != null) {
            return _Audio!!
        }
        _Audio = ImageVector.Builder(
            name = "Audio",
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
                moveTo(21.3f, 12f)
                curveTo(21.3f, 14.7f, 20.375f, 17.175f, 18.8f, 19.175f)
                lineTo(19.35f, 19.7f)
                curveTo(21.575f, 17.875f, 23f, 15.125f, 23f, 12f)
                curveTo(23f, 8.875f, 21.575f, 6.1f, 19.35f, 4.275f)
                lineTo(18.8f, 4.8f)
                curveTo(20.375f, 6.8f, 21.3f, 9.275f, 21.3f, 12f)
                close()
                moveTo(16.1f, 12f)
                curveTo(16.1f, 13.575f, 15.675f, 14.975f, 14.825f, 16.2f)
                lineTo(15.475f, 16.85f)
                curveTo(16.75f, 15.575f, 17.5f, 13.9f, 17.5f, 12f)
                curveTo(17.5f, 10.075f, 16.75f, 8.4f, 15.475f, 7.125f)
                lineTo(14.825f, 7.775f)
                curveTo(15.675f, 9f, 16.1f, 10.425f, 16.1f, 12f)
                close()
            }
        }.build()

        return _Audio!!
    }

@Suppress("ObjectPropertyName")
private var _Audio: ImageVector? = null