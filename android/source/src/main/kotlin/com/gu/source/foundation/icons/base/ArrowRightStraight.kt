package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowRightStraight: ImageVector
    get() {
        if (_ArrowRightStraight != null) {
            return _ArrowRightStraight!!
        }
        _ArrowRightStraight = ImageVector.Builder(
            name = "ArrowRightStraight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 12.955f)
                horizontalLineTo(19.274f)
                lineTo(12.108f, 21.531f)
                lineTo(13.039f, 22.463f)
                lineTo(23f, 12.478f)
                verticalLineTo(11.522f)
                lineTo(13.039f, 1.537f)
                lineTo(12.108f, 2.469f)
                lineTo(19.274f, 11.045f)
                horizontalLineTo(1f)
                verticalLineTo(12.955f)
                close()
            }
        }.build()

        return _ArrowRightStraight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightStraight: ImageVector? = null