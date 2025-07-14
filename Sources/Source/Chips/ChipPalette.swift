//

import SwiftUI

/// Color palette for the chip views
public struct ChipPalette {
    public var title: Color
    public var background: Color
    public var badge: Color
    public var borderColor: Color

    public init(
        title: Color,
        background: Color,
        badge: Color,
        borderColor: Color
    ) {
        self.title = title
        self.background = background
        self.badge = badge
        self.borderColor = borderColor
    }
}

/// Default palettes for the chip views
public extension ChipPalette {
    static var unselected: ChipPalette = {
        ChipPalette(
            title: Color(
                .dynamicColor(
                    light: ColorPalette.neutral10,
                    dark: ColorPalette.neutral100
                )
            ),
            background: Color(
                .dynamicColor(
                    light: ColorPalette.neutral93,
                    dark: ColorPalette.neutral20
                )
            ),
            badge: Color(hex: "0190F7"),
            borderColor: Color(
                .dynamicColor(
                    light: ColorPalette.neutral93,
                    dark: ColorPalette.neutral20
                )
            )
        )
    }()

    static var selected: ChipPalette = {
        ChipPalette(
            title: Color(
                .dynamicColor(
                    light: ColorPalette.neutral100,
                    dark: ColorPalette.neutral10
                )
            ),
            background: Color(
                .dynamicColor(
                    light: ColorPalette.neutral10,
                    dark: ColorPalette.neutral93
                )
            ),
            badge: Color(hex: "0190F7"),
            borderColor: Color(
                .dynamicColor(
                    light: ColorPalette.neutral10,
                    dark: ColorPalette.neutral93
                )
            )
        )
    }()

    static var bordered: ChipPalette = {
        ChipPalette(
            title: Color(
                .dynamicColor(
                    light: ColorPalette.neutral10,
                    dark: ColorPalette.neutral100
                )
            ),
            background: Color(
                .dynamicColor(
                    light: ColorPalette.neutral100,
                    dark: ColorPalette.neutral10
                )
            ),
            badge: Color(hex: "0190F7"),
            borderColor: Color(ColorPalette.neutral86)
        )
    }()
}
