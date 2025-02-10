package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.TextSize: ImageVector
    get() {
        if (_TextSize != null) {
            return _TextSize!!
        }
        _TextSize = ImageVector.Builder(
            name = "TextSize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.431f, 14.604f)
                lineTo(4.159f, 18.509f)
                lineTo(5.979f, 18.926f)
                verticalLineTo(19.869f)
                horizontalLineTo(1f)
                verticalLineTo(18.882f)
                lineTo(2.579f, 18.509f)
                lineTo(7.624f, 4.12f)
                horizontalLineTo(9.467f)
                lineTo(14.38f, 18.509f)
                lineTo(15.915f, 18.882f)
                verticalLineTo(19.869f)
                horizontalLineTo(10.125f)
                verticalLineTo(18.926f)
                lineTo(11.923f, 18.509f)
                lineTo(10.651f, 14.604f)
                horizontalLineTo(5.431f)
                close()
                moveTo(5.782f, 13.683f)
                horizontalLineTo(10.388f)
                lineTo(8.194f, 6.95f)
                horizontalLineTo(8.085f)
                lineTo(5.782f, 13.683f)
                close()
                moveTo(21.925f, 18.882f)
                lineTo(23f, 19.189f)
                verticalLineTo(19.869f)
                horizontalLineTo(18.898f)
                verticalLineTo(19.189f)
                lineTo(20.192f, 18.882f)
                lineTo(19.315f, 16.25f)
                horizontalLineTo(15.586f)
                verticalLineTo(16.294f)
                lineTo(15.016f, 14.78f)
                lineTo(17.122f, 8.748f)
                horizontalLineTo(18.438f)
                lineTo(21.925f, 18.882f)
                close()
                moveTo(15.893f, 15.46f)
                horizontalLineTo(19.052f)
                lineTo(17.538f, 10.744f)
                horizontalLineTo(17.473f)
                lineTo(15.893f, 15.46f)
                close()
            }
        }.build()

        return _TextSize!!
    }

@Suppress("ObjectPropertyName")
private var _TextSize: ImageVector? = null