package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.NotificationsOff: ImageVector
    get() {
        if (_NotificationsOff != null) {
            return _NotificationsOff!!
        }
        _NotificationsOff = ImageVector.Builder(
            name = "NotificationsOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.672f, 11.924f)
                curveTo(1.672f, 14.58f, 2.607f, 17.014f, 4.107f, 18.981f)
                lineTo(3.59f, 19.497f)
                curveTo(1.402f, 17.702f, 0f, 14.998f, 0f, 11.924f)
                curveTo(0f, 8.85f, 1.402f, 6.145f, 3.59f, 4.35f)
                lineTo(4.107f, 4.866f)
                curveTo(2.607f, 6.834f, 1.672f, 9.268f, 1.672f, 11.924f)
                close()
                moveTo(22.279f, 11.924f)
                curveTo(22.279f, 9.268f, 21.418f, 6.834f, 19.844f, 4.866f)
                lineTo(20.41f, 4.35f)
                curveTo(22.598f, 6.145f, 24f, 8.85f, 24f, 11.924f)
                curveTo(24f, 14.998f, 22.598f, 17.702f, 20.41f, 19.497f)
                lineTo(19.844f, 18.981f)
                curveTo(21.418f, 17.014f, 22.279f, 14.58f, 22.279f, 11.924f)
                close()
                moveTo(5.189f, 11.924f)
                curveTo(5.189f, 13.498f, 5.656f, 14.899f, 6.467f, 16.055f)
                lineTo(5.803f, 16.694f)
                curveTo(4.549f, 15.44f, 3.836f, 13.793f, 3.836f, 11.924f)
                curveTo(3.836f, 10.055f, 4.549f, 8.334f, 5.803f, 7.153f)
                lineTo(6.467f, 7.768f)
                curveTo(5.656f, 8.948f, 5.189f, 10.35f, 5.189f, 11.924f)
                close()
                moveTo(18.811f, 11.924f)
                curveTo(18.811f, 10.35f, 18.344f, 8.948f, 17.557f, 7.768f)
                lineTo(18.172f, 7.153f)
                curveTo(19.426f, 8.334f, 20.164f, 10.055f, 20.164f, 11.924f)
                curveTo(20.164f, 13.793f, 19.426f, 15.44f, 18.172f, 16.694f)
                lineTo(17.557f, 16.055f)
                curveTo(18.344f, 14.899f, 18.811f, 13.498f, 18.811f, 11.924f)
                close()
                moveTo(15.934f, 11.924f)
                curveTo(15.934f, 14.112f, 14.189f, 15.858f, 12f, 15.858f)
                curveTo(9.811f, 15.858f, 8.066f, 14.112f, 8.066f, 11.924f)
                curveTo(8.066f, 9.735f, 9.811f, 7.989f, 12f, 7.989f)
                curveTo(14.189f, 7.989f, 15.934f, 9.735f, 15.934f, 11.924f)
                close()
                moveTo(14.459f, 11.924f)
                curveTo(14.459f, 10.571f, 13.328f, 9.465f, 12f, 9.465f)
                curveTo(10.598f, 9.465f, 9.541f, 10.571f, 9.541f, 11.924f)
                curveTo(9.541f, 13.276f, 10.598f, 14.383f, 12f, 14.383f)
                curveTo(13.328f, 14.383f, 14.459f, 13.276f, 14.459f, 11.924f)
                close()
            }
        }.build()

        return _NotificationsOff!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationsOff: ImageVector? = null