package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Diets: ImageVector
    get() {
        if (_Diets != null) {
            return _Diets!!
        }
        _Diets = ImageVector.Builder(
            name = "Diets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.212f, 2.744f)
                curveTo(15.083f, 4.468f, 13.193f, 4.931f, 11.285f, 5.399f)
                curveTo(10.992f, 5.47f, 10.699f, 5.542f, 10.405f, 5.619f)
                curveTo(7.22f, 6.446f, 5.072f, 8.33f, 4.189f, 10.818f)
                curveTo(3.352f, 13.176f, 3.701f, 15.935f, 5.152f, 18.615f)
                curveTo(4.91f, 19.01f, 4.681f, 19.395f, 4.462f, 19.766f)
                lineTo(5.861f, 20.593f)
                curveTo(6.043f, 20.285f, 6.23f, 19.97f, 6.425f, 19.648f)
                horizontalLineTo(11.161f)
                curveTo(13.347f, 19.648f, 15.126f, 19.058f, 16.495f, 18.01f)
                curveTo(17.861f, 16.965f, 18.761f, 15.509f, 19.268f, 13.87f)
                curveTo(20.277f, 10.617f, 19.77f, 6.56f, 18.206f, 3.103f)
                lineTo(17.212f, 2.744f)
                close()
                moveTo(11.648f, 6.984f)
                curveTo(11.362f, 7.053f, 11.084f, 7.121f, 10.813f, 7.191f)
                curveTo(8.055f, 7.908f, 6.393f, 9.468f, 5.721f, 11.362f)
                curveTo(5.148f, 12.975f, 5.255f, 14.942f, 6.174f, 17.014f)
                curveTo(7.641f, 14.826f, 9.849f, 12.594f, 12.865f, 10.219f)
                lineTo(13.552f, 11.031f)
                curveTo(10.646f, 13.625f, 8.868f, 15.898f, 7.454f, 18.023f)
                horizontalLineTo(11.161f)
                curveTo(13.044f, 18.023f, 14.462f, 17.52f, 15.508f, 16.72f)
                curveTo(16.557f, 15.916f, 17.289f, 14.769f, 17.716f, 13.389f)
                curveTo(18.487f, 10.901f, 18.242f, 7.728f, 17.151f, 4.803f)
                curveTo(15.14f, 6.135f, 13.28f, 6.587f, 11.648f, 6.984f)
                close()
            }
        }.build()

        return _Diets!!
    }

@Suppress("ObjectPropertyName")
private var _Diets: ImageVector? = null