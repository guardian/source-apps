package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ShareApp: ImageVector
    get() {
        if (_ShareApp != null) {
            return _ShareApp!!
        }
        _ShareApp = ImageVector.Builder(
            name = "ShareApp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(11.125f, 3.125f)
                verticalLineTo(12f)
                horizontalLineTo(12.875f)
                verticalLineTo(3.125f)
                lineTo(16.558f, 6.015f)
                lineTo(17.438f, 5.13f)
                lineTo(12.313f, 0f)
                horizontalLineTo(11.623f)
                lineTo(6.497f, 5.13f)
                lineTo(7.377f, 6.01f)
                lineTo(11.125f, 3.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(19.125f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(9.625f)
                horizontalLineTo(18.375f)
                verticalLineTo(20.375f)
                horizontalLineTo(5.625f)
                verticalLineTo(9.625f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(4.875f)
                lineTo(4f, 9f)
                verticalLineTo(21.125f)
                lineTo(4.875f, 22f)
                horizontalLineTo(19.125f)
                lineTo(20f, 21.125f)
                verticalLineTo(8.875f)
                lineTo(19.125f, 8f)
                close()
            }
        }.build()

        return _ShareApp!!
    }

@Suppress("ObjectPropertyName")
private var _ShareApp: ImageVector? = null