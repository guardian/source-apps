package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Indent: ImageVector
    get() {
        if (_Indent != null) {
            return _Indent!!
        }
        _Indent = ImageVector.Builder(
            name = "Indent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.025f, 11.5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(12.45f)
                lineTo(4.025f, 13.475f)
                horizontalLineTo(17.75f)
                lineTo(15f, 17.05f)
                lineTo(15.85f, 17.95f)
                lineTo(21f, 12.825f)
                verticalLineTo(12.15f)
                lineTo(15.9f, 7.025f)
                lineTo(15f, 7.9f)
                lineTo(17.75f, 11.5f)
                horizontalLineTo(5.025f)
                close()
            }
        }.build()

        return _Indent!!
    }

@Suppress("ObjectPropertyName")
private var _Indent: ImageVector? = null