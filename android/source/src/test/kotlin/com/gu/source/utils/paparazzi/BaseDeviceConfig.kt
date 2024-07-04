package com.gu.source.utils.paparazzi

import app.cash.paparazzi.DeviceConfig

/**
 * Used to define the device variants to use for screenshot tests.
 */
enum class BaseDeviceConfig(
    val deviceConfig: DeviceConfig,
) {
    Phone(DeviceConfig.PIXEL_6),
    Tablet(DeviceConfig.PIXEL_C),
}

/**
 * Used to define the font scale variants to use for screenshot tests.
 * Have disabled the small && large variants to reduce the number of screenshots.
 * @property value The float value corresponding to the scale.
 */
@Suppress("unused")
enum class FontScale(
    val value: Float,
) {
    //    Small(0.85f),
    Normal(value = 1f),

    //    Large(1.15f),
    ExtraLarge(value = 1.3f),
}