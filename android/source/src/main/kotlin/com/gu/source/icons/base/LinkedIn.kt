package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.LinkedIn: ImageVector
    get() {
        if (_LinkedIn != null) {
            return _LinkedIn!!
        }
        _LinkedIn = ImageVector.Builder(
            name = "LinkedIn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(7.075f, 3.952f)
                curveTo(7.075f, 5.037f, 6.29f, 5.902f, 4.996f, 5.902f)
                curveTo(3.785f, 5.902f, 3f, 5.037f, 3f, 3.952f)
                curveTo(3f, 2.843f, 3.81f, 2f, 5.051f, 2f)
                curveTo(6.292f, 2f, 7.05f, 2.843f, 7.075f, 3.952f)
                close()
                moveTo(3.101f, 19.997f)
                verticalLineTo(7.442f)
                horizontalLineTo(6.949f)
                verticalLineTo(19.997f)
                horizontalLineTo(3.101f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(9.251f, 11.447f)
                curveTo(9.251f, 9.882f, 9.201f, 8.579f, 9.151f, 7.442f)
                horizontalLineTo(12.491f)
                lineTo(12.669f, 9.188f)
                horizontalLineTo(12.745f)
                curveTo(13.244f, 8.367f, 14.492f, 7.164f, 16.571f, 7.164f)
                curveTo(19.102f, 7.164f, 21f, 8.885f, 21f, 12.581f)
                verticalLineTo(20.003f)
                horizontalLineTo(17.15f)
                verticalLineTo(13.04f)
                curveTo(17.15f, 11.422f, 16.592f, 10.318f, 15.2f, 10.318f)
                curveTo(14.137f, 10.318f, 13.504f, 11.062f, 13.226f, 11.781f)
                curveTo(13.127f, 12.096f, 13.083f, 12.427f, 13.098f, 12.758f)
                verticalLineTo(19.997f)
                horizontalLineTo(9.251f)
                verticalLineTo(11.447f)
                close()
            }
        }.build()

        return _LinkedIn!!
    }

@Suppress("ObjectPropertyName")
private var _LinkedIn: ImageVector? = null