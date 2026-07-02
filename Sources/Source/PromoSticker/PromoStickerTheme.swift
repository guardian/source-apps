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
            foregroundColor: Color(uiColor: ColorPalette.neutral97),
            backgroundColor: Color(uiColor: ColorPalette.sport400)
        )
    }

    static var red: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(uiColor: ColorPalette.neutral97),
            backgroundColor: Color(uiColor: ColorPalette.news400)
        )
    }

    static var purple: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(uiColor: ColorPalette.neutral97),
            backgroundColor: Color(uiColor: ColorPalette.lifestyle400)
        )
    }

    static var green: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(uiColor: ColorPalette.neutral97),
            backgroundColor: Color(uiColor: ColorPalette.labs200)
        )
    }
}
