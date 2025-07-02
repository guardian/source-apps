package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.CrossSmall: ImageVector
    get() {
        if (_CrossSmall != null) {
            return _CrossSmall!!
        }
        _CrossSmall = ImageVector.Builder(
            name = "CrossSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(16.356f, 6.862f)
                lineTo(17.138f, 7.643f)
                lineTo(13.165f, 12f)
                lineTo(17.138f, 16.358f)
                lineTo(16.356f, 17.139f)
                lineTo(12.007f, 13.156f)
                lineTo(7.643f, 17.123f)
                lineTo(6.861f, 16.343f)
                lineTo(10.849f, 12f)
                lineTo(6.861f, 7.658f)
                lineTo(7.643f, 6.877f)
                lineTo(12.007f, 10.844f)
                lineTo(16.356f, 6.862f)
                close()
            }
        }.build()

        return _CrossSmall!!
    }

@Suppress("ObjectPropertyName")
private var _CrossSmall: ImageVector? = null