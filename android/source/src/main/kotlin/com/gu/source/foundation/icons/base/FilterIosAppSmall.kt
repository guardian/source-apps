package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.FilterIosAppSmall: ImageVector
    get() {
        if (_FilterIosAppSmall != null) {
            return _FilterIosAppSmall!!
        }
        _FilterIosAppSmall = ImageVector.Builder(
            name = "FilterIosAppSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(5.995f, 8.005f)
                horizontalLineTo(17.98f)
                verticalLineTo(9.505f)
                lineTo(13.48f, 14.015f)
                lineTo(13.5f, 14f)
                verticalLineTo(17f)
                lineTo(11.49f, 19.005f)
                lineTo(10.5f, 18f)
                verticalLineTo(14f)
                lineTo(5.995f, 9.505f)
                verticalLineTo(8.005f)
                close()
            }
        }.build()

        return _FilterIosAppSmall!!
    }

@Suppress("ObjectPropertyName")
private var _FilterIosAppSmall: ImageVector? = null