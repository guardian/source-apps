//

import SwiftUI

/// Color palette for the chip views
public struct ChipPalette {
    let title: Color
    let background: Color
    let badge: Color
    let borderColor: Color
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
