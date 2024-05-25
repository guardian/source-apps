package com.gu.source.utils

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

/** Creates two previews on a Pixel 7 device for light and dark mode. */
@Preview(
    name = "Pixel 7 day mode",
    device = Devices.PIXEL_7,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    backgroundColor = 0xFFFFFFFF,
    showBackground = true,
)
@Preview(
    name = "Pixel 7 night mode",
    device = Devices.PIXEL_7,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    backgroundColor = 0xFF000000,
    showBackground = true,
)
annotation class PhoneBothModePreviews

/** Creates two previews on a Pixel tablet device for light and dark mode. */
@Preview(
    name = "Pixel tablet day mode",
    device = Devices.PIXEL_TABLET,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    backgroundColor = 0xFFFFFFFF,
    showBackground = true,
)
@Preview(
    name = "Pixel tablet night mode",
    device = Devices.PIXEL_TABLET,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    backgroundColor = 0xFF000000,
    showBackground = true,
)
annotation class TabletBothModePreviews