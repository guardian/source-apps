package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronLeftDouble: ImageVector
    get() {
        if (_ChevronLeftDouble != null) {
            return _ChevronLeftDouble!!
        }
        _ChevronLeftDouble = ImageVector.Builder(
            name = "ChevronLeftDouble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.749f, 2f)
                lineTo(11.701f, 2.977f)
                lineTo(4.333f, 12f)
                lineTo(11.701f, 21.023f)
                lineTo(10.749f, 22f)
                lineTo(1.25f, 12.501f)
                verticalLineTo(11.499f)
                lineTo(10.749f, 2f)
                close()
                moveTo(20.774f, 2f)
                lineTo(21.726f, 2.977f)
                lineTo(14.358f, 12f)
                lineTo(21.726f, 21.023f)
                lineTo(20.774f, 22f)
                lineTo(11.275f, 12.501f)
                verticalLineTo(11.499f)
                lineTo(20.774f, 2f)
                close()
            }
        }.build()

        return _ChevronLeftDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeftDouble: ImageVector? = null