package com.gu.source.icons.core

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.presets.palette.Brand400

val Source.Icons.Core.Plus: ImageVector
    get() {
        if (plus != null) {
            return plus!!
        }
        plus = ImageVector.Builder(
            name = "Plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Source.Palette.Brand400),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(10.8f, 13.2f)
                lineTo(11.225f, 23f)
                horizontalLineTo(12.75f)
                lineTo(13.2f, 13.2f)
                lineTo(23f, 12.75f)
                verticalLineTo(11.225f)
                lineTo(13.2f, 10.8f)
                lineTo(12.75f, 1f)
                horizontalLineTo(11.225f)
                lineTo(10.8f, 10.8f)
                lineTo(1f, 11.225f)
                verticalLineTo(12.75f)
                lineTo(10.8f, 13.2f)
                close()
            }
        }.build()

        return plus!!
    }

@Suppress("ObjectPropertyName")
private var plus: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Icon(
        imageVector = Source.Icons.Core.Plus,
        contentDescription = null,
    )
}