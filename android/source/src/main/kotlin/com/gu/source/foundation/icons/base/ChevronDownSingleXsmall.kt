package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronDownSingleXsmall: ImageVector
    get() {
        if (_ChevronDownSingleXsmall != null) {
            return _ChevronDownSingleXsmall!!
        }
        _ChevronDownSingleXsmall = ImageVector.Builder(
            name = "ChevronDownSingleXsmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.806f, 10.712f)
                lineTo(11.634f, 15f)
                horizontalLineTo(12.365f)
                lineTo(16.194f, 10.712f)
                lineTo(15.5f, 10f)
                lineTo(12f, 13f)
                lineTo(8.5f, 10f)
                lineTo(7.806f, 10.712f)
                close()
            }
        }.build()

        return _ChevronDownSingleXsmall!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownSingleXsmall: ImageVector? = null