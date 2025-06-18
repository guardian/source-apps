package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PadlockLocked: ImageVector
    get() {
        if (_PadlockLocked != null) {
            return _PadlockLocked!!
        }
        _PadlockLocked = ImageVector.Builder(
            name = "PadlockLocked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.063f, 10.438f)
                verticalLineTo(7.591f)
                curveTo(8.063f, 5.427f, 9.834f, 3.688f, 12f, 3.688f)
                curveTo(14.166f, 3.688f, 15.938f, 5.427f, 15.938f, 7.591f)
                verticalLineTo(10.438f)
                horizontalLineTo(17f)
                lineTo(17.813f, 11.25f)
                verticalLineTo(19.5f)
                lineTo(17f, 20.313f)
                horizontalLineTo(7f)
                lineTo(6.188f, 19.5f)
                verticalLineTo(11.25f)
                lineTo(7f, 10.438f)
                horizontalLineTo(8.063f)
                close()
                moveTo(9.688f, 7.591f)
                curveTo(9.688f, 6.341f, 10.714f, 5.313f, 12f, 5.313f)
                curveTo(13.286f, 5.313f, 14.313f, 6.341f, 14.313f, 7.591f)
                verticalLineTo(10.438f)
                horizontalLineTo(9.688f)
                verticalLineTo(7.591f)
                close()
                moveTo(7.813f, 18.688f)
                verticalLineTo(12.063f)
                horizontalLineTo(16.188f)
                verticalLineTo(18.688f)
                horizontalLineTo(7.813f)
                close()
            }
        }.build()

        return _PadlockLocked!!
    }

@Suppress("ObjectPropertyName")
private var _PadlockLocked: ImageVector? = null