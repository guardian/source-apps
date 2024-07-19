package com.gu.source.components.pager

import com.android.resources.NightMode
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import com.gu.source.utils.paparazzi.BaseDeviceConfig
import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class PagerProgressBarTest(
    @TestParameter private val baseDeviceConfig: BaseDeviceConfig,
    @TestParameter private val nightMode: NightMode,
) {
    @get:Rule
    val paparazzi = createComponentPaparazziRule(
        deviceConfig = baseDeviceConfig.deviceConfig.copy(nightMode = nightMode),
    )

    @Test
    fun pagerProgressBar() {
        paparazzi.snapshot {
            PagerProgressBarPreview()
        }
    }
}