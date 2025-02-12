package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.CameraSmall: ImageVector
    get() {
        if (_CameraSmall != null) {
            return _CameraSmall!!
        }
        _CameraSmall = ImageVector.Builder(
            name = "CameraSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(17f, 8.5f)
                horizontalLineTo(14.5f)
                lineTo(12.995f, 7f)
                horizontalLineTo(10.995f)
                lineTo(9.5f, 8.5f)
                horizontalLineTo(7f)
                lineTo(6.5f, 9f)
                verticalLineTo(15f)
                lineTo(7f, 15.5f)
                horizontalLineTo(17f)
                lineTo(17.5f, 15f)
                verticalLineTo(9f)
                lineTo(17f, 8.5f)
                close()
                moveTo(12f, 14.125f)
                curveTo(10.755f, 14.125f, 9.75f, 13.12f, 9.75f, 11.875f)
                curveTo(9.75f, 10.63f, 10.755f, 9.625f, 12f, 9.625f)
                curveTo(13.245f, 9.625f, 14.25f, 10.63f, 14.25f, 11.875f)
                curveTo(14.25f, 13.12f, 13.24f, 14.125f, 12f, 14.125f)
                close()
            }
        }.build()

        return _CameraSmall!!
    }

@Suppress("ObjectPropertyName")
private var _CameraSmall: ImageVector? = null