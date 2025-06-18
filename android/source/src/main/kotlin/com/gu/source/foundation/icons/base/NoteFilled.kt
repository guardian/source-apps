package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.NoteFilled: ImageVector
    get() {
        if (_NoteFilled != null) {
            return _NoteFilled!!
        }
        _NoteFilled = ImageVector.Builder(
            name = "NoteFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.625f, 9.683f)
                verticalLineTo(6.25f)
                lineTo(16.25f, 2.838f)
                lineTo(7.25f, 2.875f)
                lineTo(6.375f, 3.75f)
                verticalLineTo(20.25f)
                lineTo(7.25f, 21.125f)
                horizontalLineTo(18.75f)
                lineTo(19.625f, 20.25f)
                verticalLineTo(12.042f)
                lineTo(16.063f, 15.604f)
                lineTo(14.883f, 14.425f)
                lineTo(19.625f, 9.683f)
                close()
                moveTo(16.321f, 9.5f)
                horizontalLineTo(8.821f)
                verticalLineTo(10.75f)
                horizontalLineTo(16.321f)
                verticalLineTo(9.5f)
                close()
                moveTo(14.238f, 12.417f)
                horizontalLineTo(8.821f)
                verticalLineTo(13.667f)
                horizontalLineTo(14.238f)
                verticalLineTo(12.417f)
                close()
                moveTo(12.571f, 15.333f)
                horizontalLineTo(8.821f)
                verticalLineTo(16.583f)
                horizontalLineTo(12.571f)
                verticalLineTo(15.333f)
                close()
                moveTo(14.067f, 16.75f)
                lineTo(13.771f, 16.458f)
                lineTo(14.483f, 14.863f)
                lineTo(15.663f, 16.038f)
                lineTo(14.067f, 16.75f)
                close()
            }
        }.build()

        return _NoteFilled!!
    }

@Suppress("ObjectPropertyName")
private var _NoteFilled: ImageVector? = null