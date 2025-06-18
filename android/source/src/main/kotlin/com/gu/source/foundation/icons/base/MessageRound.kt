package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.MessageRound: ImageVector
    get() {
        if (_MessageRound != null) {
            return _MessageRound!!
        }
        _MessageRound = ImageVector.Builder(
            name = "MessageRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(15.336f, 7.556f)
                verticalLineTo(8.825f)
                horizontalLineTo(7.558f)
                verticalLineTo(7.556f)
                horizontalLineTo(15.336f)
                close()
                moveTo(12.637f, 10.095f)
                verticalLineTo(11.365f)
                horizontalLineTo(7.558f)
                verticalLineTo(10.095f)
                horizontalLineTo(12.637f)
                close()
                moveTo(16.447f, 12.635f)
                verticalLineTo(13.905f)
                horizontalLineTo(7.558f)
                verticalLineTo(12.635f)
                horizontalLineTo(16.447f)
                close()
                moveTo(14.224f, 15.175f)
                verticalLineTo(16.444f)
                horizontalLineTo(7.558f)
                verticalLineTo(15.175f)
                horizontalLineTo(14.224f)
                close()
            }
        }.build()

        return _MessageRound!!
    }

@Suppress("ObjectPropertyName")
private var _MessageRound: ImageVector? = null