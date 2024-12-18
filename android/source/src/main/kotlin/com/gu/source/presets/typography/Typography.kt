@file:Suppress("UnusedReceiverParameter", "unused")

package com.gu.source.presets.typography

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gu.source.R
import com.gu.source.Source
import com.gu.source.utils.fontFamilyResource

private val BaseTextStyle = TextStyle(
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Proportional,
        trim = LineHeightStyle.Trim.Both,
    ),
    platformStyle = PlatformTextStyle(includeFontPadding = false),
)

// region HeadlineBold

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold16: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold18: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold22: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold42: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineBold50: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_bold),
        fontSize = TextSize._50,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

// endregion

// region HeadlineLight

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight16: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight18: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight22: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight42: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLight50: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_light),
        fontSize = TextSize._50,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

// endregion

// region HeadlineLightItalic

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic16: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic18: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic22: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic42: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineLightItalic50: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_lightitalic),
        fontSize = TextSize._50,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
    )

// endregion

// region HeadlineMedium

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium16: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium18: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium22: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium42: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMedium50: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_medium),
        fontSize = TextSize._50,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
    )

// endregion

// region HeadlineMediumItalic

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic16: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic18: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic22: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic42: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineMediumItalic50: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_mediumitalic),
        fontSize = TextSize._50,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Italic,
    )

// endregion

// region HeadlineSemiBold

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold16: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._16,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold18: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._18,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold22: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._22,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold42: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

/** Use for headlines, headings and any short form text like pull quotes, bylines and titles. */
val Source.Typography.HeadlineSemiBold50: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.ghguardianheadline_semibold),
        fontSize = TextSize._50,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W500,
    )

// endregion

// region TextArticle

/** Use for article body text. */
val Source.Typography.TextArticle15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Loose,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
    )

/** Use for article body text. */
val Source.Typography.TextArticle17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Loose,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
    )

/** Use for article body text. */
val Source.Typography.TextArticleBold15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Loose,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for article body text. */
val Source.Typography.TextArticleBold17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Loose,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for article body text. */
val Source.Typography.TextArticleItalic15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Loose,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
    )

/** Use for article body text. */
val Source.Typography.TextArticleItalic17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Loose,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
    )

// endregion

// region TextArticleBoldItalic

/** Use for article body text. */
val Source.Typography.TextArticleBoldItalic15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Loose,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
    )

/** Use for article body text. */
val Source.Typography.TextArticleBoldItalic17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Loose,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
    )

// endregion

// region TextEgyptian

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
val Source.Typography.TextEgyptian14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
    )

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
val Source.Typography.TextEgyptian15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
    )

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
val Source.Typography.TextEgyptian17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regular),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
    )

// endregion

// region TextEgyptianBold

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
// TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
val Source.Typography.TextEgyptianBold14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
// TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
val Source.Typography.TextEgyptianBold15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
// TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
val Source.Typography.TextEgyptianBold17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_medium),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

// endregion

// region TextEgyptianBoldItalic

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
// TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
val Source.Typography.TextEgyptianBoldItalic14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
    )

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
// TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
val Source.Typography.TextEgyptianBoldItalic15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
    )

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
// TODO: 12/04/2024 App doesn't have a bold Egyptian font so using medium
val Source.Typography.TextEgyptianBoldItalic17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_mediumitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Italic,
    )

// endregion

// region TextEgyptianItalic

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
val Source.Typography.TextEgyptianItalic14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
    )

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
val Source.Typography.TextEgyptianItalic15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
    )

/** Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages. */
val Source.Typography.TextEgyptianItalic17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardiantextegyptian_regularitalic),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
    )

// endregion

// region TextSans

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
val Source.Typography.TextSans11: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._11,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSans12: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._12,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSans14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSans15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSans17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSans20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSans24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSans28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSans34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Normal,
    )

// endregion

// region TextSansBold

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
val Source.Typography.TextSansBold11: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._11,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSansBold12: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._12,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSansBold14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSansBold15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSansBold17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSansBold20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSansBold24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSansBold28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
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
val Source.Typography.TextSansBold34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

// endregion

// region TextSansItalic

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
val Source.Typography.TextSansItalic11: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._11,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
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
val Source.Typography.TextSansItalic12: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._12,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
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
val Source.Typography.TextSansItalic14: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._14,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
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
val Source.Typography.TextSansItalic15: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._15,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
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
val Source.Typography.TextSansItalic17: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._17,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
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
val Source.Typography.TextSansItalic20: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._20,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
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
val Source.Typography.TextSansItalic24: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._24,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
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
val Source.Typography.TextSansItalic28: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._28,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
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
val Source.Typography.TextSansItalic34: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.guardian_texsan_two_regular),
        fontSize = TextSize._34,
        lineHeight = LineHeight.Regular,
        fontWeight = FontWeight.W400,
        fontStyle = FontStyle.Italic,
    )

// endregion

// region Titlepiece

/**
 * Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly
 * and at large sizes only.
 */
val Source.Typography.Titlepiece42: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
        fontSize = TextSize._42,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/**
 * Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly
 * and at large sizes only.
 */
val Source.Typography.Titlepiece50: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
        fontSize = TextSize._50,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

/**
 * Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly
 * and at large sizes only.
 */
val Source.Typography.Titlepiece70: TextStyle
    get() = BaseTextStyle + TextStyle(
        fontFamily = fontFamilyResource(R.font.gtguardiantitlepiece_bold),
        fontSize = TextSize._70,
        lineHeight = LineHeight.Tight,
        fontWeight = FontWeight.W700,
        fontStyle = FontStyle.Normal,
    )

// endregion

private object LineHeight {
    val Tight = 1.15.em
    val Regular = 1.3.em
    val Loose = 1.4.em
}

@Suppress("ObjectPropertyNaming", "ktlint:standard:backing-property-naming")
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