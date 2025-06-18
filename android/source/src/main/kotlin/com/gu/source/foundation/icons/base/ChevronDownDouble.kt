package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronDownDouble: ImageVector
    get() {
        if (_ChevronDownDouble != null) {
            return _ChevronDownDouble!!
        }
        _ChevronDownDouble = ImageVector.Builder(
            name = "ChevronDownDouble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2.712f)
                lineTo(2.977f, 1.76f)
                lineTo(12f, 9.128f)
                lineTo(21.023f, 1.76f)
                lineTo(22f, 2.712f)
                lineTo(12.501f, 12.211f)
                horizontalLineTo(11.499f)
                lineTo(2f, 2.712f)
                close()
                moveTo(2f, 12.738f)
                lineTo(2.977f, 11.785f)
                lineTo(12f, 19.153f)
                lineTo(21.023f, 11.785f)
                lineTo(22f, 12.738f)
                lineTo(12.501f, 22.236f)
                horizontalLineTo(11.499f)
                lineTo(2f, 12.738f)
                close()
            }
        }.build()

        return _ChevronDownDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownDouble: ImageVector? = null