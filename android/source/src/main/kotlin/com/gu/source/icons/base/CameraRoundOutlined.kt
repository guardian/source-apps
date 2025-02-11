package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.CameraRoundOutlined: ImageVector
    get() {
        if (_CameraRoundOutlined != null) {
            return _CameraRoundOutlined!!
        }
        _CameraRoundOutlined = ImageVector.Builder(
            name = "CameraRoundOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(17f, 8.75f)
                horizontalLineTo(14.5f)
                lineTo(12.995f, 7.25f)
                horizontalLineTo(10.995f)
                lineTo(9.5f, 8.75f)
                horizontalLineTo(7f)
                lineTo(6.5f, 9.25f)
                verticalLineTo(15.25f)
                lineTo(7f, 15.75f)
                horizontalLineTo(17f)
                lineTo(17.5f, 15.25f)
                verticalLineTo(9.25f)
                lineTo(17f, 8.75f)
                close()
                moveTo(12f, 14.375f)
                curveTo(10.755f, 14.375f, 9.75f, 13.37f, 9.75f, 12.125f)
                curveTo(9.75f, 10.88f, 10.755f, 9.875f, 12f, 9.875f)
                curveTo(13.245f, 9.875f, 14.25f, 10.88f, 14.25f, 12.125f)
                curveTo(14.25f, 13.37f, 13.24f, 14.375f, 12f, 14.375f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 21.224f)
                curveTo(17.063f, 21.224f, 21.167f, 17.12f, 21.167f, 12.057f)
                curveTo(21.167f, 6.995f, 17.063f, 2.891f, 12f, 2.891f)
                curveTo(6.937f, 2.891f, 2.833f, 6.995f, 2.833f, 12.057f)
                curveTo(2.833f, 17.12f, 6.937f, 21.224f, 12f, 21.224f)
                close()
                moveTo(12f, 22.057f)
                curveTo(17.523f, 22.057f, 22f, 17.58f, 22f, 12.057f)
                curveTo(22f, 6.534f, 17.523f, 2.057f, 12f, 2.057f)
                curveTo(6.477f, 2.057f, 2f, 6.534f, 2f, 12.057f)
                curveTo(2f, 17.58f, 6.477f, 22.057f, 12f, 22.057f)
                close()
            }
        }.build()

        return _CameraRoundOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _CameraRoundOutlined: ImageVector? = null