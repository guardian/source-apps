package com.gu.source.utils.paparazzi

import app.cash.paparazzi.DeviceConfig
import com.android.resources.ScreenOrientation

/**
 * Used to define the device variants to use for screenshot tests.
 */
enum class BaseDeviceConfig(val deviceConfig: DeviceConfig) {
    Phone(DeviceConfig.PIXEL_6),
    Tablet(DeviceConfig.PIXEL_C),
}

/**
 * Used to define the font scale variants to use for screenshot tests.
 * Have disabled the small && large variants to reduce the number of screenshots.
 * @property value The float value corresponding to the scale.
 */
@Suppress("unused")
enum class FontScale(val value: Float) {
    //    Small(0.85f),
    Normal(value = 1f),

    //    Large(1.15f),
    ExtraLarge(value = 1.3f),
}

/**
 * Used to define the orientation variants to use for screenshot tests.
 * @property value The [com.android.resources.ScreenOrientation] value corresponding to the orientation.
 */
enum class Orientation(val value: ScreenOrientation) {
    Portrait(ScreenOrientation.PORTRAIT),
    Landscape(ScreenOrientation.LANDSCAPE),
}