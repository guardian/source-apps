package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PersonCross: ImageVector
    get() {
        if (_PersonCross != null) {
            return _PersonCross!!
        }
        _PersonCross = ImageVector.Builder(
            name = "PersonCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.3f, 9.5f)
                curveTo(12.125f, 9.5f, 14.275f, 7.45f, 14.275f, 4.95f)
                curveTo(14.275f, 2.45f, 12.8f, 1f, 10.3f, 1f)
                curveTo(7.8f, 1f, 6.35f, 2.45f, 6.35f, 4.95f)
                curveTo(6.35f, 7.45f, 8.675f, 9.5f, 10.3f, 9.5f)
                close()
                moveTo(22.65f, 13.3f)
                lineTo(21.6f, 14.35f)
                lineTo(19.3f, 12.05f)
                lineTo(17f, 14.35f)
                lineTo(15.95f, 13.3f)
                lineTo(18.25f, 11f)
                lineTo(15.95f, 8.7f)
                lineTo(17f, 7.65f)
                lineTo(19.3f, 9.95f)
                lineTo(21.6f, 7.65f)
                lineTo(22.65f, 8.7f)
                lineTo(20.35f, 11f)
                lineTo(22.65f, 13.3f)
                close()
                moveTo(10.3f, 11.5f)
                curveTo(11.375f, 11.5f, 12.4f, 11.575f, 13.325f, 11.75f)
                curveTo(13.6f, 14.35f, 15.65f, 16.45f, 18.2f, 16.9f)
                lineTo(19.3f, 21f)
                lineTo(18.275f, 22f)
                horizontalLineTo(2.275f)
                lineTo(1.3f, 21f)
                lineTo(3.275f, 13.5f)
                lineTo(4.3f, 12.475f)
                curveTo(6.3f, 11.8f, 8.1f, 11.5f, 10.3f, 11.5f)
                close()
            }
        }.build()

        return _PersonCross!!
    }

@Suppress("ObjectPropertyName")
private var _PersonCross: ImageVector? = null