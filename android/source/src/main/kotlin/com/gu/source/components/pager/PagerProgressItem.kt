package com.gu.source.components.pager

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import androidx.compose.ui.util.lerp
import com.gu.source.Source
import com.gu.source.presets.palette.Labs400
import com.gu.source.presets.palette.Neutral73
import com.gu.source.presets.palette.News550
import com.gu.source.presets.palette.Sport500
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue

/**
 * Draws a single pager progress indicator item.
 *
 * The item size is scaled down based on its position relative to the selected index. Fill colour
 * is based on selected state.
 *
 * @param itemIndex The index of the item to be drawn.
 * @param selectedItemIndex The index of the selected item.
 * @param selectedItemSize The size of the selected indicator.
 * @param selectedColour The colour of the selected indicator.
 * @param unSelectedColour The colour of the unselected indicator.
 * @param unselectedItemScaleFactor The scaling factor for unselected items as a ratio of the
 * [selectedItemSize].
 * @param numberOfItemsToScale The number of items to scale in size, including selected item.
 * @param itemShape Shape for the item.
 * @param modifier The modifier to be applied to the item.
 * @param rotate Fun argument to rotate items as they animate. Works with non-circle shapes.
 */
@Composable
internal fun PagerProgressItem(
    itemIndex: Int,
    selectedItemIndex: Int,
    selectedItemSize: Dp,
    selectedColour: Color,
    unSelectedColour: Color,
    unselectedItemScaleFactor: Float,
    numberOfItemsToScale: Int,
    itemShape: Shape,
    modifier: Modifier = Modifier,
    rotate: Boolean = false,
) {
    require(numberOfItemsToScale > 0 && numberOfItemsToScale % 2 == 1) {
        "numberOfItemsToScale must be an odd number greater than 0"
    }

    val colour by animateColorAsState(
        targetValue = if (itemIndex == selectedItemIndex) selectedColour else unSelectedColour,
        label = "PagerIndicatorItemColour",
    )

    val indexDifference = (itemIndex - selectedItemIndex).absoluteValue
    val scaleSpread = ((numberOfItemsToScale - 1) / 2 + 1)
        .coerceAtLeast(1)
        .toFloat()

    val itemScale by animateFloatAsState(
        targetValue = lerp(
            start = 1f,
            stop = unselectedItemScaleFactor,
            fraction = indexDifference / scaleSpread,
        ).coerceAtLeast(unselectedItemScaleFactor),
        label = "PagerIndicatorItemScale",
    )

    val itemSize by animateDpAsState(
        targetValue = itemScale * selectedItemSize,
        label = "PagerIndicatorItemSize",
    )

    val rotation by animateFloatAsState(
        targetValue = if (!rotate) 0f else 90f * (itemIndex - selectedItemIndex).absoluteValue,
        label = "PagerIndicatorItemRotation",
    )

    Box(modifier = modifier.size(selectedItemSize)) {
        Box(
            modifier = Modifier
                .rotate(rotation)
                .size(itemSize)
                .background(
                    color = colour,
                    shape = itemShape,
                )
                .align(Alignment.Center),
        )
    }
}

@Preview
@Composable
private fun Preview() {
    var selectedItem by remember {
        mutableIntStateOf(2)
    }

    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            repeat(5) {
                PagerProgressItem(
                    itemIndex = it,
                    selectedItemIndex = selectedItem,
                    selectedItemSize = 16.dp,
                    selectedColour = Source.Palette.Sport500,
                    unSelectedColour = Source.Palette.Neutral73,
                    unselectedItemScaleFactor = 0.5f,
                    numberOfItemsToScale = 3,
                    itemShape = CircleShape,
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            repeat(5) {
                PagerProgressItem(
                    itemIndex = it,
                    selectedItemIndex = selectedItem,
                    selectedItemSize = 16.dp,
                    selectedColour = Source.Palette.News550,
                    unSelectedColour = Source.Palette.Neutral73,
                    unselectedItemScaleFactor = 0.5f,
                    numberOfItemsToScale = 3,
                    itemShape = AbsoluteCutCornerShape(50),
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            repeat(5) {
                PagerProgressItem(
                    itemIndex = it,
                    selectedItemIndex = selectedItem,
                    selectedItemSize = 16.dp,
                    selectedColour = Source.Palette.Labs400,
                    unSelectedColour = Source.Palette.Neutral73,
                    unselectedItemScaleFactor = 0.5f,
                    numberOfItemsToScale = 1,
                    itemShape = RectangleShape,
                    rotate = true,
                )
            }
        }
    }

    LaunchedEffect(Unit) {
        while (true) {
            delay(1000)
            selectedItem = (selectedItem + 1) % 5
        }
    }
}