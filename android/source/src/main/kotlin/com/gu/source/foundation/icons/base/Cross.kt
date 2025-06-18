package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Cross: ImageVector
    get() {
        if (_Cross != null) {
            return _Cross!!
        }
        _Cross = ImageVector.Builder(
            name = "Cross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.015f, 14.042f)
                lineTo(20.707f, 22f)
                lineTo(22f, 20.709f)
                lineTo(14.06f, 12f)
                lineTo(22f, 3.291f)
                lineTo(20.707f, 2f)
                lineTo(12.015f, 9.958f)
                lineTo(3.293f, 2.03f)
                lineTo(2f, 3.321f)
                lineTo(9.97f, 12f)
                lineTo(2f, 20.679f)
                lineTo(3.293f, 21.97f)
                lineTo(12.015f, 14.042f)
                close()
            }
        }.build()

        return _Cross!!
    }

@Suppress("ObjectPropertyName")
private var _Cross: ImageVector? = null