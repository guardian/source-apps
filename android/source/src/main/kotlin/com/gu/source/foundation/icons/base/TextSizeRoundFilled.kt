package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.TextSizeRoundFilled: ImageVector
    get() {
        if (_TextSizeRoundFilled != null) {
            return _TextSizeRoundFilled!!
        }
        _TextSizeRoundFilled = ImageVector.Builder(
            name = "TextSizeRoundFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(14.26f, 15.92f)
                horizontalLineTo(10.91f)
                verticalLineTo(15.37f)
                lineTo(11.95f, 15.13f)
                lineTo(11.21f, 12.87f)
                horizontalLineTo(8.19f)
                lineTo(7.45f, 15.13f)
                lineTo(8.5f, 15.37f)
                verticalLineTo(15.92f)
                horizontalLineTo(5.63f)
                verticalLineTo(15.35f)
                lineTo(6.54f, 15.13f)
                lineTo(9.46f, 6.8f)
                horizontalLineTo(10.53f)
                lineTo(13.37f, 15.13f)
                lineTo(14.26f, 15.35f)
                verticalLineTo(15.92f)
                close()
                moveTo(18.36f, 15.92f)
                horizontalLineTo(15.99f)
                verticalLineTo(15.53f)
                lineTo(16.74f, 15.35f)
                lineTo(16.23f, 13.83f)
                horizontalLineTo(14.07f)
                verticalLineTo(13.86f)
                lineTo(13.74f, 12.98f)
                lineTo(14.96f, 9.49f)
                horizontalLineTo(15.72f)
                lineTo(17.74f, 15.36f)
                lineTo(18.36f, 15.54f)
                verticalLineTo(15.92f)
                close()
                moveTo(15.17f, 10.64f)
                lineTo(14.25f, 13.37f)
                horizontalLineTo(16.08f)
                lineTo(15.2f, 10.64f)
                horizontalLineTo(15.17f)
                close()
                moveTo(8.4f, 12.34f)
                lineTo(9.73f, 8.44f)
                horizontalLineTo(9.79f)
                lineTo(11.06f, 12.34f)
                horizontalLineTo(8.4f)
                close()
            }
        }.build()

        return _TextSizeRoundFilled!!
    }

@Suppress("ObjectPropertyName")
private var _TextSizeRoundFilled: ImageVector? = null