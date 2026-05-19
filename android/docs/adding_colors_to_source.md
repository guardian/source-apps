# Adding Colors to Source

The design system team may want to add new colors from time to time. Developers are responsible for adding them to the Source repository to be used.

## Outline

The design system team will typically provide a color under a certain category in The Guardian app i.e. `Brand`, `Success`, `News`, `Opinion`, `Sport`, `Culture`, `Lifestyle`, etc.

The colors are defined in the Figma file [Here](https://www.figma.com/design/b2qv2OMLoNCYnP01ipfrP7/%E2%97%88-Core-library?node-id=4229-96590&t=Yx6Rt423B9TxRRqz-0).

We have a preview in the `source-apps` repository that displays all of our currently defined colors in `PalettePreview.kt`.

### Steps to add a new color

Define the color in the `Pallette.kt` file, specifying the name of the Color and the Hex code.

```kotlin
    val Source.Palette.SuccessXYZ: Color // XYZ will usually represent a number like 450
        get() = Color(color = 0xff28a85f)
```

Specify the color in the `palette.xml` file in the appropriate region:

```xml
    <color name="success_xyz">#28a85f</color>
```

Add the Color to the `PalettePreview.kt` file to be able to see it in the preview:

```kotlin
    Colour("Success450", Source.Palette.Success450)
```

Update the `palette.png` file:
- Take a screenshot of the updated Palette preview ensuring to maintain the dimensions and replace the old file with the new png file.

Confirm the color appearance with the design system team for a final approval.