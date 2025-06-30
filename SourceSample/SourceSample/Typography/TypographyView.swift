//
//  TypographyView.swift
//  SourceSample
//
//  Created by Benjamin Briggs on 30/06/2025.
//

import SwiftUI
import GuardianFonts
import Source

struct TypographyView: View {
    private let model = TypographyModel()
    var body: some View {
        List {
            ForEach(model.sections, id: \.name) { section in
                Section {
                    ForEach(section.fonts, id: \.name) { font in
                        HStack {
                            Text(font.name)
                                .font(font.font)
                            Spacer()
                            Text(font.fontDescriptor)
                                .monospaced()
                        }
                        .padding()
                        .onTapGesture {
                            NSPasteboard.general.clearContents()
                            NSPasteboard.general.setString(font.fontDescriptor, forType: .string)
                        }
                    }
                } header: {
                    Text(section.name)
                        .font(Typography.headlineBld20)
                        .padding(.bottom, 8)
                }
            }
        }
    }
}

#Preview {
    TypographyView()
}
