//

import Foundation
import SwiftUI

public struct ButtonTheme {

    /// The `buttonPriority` determines where to apply the `foregroundColor` and `backgroundColor`
    let buttonPriority: ButtonPriority

    /// For `primary` and `secondary` button styles this will be the colour of the text.
    /// For `tertiary` it will also be the colour of the border.
    let foregroundColor: Color

    /// This should always be set to `clear` for `tertiary` button styles
    let backgroundColor: Color
}

public extension ButtonTheme {
    static let brandPrimary = ButtonTheme(
        buttonPriority: .primary,
        foregroundColor: Color(uiColor: ColorPalette.neutral100),
        backgroundColor: Color(uiColor: ColorPalette.brand400)
    )

    static let brandSecondary = ButtonTheme(
        buttonPriority: .secondary,
        foregroundColor: Color(uiColor: ColorPalette.brand100),
        backgroundColor: Color(uiColor: ColorPalette.brand800)
    )

    static let brandTertiary = ButtonTheme(
        buttonPriority: .tertiary,
        foregroundColor: Color(uiColor: ColorPalette.brand100),
        backgroundColor: Color.clear
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
