package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronUpSingle: ImageVector
    get() {
        if (_ChevronUpSingle != null) {
            return _ChevronUpSingle!!
        }
        _ChevronUpSingle = ImageVector.Builder(
            name = "ChevronUpSingle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 16.768f)
                lineTo(12.502f, 6.27f)
                horizontalLineTo(11.498f)
                lineTo(1f, 16.768f)
                lineTo(1.979f, 17.722f)
                lineTo(12f, 9.284f)
                lineTo(22.021f, 17.722f)
                lineTo(23f, 16.768f)
                close()
            }
        }.build()

        return _ChevronUpSingle!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpSingle: ImageVector? = null