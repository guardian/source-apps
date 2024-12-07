package com.gu.source.components.chips

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.android.resources.NightMode
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import com.gu.source.daynight.AppColour
import com.gu.source.utils.paparazzi.BaseDeviceConfig
import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class SourceChipTest(
    @TestParameter private val nightMode: NightMode,
    @TestParameter private val baseDeviceConfig: BaseDeviceConfig,
) {
    @get:Rule
    val paparazzi = createComponentPaparazziRule(
        deviceConfig = baseDeviceConfig.deviceConfig.copy(nightMode = nightMode),
    )

    @Test
    fun base() {
        paparazzi.snapshot {
            SourceChipPreview(
                modifier = Modifier.background(
                    AppColour(Color.White, Color.Black).current,
                ),
            )
        }
    }
}