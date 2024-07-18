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
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue

/**
 * Draws a single pager progress indicator item.
 *
 * The item size is scaled down based on its position relative to the selected index. Fill colour
 * is based on selected state.
 *
 * @param index The index of the item to be drawn.
 * @param selectedIndex The index of the selected item.
 * @param boxSize The size of the selected indicator.
 * @param selectedColour The colour of the selected indicator.
 * @param unSelectedColour The colour of the unselected indicator.
 * @param modifier The modifier to be applied to the item.
 * @param shape Optional shape for the item. Defaults to [CircleShape].
 */
@Composable
internal fun PagerProgressItem(
    index: Int,
    selectedIndex: Int,
    boxSize: Dp,
    selectedItemSize: Dp,
    selectedColour: Color,
    unSelectedColour: Color,
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    unselectedItemScaleOffset: Float = DefaultScaleOffset
) {
    val colour by animateColorAsState(
        targetValue = if (index == selectedIndex) selectedColour else unSelectedColour,
        label = "PagerIndicatorItemColour",
    )

    val size by animateFloatAsState(
        targetValue = lerp(
            start = 1f,
            stop = unselectedItemScaleOffset,
            fraction = (index - selectedIndex).absoluteValue / 2f,
        ).coerceAtLeast(unselectedItemScaleOffset),
    )

    val indicatorSize1 by animateDpAsState(size * selectedItemSize)

    Box(modifier = modifier.size(boxSize)) {
        Box(
            modifier = Modifier
                .size(indicatorSize1)
                .background(
                    color = colour,
                    shape = shape,
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
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        repeat(5) {
            PagerProgressItem(
                index = it,
                selectedIndex = selectedItem,
                boxSize = 16.dp,
                selectedColour = Color.Red,
                unSelectedColour = Color.Gray,
                selectedItemSize = 16.dp,
            )
        }
    }

    LaunchedEffect(key1 = Unit) {
        while (true) {
            delay(1000)
            selectedItem = (selectedItem + 1) % 5
        }
    }
}