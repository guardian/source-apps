package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 6.5f)
                verticalLineTo(17.475f)
                lineTo(21.525f, 19.025f)
                horizontalLineTo(2.5f)
                lineTo(1f, 17.55f)
                verticalLineTo(6.5f)
                lineTo(2.5f, 5f)
                horizontalLineTo(7.475f)
                lineTo(9.975f, 2.5f)
                horizontalLineTo(14f)
                lineTo(16.5f, 5f)
                horizontalLineTo(21.525f)
                lineTo(23f, 6.5f)
                close()
                moveTo(12f, 16.25f)
                curveTo(14.5f, 16.25f, 16.525f, 14.25f, 16.525f, 11.775f)
                curveTo(16.525f, 9.275f, 14.5f, 7.275f, 12f, 7.275f)
                curveTo(9.5f, 7.275f, 7.5f, 9.275f, 7.5f, 11.775f)
                curveTo(7.5f, 14.25f, 9.5f, 16.25f, 12f, 16.25f)
                close()
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null