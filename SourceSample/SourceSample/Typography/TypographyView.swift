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
                Section(section.name) {
                    ForEach(section.fonts, id: \.name) { font in
                        ViewThatFits {
                            HStack {
                                Text(font.name)
                                    .font(font.font)
                                Spacer()
                                CopyableLabel(font.fontDescriptor)
                            }


                            HStack {
                                Text(font.name)
                                    .font(font.font)
                                Spacer()
                            }
                        }
                        .padding()
                    }
                }
            }
        }
        .navigationTitle("Source Typography")
    }
}

#Preview {
    TypographyView()
}
