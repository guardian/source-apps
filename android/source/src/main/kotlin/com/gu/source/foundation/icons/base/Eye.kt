package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Eye: ImageVector
    get() {
        if (_Eye != null) {
            return _Eye!!
        }
        _Eye = ImageVector.Builder(
            name = "Eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 4.9f)
                curveTo(16.875f, 4.9f, 23f, 11.375f, 23f, 11.375f)
                verticalLineTo(12.55f)
                curveTo(23f, 12.55f, 16.875f, 19.025f, 12f, 19.025f)
                curveTo(7.125f, 19.025f, 1f, 12.55f, 1f, 12.55f)
                verticalLineTo(11.375f)
                curveTo(1f, 11.375f, 7.125f, 4.9f, 12f, 4.9f)
                close()
                moveTo(12f, 16.675f)
                curveTo(14.6f, 16.675f, 16.725f, 14.575f, 16.725f, 11.975f)
                curveTo(16.725f, 9.35f, 14.6f, 7.25f, 12f, 7.25f)
                curveTo(9.4f, 7.25f, 7.275f, 9.35f, 7.275f, 11.975f)
                curveTo(7.275f, 14.575f, 9.4f, 16.675f, 12f, 16.675f)
                close()
                moveTo(12f, 10.4f)
                curveTo(12f, 11.25f, 12.7f, 11.975f, 13.575f, 11.975f)
                horizontalLineTo(14.35f)
                curveTo(14.35f, 13.275f, 13.3f, 14.325f, 12f, 14.325f)
                curveTo(10.7f, 14.325f, 9.65f, 13.275f, 9.65f, 11.975f)
                curveTo(9.65f, 10.65f, 10.7f, 9.6f, 12f, 9.6f)
                verticalLineTo(10.4f)
                close()
            }
        }.build()

        return _Eye!!
    }

@Suppress("ObjectPropertyName")
private var _Eye: ImageVector? = null