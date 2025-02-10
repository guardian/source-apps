package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Cuisine: ImageVector
    get() {
        if (_Cuisine != null) {
            return _Cuisine!!
        }
        _Cuisine = ImageVector.Builder(
            name = "Cuisine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(16.944f, 9.242f)
                curveTo(17.634f, 9.242f, 18.194f, 8.683f, 18.194f, 7.992f)
                curveTo(18.194f, 7.302f, 17.634f, 6.742f, 16.944f, 6.742f)
                curveTo(16.253f, 6.742f, 15.694f, 7.302f, 15.694f, 7.992f)
                curveTo(15.694f, 8.683f, 16.253f, 9.242f, 16.944f, 9.242f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.206f, 18.961f)
                curveTo(7.347f, 17.929f, 8.757f, 17.195f, 10.316f, 16.881f)
                lineTo(11.534f, 12.311f)
                lineTo(11.39f, 11.766f)
                lineTo(4.642f, 13.467f)
                lineTo(3.883f, 13.014f)
                lineTo(2.6f, 7.928f)
                lineTo(3.054f, 7.169f)
                lineTo(9.726f, 5.487f)
                lineTo(9.584f, 4.95f)
                lineTo(10.792f, 4.63f)
                lineTo(12.183f, 9.878f)
                lineTo(13.916f, 3.375f)
                lineTo(15.124f, 3.697f)
                lineTo(15.007f, 4.137f)
                lineTo(21.417f, 5.74f)
                lineTo(21.871f, 6.498f)
                lineTo(20.599f, 11.587f)
                lineTo(19.841f, 12.042f)
                lineTo(13.333f, 10.414f)
                lineTo(12.828f, 12.312f)
                lineTo(14.056f, 16.948f)
                curveTo(15.495f, 17.293f, 16.796f, 17.997f, 17.862f, 18.961f)
                horizontalLineTo(20.284f)
                verticalLineTo(19.836f)
                lineTo(19.534f, 20.586f)
                lineTo(4.534f, 20.586f)
                lineTo(3.784f, 19.836f)
                lineTo(3.784f, 18.961f)
                horizontalLineTo(6.206f)
                close()
                moveTo(12.034f, 16.711f)
                curveTo(11.906f, 16.711f, 11.779f, 16.713f, 11.653f, 16.719f)
                lineTo(12.179f, 14.745f)
                lineTo(12.707f, 16.736f)
                curveTo(12.485f, 16.719f, 12.26f, 16.711f, 12.034f, 16.711f)
                close()
                moveTo(13.656f, 9.206f)
                lineTo(14.685f, 5.345f)
                lineTo(20.507f, 6.801f)
                lineTo(19.538f, 10.677f)
                lineTo(13.656f, 9.206f)
                close()
                moveTo(3.965f, 8.228f)
                lineTo(5.205f, 7.916f)
                lineTo(6.212f, 11.782f)
                lineTo(4.942f, 12.102f)
                lineTo(3.965f, 8.228f)
                close()
                moveTo(7.577f, 7.318f)
                lineTo(6.417f, 7.61f)
                lineTo(7.424f, 11.477f)
                lineTo(8.585f, 11.184f)
                lineTo(7.577f, 7.318f)
                close()
                moveTo(9.797f, 10.878f)
                lineTo(8.79f, 7.012f)
                lineTo(10.046f, 6.695f)
                lineTo(11.07f, 10.558f)
                lineTo(9.797f, 10.878f)
                close()
            }
        }.build()

        return _Cuisine!!
    }

@Suppress("ObjectPropertyName")
private var _Cuisine: ImageVector? = null