package com.gu.source.components.text

import com.android.resources.NightMode
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class LinkTextTest(
    @TestParameter private val nightMode: NightMode,
) {
    @get:Rule
    val paparazzi = createComponentPaparazziRule(nightMode)

    @Test
    fun linkTextPreviewTest() {
        paparazzi.snapshot {
            LinkTextPreview()
        }
    }
}