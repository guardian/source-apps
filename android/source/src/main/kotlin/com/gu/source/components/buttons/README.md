# Buttons

Four core button components are available:
- `SourceButton`, 
- `SourceIconButton`
- `PlainSourceButton`
- `SourceBaseIconButton`.

## Source-themed buttons

`SourceButton` ([API Docs][1]) and `SourceIconButton` ([API Docs][2]) are themed buttons. They have
preset style and size variants corresponding to Source specifications. Both _Core_ and 
_Reader Revenue_ themes are provided.

|  | Light | Dark |
|--------|--------|--------|
| Core |![core-light](https://github.com/user-attachments/assets/36ec4bbd-2fac-4ab3-b32a-8733aaeaceeb)|![core-dark](https://github.com/user-attachments/assets/77b4ae66-5943-48fb-983c-0b0ab30c6a36)|
| Reader Revenue |![rr-light](https://github.com/user-attachments/assets/6a7aa129-acd9-4826-9846-553bf22c90e9)|![rr-dark](https://github.com/user-attachments/assets/e7e1f6ba-fd52-4dd6-acd4-1efaae9ce942)| 


### Usage examples

Using `SourceButton`:
```kotlin
SourceButton(
    text = "Sign in",
    priority = SourceButton.Priority.PrimaryOnWhite,
    onClick = {},
    size = SourceButton.Size.Small,
)
```

Using `SourceIconButton` with a Source Icon:
```kotlin
SourceIconButton(
    icon = Source.Icons.Base.Checkmark,
    priority = SourceButton.Priority.SecondaryOnBlue,
    contentDescription = null,
    onClick = {},
    size = SourceButton.Size.Medium,
)
```

Using `SourceIconButton` with a drawable resource:
```kotlin
SourceIconButton(
    painter = painterResource(R.drawable.ic_person),
    priority = SourceButton.Priority.SecondaryOnBlue,
    contentDescription = null,
    onClick = {},
)
```

## Base buttons

`PlainSourceButton` ([API Docs][3]) and `SourceBaseIconButton` ([API Docs][4]) are intended for when
custom colour schemes are needed. They use Source defined sizing but do not use preconfigured 
`priority` or `theme`. They expect to be directly be provided with `ButtonColours`. 
(`PlainSourceButton` is available from version `0.2.1`, `SourceBaseIconButton` is available from 
version `0.3.0`)

### Usage examples

```kotlin
PlainSourceButton(
    text = "Culture themed",
    onClick = {},
    modifier = Modifier.align(CenterHorizontally),
    buttonColours = ButtonColours(
        border = AppColour(
            light = Source.Palette.Culture200,
            dark = Source.Palette.Culture800,
        ),
        container = AppColour(
            light = Source.Palette.Culture800,
            dark = Source.Palette.Culture200,
        ),
        content = AppColour(
            light = Source.Palette.Culture200,
            dark = Source.Palette.Culture800,
        ),
    ),
)
```

```kotlin
SourceBaseIconButton(
    buttonColours = buttonColours,
    size = SourceButton.Size.Small,
    onClick = { },
) {
    Icon(
        imageVector = Source.Icons.Base.ChevronRight,
        contentDescription = null,
        modifier = it,
    )
}
```

[1]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.buttons/-source-button.html
[2]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.buttons/-source-icon-button.html
[3]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.buttons/-plain-source-button.html
[4]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.buttons/-source-base-icon-button.html