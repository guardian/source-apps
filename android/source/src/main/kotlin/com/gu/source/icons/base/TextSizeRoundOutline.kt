package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.TextSizeRoundOutline: ImageVector
    get() {
        if (_TextSizeRoundOutline != null) {
            return _TextSizeRoundOutline!!
        }
        _TextSizeRoundOutline = ImageVector.Builder(
            name = "TextSizeRoundOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.167f, 12f)
                curveTo(21.167f, 17.063f, 17.063f, 21.167f, 12f, 21.167f)
                curveTo(6.937f, 21.167f, 2.833f, 17.063f, 2.833f, 12f)
                curveTo(2.833f, 6.937f, 6.937f, 2.833f, 12f, 2.833f)
                curveTo(17.063f, 2.833f, 21.167f, 6.937f, 21.167f, 12f)
                close()
                moveTo(22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
                moveTo(7.46f, 15.137f)
                lineTo(8.197f, 12.876f)
                horizontalLineTo(11.219f)
                lineTo(11.955f, 15.137f)
                lineTo(10.914f, 15.378f)
                verticalLineTo(15.924f)
                horizontalLineTo(14.267f)
                verticalLineTo(15.352f)
                lineTo(13.378f, 15.137f)
                lineTo(10.533f, 6.806f)
                horizontalLineTo(9.467f)
                lineTo(6.546f, 15.137f)
                lineTo(5.632f, 15.352f)
                verticalLineTo(15.924f)
                horizontalLineTo(8.514f)
                verticalLineTo(15.378f)
                lineTo(7.46f, 15.137f)
                close()
                moveTo(9.797f, 8.444f)
                lineTo(11.067f, 12.343f)
                horizontalLineTo(8.4f)
                lineTo(9.733f, 8.444f)
                horizontalLineTo(9.797f)
                close()
                moveTo(18.368f, 15.53f)
                lineTo(17.746f, 15.352f)
                lineTo(15.727f, 9.486f)
                horizontalLineTo(14.965f)
                lineTo(13.746f, 12.978f)
                lineTo(14.076f, 13.854f)
                verticalLineTo(13.829f)
                horizontalLineTo(16.235f)
                lineTo(16.743f, 15.352f)
                lineTo(15.994f, 15.53f)
                verticalLineTo(15.924f)
                horizontalLineTo(18.368f)
                verticalLineTo(15.53f)
                close()
                moveTo(15.206f, 10.641f)
                lineTo(16.083f, 13.372f)
                horizontalLineTo(14.254f)
                lineTo(15.168f, 10.641f)
                horizontalLineTo(15.206f)
                close()
            }
        }.build()

        return _TextSizeRoundOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TextSizeRoundOutline: ImageVector? = null