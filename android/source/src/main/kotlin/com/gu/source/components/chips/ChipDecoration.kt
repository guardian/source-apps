package com.gu.source.components.chips

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.R
import com.gu.source.Source
import com.gu.source.components.chips.ChipDecoration.Icon
import com.gu.source.components.chips.ChipDecoration.Image
import com.gu.source.icons.Checkmark

/**
 * Represents an icon or image displayed before or after a [SourceChip]'s text.
 *
 * [Icon]s are `18.dp` tall and the [Image]s are `24.dp` tall.
 *
 * The icon or image will be tinted with the [SourceChip.Style.contentColour]. To override the
 * tinting, use [ChipDecoration.Icon.Component] or [ChipDecoration.Image.Component] and provide a
 * custom composable function with the desired colour.
 *
 * For icons, prefer to use [ChipDecoration.Icon.Vector] with a [Source.Icons] vector where possible.
 * Alternatively use [ChipDecoration.Icon.Painter] with a drawable resource ID.
 *
 * For images, prefer to use [ChipDecoration.Image.Painter] for static images. For images fetched
 * from the network, use [ChipDecoration.Image.Component] with a custom composable function.
 */
sealed class ChipDecoration {
    /**
     * The content to display. The provided modifier _must_ be set on the content.
     * The modifier is used to apply the correct size to the icon/image.
     */
    abstract val content: @Composable RowScope.(Modifier) -> Unit

    /** The height of the icon/image. */
    abstract val height: Dp

    /**
     * Represents an [Icon] displayed before/after the chip's text. Icons are `18.dp` tall and will
     * be tinted with the [SourceChip.Style.contentColour].
     */
    sealed class Icon : ChipDecoration() {
        override val height: Dp = 18.dp

        /**
         * Represents an [ImageVector] displayed before/after the chip's text. The icon will be
         * `18.dp` tall and will be tinted with [SourceChip.Style.contentColour].
         *
         * @property imageVector The [ImageVector] to display.
         * @property contentDescription Optional content description for the icon.
         */
        data class Vector(
            val imageVector: ImageVector,
            val contentDescription: String? = null,
        ) : Icon() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {
                Icon(
                    imageVector = imageVector,
                    contentDescription = contentDescription,
                    modifier = it,
                )
            }
        }

        /**
         * Represents a [androidx.compose.ui.graphics.painter.Painter] displayed before/after the
         * chip's text. The icon will be `18.dp` tall and will be tinted with
         * [SourceChip.Style.contentColour].
         *
         * @property painter The [androidx.compose.ui.graphics.painter.Painter] to display.
         * @property contentDescription Optional content description for the icon.
         */
        data class Painter(
            val painter: androidx.compose.ui.graphics.painter.Painter,
            val contentDescription: String? = null,
        ) : Icon() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {
                Icon(
                    painter = painter,
                    contentDescription = contentDescription,
                    modifier = it,
                )
            }
        }

        /**
         * Represents a composable function that displays an icon before/after the chip's text.
         * The icon will be `18.dp` tall and will be tinted with [SourceChip.Style.contentColour] if
         * no color is set in the component.
         *
         * @property content The composable function to display the icon. The provided modifier
         * _must_ be set on the content.
         */
        data class Component(
            override val content: @Composable RowScope.(Modifier) -> Unit,
        ) : Icon()
    }

    /**
     * Represents an [Image] displayed before/after the chip's text. Images are `24.dp` tall.
     */
    sealed class Image : ChipDecoration() {
        override val height: Dp = 24.dp

        /**
         * Represents an [ImageVector] displayed before/after the chip's text. The image will be
         * `24.dp` tall and will be tinted with [SourceChip.Style.contentColour].
         *
         * @property imageVector The [ImageVector] to display.
         * @property contentDescription Optional content description for the image.
         */
        data class Vector(
            val imageVector: ImageVector,
            val contentDescription: String? = null,
        ) : Image() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {
                Image(
                    imageVector = imageVector,
                    contentDescription = contentDescription,
                    modifier = it,
                )
            }
        }

        /**
         * Represents a [androidx.compose.ui.graphics.painter.Painter] displayed before/after the
         * chip's text. The image will be `24.dp` tall and will be tinted with
         * [SourceChip.Style.contentColour].
         *
         * @property painter The [androidx.compose.ui.graphics.painter.Painter] to display.
         * @property contentDescription Optional content description for the image.
         */
        data class Painter(
            val painter: androidx.compose.ui.graphics.painter.Painter,
            val contentDescription: String? = null,
        ) : Image() {
            override val content: @Composable RowScope.(Modifier) -> Unit = {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    modifier = it,
                )
            }
        }

        /**
         * Represents a composable function that displays an image before/after the chip's text.
         * The image will be `24.dp` tall.
         *
         * @property content The composable function to display the image. The provided modifier
         * _must_ be set on the content.
         */
        data class Component(
            override val content: @Composable RowScope.(Modifier) -> Unit,
        ) : Image()
    }

    /** Represents no image or icon displayed before/after the chip's text. */
    data object None : ChipDecoration() {
        override val content: @Composable RowScope.(Modifier) -> Unit = {}
        override val height: Dp = 0.dp
    }
}

@SuppressLint("DiscouragedApi")
@Preview
@Composable
private fun Preview() {
    Row(
        modifier = Modifier
            .background(Color.Gray)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        CompositionLocalProvider(LocalContentColor provides Color.White) {
            listOf(
                Icon.Vector(imageVector = Source.Icons.Base.Checkmark),
                Icon.Painter(painter = painterResource(id = R.drawable.ic_list)),
                Icon.Component {
                    Icon(
                        imageVector = Source.Icons.Base.Checkmark,
                        contentDescription = "Check",
                        modifier = Modifier.size(18.dp),
                    )
                },

                Image.Vector(imageVector = Source.Icons.Base.Checkmark),
                Image.Painter(painter = painterResource(id = R.drawable.marina_hyde)),
                Image.Component {
                    Image(
                        painter = painterResource(id = R.drawable.marina_hyde),
                        contentDescription = "Marina Hyde",
                        modifier = Modifier.size(24.dp),
                    )
                },
            ).forEach { it.content(this, Modifier.height(it.height)) }
        }
    }
}