package com.gu.source.foundation.icons.base

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.TelegramBrand: ImageVector
    get() {
        if (_TelegramBrand != null) {
            return _TelegramBrand!!
        }
        _TelegramBrand = ImageVector.Builder(
            name = "TelegramBrand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2AABEE),
                        1f to Color(0xFF229ED9)
                    ),
                    start = Offset(11.874f, 1.812f),
                    end = Offset(11.874f, 21.938f)
                )
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.522f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(6.527f, 11.894f)
                lineTo(12.358f, 9.378f)
                lineTo(16.089f, 8.016f)
                curveTo(16.227f, 8.013f, 16.363f, 8.053f, 16.476f, 8.132f)
                curveTo(16.556f, 8.201f, 16.607f, 8.297f, 16.619f, 8.402f)
                curveTo(16.639f, 8.533f, 16.645f, 8.664f, 16.636f, 8.796f)
                curveTo(16.485f, 10.377f, 15.834f, 14.215f, 15.504f, 15.986f)
                curveTo(15.364f, 16.741f, 15.087f, 16.992f, 14.821f, 17.011f)
                curveTo(14.24f, 17.064f, 13.799f, 16.627f, 13.237f, 16.256f)
                lineTo(11.006f, 14.757f)
                curveTo(10.018f, 14.107f, 10.658f, 13.751f, 11.221f, 13.164f)
                lineTo(13.976f, 10.472f)
                curveTo(13.983f, 10.442f, 13.982f, 10.409f, 13.974f, 10.378f)
                curveTo(13.966f, 10.347f, 13.951f, 10.319f, 13.93f, 10.295f)
                curveTo(13.899f, 10.276f, 13.865f, 10.263f, 13.828f, 10.26f)
                curveTo(13.792f, 10.257f, 13.756f, 10.262f, 13.722f, 10.275f)
                curveTo(13.634f, 10.295f, 12.228f, 11.224f, 9.505f, 13.062f)
                curveTo(9.106f, 13.337f, 8.744f, 13.47f, 8.421f, 13.462f)
                curveTo(8.063f, 13.455f, 7.377f, 13.261f, 6.866f, 13.095f)
                curveTo(6.237f, 12.891f, 5.742f, 12.784f, 5.785f, 12.438f)
                curveTo(5.806f, 12.264f, 6.052f, 12.082f, 6.527f, 11.894f)
                close()
            }
        }.build()

        return _TelegramBrand!!
    }

@Suppress("ObjectPropertyName")
private var _TelegramBrand: ImageVector? = null