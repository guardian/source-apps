package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Envelope: ImageVector
    get() {
        if (_Envelope != null) {
            return _Envelope!!
        }
        _Envelope = ImageVector.Builder(
            name = "Envelope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(2.571f, 4f)
                lineTo(1f, 5.699f)
                lineTo(10.952f, 13.625f)
                horizontalLineTo(13.048f)
                lineTo(23f, 5.699f)
                lineTo(21.429f, 4f)
                horizontalLineTo(2.571f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(1f, 17.625f)
                verticalLineTo(8.125f)
                lineTo(10.952f, 15.125f)
                horizontalLineTo(13.048f)
                lineTo(23f, 8.125f)
                verticalLineTo(17.625f)
                lineTo(21.429f, 19.125f)
                horizontalLineTo(2.571f)
                lineTo(1f, 17.625f)
                close()
            }
        }.build()

        return _Envelope!!
    }

@Suppress("ObjectPropertyName")
private var _Envelope: ImageVector? = null