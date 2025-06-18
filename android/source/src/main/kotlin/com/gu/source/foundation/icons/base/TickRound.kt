package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.TickRound: ImageVector
    get() {
        if (_TickRound != null) {
            return _TickRound!!
        }
        _TickRound = ImageVector.Builder(
            name = "TickRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(10.227f, 14.147f)
                lineTo(7.957f, 11.978f)
                lineTo(7.158f, 12.776f)
                lineTo(9.866f, 16.568f)
                horizontalLineTo(10.32f)
                lineTo(17.775f, 8.852f)
                lineTo(16.955f, 8.052f)
                lineTo(10.227f, 14.147f)
                close()
            }
        }.build()

        return _TickRound!!
    }

@Suppress("ObjectPropertyName")
private var _TickRound: ImageVector? = null