package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronLeftSingle: ImageVector
    get() {
        if (_ChevronLeftSingle != null) {
            return _ChevronLeftSingle!!
        }
        _ChevronLeftSingle = ImageVector.Builder(
            name = "ChevronLeftSingle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.471f, 1f)
                lineTo(5f, 11.471f)
                verticalLineTo(12.529f)
                lineTo(15.471f, 23f)
                lineTo(16.453f, 22.044f)
                lineTo(8.071f, 12f)
                lineTo(16.453f, 1.957f)
                lineTo(15.471f, 1f)
                close()
            }
        }.build()

        return _ChevronLeftSingle!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeftSingle: ImageVector? = null