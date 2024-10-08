package com.gu.source.icons

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

/** Core minus mark icon. */
@Suppress("UnusedReceiverParameter", "MagicNumber")
val Source.Icons.Base.Minus: ImageVector
    get() = _minus ?: ImageVector.Builder(
        name = "Minus",
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
            moveTo(1f, 10.75f)
            verticalLineTo(13.25f)
            horizontalLineTo(23f)
            verticalLineTo(10.75f)
            horizontalLineTo(1f)
            close()
        }
    }
        .build()
        .also { _minus = it }

@Suppress("TopLevelPropertyNaming", "ktlint:standard:backing-property-naming")
private var _minus: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Icon(
        imageVector = Source.Icons.Base.Minus,
        contentDescription = null,
    )
}