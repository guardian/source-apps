package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronDownSingle: ImageVector
    get() {
        if (_ChevronDownSingle != null) {
            return _ChevronDownSingle!!
        }
        _ChevronDownSingle = ImageVector.Builder(
            name = "ChevronDownSingle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 7.224f)
                lineTo(11.498f, 17.722f)
                horizontalLineTo(12.502f)
                lineTo(23f, 7.224f)
                lineTo(22.021f, 6.27f)
                lineTo(12f, 14.708f)
                lineTo(1.979f, 6.27f)
                lineTo(1f, 7.224f)
                close()
            }
        }.build()

        return _ChevronDownSingle!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownSingle: ImageVector? = null