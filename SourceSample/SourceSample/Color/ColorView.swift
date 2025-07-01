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
                    Text(hex)
                        .monospaced()
                        .foregroundStyle(.secondary)
                }
            }

            VStack(alignment: .leading) {
                Color(color.color)
                    .frame(height: 75)
                Text(color.description)
                    .bold()
            }
        }
        .onTapGesture {
            guard let hexString = color.hexString, !hexString.isEmpty else { return }
            NSPasteboard.general.clearContents()
            NSPasteboard.general.setString(hexString, forType: .string)
        }
    }
}

#Preview {
    ColorView(color: ColorSwatch(color: ColorPalette.news100, description: "100"))
}
