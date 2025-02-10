package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Twitter: ImageVector
    get() {
        if (_Twitter != null) {
            return _Twitter!!
        }
        _Twitter = ImageVector.Builder(
            name = "Twitter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24f, 6.1f)
                curveTo(23.125f, 6.475f, 22.35f, 6.7f, 21.375f, 6.825f)
                curveTo(22.4f, 6.25f, 23.075f, 5.4f, 23.4f, 4.325f)
                curveTo(22.525f, 4.75f, 21.5f, 5.325f, 20.525f, 5.4f)
                curveTo(19.7f, 4.575f, 18.6f, 4f, 17.2f, 4f)
                curveTo(14.75f, 4f, 12.7f, 6.05f, 12.7f, 8.5f)
                curveTo(12.7f, 8.775f, 12.725f, 9.25f, 12.825f, 9.525f)
                curveTo(9f, 9.325f, 5.875f, 7.575f, 3.5f, 4.8f)
                curveTo(3.175f, 5.475f, 2.9f, 6.275f, 2.9f, 7.075f)
                curveTo(2.9f, 8.575f, 3.7f, 10.1f, 4.925f, 10.825f)
                curveTo(4.525f, 10.9f, 3.25f, 10.5f, 2.85f, 10.3f)
                curveTo(2.85f, 12.625f, 4.475f, 14.3f, 6.5f, 14.775f)
                curveTo(5.725f, 14.975f, 5.125f, 15.025f, 4.45f, 14.85f)
                curveTo(5.075f, 16.65f, 6.65f, 17.95f, 8.65f, 17.95f)
                curveTo(7.15f, 19.225f, 5.175f, 19.9f, 3.075f, 19.925f)
                curveTo(2.7f, 19.85f, 2.3f, 19.925f, 2f, 19.85f)
                curveTo(3.925f, 21.125f, 6.425f, 21.825f, 8.925f, 21.825f)
                curveTo(17.2f, 21.825f, 21.775f, 14.975f, 21.775f, 9.025f)
                curveTo(21.775f, 8.85f, 21.725f, 8.625f, 21.725f, 8.45f)
                curveTo(22.625f, 7.775f, 23.4f, 6.975f, 24f, 6.1f)
                close()
            }
        }.build()

        return _Twitter!!
    }

@Suppress("ObjectPropertyName")
private var _Twitter: ImageVector? = null