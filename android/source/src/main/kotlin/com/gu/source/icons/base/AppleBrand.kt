package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AppleBrand: ImageVector
    get() {
        if (_AppleBrand != null) {
            return _AppleBrand!!
        }
        _AppleBrand = ImageVector.Builder(
            name = "AppleBrand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.379f, 5.615f)
                curveTo(13.282f, 5.615f, 14.413f, 5.005f, 15.087f, 4.191f)
                curveTo(15.697f, 3.454f, 16.142f, 2.424f, 16.142f, 1.394f)
                curveTo(16.142f, 1.254f, 16.13f, 1.114f, 16.104f, 1f)
                curveTo(15.1f, 1.038f, 13.892f, 1.674f, 13.167f, 2.526f)
                curveTo(12.595f, 3.174f, 12.074f, 4.191f, 12.074f, 5.234f)
                curveTo(12.074f, 5.387f, 12.099f, 5.539f, 12.112f, 5.59f)
                curveTo(12.175f, 5.603f, 12.277f, 5.615f, 12.379f, 5.615f)
                close()
                moveTo(9.2f, 21f)
                curveTo(10.434f, 21f, 10.98f, 20.174f, 12.519f, 20.174f)
                curveTo(14.083f, 20.174f, 14.426f, 20.975f, 15.799f, 20.975f)
                curveTo(17.147f, 20.975f, 18.05f, 19.729f, 18.902f, 18.508f)
                curveTo(19.855f, 17.109f, 20.249f, 15.736f, 20.275f, 15.673f)
                curveTo(20.186f, 15.647f, 17.605f, 14.592f, 17.605f, 11.629f)
                curveTo(17.605f, 9.061f, 19.639f, 7.904f, 19.753f, 7.815f)
                curveTo(18.406f, 5.882f, 16.358f, 5.832f, 15.799f, 5.832f)
                curveTo(14.286f, 5.832f, 13.053f, 6.747f, 12.277f, 6.747f)
                curveTo(11.438f, 6.747f, 10.332f, 5.882f, 9.022f, 5.882f)
                curveTo(6.53f, 5.882f, 4f, 7.942f, 4f, 11.833f)
                curveTo(4f, 14.249f, 4.941f, 16.804f, 6.098f, 18.457f)
                curveTo(7.09f, 19.856f, 7.954f, 21f, 9.2f, 21f)
                close()
            }
        }.build()

        return _AppleBrand!!
    }

@Suppress("ObjectPropertyName")
private var _AppleBrand: ImageVector? = null