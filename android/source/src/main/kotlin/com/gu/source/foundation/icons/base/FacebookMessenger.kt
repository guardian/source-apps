package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.FacebookMessenger: ImageVector
    get() {
        if (_FacebookMessenger != null) {
            return _FacebookMessenger!!
        }
        _FacebookMessenger = ImageVector.Builder(
            name = "FacebookMessenger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.848f, 20.061f)
                curveTo(9.848f, 20.364f, 10.909f, 20.515f, 12f, 20.515f)
                curveTo(17.515f, 20.515f, 22f, 16.364f, 22f, 11.273f)
                curveTo(22f, 6.152f, 17.515f, 2f, 12f, 2f)
                curveTo(6.485f, 2f, 2f, 6.152f, 2f, 11.273f)
                curveTo(2f, 13.879f, 3.182f, 16.242f, 5.061f, 17.909f)
                verticalLineTo(22f)
                lineTo(8.848f, 20.061f)
                close()
                moveTo(10.485f, 11.758f)
                lineTo(13.061f, 14.424f)
                lineTo(18.515f, 8.697f)
                lineTo(13.545f, 11.424f)
                lineTo(10.97f, 8.758f)
                lineTo(5.515f, 14.485f)
                lineTo(10.485f, 11.758f)
                close()
            }
        }.build()

        return _FacebookMessenger!!
    }

@Suppress("ObjectPropertyName")
private var _FacebookMessenger: ImageVector? = null