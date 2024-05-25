@file:Suppress("MagicNumber")

package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

/**
 * Check mark icon.
 */
val SourceIcon.Check: ImageVector
    get() = _check ?: Builder(
        name = "Check",
        defaultWidth = 24.0.dp,
        defaultHeight = 24.0.dp,
        viewportWidth = 24.0f,
        viewportHeight = 24.0f,
    ).apply {
        path(
            fill = SolidColor(Color(0xFFffffff)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = EvenOdd,
        ) {
            moveTo(3.0114f, 11.8835f)
            lineTo(2.0f, 12.8949f)
            lineTo(7.0569f, 19.9745f)
            horizontalLineTo(7.5373f)
            lineTo(22.0f, 5.0061f)
            lineTo(20.9886f, 4.02f)
            lineTo(7.5373f, 16.2071f)
            lineTo(3.0114f, 11.8835f)
            close()
        }
    }
        .build()
        .also { _check = it }

@Suppress("TopLevelPropertyNaming")
private var _check: ImageVector? = null