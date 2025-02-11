package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.WhiteArrowLeftStraightRound: ImageVector
    get() {
        if (_WhiteArrowLeftStraightRound != null) {
            return _WhiteArrowLeftStraightRound!!
        }
        _WhiteArrowLeftStraightRound = ImageVector.Builder(
            name = "WhiteArrowLeftStraightRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                close()
                moveTo(17.5f, 12.5f)
                horizontalLineTo(8.4f)
                lineTo(12f, 16.8f)
                lineTo(11.5f, 17.3f)
                lineTo(6.5f, 12.3f)
                verticalLineTo(11.8f)
                lineTo(11.5f, 6.8f)
                lineTo(12f, 7.3f)
                lineTo(8.4f, 11.6f)
                horizontalLineTo(17.5f)
                verticalLineTo(12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(12f, 16.8f)
                lineTo(8.4f, 12.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(11.6f)
                horizontalLineTo(8.4f)
                lineTo(12f, 7.3f)
                lineTo(11.5f, 6.8f)
                lineTo(6.5f, 11.8f)
                verticalLineTo(12.3f)
                lineTo(11.5f, 17.3f)
                lineTo(12f, 16.8f)
                close()
            }
        }.build()

        return _WhiteArrowLeftStraightRound!!
    }

@Suppress("ObjectPropertyName")
private var _WhiteArrowLeftStraightRound: ImageVector? = null