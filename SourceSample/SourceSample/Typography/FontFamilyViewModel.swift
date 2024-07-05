//
//  FontFamilyViewModel.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 05/07/2024.
//

import Foundation
import Source
import GuardianFonts

struct FontFamilyViewModel {
    let fontFamily: FontFamily
    let fonts: [GuardianFontViewModel]
}

extension FontFamilyViewModel {
    static let preview = FontFamilyViewModel(fontFamily: .headline, fonts: [GuardianFontViewModel(propertyName: "Typography.headlineBld14", font: Typography.headlineBld14)])
}
