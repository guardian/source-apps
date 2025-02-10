package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.TransparentArrowLeftStraightRound: ImageVector
    get() {
        if (_TransparentArrowLeftStraightRound != null) {
            return _TransparentArrowLeftStraightRound!!
        }
        _TransparentArrowLeftStraightRound = ImageVector.Builder(
            name = "TransparentArrowLeftStraightRound",
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
                moveTo(17.5f, 12.48f)
                horizontalLineTo(8.36f)
                lineTo(11.94f, 16.77f)
                lineTo(11.47f, 17.24f)
                lineTo(6.49f, 12.25f)
                verticalLineTo(11.77f)
                lineTo(11.47f, 6.78f)
                lineTo(11.94f, 7.25f)
                lineTo(8.36f, 11.54f)
                horizontalLineTo(17.5f)
                verticalLineTo(12.5f)
                verticalLineTo(12.48f)
                close()
            }
        }.build()

        return _TransparentArrowLeftStraightRound!!
    }

@Suppress("ObjectPropertyName")
private var _TransparentArrowLeftStraightRound: ImageVector? = null