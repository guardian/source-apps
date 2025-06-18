package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PersonTick: ImageVector
    get() {
        if (_PersonTick != null) {
            return _PersonTick!!
        }
        _PersonTick = ImageVector.Builder(
            name = "PersonTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.4f, 9.5f)
                curveTo(12.225f, 9.5f, 14.375f, 7.45f, 14.375f, 4.95f)
                curveTo(14.375f, 2.45f, 12.9f, 1f, 10.4f, 1f)
                curveTo(7.9f, 1f, 6.45f, 2.45f, 6.45f, 4.95f)
                curveTo(6.45f, 7.45f, 8.775f, 9.5f, 10.4f, 9.5f)
                close()
                moveTo(16.15f, 11.5f)
                lineTo(17.225f, 10.45f)
                lineTo(18.325f, 11.575f)
                lineTo(21.6f, 8.3f)
                lineTo(22.65f, 9.375f)
                lineTo(18.325f, 13.7f)
                lineTo(17.275f, 12.625f)
                lineTo(16.15f, 11.5f)
                close()
                moveTo(10.4f, 11.5f)
                curveTo(11.475f, 11.5f, 12.5f, 11.575f, 13.425f, 11.75f)
                curveTo(13.7f, 14.35f, 15.75f, 16.45f, 18.3f, 16.9f)
                lineTo(19.4f, 21f)
                lineTo(18.375f, 22f)
                horizontalLineTo(2.375f)
                lineTo(1.4f, 21f)
                lineTo(3.375f, 13.5f)
                lineTo(4.4f, 12.475f)
                curveTo(6.4f, 11.8f, 8.2f, 11.5f, 10.4f, 11.5f)
                close()
            }
        }.build()

        return _PersonTick!!
    }

@Suppress("ObjectPropertyName")
private var _PersonTick: ImageVector? = null