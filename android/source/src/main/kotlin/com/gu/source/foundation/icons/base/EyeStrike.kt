package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.EyeStrike: ImageVector
    get() {
        if (_EyeStrike != null) {
            return _EyeStrike!!
        }
        _EyeStrike = ImageVector.Builder(
            name = "EyeStrike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(14.215f, 5.698f)
                curveTo(13.466f, 5.447f, 12.719f, 5.299f, 12f, 5.299f)
                curveTo(7.374f, 5.299f, 1.563f, 11.443f, 1.563f, 11.443f)
                lineTo(1.563f, 12.557f)
                curveTo(1.563f, 12.557f, 2.813f, 13.88f, 4.616f, 15.297f)
                lineTo(7.532f, 12.381f)
                curveTo(7.522f, 12.259f, 7.517f, 12.136f, 7.517f, 12.012f)
                curveTo(7.517f, 9.521f, 9.533f, 7.529f, 12f, 7.529f)
                curveTo(12.124f, 7.529f, 12.248f, 7.534f, 12.37f, 7.544f)
                lineTo(14.215f, 5.698f)
                close()
                moveTo(9.883f, 12.714f)
                lineTo(12.002f, 10.595f)
                curveTo(12.002f, 10.599f, 12.002f, 10.604f, 12.003f, 10.608f)
                lineTo(9.886f, 12.725f)
                curveTo(9.885f, 12.721f, 9.884f, 12.718f, 9.883f, 12.714f)
                close()
                moveTo(8.207f, 14.389f)
                lineTo(6.166f, 16.431f)
                curveTo(6.169f, 16.433f, 6.172f, 16.434f, 6.174f, 16.436f)
                lineTo(8.213f, 14.398f)
                curveTo(8.211f, 14.395f, 8.209f, 14.392f, 8.207f, 14.389f)
                close()
                moveTo(11.531f, 16.447f)
                lineTo(9.703f, 18.275f)
                curveTo(10.48f, 18.542f, 11.255f, 18.701f, 12f, 18.701f)
                curveTo(16.626f, 18.701f, 22.437f, 12.557f, 22.437f, 12.557f)
                lineTo(22.437f, 11.443f)
                curveTo(22.437f, 11.443f, 21.159f, 10.091f, 19.323f, 8.655f)
                lineTo(16.457f, 11.521f)
                curveTo(16.474f, 11.682f, 16.483f, 11.846f, 16.483f, 12.012f)
                curveTo(16.483f, 14.479f, 14.467f, 16.471f, 12f, 16.471f)
                curveTo(11.842f, 16.471f, 11.685f, 16.463f, 11.531f, 16.447f)
                close()
                moveTo(14.392f, 8.218f)
                curveTo(14.389f, 8.217f, 14.387f, 8.215f, 14.384f, 8.213f)
                lineTo(16.084f, 6.513f)
                curveTo(16.087f, 6.514f, 16.09f, 6.516f, 16.093f, 6.517f)
                lineTo(14.392f, 8.218f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(20.06f, 2.551f)
                lineToRelative(1.342f, 1.342f)
                lineToRelative(-17.444f, 17.444f)
                lineToRelative(-1.342f, -1.342f)
                close()
            }
        }.build()

        return _EyeStrike!!
    }

@Suppress("ObjectPropertyName")
private var _EyeStrike: ImageVector? = null