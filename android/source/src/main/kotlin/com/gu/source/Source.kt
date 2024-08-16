package com.gu.source

import androidx.annotation.Discouraged
import com.gu.source.Source.Palette
import com.gu.source.Source.Typography

/**
 * Source is the Guardian's design system. This object provides handles to tokens for [Typography],
 * [Palette] and more.
 */
object Source {
    /**
     * App typography presets.
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
    object Typography

    /**
     * App core colour palette.
     *
     * ![Full colour palette](presets/palette/palette.png)
     *
     * [Palette colour definitions](https://theguardian.design/2a1e5182b/p/71fb50-colour/b/399c59)).
     */
    object Palette

    /** Source provided raw icons. */
    @Discouraged("These are not ready for production use.")
    object Icons {
        /** Base icons without any decoration around them. */
        object Base
    }

    /** Source colour themes used by components. */
    enum class Theme {
        Core,
        ReaderRevenue,
    }
}