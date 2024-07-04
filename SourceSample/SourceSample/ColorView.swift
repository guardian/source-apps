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
            Color.init(uiColor: color.color)
                .overlay {
                    if isHovering, let hex = color.hexString {
                        Text(hex)
                    }
                }
                .onHover(perform: { hovering in
                    isHovering = hovering

                })
            Text(color.description)
        }
    }
}

#Preview {
    ColorView(color: ColorSwatch(color: ColorPalette.news100, description: "100"))
}
