@file:Suppress("MagicNumber")

package com.gu.source.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source

/** Base double left chevron icon. */
@Suppress("UnusedReceiverParameter")
val Source.Icons.Base.ChevronLeftDouble: ImageVector
    get() = _icon ?: Builder(
        name = "ChevronLeftDouble",
        defaultWidth = 24.0.dp,
        defaultHeight = 24.0.dp,
        viewportWidth = 24.0f,
        viewportHeight = 24.0f,
    ).apply {
        path(
            fill = SolidColor(Color(0xFF052962)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = EvenOdd,
        ) {
            moveTo(11.2585f, 2.0f)
            lineTo(12.2109f, 2.9774f)
            lineTo(4.8425f, 12.0f)
            lineTo(12.2109f, 21.0226f)
            lineTo(11.2585f, 22.0f)
            lineTo(1.7598f, 12.5013f)
            verticalLineTo(11.4987f)
            lineTo(11.2585f, 2.0f)
            close()
            moveTo(21.2836f, 2.0f)
            lineTo(22.236f, 2.9774f)
            lineTo(14.8675f, 12.0f)
            lineTo(22.236f, 21.0226f)
            lineTo(21.2836f, 22.0f)
            lineTo(11.7848f, 12.5013f)
            verticalLineTo(11.4987f)
            lineTo(21.2836f, 2.0f)
            close()
        }
    }
        .build()
        .also { _icon = it }

@Suppress("TopLevelPropertyNaming", "ktlint:standard:backing-property-naming")
private var _icon: ImageVector? = null

@Preview
@Composable
private fun Preview() {
    Icon(
        imageVector = Source.Icons.Base.ChevronLeftDouble,
        contentDescription = null,
    )
}