package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.TextLarge: ImageVector
    get() {
        if (_TextLarge != null) {
            return _TextLarge!!
        }
        _TextLarge = ImageVector.Builder(
            name = "TextLarge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.9f, 19.975f)
                lineTo(15.925f, 19.475f)
                lineTo(14.5f, 15.05f)
                horizontalLineTo(8.575f)
                lineTo(7.075f, 19.475f)
                lineTo(9.175f, 19.975f)
                verticalLineTo(21f)
                horizontalLineTo(3.5f)
                verticalLineTo(19.925f)
                lineTo(5.25f, 19.475f)
                lineTo(11.025f, 3.05f)
                horizontalLineTo(13.175f)
                lineTo(18.7f, 19.475f)
                lineTo(20.525f, 19.925f)
                verticalLineTo(21f)
                horizontalLineTo(13.9f)
                verticalLineTo(19.975f)
                close()
                moveTo(8.95f, 14f)
                horizontalLineTo(14.15f)
                lineTo(11.7f, 6.275f)
                horizontalLineTo(11.575f)
                lineTo(8.95f, 14f)
                close()
            }
        }.build()

        return _TextLarge!!
    }

@Suppress("ObjectPropertyName")
private var _TextLarge: ImageVector? = null