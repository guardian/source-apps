package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) {
            return _CreditCard!!
        }
        _CreditCard = ImageVector.Builder(
            name = "CreditCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 6.569f)
                lineTo(21.167f, 4.76f)
                horizontalLineTo(2.833f)
                lineTo(1f, 6.569f)
                verticalLineTo(8.234f)
                horizontalLineTo(23f)
                verticalLineTo(6.569f)
                close()
                moveTo(23f, 10.26f)
                horizontalLineTo(1f)
                lineTo(1f, 17.424f)
                lineTo(2.803f, 19.234f)
                horizontalLineTo(21.167f)
                lineTo(23f, 17.424f)
                lineTo(23f, 10.26f)
                close()
                moveTo(5.632f, 15.76f)
                horizontalLineTo(7.922f)
                verticalLineTo(14.602f)
                horizontalLineTo(5.632f)
                verticalLineTo(15.76f)
                close()
                moveTo(11.404f, 15.76f)
                horizontalLineTo(9.114f)
                verticalLineTo(14.602f)
                horizontalLineTo(11.404f)
                verticalLineTo(15.76f)
                close()
                moveTo(12.596f, 15.76f)
                horizontalLineTo(14.886f)
                verticalLineTo(14.602f)
                horizontalLineTo(12.596f)
                verticalLineTo(15.76f)
                close()
                moveTo(18.368f, 15.76f)
                horizontalLineTo(16.078f)
                verticalLineTo(14.602f)
                horizontalLineTo(18.368f)
                verticalLineTo(15.76f)
                close()
            }
        }.build()

        return _CreditCard!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCard: ImageVector? = null