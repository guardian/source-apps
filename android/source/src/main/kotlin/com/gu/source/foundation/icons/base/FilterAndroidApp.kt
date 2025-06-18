package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.FilterAndroidApp: ImageVector
    get() {
        if (_FilterAndroidApp != null) {
            return _FilterAndroidApp!!
        }
        _FilterAndroidApp = ImageVector.Builder(
            name = "FilterAndroidApp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 7f)
                horizontalLineTo(20.985f)
                verticalLineTo(8.5f)
                lineTo(20.495f, 9f)
                horizontalLineTo(3.495f)
                lineTo(3f, 8.5f)
                verticalLineTo(7f)
                close()
                moveTo(17.995f, 12.005f)
                horizontalLineTo(5.995f)
                verticalLineTo(13.5f)
                lineTo(6.495f, 14.005f)
                horizontalLineTo(17.495f)
                lineTo(17.995f, 13.5f)
                verticalLineTo(12.005f)
                close()
                moveTo(13.98f, 17f)
                horizontalLineTo(10.005f)
                verticalLineTo(18.5f)
                lineTo(10.495f, 19f)
                horizontalLineTo(13.495f)
                lineTo(13.98f, 18.5f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _FilterAndroidApp!!
    }

@Suppress("ObjectPropertyName")
private var _FilterAndroidApp: ImageVector? = null