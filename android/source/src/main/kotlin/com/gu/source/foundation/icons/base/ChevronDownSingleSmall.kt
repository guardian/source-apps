package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronDownSingleSmall: ImageVector
    get() {
        if (_ChevronDownSingleSmall != null) {
            return _ChevronDownSingleSmall!!
        }
        _ChevronDownSingleSmall = ImageVector.Builder(
            name = "ChevronDownSingleSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(18.1f, 9.08f)
                lineTo(11.985f, 14.087f)
                lineTo(5.9f, 9.085f)
                lineTo(5f, 9.98f)
                lineTo(11.649f, 16.629f)
                horizontalLineTo(12.346f)
                lineTo(19f, 9.98f)
                lineTo(18.1f, 9.08f)
                close()
            }
        }.build()

        return _ChevronDownSingleSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownSingleSmall: ImageVector? = null