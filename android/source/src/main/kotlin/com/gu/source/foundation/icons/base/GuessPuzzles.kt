package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.GuessPuzzles: ImageVector
    get() {
        if (_GuessPuzzles != null) {
            return _GuessPuzzles!!
        }
        _GuessPuzzles = ImageVector.Builder(
            name = "GuessPuzzles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF1F3060))) {
                moveTo(2f, 3.285f)
                lineTo(3.283f, 2f)
                horizontalLineTo(20.717f)
                lineTo(22f, 3.285f)
                verticalLineTo(3.905f)
                horizontalLineTo(2f)
                verticalLineTo(3.285f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1F3060))) {
                moveTo(22f, 20.715f)
                lineTo(20.717f, 22f)
                horizontalLineTo(3.283f)
                lineTo(2f, 20.715f)
                verticalLineTo(20.095f)
                horizontalLineTo(22f)
                verticalLineTo(20.715f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1F3060))) {
                moveTo(4f, 3.905f)
                horizontalLineTo(2f)
                verticalLineTo(20.095f)
                horizontalLineTo(4f)
                verticalLineTo(3.905f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1F3060))) {
                moveTo(22f, 3.905f)
                horizontalLineTo(20f)
                verticalLineTo(20.095f)
                horizontalLineTo(22f)
                verticalLineTo(3.905f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1F3060))) {
                moveTo(11.351f, 7.339f)
                curveTo(11.252f, 7.339f, 11.154f, 7.344f, 11.055f, 7.354f)
                curveTo(10.957f, 7.365f, 10.873f, 7.375f, 10.804f, 7.386f)
                lineTo(10.273f, 9.44f)
                horizontalLineTo(9.062f)
                verticalLineTo(6.716f)
                curveTo(9.396f, 6.602f, 9.8f, 6.503f, 10.273f, 6.42f)
                curveTo(10.755f, 6.327f, 11.247f, 6.28f, 11.75f, 6.28f)
                curveTo(12.281f, 6.28f, 12.769f, 6.332f, 13.212f, 6.436f)
                curveTo(13.665f, 6.54f, 14.049f, 6.701f, 14.364f, 6.918f)
                curveTo(14.689f, 7.136f, 14.94f, 7.427f, 15.117f, 7.79f)
                curveTo(15.304f, 8.143f, 15.398f, 8.574f, 15.398f, 9.082f)
                curveTo(15.398f, 9.788f, 15.215f, 10.359f, 14.851f, 10.795f)
                curveTo(14.497f, 11.231f, 13.98f, 11.651f, 13.3f, 12.056f)
                curveTo(12.798f, 12.346f, 12.439f, 12.59f, 12.222f, 12.788f)
                curveTo(12.005f, 12.985f, 11.897f, 13.218f, 11.897f, 13.488f)
                curveTo(11.897f, 13.561f, 11.902f, 13.633f, 11.912f, 13.706f)
                curveTo(11.932f, 13.768f, 11.951f, 13.851f, 11.971f, 13.955f)
                horizontalLineTo(10.804f)
                curveTo(10.726f, 13.82f, 10.652f, 13.654f, 10.583f, 13.457f)
                curveTo(10.524f, 13.249f, 10.494f, 13.016f, 10.494f, 12.756f)
                curveTo(10.494f, 12.393f, 10.573f, 12.082f, 10.731f, 11.822f)
                curveTo(10.898f, 11.552f, 11.134f, 11.288f, 11.439f, 11.028f)
                curveTo(11.804f, 10.707f, 12.069f, 10.39f, 12.237f, 10.079f)
                curveTo(12.414f, 9.767f, 12.503f, 9.352f, 12.503f, 8.833f)
                curveTo(12.503f, 8.294f, 12.409f, 7.91f, 12.222f, 7.681f)
                curveTo(12.035f, 7.453f, 11.745f, 7.339f, 11.351f, 7.339f)
                close()
                moveTo(11.543f, 17.862f)
                curveTo(11.119f, 17.862f, 10.77f, 17.707f, 10.494f, 17.396f)
                curveTo(10.219f, 17.084f, 10.081f, 16.721f, 10.081f, 16.306f)
                curveTo(10.081f, 15.891f, 10.219f, 15.533f, 10.494f, 15.232f)
                curveTo(10.77f, 14.92f, 11.119f, 14.765f, 11.543f, 14.765f)
                curveTo(11.976f, 14.765f, 12.33f, 14.92f, 12.606f, 15.232f)
                curveTo(12.882f, 15.533f, 13.02f, 15.891f, 13.02f, 16.306f)
                curveTo(13.02f, 16.721f, 12.882f, 17.084f, 12.606f, 17.396f)
                curveTo(12.33f, 17.707f, 11.976f, 17.862f, 11.543f, 17.862f)
                close()
            }
        }.build()

        return _GuessPuzzles!!
    }

@Suppress("ObjectPropertyName")
private var _GuessPuzzles: ImageVector? = null