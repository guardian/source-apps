package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Padlock: ImageVector
    get() {
        if (_Padlock != null) {
            return _Padlock!!
        }
        _Padlock = ImageVector.Builder(
            name = "Padlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.753f, 6.957f)
                curveTo(7.753f, 4.607f, 9.658f, 2.702f, 12.009f, 2.702f)
                curveTo(14.359f, 2.702f, 16.264f, 4.607f, 16.264f, 6.957f)
                horizontalLineTo(17.966f)
                curveTo(17.966f, 3.667f, 15.299f, 1f, 12.009f, 1f)
                curveTo(8.718f, 1f, 6.051f, 3.667f, 6.051f, 6.957f)
                horizontalLineTo(7.753f)
                close()
                moveTo(6.051f, 6.957f)
                lineTo(6.051f, 9.085f)
                lineTo(5.2f, 9.936f)
                verticalLineTo(20.149f)
                lineTo(6.051f, 21f)
                horizontalLineTo(17.966f)
                lineTo(18.817f, 20.149f)
                verticalLineTo(9.936f)
                lineTo(17.966f, 9.085f)
                verticalLineTo(6.957f)
                horizontalLineTo(16.264f)
                verticalLineTo(9.085f)
                horizontalLineTo(7.753f)
                verticalLineTo(6.957f)
                horizontalLineTo(6.051f)
                close()
                moveTo(13.285f, 13.766f)
                curveTo(13.285f, 14.322f, 12.93f, 14.795f, 12.434f, 14.97f)
                verticalLineTo(16.745f)
                horizontalLineTo(11.583f)
                verticalLineTo(14.97f)
                curveTo(11.087f, 14.795f, 10.732f, 14.322f, 10.732f, 13.766f)
                curveTo(10.732f, 13.061f, 11.303f, 12.489f, 12.008f, 12.489f)
                curveTo(12.714f, 12.489f, 13.285f, 13.061f, 13.285f, 13.766f)
                close()
            }
        }.build()

        return _Padlock!!
    }

@Suppress("ObjectPropertyName")
private var _Padlock: ImageVector? = null