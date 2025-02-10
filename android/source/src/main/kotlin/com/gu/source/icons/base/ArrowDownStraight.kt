package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowDownStraight: ImageVector
    get() {
        if (_ArrowDownStraight != null) {
            return _ArrowDownStraight!!
        }
        _ArrowDownStraight = ImageVector.Builder(
            name = "ArrowDownStraight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.045f, 1f)
                lineTo(11.045f, 19.274f)
                lineTo(2.469f, 12.108f)
                lineTo(1.538f, 13.039f)
                lineTo(11.523f, 23f)
                lineTo(12.478f, 23f)
                lineTo(22.463f, 13.039f)
                lineTo(21.531f, 12.108f)
                lineTo(12.956f, 19.274f)
                lineTo(12.956f, 1f)
                lineTo(11.045f, 1f)
                close()
            }
        }.build()

        return _ArrowDownStraight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownStraight: ImageVector? = null