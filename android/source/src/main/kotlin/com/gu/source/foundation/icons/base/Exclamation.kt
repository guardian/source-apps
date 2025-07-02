package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Exclamation: ImageVector
    get() {
        if (_Exclamation != null) {
            return _Exclamation!!
        }
        _Exclamation = ImageVector.Builder(
            name = "Exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(9.407f, 2.051f)
                lineTo(10.39f, 14.898f)
                horizontalLineTo(13.102f)
                lineTo(14.119f, 2.051f)
                lineTo(13.136f, 1f)
                horizontalLineTo(10.39f)
                lineTo(9.407f, 2.051f)
                close()
                moveTo(14.424f, 20.322f)
                curveTo(14.424f, 18.83f, 13.203f, 17.61f, 11.678f, 17.61f)
                curveTo(10.22f, 17.61f, 9f, 18.83f, 9f, 20.322f)
                curveTo(9f, 21.78f, 10.22f, 23f, 11.678f, 23f)
                curveTo(13.17f, 23f, 14.424f, 21.78f, 14.424f, 20.322f)
                close()
            }
        }.build()

        return _Exclamation!!
    }

@Suppress("ObjectPropertyName")
private var _Exclamation: ImageVector? = null