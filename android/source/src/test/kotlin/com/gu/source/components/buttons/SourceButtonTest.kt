package com.gu.source.components.buttons

import com.android.resources.NightMode
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
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
            CoreButtonIconBeforePreview()
        }
    }

    @Test
    fun readerRevenueIconBefore() {
        paparazzi.snapshot {
            RrButtonIconBeforePreview()
        }
    }

    @Test
    fun coreTextOnly() {
        paparazzi.snapshot {
            CoreButtonTextOnlyPreview()
        }
    }

    @Test
    fun readerRevenueTextOnly() {
        paparazzi.snapshot {
            RrButtonTextOnlyPreview()
        }
    }

    @Test
    fun coreIconAfter() {
        paparazzi.snapshot {
            CoreButtonIconAfterPreview()
        }
    }

    @Test
    fun readerRevenueIconAfter() {
        paparazzi.snapshot {
            RrButtonIconAfterPreview()
        }
    }

    @Test
    fun sourceTextButtonNoUnderline() {
        paparazzi.snapshot {
            SourceTextButtonPreviewNoUnderline()
        }
    }

    @Test
    fun sourceTextButtonUnderline() {
        paparazzi.snapshot {
            SourceTextButtonPreviewUnderline()
        }
    }
}