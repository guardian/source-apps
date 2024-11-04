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

/** Base double right chevron icon. */
@Suppress("UnusedReceiverParameter")
val Source.Icons.Base.ChevronRightDouble: ImageVector
    get() = _icon ?: Builder(
        name = "ChevronRightDouble",
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
            moveTo(2.7122f, 2.0f)
            lineTo(12.2109f, 11.4987f)
            verticalLineTo(12.5013f)
            lineTo(2.7122f, 22.0f)
            lineTo(1.7598f, 21.0226f)
            lineTo(9.1282f, 12.0f)
            lineTo(1.7598f, 2.9774f)
            lineTo(2.7122f, 2.0f)
            close()
            moveTo(12.7372f, 2.0f)
            lineTo(22.236f, 11.4987f)
            verticalLineTo(12.5013f)
            lineTo(12.7372f, 22.0f)
            lineTo(11.7848f, 21.0226f)
            lineTo(19.1533f, 12.0f)
            lineTo(11.7848f, 2.9774f)
            lineTo(12.7372f, 2.0f)
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
        imageVector = Source.Icons.Base.ChevronRightDouble,
        contentDescription = null,
    )
}