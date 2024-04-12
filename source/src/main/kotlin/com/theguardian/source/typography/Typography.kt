package com.theguardian.source.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.theguardian.source.R
import com.theguardian.source.utils.fontFamilyResource

/**
 * Source defined typography presets.
 * Each preset includes the font face, weight, size, and line height.
 */
object Typography {
    @Suppress("MagicNumber")
    private object LineHeight {
        const val Tight = 1.15f
        const val Regular = 1.3f
        const val Loose = 1.4f
    }

    private object Weight {
        val light = FontWeight.W300
        val regular = FontWeight.W400
        val medium = FontWeight.W500
        val bold = FontWeight.W700
    }

    private object TextSize {
        val _12 = 12.sp
        val _14 = 14.sp
        val _15 = 15.sp
        val _17 = 17.sp
        val _20 = 20.sp
        val _24 = 24.sp
        val _28 = 28.sp
        val _34 = 34.sp
        val _42 = 42.sp
        val _50 = 50.sp
        val _70 = 70.sp
    }

    object Body {
        val xSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardiantextegyptian_regular)),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Loose * TextSize._14,
            fontWeight = Weight.regular,
        )
        val small = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardiantextegyptian_regular)),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Loose * TextSize._15,
            fontWeight = Weight.regular,
        )
        val medium = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardiantextegyptian_regular)),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Loose * TextSize._17,
            fontWeight = Weight.regular,
        )
    }

    object TextSans {
        val xxSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._12,
            lineHeight = LineHeight.Regular * TextSize._12,
            fontWeight = Weight.regular,
        )
        val xSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Regular * TextSize._14,
            fontWeight = Weight.regular,
        )
        val small = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Regular * TextSize._15,
            fontWeight = Weight.regular,
        )
        val medium = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Regular * TextSize._17,
            fontWeight = Weight.regular,
        )
        val large = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Regular * TextSize._20,
            fontWeight = Weight.regular,
        )
        val xLarge = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Regular * TextSize._24,
            fontWeight = Weight.regular,
        )
        val xxLarge = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Regular * TextSize._28,
            fontWeight = Weight.regular,
        )
        val xxxLarge = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Regular * TextSize._34,
            fontWeight = Weight.regular,
        )
    }

    /**
     * Use for headlines, headings and any short form text like pull quotes, bylines and titles.
     */
    object Headline {
        val xxxSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Tight * TextSize._17,
            fontWeight = Weight.medium,
        )
        val xxSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Tight * TextSize._20,
            fontWeight = Weight.medium,
        )
        val xSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Tight * TextSize._24,
            fontWeight = Weight.medium,
        )
        val small = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Tight * TextSize._28,
            fontWeight = Weight.medium,
        )
        val medium = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Tight * TextSize._34,
            fontWeight = Weight.medium,
        )
        val large = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._42,
            lineHeight = LineHeight.Tight * TextSize._42,
            fontWeight = Weight.medium,
        )
        val xLarge = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._50,
            lineHeight = LineHeight.Tight * TextSize._50,
            fontWeight = Weight.medium,
        )
    }

    object Titlepiece {
        val small = TextStyle(
            fontFamily = FontFamily(Font(R.font.gtguardiantitlepiece_bold)),
            fontSize = TextSize._42,
            lineHeight = LineHeight.Tight * TextSize._42,
            fontWeight = Weight.bold,
        )
        val medium = TextStyle(
            fontFamily = FontFamily(Font(R.font.gtguardiantitlepiece_bold)),
            fontSize = TextSize._50,
            lineHeight = LineHeight.Tight * TextSize._50,
            fontWeight = Weight.bold,
        )
        val large = TextStyle(
            fontFamily = FontFamily(Font(R.font.gtguardiantitlepiece_bold)),
            fontSize = TextSize._70,
            lineHeight = LineHeight.Tight * TextSize._70,
            fontWeight = Weight.bold,
        )
    }

    val presets = mapOf(
        "headlineBold14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Tight * TextSize._14,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineBold17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Tight * TextSize._17,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineBold20" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Tight * TextSize._20,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineBold24" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Tight * TextSize._24,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineBold28" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Tight * TextSize._28,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineBold34" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Tight * TextSize._34,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineBold42" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._42,
            lineHeight = LineHeight.Tight * TextSize._42,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineBold50" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._50,
            lineHeight = LineHeight.Tight * TextSize._50,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineBold70" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._70,
            lineHeight = LineHeight.Tight * TextSize._70,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Tight * TextSize._14,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Tight * TextSize._17,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight20" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Tight * TextSize._20,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight24" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Tight * TextSize._24,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight28" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Tight * TextSize._28,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight34" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Tight * TextSize._34,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight42" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._42,
            lineHeight = LineHeight.Tight * TextSize._42,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight50" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._50,
            lineHeight = LineHeight.Tight * TextSize._50,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLight70" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._70,
            lineHeight = LineHeight.Tight * TextSize._70,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Normal,
        ),
        "headlineLightItalic14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Tight * TextSize._14,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineLightItalic17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Tight * TextSize._17,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineLightItalic20" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Tight * TextSize._20,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineLightItalic24" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Tight * TextSize._24,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineLightItalic28" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Tight * TextSize._28,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineLightItalic34" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Tight * TextSize._34,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineLightItalic42" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._42,
            lineHeight = LineHeight.Tight * TextSize._42,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineLightItalic50" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._50,
            lineHeight = LineHeight.Tight * TextSize._50,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineLightItalic70" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._70,
            lineHeight = LineHeight.Tight * TextSize._70,
            fontWeight = FontWeight.W300,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMedium14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Tight * TextSize._14,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMedium17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Tight * TextSize._17,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMedium20" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Tight * TextSize._20,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMedium24" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Tight * TextSize._24,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMedium28" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Tight * TextSize._28,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMedium34" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Tight * TextSize._34,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMedium42" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._42,
            lineHeight = LineHeight.Tight * TextSize._42,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMedium50" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._50,
            lineHeight = LineHeight.Tight * TextSize._50,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMedium70" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._70,
            lineHeight = LineHeight.Tight * TextSize._70,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Normal,
        ),
        "headlineMediumItalic14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Tight * TextSize._14,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMediumItalic17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Tight * TextSize._17,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMediumItalic20" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Tight * TextSize._20,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMediumItalic24" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Tight * TextSize._24,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMediumItalic28" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Tight * TextSize._28,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMediumItalic34" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Tight * TextSize._34,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMediumItalic42" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._42,
            lineHeight = LineHeight.Tight * TextSize._42,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMediumItalic50" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._50,
            lineHeight = LineHeight.Tight * TextSize._50,
            fontWeight = FontWeight.W500,
            fontStyle = FontStyle.Italic,
        ),
        "headlineMediumItalic70" to TextStyle(
            fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
            fontSize = TextSize._70,
            lineHeight = LineHeight.Tight * TextSize._70,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Italic,
        ),
        "textEgyptian14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Regular * TextSize._14,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textEgyptian15" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Regular * TextSize._15,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textEgyptian17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Regular * TextSize._17,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textEgyptianBold14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Regular * TextSize._14,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textEgyptianBold15" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Regular * TextSize._15,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textEgyptianBold17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Regular * TextSize._17,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textEgyptianBoldItalic14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Regular * TextSize._14,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Italic,
        ),
        "textEgyptianBoldItalic15" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Regular * TextSize._15,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Italic,
        ),
        "textEgyptianBoldItalic17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Regular * TextSize._17,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Italic,
        ),
        "textEgyptianItalic14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Regular * TextSize._14,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textEgyptianItalic15" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Regular * TextSize._15,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textEgyptianItalic17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Regular * TextSize._17,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textSans12" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._12,
            lineHeight = LineHeight.Regular * TextSize._12,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textSans14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Regular * TextSize._14,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textSans15" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Regular * TextSize._15,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textSans17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Regular * TextSize._17,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textSans20" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Regular * TextSize._20,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textSans24" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Regular * TextSize._24,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textSans28" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Regular * TextSize._28,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textSans34" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Regular * TextSize._34,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        "textSansBold12" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._12,
            lineHeight = LineHeight.Regular * TextSize._12,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textSansBold14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Regular * TextSize._14,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textSansBold15" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Regular * TextSize._15,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textSansBold17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Regular * TextSize._17,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textSansBold20" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Regular * TextSize._20,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textSansBold24" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Regular * TextSize._24,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textSansBold28" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Regular * TextSize._28,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textSansBold34" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Regular * TextSize._34,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "textSansItalic12" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._12,
            lineHeight = LineHeight.Regular * TextSize._12,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textSansItalic14" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._14,
            lineHeight = LineHeight.Regular * TextSize._14,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textSansItalic15" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._15,
            lineHeight = LineHeight.Regular * TextSize._15,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textSansItalic17" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._17,
            lineHeight = LineHeight.Regular * TextSize._17,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textSansItalic20" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._20,
            lineHeight = LineHeight.Regular * TextSize._20,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textSansItalic24" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._24,
            lineHeight = LineHeight.Regular * TextSize._24,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textSansItalic28" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._28,
            lineHeight = LineHeight.Regular * TextSize._28,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "textSansItalic34" to TextStyle(
            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
            fontSize = TextSize._34,
            lineHeight = LineHeight.Regular * TextSize._34,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Italic,
        ),
        "titlepiece42" to TextStyle(
            fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
            fontSize = TextSize._42,
            lineHeight = LineHeight.Tight * TextSize._42,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "titlepiece50" to TextStyle(
            fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
            fontSize = TextSize._50,
            lineHeight = LineHeight.Tight * TextSize._50,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
        "titlepiece70" to TextStyle(
            fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
            fontSize = TextSize._70,
            lineHeight = LineHeight.Tight * TextSize._70,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Normal,
        ),
    )
}