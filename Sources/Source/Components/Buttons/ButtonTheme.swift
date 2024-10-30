//

import Foundation
import SwiftUI

/// A theme for configuring button styles, including Primary, Secondary, Tertiary, and Subdued styles.
/// The `foregroundColorTertiary` and `foregroundColorSubdued` properties are derived from
/// the Primary button style by default.
public struct ButtonTheme {

    /// The foreground color for the Primary button style.
    let foregroundColorPrimary: UIColor

    /// The background color for the Primary button style.
    let backgroundColorPrimary: UIColor

    /// The foreground color for the Secondary button style.
    let foregroundColorSecondary: UIColor

    /// The background color for the Secondary button style.
    let backgroundColorSecondary: UIColor

    /// The foreground color for the Tertiary button style. This will also be the border color. By default, this
    /// is derived from `backgroundColorPrimary`.
    let foregroundColorTertiary: UIColor

    /// The foreground color for the Subdued button style. By default, this is derived from `backgroundColorPrimary`.
    let foregroundColorSubdued: UIColor

    /// Initializes a new instance of `ButtonTheme`.
    ///
    /// - Parameters:
    ///   - foregroundColorPrimary: The foreground color for the Primary button style.
    ///   - backgroundColorPrimary: The background color for the Primary button style.
    ///   - foregroundColorSecondary: The foreground color for the Secondary button style.
    ///   - backgroundColorSecondary: The background color for the Secondary button style.
    ///   - foregroundColorTertiary: The foreground color for the Tertiary button style, derived
    ///   from `backgroundColorPrimary` if not specified.
    ///   - foregroundColorSubdued: The foreground color for the Subdued button style, derived
    ///   from `backgroundColorPrimary` if not specified.
    public init(
        foregroundColorPrimary: UIColor,
        backgroundColorPrimary: UIColor,
        foregroundColorSecondary: UIColor,
        backgroundColorSecondary: UIColor,
        foregroundColorTertiary: UIColor? = nil,
        foregroundColorSubdued: UIColor? = nil
    ) {
        self.foregroundColorPrimary = foregroundColorPrimary
        self.backgroundColorPrimary = backgroundColorPrimary
        self.foregroundColorSecondary = foregroundColorSecondary
        self.backgroundColorSecondary = backgroundColorSecondary
        self.foregroundColorTertiary = foregroundColorTertiary ?? backgroundColorPrimary
        self.foregroundColorSubdued = foregroundColorSubdued ?? backgroundColorPrimary
    }
}


public extension ButtonTheme {

    static let brand = ButtonTheme(
        foregroundColorPrimary: .dynamicColor(
            light: ColorPalette.neutral100,
            dark: ColorPalette.brand400
        ),
        backgroundColorPrimary: .dynamicColor(
            light: ColorPalette.brand400,
            dark: ColorPalette.neutral86
        ),
        foregroundColorSecondary: .dynamicColor(
            light: ColorPalette.brand100,
            dark: ColorPalette.neutral97
        ),
        backgroundColorSecondary: .dynamicColor(
            light: ColorPalette.brand800,
            dark: ColorPalette.brand600
        )
    )
}

//extension View {
//
//    /// Applies  design system styling to `SourceButton`
//    func buttonTheme(_ theme: ButtonTheme) -> some View {
//        self.environment(\.buttonTheme, theme)
//    }
//}
//
//struct ButtonThemeKey: EnvironmentKey {
//    static let defaultValue: ButtonTheme = .brand
//}
//
//extension EnvironmentValues {
//    var buttonTheme: ButtonTheme {
//        get { self[ButtonThemeKey.self] }
//        set { self[ButtonThemeKey.self] = newValue }
//    }
//}
