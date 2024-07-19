package com.gu.source.components.pager

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test

class PagerProgressIndicatorTest {
    @get:Rule
    val paparazzi = createComponentPaparazziRule()

    @Test
    fun progressIndicatorStates() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Color.White)) {
                PagerProgressIndicatorPreview()
            }
        }
    }
}