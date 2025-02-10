package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ShareAppSmall: ImageVector
    get() {
        if (_ShareAppSmall != null) {
            return _ShareAppSmall!!
        }
        _ShareAppSmall = ImageVector.Builder(
            name = "ShareAppSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.265f, 13f)
                verticalLineTo(6.44f)
                lineTo(9.04f, 8.04f)
                lineTo(8.38f, 7.375f)
                lineTo(11.755f, 4f)
                horizontalLineTo(12.27f)
                lineTo(15.635f, 7.365f)
                lineTo(14.975f, 8.03f)
                lineTo(12.765f, 6.44f)
                verticalLineTo(13f)
                horizontalLineTo(11.265f)
                close()
                moveTo(14f, 9.5f)
                horizontalLineTo(16.5f)
                lineTo(17.5f, 10.49f)
                verticalLineTo(13.5f)
                verticalLineTo(17.5f)
                lineTo(16.49f, 18.5f)
                horizontalLineTo(7.49f)
                lineTo(6.5f, 17.5f)
                verticalLineTo(13.5f)
                verticalLineTo(10.49f)
                lineTo(7.5f, 9.5f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()

        return _ShareAppSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ShareAppSmall: ImageVector? = null