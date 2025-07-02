package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Facebook: ImageVector
    get() {
        if (_Facebook != null) {
            return _Facebook!!
        }
        _Facebook = ImageVector.Builder(
            name = "Facebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(9.575f, 6.125f)
                verticalLineTo(9.25f)
                horizontalLineTo(6.15f)
                verticalLineTo(12.7f)
                horizontalLineTo(9.575f)
                verticalLineTo(23f)
                horizontalLineTo(13.7f)
                verticalLineTo(12.7f)
                horizontalLineTo(17.075f)
                lineTo(17.825f, 9.25f)
                horizontalLineTo(13.7f)
                verticalLineTo(6.5f)
                curveTo(13.7f, 4.975f, 14.6f, 4.45f, 15.775f, 4.45f)
                horizontalLineTo(17.825f)
                lineTo(17.7f, 1.175f)
                curveTo(16.675f, 1.075f, 15.875f, 1f, 14.7f, 1f)
                curveTo(11.775f, 1f, 9.575f, 2.825f, 9.575f, 6.125f)
                close()
            }
        }.build()

        return _Facebook!!
    }

@Suppress("ObjectPropertyName")
private var _Facebook: ImageVector? = null