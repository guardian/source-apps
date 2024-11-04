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

/** Base small left chevron icon. */
@Suppress("UnusedReceiverParameter")
val Source.Icons.Base.ChevronLeftSmall: ImageVector
    get() = _icon ?: Builder(
        name = "ChevronLeftSmall",
        defaultWidth = 24.0.dp,
        defaultHeight = 24.0.dp,
        viewportWidth = 24.0f,
        viewportHeight = 24.0f,
    ).apply {
        path(
            fill = SolidColor(Color(0xFFffffff)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = EvenOdd,
        ) {
            moveTo(15f, 18.03f)
            lineTo(10.075f, 12.015f)
            lineTo(14.995f, 6.03004f)
            lineTo(14.115f, 5.14504f)
            lineTo(7.57495f, 11.685f)
            lineTo(7.57495f, 12.375f)
            lineTo(14.115f, 18.915f)
            lineTo(15f, 18.03f)
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
        imageVector = Source.Icons.Base.ChevronLeftSmall,
        contentDescription = null,
    )
}