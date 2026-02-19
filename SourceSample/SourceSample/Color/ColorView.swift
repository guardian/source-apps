//
//  ColorView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//

import SwiftUI
import Source

struct ColorView: View {

    let color: ColorSwatch

    var body: some View {
        ViewThatFits {
            VStack(alignment: .leading) {
                Color(color.color)
                    .frame(height: 75)
                Text(color.description)
                    .bold()
                if let hex = color.hexString {
                    CopyableLabel(hex)
                }
            }

            VStack(alignment: .leading) {
                Color(color.color)
                    .frame(height: 75)
                Text(color.description)
                    .bold()
            }
        }
    }
}

#Preview {
    ColorView(color: ColorSwatch(color: ColorPalette.news100, description: "100"))
}
