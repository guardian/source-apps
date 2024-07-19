package com.gu.source.components.pager

import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test

class PagerProgressIndicatorTest {
    @get:Rule
    val paparazzi = createComponentPaparazziRule()

    @Test
    fun progressIndicatorStates() {
        paparazzi.snapshot {
            PagerProgressIndicatorPreview()
        }
    }
}