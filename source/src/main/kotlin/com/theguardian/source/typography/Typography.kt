package com.theguardian.source.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.theguardian.source.R

/**
 * Source defined typography presets.
 * Each preset includes the font face, weight, size, and line height.
 */
object Typography {
    private object LineHeight {
        val tight = 1.15f
        val regular = 1.3f
        val loose = 1.4f
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
            lineHeight = LineHeight.loose * TextSize._14,
            fontWeight = Weight.regular,
        )
        val small = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardiantextegyptian_regular)),
            fontSize = TextSize._15,
            lineHeight = LineHeight.loose * TextSize._15,
            fontWeight = Weight.regular,
        )
        val medium = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardiantextegyptian_regular)),
            fontSize = TextSize._17,
            lineHeight = LineHeight.loose * TextSize._17,
            fontWeight = Weight.regular,
        )
    }

    object TextSans {
        val xxSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._12,
            lineHeight = LineHeight.regular * TextSize._12,
            fontWeight = Weight.regular,
        )
        val xSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._14,
            lineHeight = LineHeight.regular * TextSize._14,
            fontWeight = Weight.regular,
        )
        val small = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._15,
            lineHeight = LineHeight.regular * TextSize._15,
            fontWeight = Weight.regular,
        )
        val medium = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._17,
            lineHeight = LineHeight.regular * TextSize._17,
            fontWeight = Weight.regular,
        )
        val large = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._20,
            lineHeight = LineHeight.regular * TextSize._20,
            fontWeight = Weight.regular,
        )
        val xLarge = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._24,
            lineHeight = LineHeight.regular * TextSize._24,
            fontWeight = Weight.regular,
        )
        val xxLarge = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._28,
            lineHeight = LineHeight.regular * TextSize._28,
            fontWeight = Weight.regular,
        )
        val xxxLarge = TextStyle(
            fontFamily = FontFamily(Font(R.font.guardian_texsan_two_regular)),
            fontSize = TextSize._34,
            lineHeight = LineHeight.regular * TextSize._34,
            fontWeight = Weight.regular,
        )
    }

    object Headline {
        val xxxSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._17,
            lineHeight = LineHeight.tight * TextSize._17,
            fontWeight = Weight.medium,
        )
        val xxSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._20,
            lineHeight = LineHeight.tight * TextSize._20,
            fontWeight = Weight.medium,
        )
        val xSmall = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._24,
            lineHeight = LineHeight.tight * TextSize._24,
            fontWeight = Weight.medium,
        )
        val small = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._28,
            lineHeight = LineHeight.tight * TextSize._28,
            fontWeight = Weight.medium,
        )
        val medium = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._34,
            lineHeight = LineHeight.tight * TextSize._34,
            fontWeight = Weight.medium,
        )
        val large = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._42,
            lineHeight = LineHeight.tight * TextSize._42,
            fontWeight = Weight.medium,
        )
        val xLarge = TextStyle(
            fontFamily = FontFamily(Font(R.font.ghguardianheadline_medium)),
            fontSize = TextSize._50,
            lineHeight = LineHeight.tight * TextSize._50,
            fontWeight = Weight.medium,
        )
    }

    object Titlepiece {
        val small = TextStyle(
            fontFamily = FontFamily(Font(R.font.gtguardiantitlepiece_bold)),
            fontSize = TextSize._42,
            lineHeight = LineHeight.tight * TextSize._42,
            fontWeight = Weight.bold,
        )
        val medium = TextStyle(
            fontFamily = FontFamily(Font(R.font.gtguardiantitlepiece_bold)),
            fontSize = TextSize._50,
            lineHeight = LineHeight.tight * TextSize._50,
            fontWeight = Weight.bold,
        )
        val large = TextStyle(
            fontFamily = FontFamily(Font(R.font.gtguardiantitlepiece_bold)),
            fontSize = TextSize._70,
            lineHeight = LineHeight.tight * TextSize._70,
            fontWeight = Weight.bold,
        )
    }
}