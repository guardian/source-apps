package com.gu.source.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.presets.palette.Brand400

/** Core plus mark icon. */
@Suppress("UnusedReceiverParameter", "MagicNumber")
val Source.Icons.Base.Plus: ImageVector
    get() = _plus ?: Builder(
        name = "Plus",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = SolidColor(Source.Palette.Brand400),
            stroke = null,
            strokeLineWidth = 0.0f,
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
    }
        .build()
        .also { _plus = it }

@Suppress("TopLevelPropertyNaming", "ktlint:standard:backing-property-naming")
private var _plus: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Icon(
        imageVector = Source.Icons.Base.Plus,
        contentDescription = null,
    )
}