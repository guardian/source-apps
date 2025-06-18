package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PlusOnRound: ImageVector
    get() {
        if (_PlusOnRound != null) {
            return _PlusOnRound!!
        }
        _PlusOnRound = ImageVector.Builder(
            name = "PlusOnRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 21.167f)
                curveTo(17.063f, 21.167f, 21.167f, 17.063f, 21.167f, 12f)
                curveTo(21.167f, 6.937f, 17.063f, 2.833f, 12f, 2.833f)
                curveTo(6.937f, 2.833f, 2.833f, 6.937f, 2.833f, 12f)
                curveTo(2.833f, 17.063f, 6.937f, 21.167f, 12f, 21.167f)
                close()
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(11.4f, 12.6f)
                lineTo(11.613f, 17.5f)
                horizontalLineTo(12.375f)
                lineTo(12.6f, 12.6f)
                lineTo(17.5f, 12.375f)
                verticalLineTo(11.613f)
                lineTo(12.6f, 11.4f)
                lineTo(12.375f, 6.5f)
                horizontalLineTo(11.613f)
                lineTo(11.4f, 11.4f)
                lineTo(6.5f, 11.613f)
                verticalLineTo(12.375f)
                lineTo(11.4f, 12.6f)
                close()
            }
        }.build()

        return _PlusOnRound!!
    }

@Suppress("ObjectPropertyName")
private var _PlusOnRound: ImageVector? = null