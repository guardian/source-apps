package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.KnifeAndFork: ImageVector
    get() {
        if (_KnifeAndFork != null) {
            return _KnifeAndFork!!
        }
        _KnifeAndFork = ImageVector.Builder(
            name = "KnifeAndFork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(16.97f, 1f)
                horizontalLineTo(15.97f)
                curveTo(15.97f, 1f, 13.675f, 10.185f, 13.595f, 10.495f)
                curveTo(13.52f, 10.805f, 13.675f, 11.12f, 13.92f, 11.255f)
                curveTo(14.01f, 11.305f, 14.45f, 11.56f, 14.97f, 11.855f)
                verticalLineTo(22.5f)
                lineTo(15.47f, 23f)
                horizontalLineTo(16.47f)
                lineTo(16.97f, 22.5f)
                verticalLineTo(1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(9.47f, 1f)
                verticalLineTo(7f)
                horizontalLineTo(8.72f)
                lineTo(8.48f, 1f)
                horizontalLineTo(7.47f)
                lineTo(7.225f, 7f)
                horizontalLineTo(6.475f)
                verticalLineTo(1f)
                horizontalLineTo(5.475f)
                curveTo(5.475f, 1f, 5.03f, 7.235f, 5.01f, 7.495f)
                curveTo(4.985f, 7.85f, 5.045f, 8.035f, 5.24f, 8.165f)
                curveTo(5.88f, 8.59f, 7.41f, 9.765f, 7.37f, 11f)
                lineTo(6.975f, 22.5f)
                lineTo(7.475f, 23f)
                horizontalLineTo(8.475f)
                lineTo(8.975f, 22.5f)
                lineTo(8.58f, 11.025f)
                curveTo(8.58f, 11.025f, 8.58f, 11.005f, 8.58f, 10.995f)
                curveTo(8.54f, 9.77f, 10.07f, 8.59f, 10.71f, 8.165f)
                curveTo(10.91f, 8.035f, 10.965f, 7.85f, 10.94f, 7.495f)
                lineTo(10.475f, 1f)
                horizontalLineTo(9.47f)
                close()
            }
        }.build()

        return _KnifeAndFork!!
    }

@Suppress("ObjectPropertyName")
private var _KnifeAndFork: ImageVector? = null