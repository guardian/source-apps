import Foundation
import SwiftUI
import GuardianFonts

// FIXME: figure out line height percentages

/// App typography presets.
///  Defined in Source here https://theguardian.design/2a1e5182b/p/01555f-typography-presets/b/814fba. 
/// The Guardian has four bespoke typefaces, which were created for different purposes. When used effectively, they create contrast and alter the tone in which text is read.
/// **Where do we use app typography presets?**
/// Any content crafted and developed within the app's native environment, including the app fronts, My Guardian, custom modals, and supporter revenue messages.
///
/// *Note: Article pages and sign-in/registration pages are presented in a webview, hence utilising web typography presets.
public struct Typography {

    // MARK: GuardianHeadline
    /// Use for headlines, headings and any short form text like pull quotes, bylines and titles.

    let headlineBld14 = GuardianFont(style: .headlineBold, size: 14)
    let headlineBld15 = GuardianFont(style: .headlineBold, size: 15)
    let headlineBld16 = GuardianFont(style: .headlineBold, size: 16)
    let headlineBld17 = GuardianFont(style: .headlineBold, size: 17)
    let headlineBld18 = GuardianFont(style: .headlineBold, size: 18)
    let headlineBld20 = GuardianFont(style: .headlineBold, size: 20)
    let headlineBld22 = GuardianFont(style: .headlineBold, size: 22)
    let headlineBld24 = GuardianFont(style: .headlineBold, size: 24)
    let headlineBld28 = GuardianFont(style: .headlineBold, size: 28)
    let headlineBld34 = GuardianFont(style: .headlineBold, size: 34)
    let headlineBld42 = GuardianFont(style: .headlineBold, size: 42)

    let headlineLit14 = GuardianFont(style: .headlineLight, size: 14)
    let headlineLit15 = GuardianFont(style: .headlineLight, size: 15)
    let headlineLit16 = GuardianFont(style: .headlineLight, size: 16)
    let headlineLit17 = GuardianFont(style: .headlineLight, size: 17)
    let headlineLit18 = GuardianFont(style: .headlineLight, size: 18)
    let headlineLit20 = GuardianFont(style: .headlineLight, size: 20)
    let headlineLit22 = GuardianFont(style: .headlineLight, size: 22)
    let headlineLit24 = GuardianFont(style: .headlineLight, size: 24)
    let headlineLit28 = GuardianFont(style: .headlineLight, size: 28)
    let headlineLit34 = GuardianFont(style: .headlineLight, size: 34)
    let headlineLit42 = GuardianFont(style: .headlineLight, size: 42)

    let headlineMed14 = GuardianFont(style: .headlineMedium, size: 14)
    let headlineMed15 = GuardianFont(style: .headlineMedium, size: 15)
    let headlineMed16 = GuardianFont(style: .headlineMedium, size: 16)
    let headlineMed17 = GuardianFont(style: .headlineMedium, size: 17)
    let headlineMed18 = GuardianFont(style: .headlineMedium, size: 18)
    let headlineMed20 = GuardianFont(style: .headlineMedium, size: 20)
    let headlineMed22 = GuardianFont(style: .headlineMedium, size: 22)
    let headlineMed24 = GuardianFont(style: .headlineMedium, size: 24)
    let headlineMed28 = GuardianFont(style: .headlineMedium, size: 28)
    let headlineMed34 = GuardianFont(style: .headlineMedium, size: 34)
    let headlineMed42 = GuardianFont(style: .headlineMedium, size: 42)

    let headlineMedIta14 = GuardianFont(style: .headlineMediumItalic, size: 14)
    let headlineMedIta15 = GuardianFont(style: .headlineMediumItalic, size: 15)
    let headlineMedIta16 = GuardianFont(style: .headlineMediumItalic, size: 16)
    let headlineMedIta17 = GuardianFont(style: .headlineMediumItalic, size: 17)
    let headlineMedIta18 = GuardianFont(style: .headlineMediumItalic, size: 18)
    let headlineMedIta20 = GuardianFont(style: .headlineMediumItalic, size: 20)
    let headlineMedIta22 = GuardianFont(style: .headlineMediumItalic, size: 22)
    let headlineMedIta24 = GuardianFont(style: .headlineMediumItalic, size: 24)
    let headlineMedIta28 = GuardianFont(style: .headlineMediumItalic, size: 28)
    let headlineMedIta34 = GuardianFont(style: .headlineMediumItalic, size: 34)
    let headlineMedIta42 = GuardianFont(style: .headlineMediumItalic, size: 42)

    let headlineSemiBld14 = GuardianFont(style: .headlineSemibold, size: 14)
    let headlineSemiBld15 = GuardianFont(style: .headlineSemibold, size: 15)
    let headlineSemiBld16 = GuardianFont(style: .headlineSemibold, size: 16)
    let headlineSemiBld17 = GuardianFont(style: .headlineSemibold, size: 17)
    let headlineSemiBld18 = GuardianFont(style: .headlineSemibold, size: 18)
    let headlineSemiBld20 = GuardianFont(style: .headlineSemibold, size: 20)
    let headlineSemiBld22 = GuardianFont(style: .headlineSemibold, size: 22)
    let headlineSemiBld24 = GuardianFont(style: .headlineSemibold, size: 24)
    let headlineSemiBld28 = GuardianFont(style: .headlineSemibold, size: 28)
    let headlineSemiBld34 = GuardianFont(style: .headlineSemibold, size: 34)
    let headlineSemiBld42 = GuardianFont(style: .headlineSemibold, size: 42)


    // MARK: Article body text – GuardianTextEgyptian
    /// Use for article body text.

    let article15 = GuardianFont(style: .textEgyptianRegular, size: 15)
    let article17 = GuardianFont(style: .textEgyptianRegular, size: 17)
    let articleBld15 = GuardianFont(style: .textEgyptianBold, size: 15)
    let articleBld17 = GuardianFont(style: .textEgyptianBold, size: 17)
    let articleBldIta15 = GuardianFont(style: .textEgyptianBoldItalic, size: 15)
    let articleBldIta17 = GuardianFont(style: .textEgyptianBoldItalic, size: 17)
    let articleIta15 = GuardianFont(style: .textEgyptianRegularItalic, size: 15)
    let articleIta17 = GuardianFont(style: .textEgyptianRegularItalic, size: 17)


    // MARK: GuardianTextEgyptian
    /// Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages.

    let textEgyp14 = GuardianFont(style: .textEgyptianRegular, size: 14)
    let textEgyp15 = GuardianFont(style: .textEgyptianRegular, size: 15)
    let textEgyp17 = GuardianFont(style: .textEgyptianBold, size: 17)
    let textEgypBld14 = GuardianFont(style: .textEgyptianBold, size: 14)
    let textEgypBld15 = GuardianFont(style: .textEgyptianBold, size: 15)
    let textEgypBld17 = GuardianFont(style: .textEgyptianBold, size: 17)
    let textEgypBldIta14 = GuardianFont(style: .textEgyptianBoldItalic, size: 14)
    let textEgypBldIta15 = GuardianFont(style: .textEgyptianBoldItalic, size: 15)
    let textEgypBldIta17 = GuardianFont(style: .textEgyptianBoldItalic, size: 17)
    let textEgypIta14 = GuardianFont(style: .textEgyptianRegularItalic, size: 14)
    let textEgypIta15 = GuardianFont(style: .textEgyptianRegularItalic, size: 15)
    let textEgypIta17 = GuardianFont(style: .textEgyptianRegularItalic, size: 17)


    // MARK: GuardianTextSans
    /// Use for interactive page elements like buttons and text input fields and for meta information like datelines, image captions and data visualisations.
    /// ** Note: Text Sans is used across the board on paid content templates to help differentiate from editorial content

    let textSans11 = GuardianFont(style: .textSansRegular, size: 11)
    let textSans12 = GuardianFont(style: .textSansRegular, size: 12)
    let textSans14 = GuardianFont(style: .textSansRegular, size: 14)
    let textSans15 = GuardianFont(style: .textSansRegular, size: 15)
    let textSans17 = GuardianFont(style: .textSansRegular, size: 17)
    let textSans20 = GuardianFont(style: .textSansRegular, size: 20)
    let textSans24 = GuardianFont(style: .textSansRegular, size: 24)
    let textSans28 = GuardianFont(style: .textSansRegular, size: 28)
    let textSans34 = GuardianFont(style: .textSansRegular, size: 34)

    let textSansBld11 = GuardianFont(style: .textSansBold, size: 11)
    let textSansBld12 = GuardianFont(style: .textSansBold, size: 12)
    let textSansBld14 = GuardianFont(style: .textSansBold, size: 14)
    let textSansBld15 = GuardianFont(style: .textSansBold, size: 15)
    let textSansBld17 = GuardianFont(style: .textSansBold, size: 17)
    let textSansBld20 = GuardianFont(style: .textSansBold, size: 20)
    let textSansBld24 = GuardianFont(style: .textSansBold, size: 24)
    let textSansBld28 = GuardianFont(style: .textSansBold, size: 28)
    let textSansBld34 = GuardianFont(style: .textSansBold, size: 34)

    let textSansIta11 = GuardianFont(style: .textSansRegularItalic, size: 11)
    let textSansIta12 = GuardianFont(style: .textSansRegularItalic, size: 12)
    let textSansIta14 = GuardianFont(style: .textSansRegularItalic, size: 14)
    let textSansIta15 = GuardianFont(style: .textSansRegularItalic, size: 15)
    let textSansIta17 = GuardianFont(style: .textSansRegularItalic, size: 17)
    let textSansIta20 = GuardianFont(style: .textSansRegularItalic, size: 20)
    let textSansIta24 = GuardianFont(style: .textSansRegularItalic, size: 24)
    let textSansIta28 = GuardianFont(style: .textSansRegularItalic, size: 28)
    let textSansIta34 = GuardianFont(style: .textSansRegularItalic, size: 34)


    // MARK: GuardianTitlepiece
    /// Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly and at large sizes only.
    /// **Note: this font is not available on theguardian.com

    let titlepiece42 = GuardianFont(style: .titlepieceBold, size: 42)
    let titlepiece50 = GuardianFont(style: .titlepieceBold, size: 50)
    let titlepiece70 = GuardianFont(style: .titlepieceBold, size: 70)
}
