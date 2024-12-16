package com.gu.source.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.presets.palette.Brand400

@Suppress("UnusedReceiverParameter", "NamedArguments")
val Source.Icons.Base.Ellipsis: ImageVector
    get() = _ellipsis ?: ImageVector.Builder(
        name = "Ellipsis",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = SolidColor(Source.Palette.Brand400),
            pathFillType = PathFillType.EvenOdd,
        ) {
            moveTo(7.051f, 10.207f)
            lineTo(6.343f, 9.5f)
            horizontalLineTo(2.707f)
            lineTo(2f, 10.207f)
            verticalLineTo(13.843f)
            lineTo(2.707f, 14.55f)
            horizontalLineTo(6.343f)
            lineTo(7.051f, 13.843f)
            verticalLineTo(10.207f)
            close()
            moveTo(14.525f, 10.207f)
            lineTo(13.818f, 9.5f)
            horizontalLineTo(10.182f)
            lineTo(9.475f, 10.207f)
            verticalLineTo(13.843f)
            lineTo(10.182f, 14.55f)
            horizontalLineTo(13.818f)
            lineTo(14.525f, 13.843f)
            verticalLineTo(10.207f)
            close()
            moveTo(22f, 10.207f)
            lineTo(21.293f, 9.5f)
            horizontalLineTo(17.656f)
            lineTo(16.949f, 10.207f)
            verticalLineTo(13.843f)
            lineTo(17.656f, 14.55f)
            horizontalLineTo(21.293f)
            lineTo(22f, 13.843f)
            verticalLineTo(10.207f)
            close()
        }
    }
        .build()
        .also { _ellipsis = it }

@Suppress("TopLevelPropertyNaming", "ktlint:standard:backing-property-naming")
private var _ellipsis: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Icon(
        imageVector = Source.Icons.Base.Ellipsis,
        contentDescription = null,
    )
}