package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PersonRoundOutlined: ImageVector
    get() {
        if (_PersonRoundOutlined != null) {
            return _PersonRoundOutlined!!
        }
        _PersonRoundOutlined = ImageVector.Builder(
            name = "PersonRoundOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.469f, 19.311f)
                lineTo(7.659f, 14.856f)
                lineTo(8.283f, 14.231f)
                curveTo(9.505f, 13.821f, 10.671f, 13.607f, 12.025f, 13.607f)
                curveTo(13.378f, 13.607f, 14.548f, 13.83f, 15.766f, 14.231f)
                lineTo(16.391f, 14.856f)
                horizontalLineTo(16.386f)
                lineTo(17.568f, 19.282f)
                curveTo(19.756f, 17.607f, 21.167f, 14.968f, 21.167f, 12f)
                curveTo(21.167f, 6.937f, 17.063f, 2.833f, 12f, 2.833f)
                curveTo(6.937f, 2.833f, 2.833f, 6.937f, 2.833f, 12f)
                curveTo(2.833f, 14.985f, 4.26f, 17.637f, 6.469f, 19.311f)
                close()
                moveTo(22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
                moveTo(12.033f, 12.358f)
                curveTo(13.16f, 12.358f, 14.505f, 11.092f, 14.505f, 9.534f)
                curveTo(14.505f, 7.975f, 13.592f, 7.063f, 12.033f, 7.063f)
                curveTo(10.475f, 7.063f, 9.558f, 7.975f, 9.558f, 9.534f)
                curveTo(9.558f, 11.092f, 11.016f, 12.358f, 12.033f, 12.358f)
                close()
            }
        }.build()

        return _PersonRoundOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _PersonRoundOutlined: ImageVector? = null