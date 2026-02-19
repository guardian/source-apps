//

import SwiftUI

public struct SubNavigationItemColorPalette {
    public let selectedBackgroundColor: Color
    public let textColor: Color
    public let selectedTextColor: Color
    public let badgeForegroundColor: Color
    public let badgeBackgroundColor: Color

    public init(
        selectedBackgroundColor: Color,
        textColor: Color,
        selectedTextColor: Color,
        badgeForegroundColor: Color,
        badgeBackgroundColor: Color,
    ) {
        self.selectedBackgroundColor = selectedBackgroundColor
        self.textColor = textColor
        self.selectedTextColor = selectedTextColor
        self.badgeForegroundColor = badgeForegroundColor
        self.badgeBackgroundColor = badgeBackgroundColor
    }

    public static var defaultPalette: SubNavigationItemColorPalette {
        SubNavigationItemColorPalette(
            selectedBackgroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.brand400,
                    dark: ColorPalette.sport500
                )
            ),
            textColor: Color(
                .dynamicColor(
                    light: ColorPalette.neutral46,
                    dark: ColorPalette.neutral60
                )
            ),
            selectedTextColor: Color(
                .dynamicColor(
                    light: ColorPalette.neutral97,
                    dark: ColorPalette.neutral7
                )
            ),
            badgeForegroundColor: Color(
                .dynamicColor(
                light: ColorPalette.neutral97,
                dark: ColorPalette.sport300
                )
            ),
            badgeBackgroundColor: Color(
                .dynamicColor(
                    light: ColorPalette.sport400,
                    dark: ColorPalette.sport800
                )
            ),
        )
    }
}
