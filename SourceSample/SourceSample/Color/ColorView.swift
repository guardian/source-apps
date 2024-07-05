//
//  ColorView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//

import SwiftUI
import Source

struct ColorView: View {
    @State var isHovering = false

    let color: ColorSwatch

    var body: some View {
        VStack {
            #if os(iOS)
            Color.init(uiColor: color.color)
            #else
            Color.init(nsColor: color.color)
                .transformEffect(isHovering ? CGAffineTransform(translationX: 0, y: -10) : .identity)
                .overlay {
                    if isHovering, let hex = color.hexString {
                        Text(hex)
                            .foregroundStyle(Color.init(nsColor: color.color.contrastingTextColor))
                            .textSelection(.enabled)
                            .copyable([hex])
                    }
                }
                .onHover(perform: { hovering in
                    isHovering = hovering

                })
            #endif
            Text(color.description)
        }
    }
}

extension NSColor {

    var contrastingTextColor: NSColor {
            // Convert the color to the RGB color space
            guard let rgbColor = usingColorSpace(.deviceRGB) else {
                return .black  // Default to black if the color space conversion fails
            }

            // Get the RGB components
            let red = rgbColor.redComponent
            let green = rgbColor.greenComponent
            let blue = rgbColor.blueComponent

            // Calculate the relative luminance
            let luminance = 0.2126 * red + 0.7152 * green + 0.0722 * blue

            // Return black for light colors and white for dark colors
            return luminance > 0.5 ? .black : .white
        }
}

#Preview {
    ColorView(color: ColorSwatch(color: ColorPalette.news100, description: "100"))
}
