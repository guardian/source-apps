package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.BookmarkRoundFilled: ImageVector
    get() {
        if (_BookmarkRoundFilled != null) {
            return _BookmarkRoundFilled!!
        }
        _BookmarkRoundFilled = ImageVector.Builder(
            name = "BookmarkRoundFilled",
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
                moveTo(14.89f, 17.4f)
                lineTo(14.62f, 17.57f)
                lineTo(12f, 16.06f)
                lineTo(9.38f, 17.57f)
                lineTo(9.11f, 17.4f)
                verticalLineTo(7.58f)
                lineTo(9.91f, 6.79f)
                horizontalLineTo(14.11f)
                lineTo(14.9f, 7.58f)
                verticalLineTo(17.4f)
                horizontalLineTo(14.89f)
                close()
            }
        }.build()

        return _BookmarkRoundFilled!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkRoundFilled: ImageVector? = null