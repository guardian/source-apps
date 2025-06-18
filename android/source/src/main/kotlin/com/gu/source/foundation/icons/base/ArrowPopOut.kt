package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowPopOut: ImageVector
    get() {
        if (_ArrowPopOut != null) {
            return _ArrowPopOut!!
        }
        _ArrowPopOut = ImageVector.Builder(
            name = "ArrowPopOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(23f, 2.975f)
                lineTo(22.525f, 2.5f)
                horizontalLineTo(15.25f)
                verticalLineTo(3.75f)
                lineTo(19.725f, 4.325f)
                lineTo(14f, 10.075f)
                lineTo(15.4f, 11.5f)
                lineTo(21.15f, 5.725f)
                lineTo(21.75f, 10.25f)
                horizontalLineTo(23f)
                verticalLineTo(2.975f)
                close()
                moveTo(11f, 8.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(1f)
                verticalLineTo(8.5f)
                horizontalLineTo(11f)
                close()
                moveTo(9f, 12.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(1f)
                verticalLineTo(12.5f)
                horizontalLineTo(9f)
                close()
                moveTo(15f, 16.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(1f)
                verticalLineTo(16.5f)
                horizontalLineTo(15f)
                close()
                moveTo(11f, 20.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(1f)
                verticalLineTo(20.5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _ArrowPopOut!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowPopOut: ImageVector? = null