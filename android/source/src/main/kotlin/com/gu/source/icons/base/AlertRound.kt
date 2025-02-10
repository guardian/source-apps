package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AlertRound: ImageVector
    get() {
        if (_AlertRound != null) {
            return _AlertRound!!
        }
        _AlertRound = ImageVector.Builder(
            name = "AlertRound",
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
                moveTo(11.295f, 13.818f)
                horizontalLineTo(12.682f)
                lineTo(13.341f, 5.182f)
                lineTo(12.432f, 4.273f)
                horizontalLineTo(11.545f)
                lineTo(10.636f, 5.182f)
                lineTo(11.295f, 13.818f)
                close()
                moveTo(13.364f, 17.455f)
                curveTo(13.364f, 16.705f, 12.75f, 16.091f, 12f, 16.091f)
                curveTo(11.25f, 16.091f, 10.636f, 16.705f, 10.636f, 17.455f)
                curveTo(10.636f, 18.205f, 11.25f, 18.818f, 12f, 18.818f)
                curveTo(12.75f, 18.818f, 13.364f, 18.205f, 13.364f, 17.455f)
                close()
            }
        }.build()

        return _AlertRound!!
    }

@Suppress("ObjectPropertyName")
private var _AlertRound: ImageVector? = null