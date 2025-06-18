package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PadlockUnlocked: ImageVector
    get() {
        if (_PadlockUnlocked != null) {
            return _PadlockUnlocked!!
        }
        _PadlockUnlocked = ImageVector.Builder(
            name = "PadlockUnlocked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.5f, 7.903f)
                curveTo(9.5f, 6.653f, 10.527f, 5.625f, 11.813f, 5.625f)
                curveTo(13.098f, 5.625f, 14.125f, 6.653f, 14.125f, 7.903f)
                verticalLineTo(10.75f)
                horizontalLineTo(6.813f)
                lineTo(6f, 11.563f)
                verticalLineTo(19.813f)
                lineTo(6.813f, 20.625f)
                horizontalLineTo(16.813f)
                lineTo(17.625f, 19.813f)
                verticalLineTo(11.563f)
                lineTo(16.813f, 10.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(7.903f)
                curveTo(15.75f, 5.739f, 13.979f, 4f, 11.813f, 4f)
                curveTo(9.646f, 4f, 7.875f, 5.739f, 7.875f, 7.903f)
                verticalLineTo(9.128f)
                horizontalLineTo(9.5f)
                verticalLineTo(7.903f)
                close()
                moveTo(7.625f, 19f)
                verticalLineTo(12.375f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(7.625f)
                close()
            }
        }.build()

        return _PadlockUnlocked!!
    }

@Suppress("ObjectPropertyName")
private var _PadlockUnlocked: ImageVector? = null