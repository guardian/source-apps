package com.gu.source.components.chips

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// TODO: 07/12/2024 Add previews
/** Represents an icon or image displayed before or after a [SourceChip]'s text. */
sealed class ChipIndicator {
    /**
     * The content to display. The provided modifier _must_ be set on the content.
     * The modifier is used to apply the correct size to the icon/image.
     */
    abstract val content: @Composable RowScope.(Modifier) -> Unit
    internal abstract val height: Dp

    /**
     * Represents an [Icon] displayed before/after the chip's text. Icon will be tinted with
     * the [SourceChip.Style.contentColour]..
     */
    sealed class Icon : ChipIndicator() {
        override val height: Dp = 18.dp

        data class Vector(
            val imageVector: ImageVector,
            val contentDescription: String?,
        ) : Icon() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {
                Icon(
                    imageVector = imageVector,
                    contentDescription = contentDescription,
                    modifier = it,
                )
            }
        }

        data class Painter(
            val painter: androidx.compose.ui.graphics.painter.Painter,
            val contentDescription: String?,
        ) : Icon() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {
                Icon(
                    painter = painter,
                    contentDescription = contentDescription,
                    modifier = it,
                )
            }
        }

        data class Component(
            override val content: @Composable RowScope.(Modifier) -> Unit,
        ) : Icon()
    }

    /** Represents an [Image] displayed before/after the chip's text. */
    sealed class Image : ChipIndicator() {
        override val height: Dp = 24.dp

        data class Vector(
            val imageVector: ImageVector,
            val contentDescription: String?,
        ) : Image() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {
                Image(
                    imageVector = imageVector,
                    contentDescription = contentDescription,
                    modifier = it,
                )
            }
        }

        data class Painter(
            val painter: androidx.compose.ui.graphics.painter.Painter,
            val contentDescription: String?,
        ) : Image() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    modifier = it,
                )
            }
        }

        data class Component(
            override val content: @Composable RowScope.(Modifier) -> Unit,
        ) : Image()
    }

    /** Represents no image or icon displayed before/after the chip's text. */
    data object None : ChipIndicator() {
        override val content: @Composable RowScope.(Modifier) -> Unit = {}
        override val height: Dp = 0.dp
    }
}