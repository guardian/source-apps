package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Crosswords: ImageVector
    get() {
        if (_Crosswords != null) {
            return _Crosswords!!
        }
        _Crosswords = ImageVector.Builder(
            name = "Crosswords",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 20.5f)
                lineTo(20.5f, 21f)
                horizontalLineTo(3.5f)
                lineTo(3f, 20.5f)
                verticalLineTo(3.5f)
                lineTo(3.5f, 3f)
                horizontalLineTo(20.5f)
                lineTo(21f, 3.5f)
                verticalLineTo(20.5f)
                close()
                moveTo(11.5f, 4.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(19.5f, 11.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(19.5f)
                close()
                moveTo(5.225f, 8.05f)
                verticalLineTo(7.65f)
                horizontalLineTo(5.725f)
                verticalLineTo(5.825f)
                lineTo(5.2f, 5.9f)
                verticalLineTo(5.55f)
                lineTo(5.975f, 5.2f)
                horizontalLineTo(6.275f)
                verticalLineTo(7.65f)
                horizontalLineTo(6.775f)
                verticalLineTo(8.05f)
                horizontalLineTo(5.225f)
                close()
                moveTo(11.5f, 12.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(12.5f)
                close()
            }
        }.build()

        return _Crosswords!!
    }

@Suppress("ObjectPropertyName")
private var _Crosswords: ImageVector? = null