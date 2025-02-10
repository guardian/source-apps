package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowUpStraightSmall: ImageVector
    get() {
        if (_ArrowUpStraightSmall != null) {
            return _ArrowUpStraightSmall!!
        }
        _ArrowUpStraightSmall = ImageVector.Builder(
            name = "ArrowUpStraightSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.175f, 10.85f)
                lineTo(12.325f, 5f)
                horizontalLineTo(11.625f)
                lineTo(5.8f, 10.85f)
                lineTo(6.675f, 11.725f)
                lineTo(10.975f, 8.275f)
                verticalLineTo(19f)
                horizontalLineTo(12.975f)
                verticalLineTo(8.275f)
                lineTo(17.275f, 11.725f)
                lineTo(18.175f, 10.85f)
                close()
            }
        }.build()

        return _ArrowUpStraightSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpStraightSmall: ImageVector? = null