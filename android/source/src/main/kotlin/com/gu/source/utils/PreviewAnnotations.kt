package com.gu.source.utils

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

/** Creates two previews on a Pixel 7 device for light and dark mode. */
@Preview(
    name = "Day mode",
    device = Devices.PIXEL_7,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    backgroundColor = 0xFFFFFFFF,
    showBackground = true,
)
@Preview(
    name = "Night mode",
    device = Devices.PIXEL_7,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    backgroundColor = 0xFF000000,
    showBackground = true,
)
@Preview(
    name = "Scaled font",
    device = Devices.PIXEL_7,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    backgroundColor = 0xFFFFFFFF,
    showBackground = true,
    fontScale = 1.5f,
)
annotation class PreviewPhoneBothMode

/** Creates two previews on a Pixel tablet device for light and dark mode. */
@Preview(
    name = "Day mode",
    device = "spec:parent=pixel_tablet,orientation=portrait",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    backgroundColor = 0xFFFFFFFF,
    showBackground = true,
)
@Preview(
    name = "Night mode",
    device = "spec:parent=pixel_tablet,orientation=portrait",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    backgroundColor = 0xFF000000,
    showBackground = true,
)
@Preview(
    name = "Scaled font",
    device = "spec:parent=pixel_tablet,orientation=portrait",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    backgroundColor = 0xFFFFFFFF,
    showBackground = true,
    fontScale = 1.5f,
)
annotation class PreviewTabletBothMode