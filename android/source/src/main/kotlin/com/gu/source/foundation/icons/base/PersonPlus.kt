package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PersonPlus: ImageVector
    get() {
        if (_PersonPlus != null) {
            return _PersonPlus!!
        }
        _PersonPlus = ImageVector.Builder(
            name = "PersonPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 9.5f)
                curveTo(11.825f, 9.5f, 13.975f, 7.45f, 13.975f, 4.95f)
                curveTo(13.975f, 2.45f, 12.5f, 1f, 10f, 1f)
                curveTo(7.5f, 1f, 6.05f, 2.45f, 6.05f, 4.95f)
                curveTo(6.05f, 7.45f, 8.375f, 9.5f, 10f, 9.5f)
                close()
                moveTo(19.75f, 15f)
                horizontalLineTo(18.25f)
                verticalLineTo(11.75f)
                horizontalLineTo(15f)
                verticalLineTo(10.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(7f)
                horizontalLineTo(19.75f)
                verticalLineTo(10.25f)
                horizontalLineTo(23f)
                verticalLineTo(11.75f)
                horizontalLineTo(19.75f)
                verticalLineTo(15f)
                close()
                moveTo(10f, 11.5f)
                curveTo(11.075f, 11.5f, 12.1f, 11.575f, 13.025f, 11.75f)
                curveTo(13.3f, 14.35f, 15.35f, 16.45f, 17.9f, 16.9f)
                lineTo(19f, 21f)
                lineTo(17.975f, 22f)
                horizontalLineTo(1.975f)
                lineTo(1f, 21f)
                lineTo(2.975f, 13.5f)
                lineTo(4f, 12.475f)
                curveTo(6f, 11.8f, 7.8f, 11.5f, 10f, 11.5f)
                close()
            }
        }.build()

        return _PersonPlus!!
    }

@Suppress("ObjectPropertyName")
private var _PersonPlus: ImageVector? = null