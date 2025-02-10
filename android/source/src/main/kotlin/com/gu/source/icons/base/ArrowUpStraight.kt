package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowUpStraight: ImageVector
    get() {
        if (_ArrowUpStraight != null) {
            return _ArrowUpStraight!!
        }
        _ArrowUpStraight = ImageVector.Builder(
            name = "ArrowUpStraight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.956f, 23f)
                verticalLineTo(4.726f)
                lineTo(21.531f, 11.892f)
                lineTo(22.463f, 10.961f)
                lineTo(12.478f, 1f)
                horizontalLineTo(11.522f)
                lineTo(1.538f, 10.961f)
                lineTo(2.469f, 11.892f)
                lineTo(11.045f, 4.726f)
                verticalLineTo(23f)
                horizontalLineTo(12.956f)
                close()
            }
        }.build()

        return _ArrowUpStraight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpStraight: ImageVector? = null