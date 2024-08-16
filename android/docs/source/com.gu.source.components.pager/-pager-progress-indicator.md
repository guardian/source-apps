//[source](../../index.md)/[com.gu.source.components.pager](index.md)/[PagerProgressIndicator](-pager-progress-indicator.md)

# PagerProgressIndicator

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [PagerProgressIndicator](-pager-progress-indicator.md)(pagerState: [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html), selectedIndicatorColour: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html), unSelectedIndicatorColour: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, maxIndicatorCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DefaultIndicatorCount, indicatorSpacing: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = DefaultItemSpacing, indicatorShape: [Shape](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Shape.html) = CircleShape, selectedItemSize: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = DefaultSelectedItemSize, unselectedItemScaleFactor: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = DefaultUnselectedItemScaling, numberOfItemsToScale: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DefaultNumberOfItemsToScale, itemsVerticalAlignment: [Alignment.Vertical](https://developer.android.com/reference/kotlin/androidx/compose/ui/Alignment.Vertical.html) = Alignment.CenterVertically)

A pager progress indicator that displays progress indicators to represent progress in a [HorizontalPager](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/package-summary.html) or a [VerticalPager](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/package-summary.html).

To turn off item scaling, set [unselectedItemScaleFactor](-pager-progress-indicator.md) to `1f`.

#### Parameters

androidJvm

| | |
|---|---|
| pagerState | The [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html) that this indicator should be bound to. |
| selectedIndicatorColour | The colour to use for the selected page indicator. |
| unSelectedIndicatorColour | The colour to use for the unselected page indicator. |
| modifier | The modifier to apply to the layout. |
| maxIndicatorCount | The maximum number of indicators to display. The maximum is constrained to the number of pages in the [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html). The count will be scaled down to the next lower odd number if its even. |
| indicatorSpacing | Horizontal spacing between indicator. Defaults to DefaultItemSpacing. |
| indicatorShape | The shape to use for the indicator. Defaults to [CircleShape](https://developer.android.com/reference/kotlin/androidx/compose/foundation/shape/package-summary.html). |
| selectedItemSize | The size of each item. Defaults to DefaultSelectedItemSize. |
| unselectedItemScaleFactor | The scaling factor for unselected items as a ratio of the [selectedItemSize](-pager-progress-indicator.md). Set this to `1F` to disable scaling. |
| numberOfItemsToScale | The number of items to scale in size. This will be scaled down to the next lower odd number if its even. |
| itemsVerticalAlignment | The vertical alignment to use for the items. Defaults to [Alignment.CenterVertically](https://developer.android.com/reference/kotlin/androidx/compose/ui/Alignment.Companion.html#centervertically). |
