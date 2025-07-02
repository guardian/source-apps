package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HandPointed: ImageVector
    get() {
        if (_HandPointed != null) {
            return _HandPointed!!
        }
        _HandPointed = ImageVector.Builder(
            name = "HandPointed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12.001f, 1.723f)
                curveTo(9.304f, 1.723f, 6.832f, 2.672f, 4.834f, 4.195f)
                lineTo(4.31f, 3.671f)
                curveTo(6.133f, 1.448f, 8.88f, 0f, 12.001f, 0f)
                curveTo(15.123f, 0f, 17.87f, 1.448f, 19.693f, 3.671f)
                lineTo(19.168f, 4.195f)
                curveTo(17.17f, 2.672f, 14.698f, 1.723f, 12.001f, 1.723f)
                close()
                moveTo(19.018f, 13.01f)
                lineTo(17.52f, 22f)
                horizontalLineTo(10.503f)
                lineTo(9.504f, 19.028f)
                lineTo(5.284f, 14.359f)
                verticalLineTo(13.709f)
                lineTo(6.483f, 12.486f)
                lineTo(9.854f, 14.309f)
                lineTo(10.977f, 4.02f)
                horizontalLineTo(13f)
                lineTo(13.25f, 10.763f)
                lineTo(18.494f, 12.011f)
                lineTo(19.018f, 13.01f)
                close()
            }
        }.build()

        return _HandPointed!!
    }

@Suppress("ObjectPropertyName")
private var _HandPointed: ImageVector? = null