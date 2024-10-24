//

import Foundation
import SwiftUI

public struct ButtonTheme {

    /// The `buttonPriority` determines where to apply the `foregroundColor` and `backgroundColor`
    let buttonPriority: ButtonPriority

    /// For `primary` and `secondary` button styles this will be the colour of the text. For `tertiary`
    /// it will also be the colour of the border.
    let foregroundColor: UIColor

    /// This should always be set to `clear` for `tertiary` button styles
    let backgroundColor: UIColor
}

public extension ButtonTheme {
    static let brandPrimary = ButtonTheme(
        buttonPriority: .primary,
        foregroundColor: .dynamicColor(light: ColorPalette.neutral100, dark: ColorPalette.brand400),
        backgroundColor: .dynamicColor(light: ColorPalette.brand400, dark: ColorPalette.neutral86)
    )

    static let brandSecondary = ButtonTheme(
        buttonPriority: .secondary,
        foregroundColor: .dynamicColor(light: ColorPalette.brand100, dark: ColorPalette.neutral97),
        backgroundColor: .dynamicColor(light: ColorPalette.brand800, dark: ColorPalette.brand600)
    )

    static let brandTertiary = ButtonTheme(
        buttonPriority: .tertiary,
        foregroundColor: .dynamicColor(light: ColorPalette.brand100, dark: ColorPalette.neutral86),
        backgroundColor: UIColor(Color.clear)
    )
}

extension View {

    /// Applies  design system styling to `SourceButton`
    func buttonTheme(_ theme: ButtonTheme) -> some View {
        self.environment(\.buttonTheme, theme)
    }
}

struct ButtonThemeKey: EnvironmentKey {
    static let defaultValue: ButtonTheme = .brandPrimary
}

extension EnvironmentValues {
    var buttonTheme: ButtonTheme {
        get { self[ButtonThemeKey.self] }
        set { self[ButtonThemeKey.self] = newValue }
    }
}
