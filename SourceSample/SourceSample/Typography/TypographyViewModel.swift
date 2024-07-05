//
//  TypographyViewModel.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 05/07/2024.
//

import Foundation
import GuardianFonts
import Source

enum FontFamily: String {
    case headline = "Guardian Headline"
    case article = "Article body text"
    case textEgyptian = "Guardian Text Egyptian"
    case textSans = "Guardian Text Sans"
    case titlepiece = "Guardian Titlepiece"
}

struct TypographyViewModel {
    // FIXME: add other missing fonts
    private static let headlineFamily = FontFamilyViewModel(fontFamily: .headline, fonts: [GuardianFontViewModel(propertyName:"Typography.headlineBld14", font: Typography.headlineBld14),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld15", font: Typography.headlineBld15),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld16", font: Typography.headlineBld16),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld17", font: Typography.headlineBld17),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld18", font: Typography.headlineBld18),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld20", font: Typography.headlineBld20),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld22", font: Typography.headlineBld22),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld24", font: Typography.headlineBld24),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld28", font: Typography.headlineBld28),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld34", font: Typography.headlineBld34),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineBld42", font: Typography.headlineBld42),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit14", font: Typography.headlineLit14),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit15", font: Typography.headlineLit15),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit16", font: Typography.headlineLit16),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit17", font: Typography.headlineLit17),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit18", font: Typography.headlineLit18),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit20", font: Typography.headlineLit20),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit22", font: Typography.headlineLit22),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit24", font: Typography.headlineLit24),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit28", font: Typography.headlineLit28),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit34", font: Typography.headlineLit34),
                                                                                           GuardianFontViewModel(propertyName:"Typography.headlineLit42", font: Typography.headlineLit42)
    ])

    private static let articleFamily = FontFamilyViewModel(fontFamily: .article, fonts: [
        GuardianFontViewModel(propertyName:"Typography.article15", font: Typography.article15),
        GuardianFontViewModel(propertyName:"Typography.article17", font: Typography.article17),
        GuardianFontViewModel(propertyName:"Typography.articleBld15", font: Typography.articleBld15),
        GuardianFontViewModel(propertyName:"Typography.articleBld17", font: Typography.articleBld17),
        GuardianFontViewModel(propertyName:"Typography.articleIta15", font: Typography.articleIta15),
        GuardianFontViewModel(propertyName:"Typography.articleIta17", font: Typography.articleIta17),
        GuardianFontViewModel(propertyName:"Typography.articleBldIta15", font: Typography.articleBldIta15),
        GuardianFontViewModel(propertyName:"Typography.articleBldIta17", font: Typography.articleBldIta17)
    ])

    private static let textEgyptianFamily = FontFamilyViewModel(fontFamily: .textEgyptian, fonts: [
        GuardianFontViewModel(propertyName:"Typography.textEgyp14", font: Typography.textEgyp14),
        GuardianFontViewModel(propertyName:"Typography.textEgyp15", font: Typography.textEgyp15),
        GuardianFontViewModel(propertyName:"Typography.textEgyp17", font: Typography.textEgyp17),
        GuardianFontViewModel(propertyName:"Typography.textEgypBld14", font: Typography.textEgypBld14),
        GuardianFontViewModel(propertyName:"Typography.textEgypBld15", font: Typography.textEgypBld15),
        GuardianFontViewModel(propertyName:"Typography.textEgypBld17", font: Typography.textEgypBld17),
        GuardianFontViewModel(propertyName:"Typography.textEgypBldIta14", font: Typography.textEgypBldIta14),
        GuardianFontViewModel(propertyName:"Typography.textEgypBldIta15", font: Typography.textEgypBldIta15),
        GuardianFontViewModel(propertyName:"Typography.textEgypBldIta17", font: Typography.textEgypBldIta17),
        GuardianFontViewModel(propertyName:"Typography.textEgypIta14", font: Typography.textEgypIta14),
        GuardianFontViewModel(propertyName:"Typography.textEgypIta15", font: Typography.textEgypIta15),
        GuardianFontViewModel(propertyName:"Typography.textEgypIta17", font: Typography.textEgypIta17)
    ])

    let sections: [FontFamilyViewModel] = [TypographyViewModel.headlineFamily, TypographyViewModel.articleFamily, textEgyptianFamily]

}
