package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Reload: ImageVector
    get() {
        if (_Reload != null) {
            return _Reload!!
        }
        _Reload = ImageVector.Builder(
            name = "Reload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12.019f, 22f)
                curveTo(15.436f, 22f, 18.465f, 20.269f, 20.242f, 17.649f)
                lineTo(20.128f, 17.034f)
                lineTo(19.331f, 16.556f)
                lineTo(18.716f, 16.715f)
                curveTo(17.235f, 18.811f, 14.821f, 20.201f, 12.019f, 20.201f)
                curveTo(7.531f, 20.201f, 3.841f, 16.51f, 3.841f, 11.977f)
                curveTo(3.841f, 7.467f, 7.531f, 3.8f, 12.019f, 3.8f)
                curveTo(14.593f, 3.8f, 16.803f, 4.938f, 18.329f, 6.761f)
                lineTo(15.026f, 7.308f)
                lineTo(15.026f, 8.446f)
                lineTo(20.857f, 8.446f)
                lineTo(21.29f, 8.014f)
                lineTo(21.29f, 2f)
                lineTo(20.174f, 2f)
                lineTo(19.604f, 5.44f)
                curveTo(17.782f, 3.321f, 15.094f, 2f, 12.019f, 2f)
                curveTo(6.484f, 2f, 1.996f, 6.465f, 1.996f, 11.977f)
                curveTo(1.996f, 17.535f, 6.484f, 22f, 12.019f, 22f)
                close()
            }
        }.build()

        return _Reload!!
    }

@Suppress("ObjectPropertyName")
private var _Reload: ImageVector? = null