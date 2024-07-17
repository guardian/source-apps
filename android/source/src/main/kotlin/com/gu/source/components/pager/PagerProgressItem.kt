package com.gu.source.components.pager

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

private const val ScaleOffsetOne = 0.75F
private const val ScaleOffsetTwo = 0.5F

/**
 * Draws a single pager progress indicator item.
 *
 * The item size is scaled down based on its position relative to the selected index. Fill colour
 * is based on selected state.
 *
 * @param index The index of the item to be drawn.
 * @param selectedIndex The index of the selected item.
 * @param selectedIndicatorSize The size of the selected indicator.
 * @param selectedColour The colour of the selected indicator.
 * @param unSelectedColour The colour of the unselected indicator.
 * @param modifier The modifier to be applied to the item.
 */
@Composable
internal fun PagerProgressItem(
    index: Int,
    selectedIndex: Int,
    selectedIndicatorSize: Dp,
    selectedColour: Color,
    unSelectedColour: Color,
    modifier: Modifier = Modifier,
) {
    val size by animateDpAsState(
        targetValue = selectedIndicatorSize * when (index) {
            selectedIndex -> 1f
            selectedIndex - 1, selectedIndex + 1 -> ScaleOffsetOne
            else -> ScaleOffsetTwo
        },
        label = "PagerIndicatorItemSize",
    )

    val colour by animateColorAsState(
        targetValue = if (index == selectedIndex) selectedColour else unSelectedColour,
        label = "PagerIndicatorItemColour",
    )

    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(
                color = colour,
                shape = CircleShape,
            ),
    )
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
                selectedIndicatorSize = 16.dp,
                selectedColour = Color.Red,
                unSelectedColour = Color.Gray,
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