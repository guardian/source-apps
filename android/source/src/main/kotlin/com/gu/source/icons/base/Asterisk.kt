package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Asterisk: ImageVector
    get() {
        if (_Asterisk != null) {
            return _Asterisk!!
        }
        _Asterisk = ImageVector.Builder(
            name = "Asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.85f, 14f)
                lineTo(11.25f, 23f)
                horizontalLineTo(12.75f)
                lineTo(13.15f, 14f)
                lineTo(21.175f, 18.15f)
                lineTo(21.9f, 16.85f)
                lineTo(14.325f, 12f)
                lineTo(21.9f, 7.15f)
                lineTo(21.175f, 5.825f)
                lineTo(13.15f, 10f)
                lineTo(12.75f, 1f)
                horizontalLineTo(11.25f)
                lineTo(10.85f, 9.975f)
                lineTo(2.875f, 5.825f)
                lineTo(2.1f, 7.15f)
                lineTo(9.725f, 12f)
                lineTo(2.1f, 16.85f)
                lineTo(2.875f, 18.15f)
                lineTo(10.85f, 14f)
                close()
            }
        }.build()

        return _Asterisk!!
    }

@Suppress("ObjectPropertyName")
private var _Asterisk: ImageVector? = null