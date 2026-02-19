package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Newsletter: ImageVector
    get() {
        if (_Newsletter != null) {
            return _Newsletter!!
        }
        _Newsletter = ImageVector.Builder(
            name = "Newsletter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.364f, 2f)
                horizontalLineTo(5.636f)
                verticalLineTo(7.68f)
                horizontalLineTo(3.429f)
                lineTo(2f, 9.289f)
                lineTo(11.048f, 16.793f)
                horizontalLineTo(12.952f)
                lineTo(22f, 9.289f)
                lineTo(20.571f, 7.68f)
                horizontalLineTo(18.364f)
                verticalLineTo(2f)
                close()
                moveTo(16.545f, 7.68f)
                verticalLineTo(6.734f)
                horizontalLineTo(7.455f)
                verticalLineTo(7.68f)
                horizontalLineTo(16.545f)
                close()
                moveTo(16.545f, 3.893f)
                horizontalLineTo(7.455f)
                verticalLineTo(4.84f)
                horizontalLineTo(16.545f)
                verticalLineTo(3.893f)
                close()
                moveTo(2f, 20.58f)
                verticalLineTo(11.586f)
                lineTo(11.048f, 18.213f)
                horizontalLineTo(12.952f)
                lineTo(22f, 11.586f)
                verticalLineTo(20.58f)
                lineTo(20.571f, 22f)
                horizontalLineTo(3.429f)
                lineTo(2f, 20.58f)
                close()
                moveTo(7.455f, 9.574f)
                horizontalLineTo(16.545f)
                verticalLineTo(10.521f)
                horizontalLineTo(7.455f)
                verticalLineTo(9.574f)
                close()
            }
        }.build()

        return _Newsletter!!
    }

@Suppress("ObjectPropertyName")
private var _Newsletter: ImageVector? = null