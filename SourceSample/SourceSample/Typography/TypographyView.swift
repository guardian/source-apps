//
//  TypographyView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 05/07/2024.
//

import SwiftUI
import Source

struct TypographyView: View {
    let viewModel = TypographyViewModel()

    var body: some View {
        Grid {
            ForEach(viewModel.sections, id: \.fontFamily) { section in
                NavigationLink {
                    FontFamilyView(fontFamily: section)
                } label: {
                    VStack {
                        Text("Aa")
                            .font(section.fonts.last!.font)
                        Text("\(section.fonts.count) presets")
                            .font(.caption)
                    }
                    .padding()
                }
            }
        }
    }
}

#Preview {
    TypographyView()
}
