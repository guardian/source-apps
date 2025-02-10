package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Person: ImageVector
    get() {
        if (_Person != null) {
            return _Person!!
        }
        _Person = ImageVector.Builder(
            name = "Person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.975f, 4.95f)
                curveTo(15.975f, 7.45f, 13.825f, 9.5f, 12f, 9.5f)
                curveTo(10.375f, 9.5f, 8.05f, 7.45f, 8.05f, 4.95f)
                curveTo(8.05f, 2.45f, 9.5f, 1f, 12f, 1f)
                curveTo(14.5f, 1f, 15.975f, 2.45f, 15.975f, 4.95f)
                close()
                moveTo(4.975f, 13.357f)
                lineTo(6f, 12.303f)
                curveTo(8f, 11.609f, 9.8f, 11.3f, 12f, 11.3f)
                curveTo(14.175f, 11.3f, 16f, 11.66f, 18f, 12.303f)
                lineTo(19f, 13.357f)
                lineTo(21f, 21.071f)
                lineTo(19.975f, 22.1f)
                horizontalLineTo(3.975f)
                lineTo(3f, 21.071f)
                lineTo(4.975f, 13.357f)
                close()
            }
        }.build()

        return _Person!!
    }

@Suppress("ObjectPropertyName")
private var _Person: ImageVector? = null