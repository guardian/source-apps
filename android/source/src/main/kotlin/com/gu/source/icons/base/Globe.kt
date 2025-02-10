package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Globe: ImageVector
    get() {
        if (_Globe != null) {
            return _Globe!!
        }
        _Globe = ImageVector.Builder(
            name = "Globe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 12f)
                curveTo(20f, 12.715f, 19.906f, 13.408f, 19.73f, 14.068f)
                horizontalLineTo(16.402f)
                curveTo(16.465f, 13.401f, 16.498f, 12.709f, 16.498f, 12f)
                curveTo(16.498f, 11.292f, 16.465f, 10.602f, 16.402f, 9.936f)
                lineTo(19.731f, 9.936f)
                curveTo(19.906f, 10.594f, 20f, 11.286f, 20f, 12f)
                close()
                moveTo(14.393f, 9.936f)
                curveTo(14.461f, 10.592f, 14.498f, 11.282f, 14.498f, 12f)
                curveTo(14.498f, 12.719f, 14.461f, 13.411f, 14.392f, 14.068f)
                horizontalLineTo(9.608f)
                curveTo(9.539f, 13.411f, 9.502f, 12.719f, 9.502f, 12f)
                curveTo(9.502f, 11.282f, 9.539f, 10.592f, 9.608f, 9.936f)
                lineTo(14.393f, 9.936f)
                close()
                moveTo(16.111f, 7.936f)
                lineTo(18.892f, 7.936f)
                curveTo(18.007f, 6.438f, 16.648f, 5.254f, 15.021f, 4.59f)
                curveTo(15.481f, 5.518f, 15.855f, 6.656f, 16.111f, 7.936f)
                close()
                moveTo(12f, 4f)
                horizontalLineTo(12f)
                lineTo(12f, 4f)
                curveTo(12.003f, 4f, 12.026f, 4f, 12.078f, 4.024f)
                curveTo(12.139f, 4.051f, 12.242f, 4.112f, 12.381f, 4.243f)
                curveTo(12.669f, 4.514f, 13.019f, 4.999f, 13.357f, 5.749f)
                curveTo(13.634f, 6.366f, 13.877f, 7.104f, 14.066f, 7.936f)
                lineTo(9.934f, 7.936f)
                curveTo(10.123f, 7.104f, 10.366f, 6.366f, 10.643f, 5.749f)
                curveTo(10.981f, 4.999f, 11.331f, 4.514f, 11.619f, 4.243f)
                curveTo(11.758f, 4.112f, 11.862f, 4.051f, 11.922f, 4.024f)
                curveTo(11.969f, 4.002f, 11.992f, 4f, 11.998f, 4f)
                curveTo(11.999f, 4f, 12f, 4f, 12f, 4f)
                close()
                moveTo(8.98f, 4.59f)
                curveTo(8.519f, 5.518f, 8.145f, 6.656f, 7.889f, 7.936f)
                lineTo(5.108f, 7.936f)
                curveTo(5.993f, 6.438f, 7.352f, 5.254f, 8.98f, 4.59f)
                close()
                moveTo(7.598f, 9.936f)
                lineTo(4.269f, 9.936f)
                curveTo(4.093f, 10.594f, 4f, 11.286f, 4f, 12f)
                curveTo(4f, 12.715f, 4.094f, 13.408f, 4.27f, 14.068f)
                horizontalLineTo(7.598f)
                curveTo(7.535f, 13.401f, 7.502f, 12.709f, 7.502f, 12f)
                curveTo(7.502f, 11.292f, 7.535f, 10.602f, 7.598f, 9.936f)
                close()
                moveTo(7.89f, 16.068f)
                horizontalLineTo(5.11f)
                curveTo(5.995f, 17.564f, 7.354f, 18.747f, 8.98f, 19.41f)
                curveTo(8.519f, 18.483f, 8.146f, 17.346f, 7.89f, 16.068f)
                close()
                moveTo(12f, 20f)
                curveTo(12f, 20f, 12f, 20f, 12f, 20f)
                curveTo(11.999f, 20f, 11.999f, 20f, 11.998f, 20f)
                curveTo(11.992f, 20f, 11.969f, 19.998f, 11.922f, 19.976f)
                curveTo(11.862f, 19.949f, 11.758f, 19.888f, 11.619f, 19.757f)
                curveTo(11.331f, 19.486f, 10.981f, 19.001f, 10.643f, 18.251f)
                curveTo(10.366f, 17.635f, 10.124f, 16.899f, 9.935f, 16.068f)
                horizontalLineTo(14.065f)
                curveTo(13.876f, 16.899f, 13.634f, 17.635f, 13.357f, 18.251f)
                curveTo(13.019f, 19.001f, 12.669f, 19.486f, 12.381f, 19.757f)
                curveTo(12.242f, 19.888f, 12.139f, 19.949f, 12.078f, 19.976f)
                curveTo(12.031f, 19.998f, 12.008f, 20f, 12.002f, 20f)
                curveTo(12.001f, 20f, 12.001f, 20f, 12f, 20f)
                close()
                moveTo(15.021f, 19.41f)
                curveTo(16.646f, 18.747f, 18.005f, 17.564f, 18.89f, 16.068f)
                horizontalLineTo(16.111f)
                curveTo(15.854f, 17.346f, 15.481f, 18.483f, 15.021f, 19.41f)
                close()
                moveTo(12f, 2f)
                curveTo(16.076f, 2f, 19.582f, 4.438f, 21.14f, 7.936f)
                horizontalLineTo(21.149f)
                verticalLineTo(7.958f)
                curveTo(21.696f, 9.194f, 22f, 10.561f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(12f, 2f, 12f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _Globe!!
    }

@Suppress("ObjectPropertyName")
private var _Globe: ImageVector? = null