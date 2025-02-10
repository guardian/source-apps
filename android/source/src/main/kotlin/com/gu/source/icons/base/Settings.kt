package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Settings: ImageVector
    get() {
        if (_Settings != null) {
            return _Settings!!
        }
        _Settings = ImageVector.Builder(
            name = "Settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.705f, 14.195f)
                curveTo(20.531f, 15.018f, 20.156f, 15.841f, 19.782f, 16.54f)
                lineTo(20.955f, 18.435f)
                curveTo(20.256f, 19.358f, 19.383f, 20.231f, 18.485f, 20.905f)
                lineTo(16.59f, 19.683f)
                curveTo(15.816f, 20.107f, 15.068f, 20.431f, 14.245f, 20.705f)
                lineTo(13.771f, 22.825f)
                curveTo(13.197f, 22.925f, 12.649f, 23f, 12.025f, 23f)
                curveTo(11.451f, 23f, 10.803f, 22.925f, 10.279f, 22.825f)
                lineTo(9.805f, 20.655f)
                curveTo(8.982f, 20.431f, 8.159f, 20.107f, 7.46f, 19.683f)
                lineTo(5.565f, 20.905f)
                curveTo(4.642f, 20.206f, 3.769f, 19.358f, 3.095f, 18.435f)
                lineTo(4.317f, 16.515f)
                curveTo(3.893f, 15.841f, 3.569f, 15.018f, 3.345f, 14.195f)
                lineTo(1.175f, 13.721f)
                curveTo(1.075f, 13.197f, 1f, 12.549f, 1f, 11.975f)
                curveTo(1f, 11.351f, 1.075f, 10.803f, 1.175f, 10.229f)
                lineTo(3.345f, 9.755f)
                curveTo(3.569f, 8.932f, 3.893f, 8.159f, 4.317f, 7.41f)
                lineTo(3.095f, 5.515f)
                curveTo(3.769f, 4.617f, 4.642f, 3.744f, 5.565f, 3.045f)
                lineTo(7.46f, 4.218f)
                curveTo(8.159f, 3.844f, 8.982f, 3.469f, 9.805f, 3.295f)
                lineTo(10.279f, 1.075f)
                curveTo(10.803f, 1f, 11.451f, 1f, 12.025f, 1f)
                curveTo(12.599f, 1f, 13.197f, 1.025f, 13.771f, 1.075f)
                lineTo(14.245f, 3.295f)
                curveTo(15.068f, 3.469f, 15.816f, 3.844f, 16.59f, 4.218f)
                lineTo(18.485f, 3.045f)
                curveTo(19.408f, 3.769f, 20.231f, 4.592f, 20.955f, 5.515f)
                lineTo(19.782f, 7.41f)
                curveTo(20.156f, 8.134f, 20.531f, 8.932f, 20.705f, 9.755f)
                lineTo(22.925f, 10.229f)
                curveTo(22.975f, 10.803f, 23f, 11.401f, 23f, 11.975f)
                curveTo(23f, 12.574f, 22.975f, 13.147f, 22.925f, 13.721f)
                lineTo(20.705f, 14.195f)
                close()
                moveTo(12.025f, 19.034f)
                curveTo(15.916f, 19.034f, 19.084f, 15.866f, 19.084f, 11.975f)
                curveTo(19.084f, 8.084f, 15.916f, 4.916f, 12.025f, 4.916f)
                curveTo(8.134f, 4.916f, 4.966f, 8.084f, 4.966f, 11.975f)
                curveTo(4.966f, 15.866f, 8.134f, 19.034f, 12.025f, 19.034f)
                close()
            }
        }.build()

        return _Settings!!
    }

@Suppress("ObjectPropertyName")
private var _Settings: ImageVector? = null