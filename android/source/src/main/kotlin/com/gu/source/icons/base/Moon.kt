package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.035f, 0f)
                curveTo(6.767f, 0.547f, 5.549f, 1.318f, 4.48f, 2.312f)
                curveTo(-0.046f, 6.738f, -0.17f, 13.949f, 4.181f, 18.524f)
                curveTo(8.632f, 23.049f, 15.842f, 23.173f, 20.393f, 18.797f)
                curveTo(21.437f, 17.778f, 22.282f, 16.584f, 22.829f, 15.316f)
                curveTo(18.652f, 17.057f, 13.58f, 16.186f, 10.198f, 12.73f)
                curveTo(6.842f, 9.249f, 6.146f, 4.127f, 8.035f, 0f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null