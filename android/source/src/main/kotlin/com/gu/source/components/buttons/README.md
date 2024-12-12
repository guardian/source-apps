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

| Core theme | Reader revenue theme |
| --- | --- |
| ![Core themed text only buttons](https://github.com/user-attachments/assets/e69393fb-675b-4f0e-9f52-62a28736bcfc) | ![Reader revenue themed text only buttons](https://github.com/user-attachments/assets/7ca3d409-252e-45e1-964f-efd03b1ebe39) |

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

Using `SourceIconButton` with a Material Icon:
```kotlin
SourceIconButton(
    icon = Icons.Default.Person,
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