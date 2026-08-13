package com.gu.source.utils

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewWrapper

/**
 * Creates four previews - for light and dark mode, scaled font, and a narrow device.
 *
 * Use [PreviewAllDeviceBothMode] to create previews for both phone and tablet devices.
 */
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
    name = "Samsung S20 (narrow device)",
    device = "spec:width=945px,height=2400px",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    backgroundColor = 0xFFFFFFFF,
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
@PreviewWrapper(AppColourWrapper::class)
annotation class PreviewPhoneBothMode

/**
 * Creates three previews on a Pixel tablet device for light and dark mode, and for scaled font.
 *
 * Use [PreviewAllDeviceBothMode] to create previews for both phone and tablet devices.
 */
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
@PreviewWrapper(AppColourWrapper::class)
annotation class PreviewTabletBothMode