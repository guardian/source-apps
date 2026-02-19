package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.External: ImageVector
    get() {
        if (_External != null) {
            return _External!!
        }
        _External = ImageVector.Builder(
            name = "External",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(23f, 10.75f)
                horizontalLineTo(21.75f)
                lineTo(21.15f, 6.225f)
                lineTo(15.4f, 12f)
                lineTo(14f, 10.575f)
                lineTo(19.725f, 4.825f)
                lineTo(15.25f, 4.25f)
                verticalLineTo(3f)
                horizontalLineTo(22.525f)
                lineTo(23f, 3.475f)
                verticalLineTo(10.75f)
                close()
                moveTo(11f, 8f)
                lineTo(9.975f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                lineTo(19.975f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(19.975f)
                lineTo(19.975f, 21f)
                horizontalLineTo(1.975f)
                lineTo(1f, 19.975f)
                verticalLineTo(8f)
                lineTo(1.975f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _External!!
    }

@Suppress("ObjectPropertyName")
private var _External: ImageVector? = null