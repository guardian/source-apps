package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Document: ImageVector
    get() {
        if (_Document != null) {
            return _Document!!
        }
        _Document = ImageVector.Builder(
            name = "Document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 21f)
                lineTo(19.025f, 22f)
                horizontalLineTo(5f)
                lineTo(4f, 21f)
                verticalLineTo(3f)
                lineTo(5f, 2f)
                horizontalLineTo(16.025f)
                lineTo(20f, 6f)
                verticalLineTo(21f)
                close()
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(9.5f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                close()
                moveTo(18f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(12.5f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                close()
                moveTo(13f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(15.5f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Document!!
    }

@Suppress("ObjectPropertyName")
private var _Document: ImageVector? = null