//

import Foundation
import SwiftUI

extension Color: Codable {
    public init(hex: String) {
        let rgba = hex.toRGBA()

        self.init(
            .sRGB,
            red: Double(rgba.red),
            green: Double(rgba.green),
            blue: Double(rgba.blue),
            opacity: Double(rgba.alpha)
        )
    }

    public init(from decoder: Decoder) throws {
        let collection = try decoder.singleValueContainer()
        let hex = try collection.decode(String.self)

        self.init(hex: hex)
    }

    public func encode(to encoder: Encoder) throws {
        var collection = encoder.singleValueContainer()
        try collection.encode(toHex)
    }

    var toHex: String? {
        toHex()
    }

    func toHex(hasAlpha: Bool = false) -> String? {
        guard let components = cgColor?.components, components.count >= 3 else {
            return nil
        }

        let red = Float(components[0])
        let green = Float(components[1])
        let blue = Float(components[2])
        var alpha = Float(1.0)

        if components.count >= 4 {
            alpha = Float(components[3])
        }

        if hasAlpha {
            return String(
                format: "%02lX%02lX%02lX%02lX",
                lroundf(red * 255),
                lroundf(green * 255),
                lroundf(blue * 255),
                lroundf(alpha * 255)
            )
        } else {
            return String(
                format: "%02lX%02lX%02lX",
                lroundf(red * 255),
                lroundf(green * 255),
                lroundf(blue * 255)
            )
        }
    }
}

extension String {
    func toRGBA() -> ColorComponents {
        var hexSanitized = self.trimmingCharacters(in: .whitespacesAndNewlines)
        hexSanitized = hexSanitized.replacingOccurrences(of: "#", with: "")

        var rgb: UInt64 = 0

        var red: CGFloat = 0.0
        var green: CGFloat = 0.0
        var blue: CGFloat = 0.0
        var alpha: CGFloat = 1.0

        let length = hexSanitized.count

        Scanner(string: hexSanitized).scanHexInt64(&rgb)

        if length == 6 {
            red = CGFloat((rgb & 0xFF0000) >> 16) / 255.0
            green = CGFloat((rgb & 0x00FF00) >> 8) / 255.0
            blue = CGFloat(rgb & 0x0000FF) / 255.0
        } else if length == 8 {
            red = CGFloat((rgb & 0xFF000000) >> 24) / 255.0
            green = CGFloat((rgb & 0x00FF0000) >> 16) / 255.0
            blue = CGFloat((rgb & 0x0000FF00) >> 8) / 255.0
            alpha = CGFloat(rgb & 0x000000FF) / 255.0
        }

        return ColorComponents(red, green, blue, alpha)
    }
}

struct ColorComponents {
    internal init(_ red: CGFloat, _ green: CGFloat, _ blue: CGFloat, _ alpha: CGFloat) {
        self.red = red
        self.green = green
        self.blue = blue
        self.alpha = alpha
    }

    let red: CGFloat
    let green: CGFloat
    let blue: CGFloat
    let alpha: CGFloat
}
