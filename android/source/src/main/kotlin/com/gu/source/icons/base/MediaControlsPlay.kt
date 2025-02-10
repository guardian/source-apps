package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.MediaControlsPlay: ImageVector
    get() {
        if (_MediaControlsPlay != null) {
            return _MediaControlsPlay!!
        }
        _MediaControlsPlay = ImageVector.Builder(
            name = "MediaControlsPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(8f, 5f)
                    horizontalLineToRelative(11.2f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(-11.2f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF052962)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(19.2f, 12.39f)
                    verticalLineTo(11.67f)
                    lineTo(8.59f, 5f)
                    lineTo(8f, 5.36f)
                    verticalLineTo(18.59f)
                    lineTo(8.59f, 19f)
                    lineTo(19.2f, 12.39f)
                    close()
                }
            }
        }.build()

        return _MediaControlsPlay!!
    }

@Suppress("ObjectPropertyName")
private var _MediaControlsPlay: ImageVector? = null