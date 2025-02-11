package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Chef: ImageVector
    get() {
        if (_Chef != null) {
            return _Chef!!
        }
        _Chef = ImageVector.Builder(
            name = "Chef",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.72f, 13.296f)
                lineTo(17.885f, 19.342f)
                horizontalLineTo(19.016f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(19.342f)
                horizontalLineTo(6.132f)
                lineTo(6.358f, 13.302f)
                curveTo(3.932f, 13.203f, 1.996f, 11.205f, 1.996f, 8.754f)
                curveTo(1.996f, 6.241f, 4.034f, 4.203f, 6.548f, 4.203f)
                curveTo(7.051f, 4.203f, 7.537f, 4.285f, 7.99f, 4.436f)
                curveTo(9.126f, 3.323f, 10.632f, 2.625f, 12.384f, 2.625f)
                curveTo(14.067f, 2.625f, 15.608f, 3.235f, 16.797f, 4.245f)
                curveTo(16.998f, 4.217f, 17.204f, 4.203f, 17.414f, 4.203f)
                curveTo(19.928f, 4.203f, 21.966f, 6.241f, 21.966f, 8.754f)
                curveTo(21.966f, 11.166f, 20.091f, 13.139f, 17.72f, 13.296f)
                close()
                moveTo(7.57f, 7.551f)
                curveTo(8.318f, 5.682f, 10.252f, 4.376f, 12.384f, 4.376f)
                curveTo(13.289f, 4.376f, 14.138f, 4.613f, 14.873f, 5.029f)
                curveTo(13.753f, 5.856f, 13.052f, 7.222f, 13.052f, 8.754f)
                horizontalLineTo(14.366f)
                curveTo(14.366f, 7.236f, 15.929f, 5.815f, 17.414f, 5.815f)
                curveTo(18.961f, 5.815f, 20.215f, 7.208f, 20.215f, 8.754f)
                curveTo(20.215f, 10.214f, 19.098f, 11.413f, 17.672f, 11.543f)
                lineTo(17.638f, 10.319f)
                lineTo(16.387f, 10.319f)
                lineTo(16.222f, 16.371f)
                horizontalLineTo(7.756f)
                lineTo(7.636f, 13.175f)
                curveTo(8.297f, 13.013f, 8.902f, 12.706f, 9.413f, 12.291f)
                lineTo(8.634f, 11.242f)
                curveTo(8.074f, 11.633f, 7.216f, 11.805f, 6.548f, 11.805f)
                curveTo(5.001f, 11.805f, 3.747f, 10.301f, 3.747f, 8.754f)
                curveTo(3.747f, 7.208f, 5.001f, 5.954f, 6.548f, 5.954f)
                curveTo(6.635f, 5.954f, 6.721f, 5.958f, 6.806f, 5.966f)
                curveTo(6.612f, 6.299f, 6.442f, 6.648f, 6.297f, 7.012f)
                lineTo(7.57f, 7.551f)
                close()
                moveTo(7.807f, 17.747f)
                lineTo(7.867f, 19.342f)
                horizontalLineTo(16.14f)
                lineTo(16.184f, 17.747f)
                horizontalLineTo(7.807f)
                close()
            }
        }.build()

        return _Chef!!
    }

@Suppress("ObjectPropertyName")
private var _Chef: ImageVector? = null