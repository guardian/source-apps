package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Quote: ImageVector
    get() {
        if (_Quote != null) {
            return _Quote!!
        }
        _Quote = ImageVector.Builder(
            name = "Quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.506f, 4.7f)
                horizontalLineTo(11.481f)
                curveTo(10.883f, 9.445f, 10.353f, 14.099f, 10.122f, 19.305f)
                horizontalLineTo(1f)
                curveTo(1.829f, 14.237f, 3.557f, 9.445f, 6.506f, 4.7f)
                close()
                moveTo(18.093f, 4.7f)
                horizontalLineTo(23f)
                curveTo(22.47f, 9.445f, 21.871f, 14.099f, 21.641f, 19.305f)
                horizontalLineTo(12.542f)
                curveTo(13.486f, 14.237f, 15.145f, 9.445f, 18.093f, 4.7f)
                close()
            }
        }.build()

        return _Quote!!
    }

@Suppress("ObjectPropertyName")
private var _Quote: ImageVector? = null