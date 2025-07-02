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
        List {
            ForEach(viewModel.sections, id: \.name) { section in
                Section(section.name) {
                    ColorSectionView(colors: section.colors)
                }
            }
        }
        .navigationTitle("Source Colours")
    }
}

struct ColorSectionView: View {
    let colors: [ColorSwatch]
    var body: some View {
        HStack(spacing: 0) {
            ForEach(colors, id: \.color) { color in
                ColorView(color: color)
            }
        }
        .font(Typography.textSans14)
    }
}

#Preview {
    ColorSwatchView()
}
