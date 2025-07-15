package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.FilterIosApp: ImageVector
    get() {
        if (_FilterIosApp != null) {
            return _FilterIosApp!!
        }
        _FilterIosApp = ImageVector.Builder(
            name = "FilterIosApp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(15f, 13f)
                lineTo(20.985f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                lineTo(9f, 13f)
                verticalLineTo(18.5f)
                lineTo(11.495f, 21f)
                lineTo(15f, 18f)
                verticalLineTo(13f)
                close()
                moveTo(13.375f, 17.252f)
                verticalLineTo(12.328f)
                lineTo(19.064f, 6.625f)
                horizontalLineTo(4.923f)
                lineTo(10.625f, 12.327f)
                verticalLineTo(17.828f)
                lineTo(11.582f, 18.787f)
                lineTo(13.375f, 17.252f)
                close()
            }
        }.build()

        return _FilterIosApp!!
    }

@Suppress("ObjectPropertyName")
private var _FilterIosApp: ImageVector? = null