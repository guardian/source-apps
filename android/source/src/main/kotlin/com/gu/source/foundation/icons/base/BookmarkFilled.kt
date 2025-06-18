package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.BookmarkFilled: ImageVector
    get() {
        if (_BookmarkFilled != null) {
            return _BookmarkFilled!!
        }
        _BookmarkFilled = ImageVector.Builder(
            name = "BookmarkFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(15.625f, 3f)
                lineTo(8.375f, 3.013f)
                lineTo(7f, 4.375f)
                verticalLineTo(21.333f)
                lineTo(7.467f, 21.629f)
                lineTo(12f, 19.029f)
                lineTo(16.529f, 21.629f)
                lineTo(16.996f, 21.329f)
                verticalLineTo(4.375f)
                lineTo(15.625f, 3f)
                close()
            }
        }.build()

        return _BookmarkFilled!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkFilled: ImageVector? = null