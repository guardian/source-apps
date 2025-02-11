package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowUpAndDownSmall: ImageVector
    get() {
        if (_ArrowUpAndDownSmall != null) {
            return _ArrowUpAndDownSmall!!
        }
        _ArrowUpAndDownSmall = ImageVector.Builder(
            name = "ArrowUpAndDownSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.45f, 6.125f)
                lineTo(12.35f, 1f)
                horizontalLineTo(11.65f)
                lineTo(6.55f, 6.125f)
                lineTo(7.4f, 6.975f)
                lineTo(11f, 4.225f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(4.225f)
                lineTo(16.6f, 6.975f)
                lineTo(17.45f, 6.125f)
                close()
                moveTo(7.4f, 17f)
                lineTo(6.55f, 17.9f)
                lineTo(11.65f, 23f)
                horizontalLineTo(12.35f)
                lineTo(17.45f, 17.9f)
                lineTo(16.6f, 17f)
                lineTo(13f, 19.75f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(19.75f)
                lineTo(7.4f, 17f)
                close()
            }
        }.build()

        return _ArrowUpAndDownSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpAndDownSmall: ImageVector? = null