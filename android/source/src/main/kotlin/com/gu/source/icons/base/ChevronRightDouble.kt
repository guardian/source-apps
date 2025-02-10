package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronRightDouble: ImageVector
    get() {
        if (_ChevronRightDouble != null) {
            return _ChevronRightDouble!!
        }
        _ChevronRightDouble = ImageVector.Builder(
            name = "ChevronRightDouble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.222f, 2f)
                lineTo(12.721f, 11.499f)
                verticalLineTo(12.501f)
                lineTo(3.222f, 22f)
                lineTo(2.27f, 21.023f)
                lineTo(9.638f, 12f)
                lineTo(2.27f, 2.977f)
                lineTo(3.222f, 2f)
                close()
                moveTo(13.248f, 2f)
                lineTo(22.746f, 11.499f)
                verticalLineTo(12.501f)
                lineTo(13.248f, 22f)
                lineTo(12.295f, 21.023f)
                lineTo(19.663f, 12f)
                lineTo(12.295f, 2.977f)
                lineTo(13.248f, 2f)
                close()
            }
        }.build()

        return _ChevronRightDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightDouble: ImageVector? = null