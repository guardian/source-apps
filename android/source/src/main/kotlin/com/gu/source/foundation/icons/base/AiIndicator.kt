package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AiIndicator: ImageVector
    get() {
        if (_AiIndicator != null) {
            return _AiIndicator!!
        }
        _AiIndicator = ImageVector.Builder(
            name = "AiIndicator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(12.506f, 2f)
                curveTo(13.667f, 7.168f, 16.832f, 10.332f, 22f, 11.493f)
                verticalLineTo(12.506f)
                curveTo(16.832f, 13.667f, 13.667f, 16.832f, 12.506f, 22f)
                horizontalLineTo(11.494f)
                curveTo(10.333f, 16.832f, 7.168f, 13.667f, 2f, 12.506f)
                verticalLineTo(11.493f)
                curveTo(7.168f, 10.332f, 10.333f, 7.168f, 11.494f, 2f)
                horizontalLineTo(12.506f)
                close()
            }
        }.build()

        return _AiIndicator!!
    }

@Suppress("ObjectPropertyName")
private var _AiIndicator: ImageVector? = null