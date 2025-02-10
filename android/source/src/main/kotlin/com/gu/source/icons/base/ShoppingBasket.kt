package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ShoppingBasket: ImageVector
    get() {
        if (_ShoppingBasket != null) {
            return _ShoppingBasket!!
        }
        _ShoppingBasket = ImageVector.Builder(
            name = "ShoppingBasket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.31f, 3.578f)
                lineTo(10.776f, 3.753f)
                lineTo(6.986f, 10.313f)
                horizontalLineTo(4.5f)
                lineTo(3.688f, 11.125f)
                verticalLineTo(12f)
                lineTo(3.73f, 12.259f)
                lineTo(6.23f, 19.696f)
                lineTo(7f, 20.25f)
                horizontalLineTo(17f)
                lineTo(17.77f, 19.696f)
                lineTo(20.27f, 12.259f)
                lineTo(20.313f, 12f)
                verticalLineTo(11.125f)
                lineTo(19.5f, 10.313f)
                horizontalLineTo(17.005f)
                lineTo(13.226f, 3.753f)
                lineTo(12.692f, 3.578f)
                lineTo(12.001f, 3.977f)
                lineTo(11.31f, 3.578f)
                close()
                moveTo(12f, 4.881f)
                lineTo(15.129f, 10.313f)
                horizontalLineTo(8.862f)
                lineTo(12f, 4.881f)
                close()
                moveTo(7.584f, 18.625f)
                lineTo(5.336f, 11.938f)
                horizontalLineTo(18.664f)
                lineTo(16.416f, 18.625f)
                horizontalLineTo(7.584f)
                close()
            }
        }.build()

        return _ShoppingBasket!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBasket: ImageVector? = null