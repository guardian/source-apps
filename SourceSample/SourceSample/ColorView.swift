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
                .overlay {
                    if isHovering, let hex = color.hexString {
                        Text(hex)
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

#Preview {
    ColorView(color: ColorSwatch(color: ColorPalette.news100, description: "100"))
}
