//
//  ContentView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//

import SwiftUI
import Source

struct ColorSwatchView: View {

    let viewModel = PaletteViewModel()

    var body: some View {
        ScrollView {
        VStack(alignment: .leading) {
            ForEach(viewModel.sections, id: \.name) { section in
                Section {
                    HStack(spacing: 0) {
                        ForEach(section.colors, id: \.color) { color in
                            ColorView(color: color)
                        }
                    }
                    .frame(height: 75)
                    .font(Typography.textSans14)
                } header: {
                    Text(section.name)
                        .font(Typography.headlineBld28)
                        .padding(.bottom, 8)
                }
            }
        }
        .padding()
        }
    }
}

#Preview {
    ColorSwatchView()
        .previewFonts()
}
