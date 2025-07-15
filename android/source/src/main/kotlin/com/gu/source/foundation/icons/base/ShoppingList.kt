package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ShoppingList: ImageVector
    get() {
        if (_ShoppingList != null) {
            return _ShoppingList!!
        }
        _ShoppingList = ImageVector.Builder(
            name = "ShoppingList",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.625f, 4.5f)
                lineTo(5.5f, 3.625f)
                horizontalLineTo(18.375f)
                lineTo(19.25f, 4.5f)
                verticalLineTo(22f)
                horizontalLineTo(17.5f)
                verticalLineTo(5.375f)
                horizontalLineTo(6.375f)
                verticalLineTo(22f)
                horizontalLineTo(4.625f)
                verticalLineTo(4.5f)
                close()
                moveTo(8f, 8.125f)
                horizontalLineTo(16.125f)
                verticalLineTo(9.75f)
                horizontalLineTo(8f)
                verticalLineTo(8.125f)
                close()
                moveTo(15.125f, 11.125f)
                horizontalLineTo(8f)
                verticalLineTo(12.75f)
                horizontalLineTo(15.125f)
                verticalLineTo(11.125f)
                close()
                moveTo(8f, 14.125f)
                horizontalLineTo(15.625f)
                verticalLineTo(15.75f)
                horizontalLineTo(8f)
                verticalLineTo(14.125f)
                close()
                moveTo(14.5f, 17.125f)
                horizontalLineTo(8f)
                verticalLineTo(18.75f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.125f)
                close()
            }
        }.build()

        return _ShoppingList!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingList: ImageVector? = null