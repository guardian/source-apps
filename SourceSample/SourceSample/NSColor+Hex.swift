//
//  NSColor+Hex.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 05/07/2024.
//
#if os(macOS)
import AppKit

extension NSColor {
    func toHexString(includeAlpha: Bool = true) -> String? {
        guard let rgbColor = usingColorSpace(.deviceRGB) else {
            return nil
        }

        let red = rgbColor.redComponent
        let green = rgbColor.greenComponent
        let blue = rgbColor.blueComponent
        let alpha = rgbColor.alphaComponent

        if includeAlpha {
            return String(
                format: "#%02lX%02lX%02lX%02lX",
                lround(Double(red * 255)),
                lround(Double(green * 255)),
                lround(Double(blue * 255)),
                lround(Double(alpha * 255))
            )
        } else {
            return String(
                format: "#%02lX%02lX%02lX",
                lround(Double(red * 255)),
                lround(Double(green * 255)),
                lround(Double(blue * 255))
            )
        }
    }
}
#endif
