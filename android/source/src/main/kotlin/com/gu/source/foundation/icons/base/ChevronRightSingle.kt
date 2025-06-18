package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ChevronRightSingle: ImageVector
    get() {
        if (_ChevronRightSingle != null) {
            return _ChevronRightSingle!!
        }
        _ChevronRightSingle = ImageVector.Builder(
            name = "ChevronRightSingle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.482f, 1f)
                lineTo(7.5f, 1.957f)
                lineTo(15.882f, 12f)
                lineTo(7.5f, 22.044f)
                lineTo(8.482f, 23f)
                lineTo(18.953f, 12.529f)
                verticalLineTo(11.471f)
                lineTo(8.482f, 1f)
                close()
            }
        }.build()

        return _ChevronRightSingle!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightSingle: ImageVector? = null