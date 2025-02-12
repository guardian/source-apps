package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Plus: ImageVector
    get() {
        if (_Plus != null) {
            return _Plus!!
        }
        _Plus = ImageVector.Builder(
            name = "Plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.8f, 13.2f)
                lineTo(11.225f, 23f)
                horizontalLineTo(12.75f)
                lineTo(13.2f, 13.2f)
                lineTo(23f, 12.75f)
                verticalLineTo(11.225f)
                lineTo(13.2f, 10.8f)
                lineTo(12.75f, 1f)
                horizontalLineTo(11.225f)
                lineTo(10.8f, 10.8f)
                lineTo(1f, 11.225f)
                verticalLineTo(12.75f)
                lineTo(10.8f, 13.2f)
                close()
            }
        }.build()

        return _Plus!!
    }

@Suppress("ObjectPropertyName")
private var _Plus: ImageVector? = null