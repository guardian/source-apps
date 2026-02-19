package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HousePlus: ImageVector
    get() {
        if (_HousePlus != null) {
            return _HousePlus!!
        }
        _HousePlus = ImageVector.Builder(
            name = "HousePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.75f, 6.75f)
                verticalLineTo(10f)
                horizontalLineTo(19.25f)
                verticalLineTo(6.75f)
                horizontalLineTo(22.5f)
                verticalLineTo(5.25f)
                horizontalLineTo(19.25f)
                verticalLineTo(2f)
                horizontalLineTo(17.75f)
                verticalLineTo(5.25f)
                horizontalLineTo(14.5f)
                verticalLineTo(6.75f)
                horizontalLineTo(17.75f)
                close()
                moveTo(18.5f, 12f)
                curveTo(18.564f, 12f, 18.627f, 11.999f, 18.69f, 11.997f)
                verticalLineTo(21.068f)
                lineTo(17.786f, 22f)
                horizontalLineTo(12.8f)
                verticalLineTo(15.214f)
                horizontalLineTo(8.277f)
                verticalLineTo(22f)
                horizontalLineTo(3.309f)
                lineTo(2.405f, 21.104f)
                verticalLineTo(12.048f)
                horizontalLineTo(1.5f)
                verticalLineTo(11.595f)
                lineTo(2.405f, 10.691f)
                verticalLineTo(10.691f)
                lineTo(10.005f, 3f)
                horizontalLineTo(10.91f)
                lineTo(12.63f, 4.701f)
                curveTo(12.545f, 5.1f, 12.5f, 5.532f, 12.5f, 6f)
                curveTo(12.5f, 9.038f, 15f, 12f, 18.5f, 12f)
                close()
            }
        }.build()

        return _HousePlus!!
    }

@Suppress("ObjectPropertyName")
private var _HousePlus: ImageVector? = null