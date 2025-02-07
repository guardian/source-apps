package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ShareWeb: ImageVector
    get() {
        if (_ShareWeb != null) {
            return _ShareWeb!!
        }
        _ShareWeb = ImageVector.Builder(
            name = "ShareWeb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 16f)
                curveTo(20.675f, 16f, 22f, 17.35f, 22f, 19f)
                curveTo(22f, 20.675f, 20.675f, 22f, 19f, 22f)
                curveTo(17.35f, 22f, 16.025f, 20.675f, 16.025f, 19f)
                curveTo(16.025f, 18.875f, 16.025f, 18.725f, 16.05f, 18.625f)
                lineTo(7.1f, 14.15f)
                curveTo(6.525f, 14.7f, 5.825f, 14.975f, 5.025f, 14.975f)
                curveTo(3.325f, 14.975f, 2f, 13.65f, 2f, 12f)
                curveTo(2f, 10.325f, 3.325f, 8.975f, 5.025f, 8.975f)
                curveTo(5.8f, 8.975f, 6.525f, 9.325f, 7.1f, 9.85f)
                lineTo(16.05f, 5.375f)
                curveTo(16.025f, 5.275f, 16.025f, 5.15f, 16.025f, 4.975f)
                curveTo(16.025f, 3.325f, 17.35f, 2f, 19f, 2f)
                curveTo(20.675f, 2f, 22f, 3.325f, 22f, 4.975f)
                curveTo(22f, 6.65f, 20.675f, 8f, 19f, 8f)
                curveTo(18.2f, 8f, 17.525f, 7.675f, 16.95f, 7.175f)
                lineTo(7.975f, 11.625f)
                curveTo(8f, 11.7f, 8f, 11.825f, 8f, 12f)
                curveTo(8f, 12.175f, 8f, 12.3f, 7.975f, 12.375f)
                lineTo(16.95f, 16.825f)
                curveTo(17.525f, 16.325f, 18.2f, 16f, 19f, 16f)
                close()
                moveTo(19f, 3.2f)
                curveTo(18.025f, 3.2f, 17.2f, 3.975f, 17.2f, 4.975f)
                curveTo(17.2f, 5.975f, 18.025f, 6.8f, 19f, 6.8f)
                curveTo(20f, 6.8f, 20.825f, 5.975f, 20.825f, 4.975f)
                curveTo(20.825f, 3.975f, 20f, 3.2f, 19f, 3.2f)
                close()
                moveTo(19f, 20.8f)
                curveTo(20f, 20.8f, 20.825f, 19.975f, 20.825f, 19f)
                curveTo(20.825f, 18f, 20f, 17.2f, 19f, 17.2f)
                curveTo(18.025f, 17.2f, 17.2f, 18f, 17.2f, 19f)
                curveTo(17.2f, 19.975f, 18.025f, 20.8f, 19f, 20.8f)
                close()
            }
        }.build()

        return _ShareWeb!!
    }

@Suppress("ObjectPropertyName")
private var _ShareWeb: ImageVector? = null