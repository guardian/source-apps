package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AlarmClockSounded: ImageVector
    get() {
        if (_AlarmClockSounded != null) {
            return _AlarmClockSounded!!
        }
        _AlarmClockSounded = ImageVector.Builder(
            name = "AlarmClockSounded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(6.549f, 7.245f)
                lineTo(6.547f, 7.243f)
                lineTo(9.018f, 5.365f)
                curveTo(8.503f, 4.685f, 7.523f, 4.555f, 6.844f, 5.07f)
                curveTo(6.165f, 5.584f, 6.029f, 6.558f, 6.547f, 7.243f)
                lineTo(6.544f, 7.245f)
                horizontalLineTo(6.549f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(17.441f, 7.245f)
                lineTo(17.443f, 7.243f)
                lineTo(17.446f, 7.245f)
                horizontalLineTo(17.441f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(17.443f, 7.243f)
                lineTo(14.972f, 5.365f)
                curveTo(15.487f, 4.685f, 16.466f, 4.555f, 17.146f, 5.07f)
                curveTo(17.826f, 5.584f, 17.961f, 6.558f, 17.443f, 7.243f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(21.186f, 16.985f)
                curveTo(22.22f, 15.655f, 22.84f, 13.985f, 22.84f, 12.17f)
                curveTo(22.84f, 10.355f, 22.22f, 8.685f, 21.186f, 7.355f)
                lineTo(21.551f, 6.99f)
                curveTo(23.045f, 8.22f, 24f, 10.08f, 24f, 12.17f)
                curveTo(24f, 14.26f, 23.045f, 16.12f, 21.551f, 17.35f)
                lineTo(21.186f, 16.985f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(20.466f, 12.18f)
                curveTo(20.466f, 13.36f, 20.106f, 14.46f, 19.496f, 15.37f)
                lineTo(19.986f, 15.86f)
                curveTo(20.926f, 14.92f, 21.51f, 13.62f, 21.51f, 12.18f)
                curveTo(21.51f, 10.74f, 20.931f, 9.445f, 19.986f, 8.5f)
                lineTo(19.496f, 8.99f)
                curveTo(20.111f, 9.9f, 20.466f, 11f, 20.466f, 12.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(2.764f, 16.905f)
                curveTo(1.746f, 15.596f, 1.136f, 13.958f, 1.135f, 12.175f)
                curveTo(1.136f, 10.392f, 1.751f, 8.754f, 2.764f, 7.445f)
                lineTo(2.405f, 7.085f)
                curveTo(0.935f, 8.29f, 0f, 10.125f, 0f, 12.175f)
                curveTo(0f, 14.225f, 0.935f, 16.055f, 2.405f, 17.265f)
                lineTo(2.764f, 16.905f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(3.529f, 12.18f)
                curveTo(3.529f, 13.36f, 3.889f, 14.46f, 4.499f, 15.37f)
                lineTo(4.009f, 15.86f)
                curveTo(3.069f, 14.92f, 2.484f, 13.62f, 2.484f, 12.18f)
                curveTo(2.484f, 10.745f, 3.064f, 9.445f, 4.009f, 8.5f)
                lineTo(4.499f, 8.99f)
                curveTo(3.884f, 9.9f, 3.529f, 11f, 3.529f, 12.18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.007f, 5.525f)
                curveTo(8.423f, 5.525f, 5.524f, 8.43f, 5.524f, 12.01f)
                curveTo(5.524f, 13.573f, 6.077f, 15.007f, 6.999f, 16.127f)
                lineTo(5.754f, 17.8f)
                lineTo(6.209f, 18.255f)
                lineTo(7.877f, 17.008f)
                curveTo(8.999f, 17.937f, 10.438f, 18.495f, 12.007f, 18.495f)
                curveTo(13.546f, 18.495f, 14.959f, 17.958f, 16.071f, 17.063f)
                lineTo(17.666f, 18.255f)
                lineTo(18.121f, 17.8f)
                lineTo(16.94f, 16.218f)
                curveTo(17.907f, 15.085f, 18.491f, 13.616f, 18.491f, 12.01f)
                curveTo(18.491f, 8.43f, 15.587f, 5.525f, 12.007f, 5.525f)
                close()
                moveTo(16.277f, 12.855f)
                lineTo(11.887f, 13.295f)
                lineTo(11.028f, 12.425f)
                lineTo(11.538f, 7.1f)
                horizontalLineTo(12.212f)
                lineTo(12.682f, 11.945f)
                lineTo(16.277f, 12.18f)
                verticalLineTo(12.855f)
                close()
            }
        }.build()

        return _AlarmClockSounded!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClockSounded: ImageVector? = null