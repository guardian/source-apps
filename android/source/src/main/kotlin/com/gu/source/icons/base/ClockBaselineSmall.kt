package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ClockBaselineSmall: ImageVector
    get() {
        if (_ClockBaselineSmall != null) {
            return _ClockBaselineSmall!!
        }
        _ClockBaselineSmall = ImageVector.Builder(
            name = "ClockBaselineSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.975f, 4f)
                curveTo(16.95f, 4f, 21f, 8.05f, 21f, 13.025f)
                curveTo(21f, 18f, 16.95f, 22.025f, 11.975f, 22.025f)
                curveTo(7f, 22.025f, 3f, 18f, 3f, 13.025f)
                curveTo(3f, 8.05f, 7f, 4f, 11.975f, 4f)
                close()
                moveTo(11.375f, 5.65f)
                lineTo(10.75f, 13.325f)
                lineTo(12f, 14.375f)
                lineTo(18.35f, 13.85f)
                verticalLineTo(12.625f)
                lineTo(13.15f, 12.325f)
                lineTo(12.6f, 5.65f)
                horizontalLineTo(11.375f)
                close()
            }
        }.build()

        return _ClockBaselineSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ClockBaselineSmall: ImageVector? = null