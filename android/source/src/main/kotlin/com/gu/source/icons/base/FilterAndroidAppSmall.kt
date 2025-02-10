package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.FilterAndroidAppSmall: ImageVector
    get() {
        if (_FilterAndroidAppSmall != null) {
            return _FilterAndroidAppSmall!!
        }
        _FilterAndroidAppSmall = ImageVector.Builder(
            name = "FilterAndroidAppSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 7f)
                horizontalLineTo(17.985f)
                verticalLineTo(8.5f)
                lineTo(17.495f, 9f)
                horizontalLineTo(6.495f)
                lineTo(6f, 8.5f)
                verticalLineTo(7f)
                close()
                moveTo(15.995f, 11.005f)
                horizontalLineTo(7.995f)
                verticalLineTo(12.5f)
                lineTo(8.495f, 13.005f)
                horizontalLineTo(15.495f)
                lineTo(15.995f, 12.5f)
                verticalLineTo(11.005f)
                close()
                moveTo(13.98f, 15f)
                horizontalLineTo(10.005f)
                verticalLineTo(16.5f)
                lineTo(10.495f, 17f)
                horizontalLineTo(13.495f)
                lineTo(13.98f, 16.5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _FilterAndroidAppSmall!!
    }

@Suppress("ObjectPropertyName")
private var _FilterAndroidAppSmall: ImageVector? = null