package com.gu.source.components.pager

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import androidx.compose.ui.util.lerp
import com.gu.source.Source
import com.gu.source.presets.palette.Neutral73
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
 * @param unselectedItemScaling The scaling factor for unselected items.
 * @param numberOfItemsToScale The number of items to spread scaling across on each side of
 * selected item.
 * @param itemShape Shape for the item.
 * @param modifier The modifier to be applied to the item.
 */
@Composable
internal fun PagerProgressItem(
    itemIndex: Int,
    selectedItemIndex: Int,
    selectedItemSize: Dp,
    selectedColour: Color,
    unSelectedColour: Color,
    unselectedItemScaling: Float,
    numberOfItemsToScale: Int,
    itemShape: Shape,
    modifier: Modifier = Modifier,
) {
    val colour by animateColorAsState(
        targetValue = if (itemIndex == selectedItemIndex) selectedColour else unSelectedColour,
        label = "PagerIndicatorItemColour",
    )

    val indexDifference = (itemIndex - selectedItemIndex).absoluteValue
    val adjustedNumberOfItemsToScale = (numberOfItemsToScale + 1).coerceAtLeast(1).toFloat()

    val itemScale by animateFloatAsState(
        targetValue = lerp(
            start = 1f,
            stop = unselectedItemScaling,
            fraction = indexDifference / adjustedNumberOfItemsToScale,
        ).coerceAtLeast(unselectedItemScaling),
        label = "PagerIndicatorItemScale",
    )

    val itemSize by animateDpAsState(
        targetValue = itemScale * selectedItemSize,
        label = "PagerIndicatorItemSize",
    )

    Box(modifier = modifier.size(selectedItemSize)) {
        Box(
            modifier = Modifier
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
        mutableIntStateOf(3)
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
                selectedColour = Source.Palette.Sport500,
                unSelectedColour = Source.Palette.Neutral73,
                unselectedItemScaling = 0.5f,
                numberOfItemsToScale = 1,
                itemShape = CircleShape,
            )
        }
    }

    LaunchedEffect(Unit) {
        while (true) {
            delay(1000)
            selectedItem = (selectedItem + 1) % 5
        }
    }
}