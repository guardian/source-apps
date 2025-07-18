//
//  PaletteEditor.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 11/07/2025.
//

import SwiftUI
import Source

struct PaletteEditor: View {
    let title: String
    @Binding var palette: ChipPalette
    
    var body: some View {
        LabeledContent(title) {
            Grid(alignment: .leading, horizontalSpacing: 16, verticalSpacing: 16) {
                GridRow {
                    colorRow(label: "Title", color: $palette.title)
                    colorRow(label: "Background", color: $palette.background)
                }
                
                GridRow {
                    colorRow(label: "Badge", color: $palette.badge)
                    colorRow(label: "Border", color: $palette.borderColor)
                }
            }
        }
    }
    
    @ViewBuilder
    private func colorRow(label: String, color: Binding<Color>) -> some View {
        VStack(alignment: .leading, spacing: 2) {
            Text(label)
                .font(.body)

            Text(color.wrappedValue.toHex ?? "#000000")
                .font(.caption)
                .monospaced()
                .foregroundColor(.secondary)

            ColorPicker("", selection: color)
                .labelsHidden()
                .frame(height: 30)
        }
    }
}

#Preview {
    @Previewable @State var palette = ChipPalette.bordered

    GroupBox("Chip Palette") {
        VStack(alignment: .leading) {
            PaletteEditor(title: "Palette", palette: $palette)
        }
        .padding()
    }
    .padding()
}
