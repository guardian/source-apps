package com.gu.source.utils.paparazzi

import com.android.resources.NightMode
import org.junit.Assume.assumeTrue

/**
 * Filters screenshot test to reduce the number of baselines.
 *
 * Only takes dark mode screenshot in phone portrait. Other sizes and orientations just take
 * light mode screenshot.
 */
fun filterScreenshots(
    nightMode: NightMode,
    deviceConfig: BaseDeviceConfig,
    orientation: Orientation = Orientation.Portrait,
    fontScale: FontScale = FontScale.Normal,
) {
    // Skip the night mode on anything other than phone portrait with normal font
    assumeTrue(
        nightMode != NightMode.NIGHT ||
            (
                deviceConfig == BaseDeviceConfig.Phone &&
                    orientation == Orientation.Portrait &&
                    fontScale == FontScale.Normal
                ),
    )
}