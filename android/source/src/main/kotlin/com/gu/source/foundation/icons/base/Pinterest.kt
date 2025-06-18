package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Pinterest: ImageVector
    get() {
        if (_Pinterest != null) {
            return _Pinterest!!
        }
        _Pinterest = ImageVector.Builder(
            name = "Pinterest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(10.577f, 15.303f)
                curveTo(10.037f, 18.134f, 9.377f, 20.849f, 7.424f, 22.267f)
                curveTo(6.82f, 17.987f, 8.309f, 14.777f, 9f, 11.361f)
                curveTo(7.818f, 9.377f, 9.142f, 5.384f, 11.628f, 6.368f)
                curveTo(14.687f, 7.578f, 8.979f, 13.744f, 12.811f, 14.514f)
                curveTo(16.812f, 15.318f, 18.445f, 7.573f, 15.964f, 5.054f)
                curveTo(12.38f, 1.417f, 5.53f, 4.971f, 6.372f, 10.178f)
                curveTo(6.577f, 11.451f, 7.893f, 11.838f, 6.898f, 13.594f)
                curveTo(4.604f, 13.086f, 3.919f, 11.277f, 4.007f, 8.864f)
                curveTo(4.149f, 4.923f, 7.555f, 2.151f, 10.971f, 1.769f)
                curveTo(15.291f, 1.286f, 19.346f, 3.355f, 19.906f, 7.419f)
                curveTo(20.537f, 12.006f, 17.956f, 16.974f, 13.336f, 16.617f)
                curveTo(12.084f, 16.519f, 11.559f, 15.899f, 10.577f, 15.303f)
                close()
            }
        }.build()

        return _Pinterest!!
    }

@Suppress("ObjectPropertyName")
private var _Pinterest: ImageVector? = null