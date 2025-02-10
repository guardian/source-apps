package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.BookmarkCross: ImageVector
    get() {
        if (_BookmarkCross != null) {
            return _BookmarkCross!!
        }
        _BookmarkCross = ImageVector.Builder(
            name = "BookmarkCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 5.541f)
                lineTo(14.937f, 6.5f)
                lineTo(16.989f, 4.448f)
                lineTo(19.063f, 6.5f)
                lineTo(20f, 5.585f)
                lineTo(17.926f, 3.511f)
                lineTo(20f, 1.437f)
                lineTo(19.041f, 0.5f)
                lineTo(16.966f, 2.574f)
                lineTo(14.937f, 0.522f)
                lineTo(14.022f, 1.459f)
                lineTo(16.052f, 3.489f)
                lineTo(14f, 5.541f)
                close()
                moveTo(8.375f, 3.013f)
                lineTo(11.521f, 3.007f)
                curveTo(11.507f, 3.165f, 11.5f, 3.325f, 11.5f, 3.487f)
                curveTo(11.5f, 6.518f, 13.957f, 8.7f, 16.987f, 8.7f)
                lineTo(16.996f, 8.7f)
                verticalLineTo(21.329f)
                lineTo(16.529f, 21.629f)
                lineTo(12f, 19.029f)
                lineTo(7.467f, 21.629f)
                lineTo(7f, 21.333f)
                verticalLineTo(4.375f)
                lineTo(8.375f, 3.013f)
                close()
            }
        }.build()

        return _BookmarkCross!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkCross: ImageVector? = null