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
            foregroundColor: Color(ColorPalette.neutral97),
            backgroundColor: Color(ColorPalette.sport400)
        )
    }

    static var red: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(ColorPalette.neutral97),
            backgroundColor: Color(ColorPalette.news400)
        )
    }

    static var purple: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(ColorPalette.neutral97),
            backgroundColor: Color(ColorPalette.lifestyle400)
        )
    }

    static var green: PromoStickerTheme {
        PromoStickerTheme(
            foregroundColor: Color(ColorPalette.neutral97),
            backgroundColor: Color(ColorPalette.labs200)
        )
    }
}
