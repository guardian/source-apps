package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronLeftSmall: ImageVector
    get() {
        if (_ChevronLeftSmall != null) {
            return _ChevronLeftSmall!!
        }
        _ChevronLeftSmall = ImageVector.Builder(
            name = "ChevronLeftSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(15.399f, 18.1f)
                lineTo(10.392f, 11.985f)
                lineTo(15.394f, 5.9f)
                lineTo(14.499f, 5f)
                lineTo(7.85f, 11.649f)
                lineTo(7.85f, 12.351f)
                lineTo(14.499f, 19f)
                lineTo(15.399f, 18.1f)
                close()
            }
        }.build()

        return _ChevronLeftSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeftSmall: ImageVector? = null