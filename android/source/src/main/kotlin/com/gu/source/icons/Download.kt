package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Download: ImageVector
    get() {
        if (_Download != null) {
            return _Download!!
        }
        _Download = ImageVector.Builder(
            name = "Download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.575f, 7f)
                lineTo(17.475f, 7.875f)
                lineTo(12.35f, 13f)
                horizontalLineTo(11.65f)
                lineTo(6.55f, 7.875f)
                lineTo(7.425f, 7f)
                lineTo(11f, 9.725f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(9.725f)
                lineTo(16.575f, 7f)
                close()
                moveTo(21f, 11f)
                lineTo(22f, 10f)
                horizontalLineTo(23f)
                verticalLineTo(19.975f)
                lineTo(21.975f, 21f)
                horizontalLineTo(1.975f)
                lineTo(1f, 19.975f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                lineTo(3f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _Download!!
    }

@Suppress("ObjectPropertyName")
private var _Download: ImageVector? = null