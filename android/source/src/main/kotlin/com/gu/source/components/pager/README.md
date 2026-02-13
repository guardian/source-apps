# Paging indicators & buttons

There are three pager components available:

1. `PagerProgressBar` - a higher level component that combines the above two
   and has different phone and tablet behaviour.
2. `PagerProgressIndicator` - a set of highly customisable indicators to signify progress as a user
   progresses through the items in the pager.
3. `PagerProgressButtons` - buttons to allow user to go to next/previous page in a pager.

## `PagerProgressBar`

The `PagerProgressBar` component is used to signify progress as a user flips through the items in a
`HorizontalPager`. It is typically used for image carousels, and is expected to be placed below the
pager.

On tablets, the bar also displays `PagerProgressButtons` to allow the user to go to the next or
previous pages.

See the [full API Docs here][3].

### Usage example

![Progress bar for tablets](https://github.com/user-attachments/assets/ec1c2520-8c2c-42c0-9a8c-631054e77a67)


```kotlin
Column(
    modifier = modifier.widthIn(max = 695.dp),
) {
    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .aspectRatio(695 / 544f)
            .clip(RoundedCornerShape(16.dp)),
    ) { page ->
        SampleImage(
            randomKey = page,
            modifier = Modifier.fillMaxWidth(),
        )
    }
    
    // Place the bar below the pager
    PagerProgressBar(pagerState = pagerState)
}
```

[1]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.pager/-pager-progress-indicator.html
[2]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.pager/-pager-progress-buttons.html
[3]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.pager/-pager-progress-bar.html

## `PagerProgressIndicator`

`PagerProgressIndicator` is a lower level component used to signify progress in a pager. It provides
a options for customising appearance of the indicators. See the [full API Docs here][1].

### Usage example:

![Custom indicator styling](https://github.com/user-attachments/assets/2d08a04d-a146-4ab0-a61c-5b8a89502cd1)


```kotlin
Column(modifier = Modifier.padding(8.dp)) {
    HorizontalPager(state = pagerState) {
        Box(
            modifier = Modifier
                .size(400.dp)
                .background(Source.Palette.Neutral86, RoundedCornerShape(8.dp)),
        ) {
            Text(
                text = (it + 1).toString(),
                style = Source.Typography.Titlepiece70,
                modifier = Modifier.align(Alignment.Center),
                color = Source.Palette.Neutral46,
            )
        }
    }
    
    // Place indicator below the pager, style it and set alignment explicitly
    PagerProgressIndicator(
        pagerState = pagerState,
        selectedIndicatorColour = Source.Palette.Sport500,
        unSelectedIndicatorColour = Source.Palette.Sport500.copy(alpha = 0.3F),
        indicatorShape = CutCornerShape(8.dp),
        maxIndicatorCount = 7,
        numberOfItemsToScale = 5,
        modifier = Modifier
            .padding(top = 8.dp)
            .align(Alignment.CenterHorizontally),
    )
}
```

## `PagerProgressButton`s

A set of next & previous icon buttons to progress through the pages. The button
enabled state depends on availability of a next/previous page. See the [full API Docs here][2].