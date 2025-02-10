package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowExpand: ImageVector
    get() {
        if (_ArrowExpand != null) {
            return _ArrowExpand!!
        }
        _ArrowExpand = ImageVector.Builder(
            name = "ArrowExpand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 8.75f)
                verticalLineTo(1.5f)
                lineTo(22.5f, 1f)
                horizontalLineTo(15.25f)
                verticalLineTo(2.25f)
                lineTo(19.75f, 2.85f)
                lineTo(14f, 8.575f)
                lineTo(15.4f, 10f)
                lineTo(21.15f, 4.275f)
                lineTo(21.75f, 8.75f)
                horizontalLineTo(23f)
                close()
                moveTo(1f, 15.25f)
                verticalLineTo(22.5f)
                lineTo(1.475f, 23f)
                horizontalLineTo(8.725f)
                verticalLineTo(21.75f)
                lineTo(4.25f, 21.15f)
                lineTo(9.975f, 15.375f)
                lineTo(8.6f, 14f)
                lineTo(2.825f, 19.725f)
                lineTo(2.25f, 15.25f)
                horizontalLineTo(1f)
                close()
            }
        }.build()

        return _ArrowExpand!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpand: ImageVector? = null