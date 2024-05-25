package com.gu.source.presets.typography

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import com.gu.source.Source
import com.gu.source.presets.palette.Neutral100
import com.gu.source.utils.paparazzi.BaseDeviceConfig
import com.gu.source.utils.paparazzi.createScreenPaparazziRule
import org.junit.Rule
import org.junit.Test

class TypographyPreviewTest {
    @get:Rule
    val paparazzi = createScreenPaparazziRule(
        deviceConfig = BaseDeviceConfig.Tablet.deviceConfig,
    )

    @Test
    fun snapshot() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                TypographyPreview()
            }
        }
    }
}