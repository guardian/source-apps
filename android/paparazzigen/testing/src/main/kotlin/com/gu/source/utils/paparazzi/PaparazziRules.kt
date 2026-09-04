package com.gu.source.utils.paparazzi

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams
import com.android.resources.NightMode

/**
 * Creates a paparazzi instance for testing sub screen level components. The rule ensures that
 * snapshots are shrunk to only cover the component's drawable area.
 * @param deviceConfig Optional device config. Use [BaseDeviceConfig] to provide different devices for parametric
 * tests.
 */
fun createComponentPaparazziRule(
    deviceConfig: DeviceConfig = BaseDeviceConfig.Phone.deviceConfig,
) = Paparazzi(
    deviceConfig = deviceConfig,
    showSystemUi = false,
    renderingMode = SessionParams.RenderingMode.SHRINK,
)

/**
 * Creates a paparazzi instance for testing sub screen level components. The rule ensures that
 * snapshots are shrunk to only cover the component's drawable area.
 * This variant takes a night mode parameter to allow for day & night mode tests on a phone device.
 * @param nightMode night mode to use for the test.
 */
fun createComponentPaparazziRule(nightMode: NightMode) = Paparazzi(
    deviceConfig = BaseDeviceConfig.Phone.deviceConfig.copy(nightMode = nightMode),
    showSystemUi = false,
    renderingMode = SessionParams.RenderingMode.SHRINK,
)

/**
 * Creates a paparazzi instance for testing screen level components. The produced snapshots are
 * device screen sized.
 * @param deviceConfig device config for the test. Use [BaseDeviceConfig] to provide different
 * devices for parametric tests.
 */
fun createScreenPaparazziRule(deviceConfig: DeviceConfig) = Paparazzi(
    deviceConfig = deviceConfig,
    showSystemUi = false,
    renderingMode = SessionParams.RenderingMode.NORMAL,
)