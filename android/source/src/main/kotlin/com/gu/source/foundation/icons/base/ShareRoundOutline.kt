package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ShareRoundOutline: ImageVector
    get() {
        if (_ShareRoundOutline != null) {
            return _ShareRoundOutline!!
        }
        _ShareRoundOutline = ImageVector.Builder(
            name = "ShareRoundOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(21.167f, 12f)
                curveTo(21.167f, 17.063f, 17.063f, 21.167f, 12f, 21.167f)
                curveTo(6.937f, 21.167f, 2.833f, 17.063f, 2.833f, 12f)
                curveTo(2.833f, 6.937f, 6.937f, 2.833f, 12f, 2.833f)
                curveTo(17.063f, 2.833f, 21.167f, 6.937f, 21.167f, 12f)
                close()
                moveTo(22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
                moveTo(14.167f, 9.632f)
                lineTo(14.593f, 9.217f)
                lineTo(12.166f, 6.79f)
                horizontalLineTo(11.834f)
                lineTo(9.418f, 9.217f)
                lineTo(9.833f, 9.632f)
                lineTo(11.526f, 8.341f)
                verticalLineTo(12.474f)
                horizontalLineTo(12.474f)
                verticalLineTo(8.341f)
                lineTo(14.167f, 9.632f)
                close()
                moveTo(17.211f, 11.053f)
                horizontalLineTo(16.737f)
                lineTo(16.263f, 11.526f)
                verticalLineTo(15.316f)
                horizontalLineTo(7.737f)
                verticalLineTo(11.526f)
                lineTo(7.263f, 11.053f)
                horizontalLineTo(6.79f)
                verticalLineTo(15.778f)
                lineTo(7.251f, 16.263f)
                horizontalLineTo(16.725f)
                lineTo(17.211f, 15.778f)
                verticalLineTo(11.053f)
                close()
            }
        }.build()

        return _ShareRoundOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShareRoundOutline: ImageVector? = null