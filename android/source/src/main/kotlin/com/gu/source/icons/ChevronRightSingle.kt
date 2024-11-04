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

/** Base single right chevron icon. */
@Suppress("UnusedReceiverParameter")
val Source.Icons.Base.ChevronRightSingle: ImageVector
    get() = _icon ?: Builder(
        name = "ChevronRightSingle",
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
            moveTo(8.2317f, 1.0f)
            lineTo(7.25f, 1.9565f)
            lineTo(15.6321f, 12.0f)
            lineTo(7.25f, 22.0435f)
            lineTo(8.2317f, 23.0f)
            lineTo(18.7031f, 12.5286f)
            verticalLineTo(11.4714f)
            lineTo(8.2317f, 1.0f)
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
        imageVector = Source.Icons.Base.ChevronRightSingle,
        contentDescription = null,
    )
}