//
//  FontFamilyView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 05/07/2024.
//

import SwiftUI
import Source
import GuardianFonts

struct GuardianFontViewModel {
    let propertyName: String
    let font: GuardianFont

    var title: String? {
        return propertyName.components(separatedBy: ".").last
    }
}

struct FontFamilyView: View {
    let fontFamily: FontFamilyViewModel

    var body: some View {
        ScrollView {
            Grid {
                ForEach(fontFamily.fonts, id: \.propertyName) { viewModel in
                    FontView(viewModel: viewModel)
                }
            }
        }
    }
}

#Preview {
    FontFamilyView(fontFamily: .preview)
}
