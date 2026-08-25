package com.gu.source.components.buttons

import com.android.resources.NightMode
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import com.gu.source.daynight.AppColourMode
import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class SourceButtonTest(@TestParameter private val nightMode: NightMode) {
    @get:Rule
    val paparazzi = createComponentPaparazziRule(nightMode)

    @Test
    fun coreIconBefore() {
        paparazzi.snapshot {
            AppColourMode { CoreButtonIconBeforePreview() }
        }
    }

    @Test
    fun readerRevenueIconBefore() {
        paparazzi.snapshot {
            AppColourMode { RrButtonIconBeforePreview() }
        }
    }

    @Test
    fun coreTextOnly() {
        paparazzi.snapshot {
            AppColourMode { CoreButtonTextOnlyPreview() }
        }
    }

    @Test
    fun readerRevenueTextOnly() {
        paparazzi.snapshot {
            AppColourMode { RrButtonTextOnlyPreview() }
        }
    }

    @Test
    fun coreIconAfter() {
        paparazzi.snapshot {
            AppColourMode { CoreButtonIconAfterPreview() }
        }
    }

    @Test
    fun readerRevenueIconAfter() {
        paparazzi.snapshot {
            AppColourMode { RrButtonIconAfterPreview() }
        }
    }

    @Test
    fun textButton() {
        paparazzi.snapshot {
            AppColourMode { SourceTextButtonPreview() }
        }
    }
}