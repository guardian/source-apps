//[source](../../index.md)/[com.gu.source.components.pager](index.md)/[PagerProgressBar](-pager-progress-bar.md)

# PagerProgressBar

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [PagerProgressBar](-pager-progress-bar.md)(pagerState: [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, buttonColours: [ButtonColours](../com.gu.source.components.buttons/-button-colours/index.md) = DefaultButtonColours, disabledButtonColours: [ButtonColours](../com.gu.source.components.buttons/-button-colours/index.md)? = disabledModeButtonColours(buttonColours), selectedIndicatorColour: [AppColour](../com.gu.source.daynight/-app-colour/index.md) = DefaultSelectedIndicatorColour, unSelectedIndicatorColour: [AppColour](../com.gu.source.daynight/-app-colour/index.md) = DefaultUnSelectedIndicatorColour, prevButtonContentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, nextButtonContentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, showProgressButtons: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = isTabletDevice(), pageSlideAnimationSpec: [AnimationSpec](https://developer.android.com/reference/kotlin/androidx/compose/animation/core/AnimationSpec.html)&lt;[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)&gt; = DefaultPageSlideAnimationSpec)

A progress bar that shows the current page of a [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html) and, on tablets, allows the user to navigate between pages using next/prev buttons.

#### Parameters

androidJvm

| | |
|---|---|
| pagerState | The [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html) that this indicator should be bound to. |
| modifier |
| buttonColours | The colours for the next/prev buttons. |
| disabledButtonColours | The colours for the next/prev buttons when they are disabled. |
| selectedIndicatorColour | The colour of the selected indicator item. |
| unSelectedIndicatorColour | The colour of the unselected indicators items. |
| prevButtonContentDescription | The content description for the previous button. |
| nextButtonContentDescription | The content description for the next button. |
| showProgressButtons | Whether to show the next/prev buttons. By default they are enabled on tablet devices (`sw600dp`). |
| pageSlideAnimationSpec | The animation spec to use when animating to the next/prev page. This is only used when the user uses prev/next buttons to navigate between pages. |

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [PagerProgressBar](-pager-progress-bar.md)(pagerState: [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html), buttonPriority: [SourceButton.Priority](../com.gu.source.components.buttons/-source-button/-priority/index.md), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, selectedIndicatorColour: [AppColour](../com.gu.source.daynight/-app-colour/index.md) = DefaultSelectedIndicatorColour, unSelectedIndicatorColour: [AppColour](../com.gu.source.daynight/-app-colour/index.md) = DefaultUnSelectedIndicatorColour, prevButtonContentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, nextButtonContentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, showProgressButtons: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = isTabletDevice(), pageSlideAnimationSpec: [AnimationSpec](https://developer.android.com/reference/kotlin/androidx/compose/animation/core/AnimationSpec.html)&lt;[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)&gt; = DefaultPageSlideAnimationSpec)

A progress bar that shows the current page of a [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html) and, on tablets, allows the user to navigate between pages using next/prev buttons.

#### Parameters

androidJvm

| | |
|---|---|
| pagerState | The [PagerState](https://developer.android.com/reference/kotlin/androidx/compose/foundation/pager/PagerState.html) that this indicator should be bound to. |
| buttonPriority | The priority for the next previous buttons. Priority decides the button colours. |
| modifier |
| selectedIndicatorColour | The colour of the selected indicator item. |
| unSelectedIndicatorColour | The colour of the unselected indicators items. |
| prevButtonContentDescription | The content description for the previous button. |
| nextButtonContentDescription | The content description for the next button. |
| showProgressButtons | Whether to show the next/prev buttons. By default they are enabled on tablet devices (`sw600dp`). |
| pageSlideAnimationSpec | The animation spec to use when animating to the next/prev page. This is only used when the user uses prev/next buttons to navigate between pages. |
