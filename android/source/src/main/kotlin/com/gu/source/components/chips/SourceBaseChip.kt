package com.gu.source.components.chips

import android.annotation.SuppressLint
import androidx.annotation.Discouraged
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Badge
import androidx.compose.material3.Icon
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.R
import com.gu.source.Source
import com.gu.source.components.HorizontalExpandingText
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.icons.base.Checkmark
import com.gu.source.foundation.palette.Neutral10
import com.gu.source.foundation.palette.Neutral46
import com.gu.source.foundation.palette.Neutral93
import com.gu.source.foundation.palette.Sport400
import com.gu.source.foundation.typography.TextSansBold14
import com.gu.source.utils.PreviewPhoneBothMode
import kotlinx.coroutines.delay

/**
 * Object defining the styling information for the base chip.
 */
object SourceBaseChip {
    /**
     * Data model for styling of the base chip.
     *
     * @property fillColour The fill colour of the chip.
     * @property border The border stroke of the chip.
     * @property shape The shape of the chip.
     * @property rippleColour The colour of the ripple effect when the chip is clicked.
     */
    data class Style(
        val fillColour: Color,
        val border: BorderStroke,
        val shape: Shape,
        val rippleColour: Color,
    )
}

/**
 * Composable function to render a customizable chip component with optional badge..
 *
 * @param height Height of the chip container in Dp.
 * @param style Styling information for the chip.
 * @param onClick Callback triggered when the chip is clicked.
 * @param modifier Modifier to adjust the chip layout or appearance.
 * @param allowsMultiSelection Optional - whether the chip allows multiple selections. This is used
 * to set correct semantic role for the chip - checkbox if true, button if false.
 * @param onClickLabel Optional label for the onClick action.
 * @param badge Optional content to display a badge over the chip. Usually a [Badge].
 * @param content The content of the chip.
 */
@Discouraged("Use SourceChip instead")
@Composable
fun SourceBaseChip(
    height: Dp,
    style: SourceBaseChip.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    allowsMultiSelection: Boolean = false,
    onClickLabel: String? = null,
    badge: @Composable (() -> Unit)? = null,
    content: @Composable RowScope.() -> Unit,
) {
    Box(modifier = modifier) {
        Row(
            modifier = Modifier
                // Padding to allow Badge to overflow a bit
                .padding(top = 2.dp)
                .heightIn(min = height)
                .background(color = style.fillColour, shape = style.shape)
                .border(border = style.border, shape = style.shape)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = ripple(color = style.rippleColour),
                    onClickLabel = onClickLabel,
                    role = if (allowsMultiSelection) Role.Checkbox else Role.Button,
                    onClick = onClick,
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            content()
        }
        badge?.invoke()
    }
}

/**
 * Preview function to display the BaseChipView with various configurations.
 */
@SuppressLint("DiscouragedApi")
@PreviewPhoneBothMode
@Composable
private fun SourceBaseChipPreview() {
    val textColor = AppColour(
        light = Source.Palette.Neutral10,
        dark = Source.Palette.Neutral93,
    )
    var text by remember { mutableStateOf("Chip Title") }

    LaunchedEffect(Unit) {
        while (true) {
            delay(timeMillis = 1000)
            text = if (text.isEmpty()) "Chip Title" else ""
        }
    }

    AppColourMode {
        Box(modifier = it.background(Source.Palette.Neutral46)) {
            SourceBaseChip(
                height = SourceChip.Size.Medium.height,
                style = SourceChip.Style.Default.toSourceBaseChipStyle(false),
                onClick = { },
                badge = {
                    Badge(containerColor = Source.Palette.Sport400)
                },
            ) {
                Spacer(modifier = Modifier.width(12.dp))
                Image(
                    painter = painterResource(R.drawable.marina_hyde),
                    contentDescription = null,
                    modifier = it.size(24.dp),
                )
                Spacer(modifier = Modifier.width(8.dp))
                HorizontalExpandingText(
                    text = text,
                    style = Source.Typography.TextSansBold14,
                    colour = textColor.current,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = Source.Icons.Base.Checkmark,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = textColor.current,
                )
                Spacer(modifier = Modifier.width(12.dp))
            }
        }
    }
}