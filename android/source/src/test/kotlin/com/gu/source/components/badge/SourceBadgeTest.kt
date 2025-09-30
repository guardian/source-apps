package com.gu.source.components.badge

import com.android.resources.NightMode
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
internal class SourceBadgeTest(@TestParameter private val nightMode: NightMode) {
    @get:Rule
    val paparazzi = createComponentPaparazziRule(nightMode)

    @Test
    fun badge() {
        paparazzi.snapshot {
            SourceBadgePreview()
        }
    }

    @Test
    fun longBadge() {
        paparazzi.snapshot {
            SourceBadgeLongPreview()
        }
    }
}