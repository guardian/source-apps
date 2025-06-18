package com.gu.source.presets.typography

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import com.gu.source.Source
import com.gu.source.foundation.palette.Neutral100
import com.gu.source.foundation.typography.HeadlineBoldPreview
import com.gu.source.foundation.typography.HeadlineLightItalicPreview
import com.gu.source.foundation.typography.HeadlineLightPreview
import com.gu.source.foundation.typography.HeadlineMediumItalicPreview
import com.gu.source.foundation.typography.HeadlineMediumPreview
import com.gu.source.foundation.typography.HeadlineSemiBoldPreview
import com.gu.source.foundation.typography.TextArticlePreview
import com.gu.source.foundation.typography.TextEgyptianPreview
import com.gu.source.foundation.typography.TextSansBoldPreview
import com.gu.source.foundation.typography.TextSansItalicPreview
import com.gu.source.foundation.typography.TextSansPreview
import com.gu.source.foundation.typography.TitlepiecePreview
import com.gu.source.utils.paparazzi.BaseDeviceConfig
import com.gu.source.utils.paparazzi.createComponentPaparazziRule
import org.junit.Rule
import org.junit.Test

class TypographyPreviewTest {
    @get:Rule
    val paparazzi = createComponentPaparazziRule(
        deviceConfig = BaseDeviceConfig.Tablet.deviceConfig,
    )

    @Test
    fun headlineBold() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                HeadlineBoldPreview()
            }
        }
    }

    @Test
    fun headlineLight() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                HeadlineLightPreview()
            }
        }
    }

    @Test
    fun headlineLightItalic() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                HeadlineLightItalicPreview()
            }
        }
    }

    @Test
    fun headlineMedium() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                HeadlineMediumPreview()
            }
        }
    }

    @Test
    fun headlineMediumItalic() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                HeadlineMediumItalicPreview()
            }
        }
    }

    @Test
    fun headlineSemiBold() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                HeadlineSemiBoldPreview()
            }
        }
    }

    @Test
    fun textArticle() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                TextArticlePreview()
            }
        }
    }

    @Test
    fun textEgyptian() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                TextEgyptianPreview()
            }
        }
    }

    @Test
    fun textSans() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                TextSansPreview()
            }
        }
    }

    @Test
    fun textSansBold() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                TextSansBoldPreview()
            }
        }
    }

    @Test
    fun textSansItalic() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                TextSansItalicPreview()
            }
        }
    }

    @Test
    fun titlepiece() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Source.Palette.Neutral100)) {
                TitlepiecePreview()
            }
        }
    }
}