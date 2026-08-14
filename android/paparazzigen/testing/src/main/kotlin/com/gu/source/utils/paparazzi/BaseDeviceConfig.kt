package com.gu.source.utils.paparazzi

import app.cash.paparazzi.DeviceConfig
import com.android.resources.NightMode
import com.android.resources.ScreenOrientation

/**
 * Used to define the device variants to use for screenshot tests.
 * @property deviceConfig The Paparazzi [DeviceConfig] backing this device variant.
 */
enum class BaseDeviceConfig(val deviceConfig: DeviceConfig) {
    /** A phone sized device, defined in portrait. */
    Phone(DeviceConfig.PIXEL_6),

    /** A tablet sized device, defined in landscape. */
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

    /** The device default font scale. */
    Normal(value = 1f),

    //    Large(1.15f),

    /** A large accessibility font scale. */
    ExtraLarge(value = 1.3f),
}

/**
 * Used to define the orientation variants to use for screenshot tests.
 * @property value The [com.android.resources.ScreenOrientation] value corresponding to the orientation.
 */
enum class Orientation(val value: ScreenOrientation) {
    /** Taller than it is wide. */
    Portrait(ScreenOrientation.PORTRAIT),

    /** Wider than it is tall. */
    Landscape(ScreenOrientation.LANDSCAPE),
}

/**
 * Builds a [DeviceConfig] for this device, applying the given night mode, font scale and
 * orientation.
 *
 * Screen dimensions are swapped when the requested [orientation] differs from the orientation the
 * underlying [DeviceConfig] is defined in, so that e.g. [BaseDeviceConfig.Tablet] - which Paparazzi
 * defines in landscape - renders correctly in portrait.
 *
 * @param nightMode night mode to render in.
 * @param fontScale font scale to render at.
 * @param orientation orientation to render in.
 */
fun BaseDeviceConfig.toDeviceConfig(
    nightMode: NightMode = NightMode.NOTNIGHT,
    fontScale: FontScale = FontScale.Normal,
    orientation: Orientation = Orientation.Portrait,
): DeviceConfig {
    val swapDimensions = deviceConfig.orientation != orientation.value
    return deviceConfig.copy(
        nightMode = nightMode,
        fontScale = fontScale.value,
        orientation = orientation.value,
        screenWidth = if (swapDimensions) deviceConfig.screenHeight else deviceConfig.screenWidth,
        screenHeight = if (swapDimensions) deviceConfig.screenWidth else deviceConfig.screenHeight,
    )
}