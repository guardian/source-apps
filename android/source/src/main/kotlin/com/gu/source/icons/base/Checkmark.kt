package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Checkmark: ImageVector
    get() {
        if (_Checkmark != null) {
            return _Checkmark!!
        }
        _Checkmark = ImageVector.Builder(
            name = "Checkmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.011f, 11.884f)
                lineTo(2f, 12.895f)
                lineTo(7.057f, 19.975f)
                horizontalLineTo(7.537f)
                lineTo(22f, 5.006f)
                lineTo(20.989f, 4.02f)
                lineTo(7.537f, 16.207f)
                lineTo(3.011f, 11.884f)
                close()
            }
        }.build()

        return _Checkmark!!
    }

@Suppress("ObjectPropertyName")
private var _Checkmark: ImageVector? = null