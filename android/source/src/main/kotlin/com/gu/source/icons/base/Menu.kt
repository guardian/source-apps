package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Menu: ImageVector
    get() {
        if (_Menu != null) {
            return _Menu!!
        }
        _Menu = ImageVector.Builder(
            name = "Menu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                close()
                moveTo(23f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                close()
                moveTo(23f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(1f)
                verticalLineTo(19f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _Menu!!
    }

@Suppress("ObjectPropertyName")
private var _Menu: ImageVector? = null