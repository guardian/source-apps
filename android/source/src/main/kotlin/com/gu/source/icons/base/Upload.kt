package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Upload: ImageVector
    get() {
        if (_Upload != null) {
            return _Upload!!
        }
        _Upload = ImageVector.Builder(
            name = "Upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.475f, 6.125f)
                lineTo(16.575f, 7f)
                lineTo(13f, 4.275f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(4.275f)
                lineTo(7.425f, 7f)
                lineTo(6.55f, 6.125f)
                lineTo(11.65f, 1f)
                horizontalLineTo(12.35f)
                lineTo(17.475f, 6.125f)
                close()
                moveTo(22f, 10f)
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
                lineTo(22f, 10f)
                close()
            }
        }.build()

        return _Upload!!
    }

@Suppress("ObjectPropertyName")
private var _Upload: ImageVector? = null