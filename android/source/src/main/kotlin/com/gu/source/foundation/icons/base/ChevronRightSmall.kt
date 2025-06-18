package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronRightSmall: ImageVector
    get() {
        if (_ChevronRightSmall != null) {
            return _ChevronRightSmall!!
        }
        _ChevronRightSmall = ImageVector.Builder(
            name = "ChevronRightSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(8.6f, 5.9f)
                lineTo(13.607f, 12.015f)
                lineTo(8.605f, 18.1f)
                lineTo(9.5f, 19f)
                lineTo(16.149f, 12.351f)
                verticalLineTo(11.649f)
                lineTo(9.5f, 5f)
                lineTo(8.6f, 5.9f)
                close()
            }
        }.build()

        return _ChevronRightSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightSmall: ImageVector? = null