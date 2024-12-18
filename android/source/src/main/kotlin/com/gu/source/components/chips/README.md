# Chips & supporting buttons

## Chips

A chip is a small, compact UI element used to display information, typically representing 
user inputs, tags, choices, filters, or actions in a concise format.

Source designs & documentation in [Figma][1].

* Chips support two sizes - `Small` and `Medium`.
* Chips support a label, and an icon or image before or after the label.
* Chips support a selected state, and multi-select and single-select modes.
* Chips also support animated expand/collapse of the chip label.

### Usage

The `SourceChip` component implements the chip design. See full [API documentation here][2].

Small chip with no icons, no badge, multi-select disabled:
```kotlin
SourceChip(
    text = "Label",
    isSelected = false,
    size = SourceChip.Size.Small,
    onClick = {},
)
```

Medium chip with a leading icon, a default badge, and multi-select disabled:
```kotlin
SourceChip(
    text = "Label",
    isSelected = false,
    size = SourceChip.Size.Medium,
    showBadge = true,
    onClick = {},
    allowsMultiSelection = true,
    indicatorBefore = ChipIndicator.Icon.Vector(
        imageVector = Source.Icons.Base.Plus,
    ),
)
```

Multi-select chip with a badge and a leading image:
```kotlin
SourceMultiSelectChip(
    text = "Label",
    isSelected = true,
    size = SourceChip.Size.Medium,
    showBadge = true,
    onClick = {},
    indicatorBefore = ChipIndicator.Image.Painter(
        painter = painterResource(R.drawable.marina_hyde),
        contentDescription = null,
    ),
)
```

## Chip supporting button

A chip that acts like a button. It does not support a selected state. The default styling appears
like an outlined button with a border, a text, and an optional icon before the text.

This is particularly useful for chips that represent actions, like "Follow", "Subscribe", etc. Use
this when the button appears inline with a row of `SourceChip` components. 

### Usage

`SourceChipSupportingButton` implements the chip supporting button design. See full [API documentation here][3].

Basic chip supporting button with no icons:
```kotlin
SourceChipSupportingButton(
    text = "Follow",
    size = SourceChip.Size.Medium,
    onClick = {},
)
```

Basic chip supporting button with a leading icon:
```kotlin
SourceChipSupportingButton(
    text = "Follow",
    size = SourceChip.Size.Medium,
    onClick = {},
    indicatorBefore = ChipIndicator.Icon.Vector(
        imageVector = Source.Icons.Base.Plus,
    ),
)
```

## Previews

| Light|Dark|
|---|---|
|![Light](https://github.com/user-attachments/assets/f59696b2-4402-4682-ac2e-791d43721e85)|![Dark](https://github.com/user-attachments/assets/95420000-11d3-486c-80f4-675dd6f5bfc2)|

[1]: https://www.figma.com/design/kSmjgtoTWiG8N7HXxFoGEE/%E2%97%90-Apps-library?node-id=6286-1728
[2]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.chips/-source-chip.html
[3]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.chips/-source-chip.html