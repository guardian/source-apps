//

import SwiftUI

public struct PromoStickerTheme {
    let foregroundColor: Color
    let backgroundColor: Color

    public init(foregroundColor: Color, backgroundColor: Color) {
        self.foregroundColor = foregroundColor
        self.backgroundColor = backgroundColor
    }
}

public extension PromoStickerTheme {
    static var blue: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.neutral97,
                    dark: ColorPalette.sport300
                )
            ),
            backgroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.sport400,
                    dark: ColorPalette.sport800
                )
            )
        )
    }

    static var red: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.neutral97,
                    dark: ColorPalette.news300
                )
            ),
            backgroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.news400,
                    dark: ColorPalette.news800
                )
            )
        )
    }

    static var purple: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.neutral97,
                    dark: ColorPalette.lifestyle300
                )
            ),
            backgroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.lifestyle400,
                    dark: ColorPalette.lifestyle800
                )
            )
        )
    }

    static var green: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.neutral97,
                    dark: ColorPalette.labs200
                )
            ),
            backgroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.labs200,
                    dark: ColorPalette.labs700
                )
            )
        )
    }
}
