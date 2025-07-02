package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowOutdent: ImageVector
    get() {
        if (_ArrowOutdent != null) {
            return _ArrowOutdent!!
        }
        _ArrowOutdent = ImageVector.Builder(
            name = "ArrowOutdent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.262f, 11.462f)
                verticalLineTo(18.962f)
                horizontalLineTo(20.262f)
                verticalLineTo(10.488f)
                lineTo(19.237f, 9.462f)
                horizontalLineTo(6.987f)
                lineTo(9.737f, 5.937f)
                lineTo(8.887f, 5.037f)
                lineTo(3.737f, 10.163f)
                verticalLineTo(10.837f)
                lineTo(8.837f, 15.962f)
                lineTo(9.737f, 15.087f)
                lineTo(6.987f, 11.462f)
                horizontalLineTo(18.262f)
                close()
            }
        }.build()

        return _ArrowOutdent!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowOutdent: ImageVector? = null