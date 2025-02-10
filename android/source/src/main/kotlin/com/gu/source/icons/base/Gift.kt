package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(5.911f, 3.763f)
                lineTo(8.21f, 1f)
                lineTo(11.99f, 5.498f)
                lineTo(15.769f, 1f)
                lineTo(18.069f, 3.763f)
                lineTo(14.188f, 5.974f)
                lineTo(19.5f, 5.974f)
                lineTo(20.5f, 7.079f)
                verticalLineTo(12.716f)
                horizontalLineTo(13.1f)
                verticalLineTo(6.526f)
                horizontalLineTo(10.9f)
                verticalLineTo(12.716f)
                lineTo(3.5f, 12.716f)
                verticalLineTo(7.079f)
                lineTo(4.5f, 5.974f)
                lineTo(9.791f, 5.974f)
                lineTo(5.911f, 3.763f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(10.9f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(20.804f)
                lineTo(5.192f, 22f)
                horizontalLineTo(10.9f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(20f, 15f)
                horizontalLineTo(13.1f)
                verticalLineTo(22f)
                horizontalLineTo(18.621f)
                lineTo(20f, 20.787f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Gift!!
    }

@Suppress("ObjectPropertyName")
private var _Gift: ImageVector? = null