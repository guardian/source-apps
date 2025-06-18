package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PersonRoundFilled: ImageVector
    get() {
        if (_PersonRoundFilled != null) {
            return _PersonRoundFilled!!
        }
        _PersonRoundFilled = ImageVector.Builder(
            name = "PersonRoundFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
                moveTo(12.033f, 12.358f)
                curveTo(13.16f, 12.358f, 14.505f, 11.092f, 14.505f, 9.534f)
                curveTo(14.505f, 7.975f, 13.592f, 7.063f, 12.033f, 7.063f)
                curveTo(10.475f, 7.063f, 9.558f, 7.975f, 9.558f, 9.534f)
                curveTo(9.558f, 11.092f, 11.016f, 12.358f, 12.033f, 12.358f)
                close()
                moveTo(17.572f, 19.282f)
                curveTo(16.028f, 20.464f, 14.098f, 21.167f, 12.004f, 21.167f)
                curveTo(9.926f, 21.167f, 8.01f, 20.476f, 6.473f, 19.311f)
                lineTo(7.662f, 14.856f)
                lineTo(8.287f, 14.231f)
                curveTo(9.509f, 13.821f, 10.675f, 13.607f, 12.028f, 13.607f)
                curveTo(13.382f, 13.607f, 14.552f, 13.83f, 15.77f, 14.231f)
                lineTo(16.395f, 14.856f)
                horizontalLineTo(16.39f)
                lineTo(17.572f, 19.282f)
                close()
            }
        }.build()

        return _PersonRoundFilled!!
    }

@Suppress("ObjectPropertyName")
private var _PersonRoundFilled: ImageVector? = null