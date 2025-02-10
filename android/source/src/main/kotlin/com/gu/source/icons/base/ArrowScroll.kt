package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowScroll: ImageVector
    get() {
        if (_ArrowScroll != null) {
            return _ArrowScroll!!
        }
        _ArrowScroll = ImageVector.Builder(
            name = "ArrowScroll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.679f, 5.36f)
                verticalLineTo(18.639f)
                lineTo(13.151f, 15.919f)
                lineTo(12.269f, 16.801f)
                lineTo(17.316f, 21.799f)
                horizontalLineTo(18.002f)
                lineTo(23f, 16.801f)
                lineTo(22.142f, 15.919f)
                lineTo(18.639f, 18.639f)
                verticalLineTo(5.36f)
                lineTo(22.142f, 8.08f)
                lineTo(23f, 7.198f)
                lineTo(18.002f, 2.2f)
                horizontalLineTo(17.316f)
                lineTo(12.269f, 7.198f)
                lineTo(13.151f, 8.08f)
                lineTo(16.679f, 5.36f)
                close()
                moveTo(10.8f, 5.14f)
                verticalLineTo(3.18f)
                horizontalLineTo(1f)
                verticalLineTo(5.14f)
                horizontalLineTo(10.8f)
                close()
                moveTo(9.82f, 9.06f)
                verticalLineTo(7.1f)
                horizontalLineTo(1f)
                verticalLineTo(9.06f)
                horizontalLineTo(9.82f)
                close()
                moveTo(11.78f, 12.979f)
                verticalLineTo(11.02f)
                horizontalLineTo(1f)
                verticalLineTo(12.979f)
                horizontalLineTo(11.78f)
                close()
                moveTo(8.84f, 16.899f)
                verticalLineTo(14.939f)
                horizontalLineTo(1f)
                verticalLineTo(16.899f)
                horizontalLineTo(8.84f)
                close()
            }
        }.build()

        return _ArrowScroll!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowScroll: ImageVector? = null