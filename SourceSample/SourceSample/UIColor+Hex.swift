//
//  UIColor+Hex.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//
#if os(iOS)
import UIKit

extension UIColor {
    func toHexString() -> String? {
        var red: CGFloat = 0
        var green: CGFloat = 0
        var blue: CGFloat = 0
        var alpha: CGFloat = 0

        let multiplier = CGFloat(255.999999)

        guard self.getRed(&red, green: &green, blue: &blue, alpha: &alpha) else {
            return nil
        }

        if alpha == 1.0 {
            return String(
                format: "#%02lX%02lX%02lX",
                lround(Double(red * multiplier)),
                lround(Double(green * multiplier)),
                lround(Double(blue * multiplier))
            )
        } else {
            return String(
                format: "#%02lX%02lX%02lX%02lX",
                lround(Double(red * multiplier)),
                lround(Double(green * multiplier)),
                lround(Double(blue * multiplier)),
                lround(Double(alpha * multiplier))
            )
        }
    }
}
#endif
