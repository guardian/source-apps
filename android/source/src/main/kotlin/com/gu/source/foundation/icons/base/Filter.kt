package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Filter: ImageVector
    get() {
        if (_Filter != null) {
            return _Filter!!
        }
        _Filter = ImageVector.Builder(
            name = "Filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(4.5f)
                lineTo(6f, 3.5f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 4.5f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.5f)
                lineTo(8.5f, 12.5f)
                horizontalLineTo(6f)
                lineTo(5f, 11.5f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                close()
                moveTo(8f, 5f)
                horizontalLineTo(6.5f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                close()
                moveTo(16.5f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(15f)
                horizontalLineTo(16.5f)
                verticalLineTo(12.475f)
                lineTo(17.475f, 11.5f)
                horizontalLineTo(20f)
                lineTo(21f, 12.5f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(19.5f)
                lineTo(20f, 20.5f)
                horizontalLineTo(17.475f)
                lineTo(16.5f, 19.5f)
                verticalLineTo(17f)
                close()
                moveTo(19.5f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(19.5f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Filter!!
    }

@Suppress("ObjectPropertyName")
private var _Filter: ImageVector? = null