package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronUpSingleSmall: ImageVector
    get() {
        if (_ChevronUpSingleSmall != null) {
            return _ChevronUpSingleSmall!!
        }
        _ChevronUpSingleSmall = ImageVector.Builder(
            name = "ChevronUpSingleSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(5.9f, 15.044f)
                lineTo(12.015f, 10.037f)
                lineTo(18.1f, 15.039f)
                lineTo(19f, 14.144f)
                lineTo(12.351f, 7.495f)
                horizontalLineTo(11.649f)
                lineTo(5f, 14.144f)
                lineTo(5.9f, 15.044f)
                close()
            }
        }.build()

        return _ChevronUpSingleSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpSingleSmall: ImageVector? = null