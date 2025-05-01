//
#if os(iOS)
import SwiftUI

public struct SubNavigationItemColorPalette {
    public let selectedBackgroundColor: Color
    public let textColor: Color
    public let selectedTextColor: Color

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
            )
        )
    }
}
#endif
