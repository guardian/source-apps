package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Gps: ImageVector
    get() {
        if (_Gps != null) {
            return _Gps!!
        }
        _Gps = ImageVector.Builder(
            name = "Gps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.6f, 10.725f)
                lineTo(2.65f, 11.4f)
                lineTo(10.25f, 13.3f)
                lineTo(12.625f, 21.45f)
                lineTo(13.4f, 21.5f)
                lineTo(21.4f, 3.2f)
                lineTo(20.7f, 2.5f)
                lineTo(2.6f, 10.725f)
                close()
            }
        }.build()

        return _Gps!!
    }

@Suppress("ObjectPropertyName")
private var _Gps: ImageVector? = null