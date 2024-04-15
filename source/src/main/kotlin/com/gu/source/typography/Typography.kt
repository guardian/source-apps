package com.gu.source.typography

import androidx.annotation.RestrictTo
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.gu.source.R
import com.gu.source.utils.fontFamilyResource

/**
 * App typography presets
 * The Guardian has four bespoke typefaces, which were created for different purposes. When
 * used effectively, they create contrast and alter the tone in which text is read.
 *
 * **Where do we use app typography presets?**
 * Any content crafted and developed within the app's native environment, including the app
 * fronts, My Guardian, custom modals, and supporter revenue messages.
 *
 * Note: Article pages and sign-in/registration pages are presented in a webview, hence
 * utilising web typography presets.
 */
@Suppress("LargeClass")
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
object Typography {
    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight * TextSize._14,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight * TextSize._15,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold16 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight * TextSize._16,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight * TextSize._17,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold18 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight * TextSize._18,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold20 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight * TextSize._20,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold22 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight * TextSize._22,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold24 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight * TextSize._24,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold28 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight * TextSize._28,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold34 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight * TextSize._34,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineBold42 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight * TextSize._42,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight * TextSize._14,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight * TextSize._15,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight16 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight * TextSize._16,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight * TextSize._17,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight18 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight * TextSize._18,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight20 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight * TextSize._20,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight22 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight * TextSize._22,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight24 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight * TextSize._24,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight28 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight * TextSize._28,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight34 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight * TextSize._34,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineLight42 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight * TextSize._42,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight * TextSize._14,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight * TextSize._15,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium16 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight * TextSize._16,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight * TextSize._17,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium18 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight * TextSize._18,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium20 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight * TextSize._20,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium22 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight * TextSize._22,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium24 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight * TextSize._24,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium28 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight * TextSize._28,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium34 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight * TextSize._34,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMedium42 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight * TextSize._42,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight * TextSize._14,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight * TextSize._15,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic16 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight * TextSize._16,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight * TextSize._17,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic18 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight * TextSize._18,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic20 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight * TextSize._20,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic22 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight * TextSize._22,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic24 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight * TextSize._24,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic28 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight * TextSize._28,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic34 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight * TextSize._34,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineMediumItalic42 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight * TextSize._42,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineSemiBold14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight * TextSize._14,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineSemiBold15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight * TextSize._15,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineSemiBold16 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight * TextSize._16,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineSemiBold18 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight * TextSize._18,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineSemiBold24 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight * TextSize._24,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
    val headlineSemiBold28 = TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight * TextSize._28,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for article body text. */
    val textArticle15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Loose * TextSize._15,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for article body text. */
    val textArticle17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Loose * TextSize._17,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for article body text. */
    val textArticleBold15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Loose * TextSize._15,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for article body text. */
    val textArticleBold17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Loose * TextSize._17,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for article body text. */
    val textArticleItalic15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Loose * TextSize._15,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for article body text. */
    val textArticleItalic17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Loose * TextSize._17,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for article body text. */
    val textArticleBoldItalic15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Loose * TextSize._15,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for article body text. */
    val textArticleBoldItalic17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Loose * TextSize._17,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    val textEgyptian14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular * TextSize._14,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    val textEgyptian15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular * TextSize._15,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    val textEgyptian17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular * TextSize._17,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    // TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
    val textEgyptianBold14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular * TextSize._14,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    // TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
    val textEgyptianBold15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular * TextSize._15,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    // TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
    val textEgyptianBold17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular * TextSize._17,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    // TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
    val textEgyptianBoldItalic14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular * TextSize._14,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    // TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
    val textEgyptianBoldItalic15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular * TextSize._15,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    // TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
    val textEgyptianBoldItalic17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular * TextSize._17,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    val textEgyptianItalic14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular * TextSize._14,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    val textEgyptianItalic15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular * TextSize._15,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
    val textEgyptianItalic17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular * TextSize._17,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans11 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._11,
        lineHeight = LineHeight.Regular * TextSize._11,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans12 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._12,
        lineHeight = LineHeight.Regular * TextSize._12,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular * TextSize._14,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular * TextSize._15,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular * TextSize._17,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans20 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Regular * TextSize._20,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans24 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Regular * TextSize._24,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans28 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Regular * TextSize._28,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSans34 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Regular * TextSize._34,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold11 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._11,
        lineHeight = LineHeight.Regular * TextSize._11,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold12 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._12,
        lineHeight = LineHeight.Regular * TextSize._12,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular * TextSize._14,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular * TextSize._15,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular * TextSize._17,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold20 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Regular * TextSize._20,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold24 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Regular * TextSize._24,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold28 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Regular * TextSize._28,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansBold34 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Regular * TextSize._34,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    // TODO: 12/04/2024 App doesn't have an italic text sans font so using regular
    val textSansItalic11 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._11,
        lineHeight = LineHeight.Regular * TextSize._11,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansItalic12 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._12,
        lineHeight = LineHeight.Regular * TextSize._12,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansItalic14 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular * TextSize._14,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansItalic15 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular * TextSize._15,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansItalic17 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular * TextSize._17,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansItalic20 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Regular * TextSize._20,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansItalic24 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Regular * TextSize._24,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansItalic28 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Regular * TextSize._28,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for interactive page elements like buttons and text input fields and for meta
     * information like datelines, image captions and data visualisations. Use for interactive
     * page elements like buttons and text input fields and for meta information like datelines,
     * image captions and data visualisations.Use for interactive page elements like buttons and
     * text input fields and for meta information like datelines, image captions and data
     * visualisations.Use for interactive page elements like buttons and text input fields and
     * for meta information like datelines, image captions and data visualisations.
     *
     *
     * _Note_: Text Sans is used across the board on paid content templates to help differentiate
     * from editorial content.
     */
    val textSansItalic34 = TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Regular * TextSize._34,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly
     * and at large sizes only.
     */
    val titlepiece42 = TextStyle(
        fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight * TextSize._42,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly
     * and at large sizes only.
     */
    val titlepiece50 = TextStyle(
        fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
        fontSize = TextSize._50,
        lineHeight = LineHeight.Tight * TextSize._50,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )

    /**
     * Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly
     * and at large sizes only.
     */
    val titlepiece70 = TextStyle(
        fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
        fontSize = TextSize._70,
        lineHeight = LineHeight.Tight * TextSize._70,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
        platformStyle = PlatformTextStyle(includeFontPadding = false),
    )
}

@Suppress("MagicNumber")
private object LineHeight {
    const val Tight = 1.15f
    const val Regular = 1.3f
    const val Loose = 1.4f
}

@Suppress("ObjectPropertyNaming")
private object TextSize {
    val _11 = 11.sp
    val _12 = 12.sp
    val _14 = 14.sp
    val _15 = 15.sp
    val _16 = 16.sp
    val _17 = 17.sp
    val _18 = 18.sp
    val _20 = 20.sp
    val _22 = 22.sp
    val _24 = 24.sp
    val _28 = 28.sp
    val _34 = 34.sp
    val _42 = 42.sp
    val _50 = 50.sp
    val _70 = 70.sp
}