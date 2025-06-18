package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.InfoRound: ImageVector
    get() {
        if (_InfoRound != null) {
            return _InfoRound!!
        }
        _InfoRound = ImageVector.Builder(
            name = "InfoRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(12f, 2f)
                curveTo(6.467f, 2f, 2f, 6.467f, 2f, 12f)
                curveTo(2f, 17.533f, 6.467f, 22f, 12f, 22f)
                curveTo(17.533f, 22f, 22f, 17.533f, 22f, 12f)
                curveTo(22f, 6.467f, 17.533f, 2f, 12f, 2f)
                close()
                moveTo(13.133f, 15.933f)
                verticalLineTo(16.422f)
                curveTo(13.022f, 16.511f, 12.867f, 16.578f, 12.711f, 16.667f)
                curveTo(12.556f, 16.733f, 12.378f, 16.8f, 12.2f, 16.867f)
                curveTo(12.022f, 16.933f, 11.844f, 16.978f, 11.667f, 17f)
                curveTo(11.489f, 17.022f, 11.311f, 17.044f, 11.156f, 17.044f)
                curveTo(10.8f, 17.044f, 10.578f, 16.978f, 10.444f, 16.844f)
                curveTo(10.289f, 16.711f, 10.222f, 16.556f, 10.222f, 16.4f)
                curveTo(10.222f, 16.222f, 10.244f, 16.044f, 10.267f, 15.867f)
                curveTo(10.289f, 15.689f, 10.333f, 15.511f, 10.378f, 15.289f)
                lineTo(11.311f, 11.044f)
                lineTo(10.444f, 10.844f)
                verticalLineTo(10.378f)
                curveTo(10.578f, 10.333f, 10.756f, 10.267f, 11f, 10.2f)
                curveTo(11.222f, 10.133f, 11.467f, 10.089f, 11.733f, 10.044f)
                curveTo(12f, 10f, 12.244f, 9.956f, 12.489f, 9.933f)
                curveTo(12.733f, 9.911f, 12.956f, 9.889f, 13.156f, 9.889f)
                lineTo(13.4f, 10.044f)
                lineTo(12.156f, 15.933f)
                horizontalLineTo(13.133f)
                close()
                moveTo(13.556f, 8.467f)
                curveTo(13.356f, 8.644f, 13.067f, 8.733f, 12.733f, 8.733f)
                curveTo(12.422f, 8.733f, 12.156f, 8.644f, 11.933f, 8.467f)
                curveTo(11.733f, 8.289f, 11.622f, 8.067f, 11.622f, 7.778f)
                curveTo(11.622f, 7.467f, 11.733f, 7.222f, 11.933f, 7.044f)
                curveTo(12.133f, 6.867f, 12.4f, 6.778f, 12.733f, 6.778f)
                curveTo(13.089f, 6.778f, 13.356f, 6.867f, 13.556f, 7.044f)
                curveTo(13.756f, 7.222f, 13.867f, 7.467f, 13.867f, 7.778f)
                curveTo(13.844f, 8.067f, 13.756f, 8.289f, 13.556f, 8.467f)
                close()
            }
        }.build()

        return _InfoRound!!
    }

@Suppress("ObjectPropertyName")
private var _InfoRound: ImageVector? = null