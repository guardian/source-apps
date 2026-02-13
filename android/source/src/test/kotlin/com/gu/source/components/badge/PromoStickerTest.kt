package com.gu.source.components.badge

import com.android.resources.NightMode
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import com.gu.source.components.promosticker.PromoStickerLongPreview
import com.gu.source.components.promosticker.PromoStickerPreview
import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
internal class PromoStickerTest(@TestParameter private val nightMode: NightMode) {
    @get:Rule
    val paparazzi = createComponentPaparazziRule(nightMode)

    @Test
    fun badge() {
        paparazzi.snapshot {
            PromoStickerPreview()
        }
    }

    @Test
    fun longBadge() {
        paparazzi.snapshot {
            PromoStickerLongPreview()
        }
    }
}