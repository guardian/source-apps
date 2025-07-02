package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.ArrowContract: ImageVector
    get() {
        if (_ArrowContract != null) {
            return _ArrowContract!!
        }
        _ArrowContract = ImageVector.Builder(
            name = "ArrowContract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(13.975f, 2.275f)
                verticalLineTo(9.525f)
                lineTo(14.45f, 10f)
                horizontalLineTo(21.725f)
                verticalLineTo(8.75f)
                lineTo(17.225f, 8.15f)
                lineTo(22.975f, 2.425f)
                lineTo(21.55f, 1f)
                lineTo(15.825f, 6.775f)
                lineTo(15.225f, 2.275f)
                horizontalLineTo(13.975f)
                close()
                moveTo(9.975f, 21.725f)
                verticalLineTo(14.475f)
                lineTo(9.5f, 14f)
                horizontalLineTo(2.25f)
                verticalLineTo(15.25f)
                lineTo(6.725f, 15.825f)
                lineTo(1f, 21.575f)
                lineTo(2.4f, 23f)
                lineTo(8.15f, 17.225f)
                lineTo(8.725f, 21.725f)
                horizontalLineTo(9.975f)
                close()
            }
        }.build()

        return _ArrowContract!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowContract: ImageVector? = null