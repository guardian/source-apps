package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.CrossedOutCloud: ImageVector
    get() {
        if (_CrossedOutCloud != null) {
            return _CrossedOutCloud!!
        }
        _CrossedOutCloud = ImageVector.Builder(
            name = "CrossedOutCloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.57f, 21.429f)
                lineTo(19.67f, 4.305f)
                lineTo(18.387f, 3f)
                lineTo(13.543f, 7.844f)
                curveTo(12.723f, 5.957f, 10.927f, 4.65f, 8.85f, 4.65f)
                curveTo(5.926f, 4.65f, 3.55f, 7.005f, 3.55f, 9.9f)
                curveTo(2.072f, 10.557f, 1f, 12.08f, 1f, 13.65f)
                curveTo(1f, 15.472f, 2.224f, 17.013f, 3.893f, 17.494f)
                lineTo(1.275f, 20.112f)
                lineTo(2.57f, 21.429f)
                close()
                moveTo(8.281f, 17.669f)
                curveTo(10.047f, 17.676f, 11.973f, 17.677f, 12.517f, 17.65f)
                lineTo(12.549f, 17.648f)
                horizontalLineTo(16.249f)
                lineTo(16.25f, 17.65f)
                lineTo(19f, 17.65f)
                curveTo(21.209f, 17.65f, 23f, 15.859f, 23f, 13.65f)
                curveTo(23f, 11.441f, 21.209f, 9.65f, 19f, 9.65f)
                curveTo(18.471f, 9.65f, 17.94f, 9.747f, 17.45f, 9.95f)
                curveTo(17.221f, 9.691f, 16.964f, 9.461f, 16.687f, 9.263f)
                lineTo(15.594f, 10.356f)
                curveTo(16.252f, 10.747f, 16.773f, 11.363f, 17f, 12.15f)
                curveTo(17.46f, 11.536f, 18.235f, 11.15f, 19f, 11.15f)
                curveTo(20.381f, 11.15f, 21.5f, 12.269f, 21.5f, 13.65f)
                curveTo(21.5f, 15.031f, 20.381f, 16.15f, 19f, 16.15f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.149f)
                horizontalLineTo(10.167f)
                verticalLineTo(16.15f)
                horizontalLineTo(9.8f)
                lineTo(8.281f, 17.669f)
                close()
                moveTo(12.35f, 9.037f)
                curveTo(11.913f, 7.437f, 10.564f, 6.15f, 8.85f, 6.15f)
                curveTo(6.749f, 6.15f, 5.05f, 7.829f, 5.05f, 9.9f)
                curveTo(5.05f, 10.599f, 5.281f, 11.223f, 5.518f, 11.865f)
                lineTo(5.55f, 11.95f)
                lineTo(4.95f, 12.15f)
                lineTo(4.5f, 11.15f)
                curveTo(3.428f, 11.443f, 2.5f, 12.502f, 2.5f, 13.65f)
                curveTo(2.5f, 15.033f, 3.601f, 16.15f, 5f, 16.15f)
                horizontalLineTo(5.237f)
                lineTo(12.35f, 9.037f)
                close()
            }
        }.build()

        return _CrossedOutCloud!!
    }

@Suppress("ObjectPropertyName")
private var _CrossedOutCloud: ImageVector? = null