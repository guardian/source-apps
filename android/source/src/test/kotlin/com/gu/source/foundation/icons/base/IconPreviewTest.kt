package com.gu.source.foundation.icons.base

import com.gu.source.utils.paparazzi.BaseDeviceConfig
import com.gu.source.utils.paparazzi.createScreenPaparazziRule
import org.junit.Rule
import org.junit.Test

internal class IconPreviewTest {
    @get:Rule
    val paparazzi = createScreenPaparazziRule(BaseDeviceConfig.Tablet.deviceConfig)

    @Test
    fun base() {
        paparazzi.snapshot {
            IconPreview()
        }
    }
}