@file:Suppress("UndocumentedPublicProperty", "UnusedReceiverParameter", "unused")

package com.gu.source.presets.palette

import androidx.compose.ui.graphics.Color
import com.gu.source.Source

// Dev note: When adding new colours here, please also add them to `PalettePreview.kt` in the
// sample module.

val Source.Palette.Brand100: Color
    get() = Color(color = 0xff001536)
val Source.Palette.Brand300: Color
    get() = Color(color = 0xff041f4a)
val Source.Palette.Brand400: Color
    get() = Color(color = 0xff052962)
val Source.Palette.Brand500: Color
    get() = Color(color = 0xff0077b6)
val Source.Palette.Brand600: Color
    get() = Color(color = 0xff506991)
val Source.Palette.Brand800: Color
    get() = Color(color = 0xffc1d8fc)

val Source.Palette.BrandAlt200: Color
    get() = Color(color = 0xfff3c100)
val Source.Palette.BrandAlt300: Color
    get() = Color(color = 0xffffd900)
val Source.Palette.BrandAlt400: Color
    get() = Color(color = 0xffffe500)

val Source.Palette.Neutral0: Color
    get() = Color(color = 0xff000000)
val Source.Palette.Neutral7: Color
    get() = Color(color = 0xff121212)
val Source.Palette.Neutral10: Color
    get() = Color(color = 0xff1a1a1a)
val Source.Palette.Neutral20: Color
    get() = Color(color = 0xff333333)

/** Was previously #606060. Updated to improve contrast for accessibility. */
val Source.Palette.Neutral38: Color
    get() = Color(color = 0xff545454)
val Source.Palette.Neutral46: Color
    get() = Color(color = 0xff707070)
val Source.Palette.Neutral60: Color
    get() = Color(color = 0xff999999)
val Source.Palette.Neutral73: Color
    get() = Color(color = 0xffbababa)
val Source.Palette.Neutral86: Color
    get() = Color(color = 0xffdcdcdc)
val Source.Palette.Neutral93: Color
    get() = Color(color = 0xffededed)
val Source.Palette.Neutral97: Color
    get() = Color(color = 0xfff6f6f6)
val Source.Palette.Neutral100: Color
    get() = Color(color = 0xffffffff)

val Source.Palette.Error400: Color
    get() = Color(color = 0xffc70000)
val Source.Palette.Error500: Color
    get() = Color(color = 0xffff9081)

val Source.Palette.Success300: Color
    get() = Color(color = 0xff185e36)
val Source.Palette.Success400: Color
    get() = Color(color = 0xff22874d)
val Source.Palette.Success500: Color
    get() = Color(color = 0xff58d08b)

val Source.Palette.News100: Color
    get() = Color(color = 0xff660505)
val Source.Palette.News200: Color
    get() = Color(color = 0xff8b0000)
val Source.Palette.News300: Color
    get() = Color(color = 0xffab0613)
val Source.Palette.News400: Color
    get() = Color(color = 0xffc70000)
val Source.Palette.News500: Color
    get() = Color(color = 0xffff5943)
val Source.Palette.News550: Color
    get() = Color(color = 0xffff9081)
val Source.Palette.News600: Color
    get() = Color(color = 0xffffbac8)
val Source.Palette.News700: Color
    get() = Color(color = 0xffffd8d1)
val Source.Palette.News800: Color
    get() = Color(color = 0xfffff4f2)

val Source.Palette.Opinion100: Color
    get() = Color(color = 0xff672005)
val Source.Palette.Opinion200: Color
    get() = Color(color = 0xff8d2700)

@Deprecated("Use Opinion400 instead", ReplaceWith("Opinion400"))
val Source.Palette.Opinion300: Color
    get() = Color(color = 0xffbd5318)
val Source.Palette.Opinion400: Color
    get() = Color(color = 0xffc74600)
val Source.Palette.Opinion450: Color
    get() = Color(color = 0xffe05e00)
val Source.Palette.Opinion500: Color
    get() = Color(color = 0xffff7f0f)
val Source.Palette.Opinion550: Color
    get() = Color(color = 0xffff9941)
val Source.Palette.Opinion600: Color
    get() = Color(color = 0xfff9b376)
val Source.Palette.Opinion700: Color
    get() = Color(color = 0xffffe7d4)
val Source.Palette.Opinion800: Color
    get() = Color(color = 0xfffef9f5)

val Source.Palette.Sport100: Color
    get() = Color(color = 0xff003c60)
val Source.Palette.Sport200: Color
    get() = Color(color = 0xff004e7c)
val Source.Palette.Sport300: Color
    get() = Color(color = 0xff005689)
val Source.Palette.Sport400: Color
    get() = Color(color = 0xff0077b6)
val Source.Palette.Sport500: Color
    get() = Color(color = 0xff00b2ff)
val Source.Palette.Sport600: Color
    get() = Color(color = 0xff90dcff)
val Source.Palette.Sport700: Color
    get() = Color(color = 0xffd8f1ff)
val Source.Palette.Sport800: Color
    get() = Color(color = 0xfff1f8fc)

val Source.Palette.Culture50: Color
    get() = Color(color = 0xff2b2625)
val Source.Palette.Culture100: Color
    get() = Color(color = 0xff3e3323)
val Source.Palette.Culture200: Color
    get() = Color(color = 0xff574835)
val Source.Palette.Culture300: Color
    get() = Color(color = 0xff6b5840)
val Source.Palette.Culture400: Color
    get() = Color(color = 0xff866d50)
val Source.Palette.Culture450: Color
    get() = Color(color = 0xffa1845c)
val Source.Palette.Culture500: Color
    get() = Color(color = 0xffeacca0)
val Source.Palette.Culture600: Color
    get() = Color(color = 0xffe7d4b9)
val Source.Palette.Culture700: Color
    get() = Color(color = 0xffefe8dd)
val Source.Palette.Culture800: Color
    get() = Color(color = 0xfffbf6ef)

val Source.Palette.Lifestyle100: Color
    get() = Color(color = 0xff510043)
val Source.Palette.Lifestyle200: Color
    get() = Color(color = 0xff650054)
val Source.Palette.Lifestyle300: Color
    get() = Color(color = 0xff7d0068)
val Source.Palette.Lifestyle400: Color
    get() = Color(color = 0xffbb3b80)
val Source.Palette.Lifestyle450: Color
    get() = Color(color = 0xfff37abc)
val Source.Palette.Lifestyle500: Color
    get() = Color(color = 0xffffabdb)
val Source.Palette.Lifestyle600: Color
    get() = Color(color = 0xfffec8d3)
val Source.Palette.Lifestyle800: Color
    get() = Color(color = 0xfffeeef7)

val Source.Palette.SpecialReport100: Color
    get() = Color(color = 0xff222527)
val Source.Palette.SpecialReport200: Color
    get() = Color(color = 0xff303538)
val Source.Palette.SpecialReport300: Color
    get() = Color(color = 0xff3f464a)
val Source.Palette.SpecialReport400: Color
    get() = Color(color = 0xff595c5f)
val Source.Palette.SpecialReport450: Color
    get() = Color(color = 0xff9da0a2)
val Source.Palette.SpecialReport500: Color
    get() = Color(color = 0xffabc2c9)
val Source.Palette.SpecialReport700: Color
    get() = Color(color = 0xffe4e5e8)
val Source.Palette.SpecialReport800: Color
    get() = Color(color = 0xffeff1f2)

val Source.Palette.SpecialReportAlt100: Color
    get() = Color(color = 0xff2b2b2a)
val Source.Palette.SpecialReportAlt200: Color
    get() = Color(color = 0xffb9300a)
val Source.Palette.SpecialReportAlt300: Color
    get() = Color(color = 0xffff663d)
val Source.Palette.SpecialReportAlt700: Color
    get() = Color(color = 0xffebe6e1)
val Source.Palette.SpecialReportAlt800: Color
    get() = Color(color = 0xfff5f0eb)

val Source.Palette.Labs200: Color
    get() = Color(color = 0xff0c7a73)
val Source.Palette.Labs300: Color
    get() = Color(color = 0xff65a897)
val Source.Palette.Labs400: Color
    get() = Color(color = 0xff69d1ca)