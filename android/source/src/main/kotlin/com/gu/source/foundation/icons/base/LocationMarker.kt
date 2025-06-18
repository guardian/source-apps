package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.LocationMarker: ImageVector
    get() {
        if (_LocationMarker != null) {
            return _LocationMarker!!
        }
        _LocationMarker = ImageVector.Builder(
            name = "LocationMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18f, 7f)
                curveTo(18f, 7.825f, 17.85f, 8.7f, 17.5f, 9.65f)
                lineTo(12.5f, 23f)
                horizontalLineTo(11.5f)
                lineTo(6.55f, 9.6f)
                curveTo(6.25f, 8.8f, 6f, 7.875f, 6f, 7f)
                curveTo(6f, 3.7f, 8.7f, 1f, 12f, 1f)
                curveTo(15.3f, 1f, 18f, 3.7f, 18f, 7f)
                close()
                moveTo(7.75f, 7f)
                curveTo(7.75f, 9.325f, 9.675f, 11.25f, 12f, 11.25f)
                curveTo(14.325f, 11.25f, 16.25f, 9.325f, 16.25f, 7f)
                curveTo(16.25f, 4.675f, 14.325f, 2.75f, 12f, 2.75f)
                curveTo(9.675f, 2.75f, 7.75f, 4.675f, 7.75f, 7f)
                close()
            }
        }.build()

        return _LocationMarker!!
    }

@Suppress("ObjectPropertyName")
private var _LocationMarker: ImageVector? = null