package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronUpDouble: ImageVector
    get() {
        if (_ChevronUpDouble != null) {
            return _ChevronUpDouble!!
        }
        _ChevronUpDouble = ImageVector.Builder(
            name = "ChevronUpDouble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 11.259f)
                lineTo(11.499f, 1.76f)
                horizontalLineTo(12.501f)
                lineTo(22f, 11.259f)
                lineTo(21.023f, 12.211f)
                lineTo(12f, 4.843f)
                lineTo(2.977f, 12.211f)
                lineTo(2f, 11.259f)
                close()
                moveTo(2f, 21.284f)
                lineTo(11.499f, 11.785f)
                horizontalLineTo(12.501f)
                lineTo(22f, 21.284f)
                lineTo(21.023f, 22.236f)
                lineTo(12f, 14.868f)
                lineTo(2.977f, 22.236f)
                lineTo(2f, 21.284f)
                close()
            }
        }.build()

        return _ChevronUpDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpDouble: ImageVector? = null