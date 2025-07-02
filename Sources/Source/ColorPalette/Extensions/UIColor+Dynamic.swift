//
import Foundation

#if canImport(UIKit)
import UIKit
public typealias PlatformColor = UIColor
#elseif canImport(AppKit)
import AppKit
public typealias PlatformColor = NSColor
#endif

public extension PlatformColor {
    class func dynamicColor(light: PlatformColor, dark: PlatformColor) -> PlatformColor {
#if canImport(UIKit)
        return UIColor { traitCollection in
            switch traitCollection.userInterfaceStyle {
            case .dark:
                return dark
            default:
                return light
            }
        }
#elseif canImport(AppKit)
        return NSColor(name: nil) { appearance in
            let appearanceName = appearance.bestMatch(from: [.darkAqua, .aqua]) ?? .aqua
            return appearanceName == .darkAqua ? dark : light
        }
#endif
    }
}

#if canImport(SwiftUI)
import SwiftUI

@available(iOS 13.0, macOS 10.15, *)
public extension Color {
    static func dynamicColor(light: Color, dark: Color) -> Color {
        Color(light: light, dark: dark)
    }
}

// SwiftUI Color initializer for light/dark variants
@available(iOS 13.0, macOS 10.15, *)
extension Color {
    init(light: Color, dark: Color) {
#if canImport(UIKit)
        self.init(
            uiColor: .dynamicColor(
                light: PlatformColor(light),
                dark: PlatformColor(dark)
            )
        )
#elseif canImport(AppKit)
        self.init(
            nsColor: .dynamicColor(
                light: PlatformColor(light),
                dark: PlatformColor(dark)
            )
        )
#endif
    }
}
#endif

extension PlatformColor {
    class func colorFromBundle(named: String) -> PlatformColor? {
#if canImport(UIKit)
        return UIColor(named: named, in: .module, compatibleWith: .none)
#elseif canImport(AppKit)
        return NSColor(named: named, bundle: .module)
#endif
    }
}
