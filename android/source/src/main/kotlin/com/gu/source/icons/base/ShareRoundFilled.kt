package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ShareRoundFilled: ImageVector
    get() {
        if (_ShareRoundFilled != null) {
            return _ShareRoundFilled!!
        }
        _ShareRoundFilled = ImageVector.Builder(
            name = "ShareRoundFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(11.83f, 6.79f)
                horizontalLineTo(12.16f)
                lineTo(14.59f, 9.22f)
                lineTo(14.16f, 9.63f)
                lineTo(12.47f, 8.34f)
                verticalLineTo(12.47f)
                horizontalLineTo(11.52f)
                verticalLineTo(8.34f)
                lineTo(9.83f, 9.63f)
                lineTo(9.42f, 9.22f)
                lineTo(11.84f, 6.79f)
                horizontalLineTo(11.83f)
                close()
                moveTo(17.21f, 15.78f)
                lineTo(16.72f, 16.27f)
                horizontalLineTo(7.25f)
                lineTo(6.79f, 15.78f)
                verticalLineTo(11.06f)
                horizontalLineTo(7.26f)
                lineTo(7.73f, 11.53f)
                verticalLineTo(15.32f)
                horizontalLineTo(16.26f)
                verticalLineTo(11.53f)
                lineTo(16.73f, 11.06f)
                horizontalLineTo(17.2f)
                verticalLineTo(15.78f)
                horizontalLineTo(17.21f)
                close()
            }
        }.build()

        return _ShareRoundFilled!!
    }

@Suppress("ObjectPropertyName")
private var _ShareRoundFilled: ImageVector? = null