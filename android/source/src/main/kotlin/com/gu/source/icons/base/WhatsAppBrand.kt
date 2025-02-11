package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.WhatsAppBrand: ImageVector
    get() {
        if (_WhatsAppBrand != null) {
            return _WhatsAppBrand!!
        }
        _WhatsAppBrand = ImageVector.Builder(
            name = "WhatsAppBrand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(2f, 2f)
                    horizontalLineTo(22f)
                    verticalLineTo(22f)
                    horizontalLineTo(2f)
                    verticalLineTo(2f)
                    close()
                }
            ) {
            }
            group(
                clipPathData = PathData {
                    moveTo(22f, 2f)
                    horizontalLineTo(2f)
                    verticalLineTo(22f)
                    horizontalLineTo(22f)
                    verticalLineTo(2f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF2EDB2A))) {
                    moveTo(12f, 20.889f)
                    curveTo(14.357f, 20.888f, 16.618f, 19.951f, 18.284f, 18.285f)
                    curveTo(19.951f, 16.618f, 20.888f, 14.357f, 20.888f, 12f)
                    curveTo(20.888f, 9.643f, 19.951f, 7.382f, 18.284f, 5.715f)
                    curveTo(16.618f, 4.049f, 14.357f, 3.112f, 12f, 3.111f)
                    curveTo(9.643f, 3.112f, 7.382f, 4.048f, 5.715f, 5.715f)
                    curveTo(4.048f, 7.382f, 3.112f, 9.643f, 3.111f, 12f)
                    curveTo(3.112f, 14.357f, 4.048f, 16.618f, 5.715f, 18.285f)
                    curveTo(7.382f, 19.952f, 9.643f, 20.889f, 12f, 20.889f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF2EDB2A))) {
                    moveTo(4.274f, 15.163f)
                    lineTo(8.524f, 19.264f)
                    lineTo(2.842f, 20.892f)
                    lineTo(4.274f, 15.162f)
                    verticalLineTo(15.163f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(19.086f, 4.906f)
                    curveTo(17.206f, 3.033f, 14.706f, 2.002f, 12.042f, 2f)
                    curveTo(6.553f, 2f, 2.086f, 6.446f, 2.083f, 11.91f)
                    curveTo(2.082f, 13.657f, 2.541f, 15.362f, 3.412f, 16.864f)
                    lineTo(2f, 22f)
                    lineTo(7.279f, 20.622f)
                    curveTo(8.733f, 21.411f, 10.372f, 21.827f, 12.038f, 21.828f)
                    horizontalLineTo(12.042f)
                    curveTo(17.53f, 21.828f, 21.997f, 17.382f, 22f, 11.918f)
                    curveTo(22.004f, 10.615f, 21.748f, 9.323f, 21.248f, 8.12f)
                    curveTo(20.747f, 6.916f, 20.013f, 5.823f, 19.086f, 4.906f)
                    close()
                    moveTo(12.042f, 20.155f)
                    horizontalLineTo(12.038f)
                    curveTo(10.557f, 20.155f, 9.102f, 19.759f, 7.826f, 19.007f)
                    lineTo(7.523f, 18.828f)
                    lineTo(4.391f, 19.646f)
                    lineTo(5.227f, 16.607f)
                    lineTo(5.031f, 16.295f)
                    curveTo(4.202f, 14.984f, 3.765f, 13.467f, 3.765f, 11.912f)
                    curveTo(3.767f, 7.37f, 7.48f, 3.675f, 12.046f, 3.675f)
                    curveTo(14.257f, 3.676f, 16.335f, 4.533f, 17.897f, 6.091f)
                    curveTo(19.46f, 7.648f, 20.32f, 9.717f, 20.32f, 11.918f)
                    curveTo(20.317f, 16.461f, 16.605f, 20.157f, 12.042f, 20.157f)
                    lineTo(12.042f, 20.155f)
                    close()
                    moveTo(16.582f, 13.985f)
                    curveTo(16.333f, 13.861f, 15.109f, 13.262f, 14.882f, 13.18f)
                    curveTo(14.654f, 13.098f, 14.488f, 13.056f, 14.322f, 13.304f)
                    curveTo(14.156f, 13.552f, 13.679f, 14.109f, 13.534f, 14.275f)
                    curveTo(13.389f, 14.441f, 13.243f, 14.461f, 12.995f, 14.337f)
                    curveTo(12.747f, 14.214f, 11.944f, 13.953f, 10.993f, 13.108f)
                    curveTo(10.253f, 12.452f, 9.754f, 11.641f, 9.609f, 11.392f)
                    curveTo(9.464f, 11.144f, 9.594f, 11.011f, 9.718f, 10.887f)
                    curveTo(9.83f, 10.777f, 9.967f, 10.598f, 10.092f, 10.453f)
                    curveTo(10.216f, 10.308f, 10.257f, 10.206f, 10.341f, 10.04f)
                    curveTo(10.424f, 9.874f, 10.382f, 9.73f, 10.32f, 9.606f)
                    curveTo(10.257f, 9.482f, 9.76f, 8.262f, 9.553f, 7.767f)
                    curveTo(9.352f, 7.284f, 9.147f, 7.35f, 8.993f, 7.343f)
                    curveTo(8.848f, 7.336f, 8.682f, 7.333f, 8.516f, 7.333f)
                    curveTo(8.39f, 7.337f, 8.266f, 7.366f, 8.152f, 7.419f)
                    curveTo(8.038f, 7.473f, 7.936f, 7.549f, 7.852f, 7.643f)
                    curveTo(7.624f, 7.891f, 6.982f, 8.49f, 6.982f, 9.709f)
                    curveTo(6.982f, 10.928f, 7.873f, 12.105f, 7.997f, 12.271f)
                    curveTo(8.122f, 12.437f, 9.752f, 14.938f, 12.248f, 16.01f)
                    curveTo(12.842f, 16.265f, 13.305f, 16.417f, 13.667f, 16.532f)
                    curveTo(14.264f, 16.72f, 14.806f, 16.694f, 15.235f, 16.63f)
                    curveTo(15.712f, 16.559f, 16.708f, 16.031f, 16.914f, 15.453f)
                    curveTo(17.121f, 14.874f, 17.122f, 14.378f, 17.059f, 14.275f)
                    curveTo(16.997f, 14.172f, 16.831f, 14.11f, 16.582f, 13.986f)
                    verticalLineTo(13.985f)
                    close()
                }
            }
        }.build()

        return _WhatsAppBrand!!
    }

@Suppress("ObjectPropertyName")
private var _WhatsAppBrand: ImageVector? = null