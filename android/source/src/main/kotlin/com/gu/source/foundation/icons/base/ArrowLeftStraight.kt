package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowLeftStraight: ImageVector
    get() {
        if (_ArrowLeftStraight != null) {
            return _ArrowLeftStraight!!
        }
        _ArrowLeftStraight = ImageVector.Builder(
            name = "ArrowLeftStraight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(23f, 11.045f)
                horizontalLineTo(4.726f)
                lineTo(11.892f, 2.469f)
                lineTo(10.961f, 1.537f)
                lineTo(1f, 11.522f)
                verticalLineTo(12.478f)
                lineTo(10.961f, 22.462f)
                lineTo(11.892f, 21.531f)
                lineTo(4.726f, 12.955f)
                horizontalLineTo(23f)
                verticalLineTo(11.045f)
                close()
            }
        }.build()

        return _ArrowLeftStraight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftStraight: ImageVector? = null