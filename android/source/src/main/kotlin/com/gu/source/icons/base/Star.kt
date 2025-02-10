package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.151f, 21.336f)
                lineTo(16.733f, 13.95f)
                lineTo(23f, 9.348f)
                lineTo(22.688f, 8.359f)
                horizontalLineTo(14.939f)
                lineTo(12.546f, 1f)
                horizontalLineTo(11.454f)
                lineTo(9.087f, 8.359f)
                horizontalLineTo(1.312f)
                lineTo(1f, 9.348f)
                lineTo(7.267f, 13.95f)
                lineTo(4.901f, 21.336f)
                lineTo(5.707f, 21.96f)
                lineTo(12f, 17.357f)
                lineTo(18.293f, 21.96f)
                lineTo(19.151f, 21.336f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null