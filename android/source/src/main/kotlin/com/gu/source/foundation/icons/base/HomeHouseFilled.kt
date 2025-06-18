package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HomeHouseFilled: ImageVector
    get() {
        if (_HomeHouseFilled != null) {
            return _HomeHouseFilled!!
        }
        _HomeHouseFilled = ImageVector.Builder(
            name = "HomeHouseFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.359f, 2.5f)
                horizontalLineTo(11.455f)
                lineTo(3.855f, 10.191f)
                verticalLineTo(10.191f)
                lineTo(2.95f, 11.095f)
                verticalLineTo(11.548f)
                horizontalLineTo(3.855f)
                verticalLineTo(20.604f)
                lineTo(4.759f, 21.5f)
                horizontalLineTo(9.727f)
                verticalLineTo(14.714f)
                horizontalLineTo(14.25f)
                verticalLineTo(21.5f)
                horizontalLineTo(19.236f)
                lineTo(20.14f, 20.568f)
                verticalLineTo(11.548f)
                horizontalLineTo(21.045f)
                verticalLineTo(11.095f)
                lineTo(19.688f, 9.738f)
                lineTo(19.687f, 9.742f)
                lineTo(12.359f, 2.5f)
                close()
            }
        }.build()

        return _HomeHouseFilled!!
    }

@Suppress("ObjectPropertyName")
private var _HomeHouseFilled: ImageVector? = null