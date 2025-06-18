package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronUpAndDownSmall: ImageVector
    get() {
        if (_ChevronUpAndDownSmall != null) {
            return _ChevronUpAndDownSmall!!
        }
        _ChevronUpAndDownSmall = ImageVector.Builder(
            name = "ChevronUpAndDownSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.025f, 5.495f)
                lineTo(7.425f, 9.005f)
                lineTo(6.54f, 8.125f)
                lineTo(11.67f, 2.995f)
                horizontalLineTo(12.355f)
                lineTo(17.485f, 8.12f)
                lineTo(16.6f, 9.005f)
                lineTo(12.025f, 5.495f)
                close()
                moveTo(12f, 18.505f)
                lineTo(16.6f, 14.995f)
                lineTo(17.485f, 15.875f)
                lineTo(12.355f, 21.005f)
                horizontalLineTo(11.67f)
                lineTo(6.54f, 15.88f)
                lineTo(7.425f, 14.995f)
                lineTo(12f, 18.505f)
                close()
            }
        }.build()

        return _ChevronUpAndDownSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpAndDownSmall: ImageVector? = null