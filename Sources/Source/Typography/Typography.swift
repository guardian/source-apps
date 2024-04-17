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

    public let headlineBld14 = GuardianFont(style: .headlineBold, size: 14)
    public let headlineBld15 = GuardianFont(style: .headlineBold, size: 15)
    public let headlineBld16 = GuardianFont(style: .headlineBold, size: 16)
    public let headlineBld17 = GuardianFont(style: .headlineBold, size: 17)
    public let headlineBld18 = GuardianFont(style: .headlineBold, size: 18)
    public let headlineBld20 = GuardianFont(style: .headlineBold, size: 20)
    public let headlineBld22 = GuardianFont(style: .headlineBold, size: 22)
    public let headlineBld24 = GuardianFont(style: .headlineBold, size: 24)
    public let headlineBld28 = GuardianFont(style: .headlineBold, size: 28)
    public let headlineBld34 = GuardianFont(style: .headlineBold, size: 34)
    public let headlineBld42 = GuardianFont(style: .headlineBold, size: 42)

    public let headlineLit14 = GuardianFont(style: .headlineLight, size: 14)
    public let headlineLit15 = GuardianFont(style: .headlineLight, size: 15)
    public let headlineLit16 = GuardianFont(style: .headlineLight, size: 16)
    public let headlineLit17 = GuardianFont(style: .headlineLight, size: 17)
    public let headlineLit18 = GuardianFont(style: .headlineLight, size: 18)
    public let headlineLit20 = GuardianFont(style: .headlineLight, size: 20)
    public let headlineLit22 = GuardianFont(style: .headlineLight, size: 22)
    public let headlineLit24 = GuardianFont(style: .headlineLight, size: 24)
    public let headlineLit28 = GuardianFont(style: .headlineLight, size: 28)
    public let headlineLit34 = GuardianFont(style: .headlineLight, size: 34)
    public let headlineLit42 = GuardianFont(style: .headlineLight, size: 42)

    public let headlineMed14 = GuardianFont(style: .headlineMedium, size: 14)
    public let headlineMed15 = GuardianFont(style: .headlineMedium, size: 15)
    public let headlineMed16 = GuardianFont(style: .headlineMedium, size: 16)
    public let headlineMed17 = GuardianFont(style: .headlineMedium, size: 17)
    public let headlineMed18 = GuardianFont(style: .headlineMedium, size: 18)
    public let headlineMed20 = GuardianFont(style: .headlineMedium, size: 20)
    public let headlineMed22 = GuardianFont(style: .headlineMedium, size: 22)
    public let headlineMed24 = GuardianFont(style: .headlineMedium, size: 24)
    public let headlineMed28 = GuardianFont(style: .headlineMedium, size: 28)
    public let headlineMed34 = GuardianFont(style: .headlineMedium, size: 34)
    public let headlineMed42 = GuardianFont(style: .headlineMedium, size: 42)

    public let headlineMedIta14 = GuardianFont(style: .headlineMediumItalic, size: 14)
    public let headlineMedIta15 = GuardianFont(style: .headlineMediumItalic, size: 15)
    public let headlineMedIta16 = GuardianFont(style: .headlineMediumItalic, size: 16)
    public let headlineMedIta17 = GuardianFont(style: .headlineMediumItalic, size: 17)
    public let headlineMedIta18 = GuardianFont(style: .headlineMediumItalic, size: 18)
    public let headlineMedIta20 = GuardianFont(style: .headlineMediumItalic, size: 20)
    public let headlineMedIta22 = GuardianFont(style: .headlineMediumItalic, size: 22)
    public let headlineMedIta24 = GuardianFont(style: .headlineMediumItalic, size: 24)
    public let headlineMedIta28 = GuardianFont(style: .headlineMediumItalic, size: 28)
    public let headlineMedIta34 = GuardianFont(style: .headlineMediumItalic, size: 34)
    public let headlineMedIta42 = GuardianFont(style: .headlineMediumItalic, size: 42)

    public let headlineSemiBld14 = GuardianFont(style: .headlineSemibold, size: 14)
    public let headlineSemiBld15 = GuardianFont(style: .headlineSemibold, size: 15)
    public let headlineSemiBld16 = GuardianFont(style: .headlineSemibold, size: 16)
    public let headlineSemiBld17 = GuardianFont(style: .headlineSemibold, size: 17)
    public let headlineSemiBld18 = GuardianFont(style: .headlineSemibold, size: 18)
    public let headlineSemiBld20 = GuardianFont(style: .headlineSemibold, size: 20)
    public let headlineSemiBld22 = GuardianFont(style: .headlineSemibold, size: 22)
    public let headlineSemiBld24 = GuardianFont(style: .headlineSemibold, size: 24)
    public let headlineSemiBld28 = GuardianFont(style: .headlineSemibold, size: 28)
    public let headlineSemiBld34 = GuardianFont(style: .headlineSemibold, size: 34)
    public let headlineSemiBld42 = GuardianFont(style: .headlineSemibold, size: 42)


    // MARK: Article body text – GuardianTextEgyptian
    /// Use for article body text.

    public let article15 = GuardianFont(style: .textEgyptianRegular, size: 15)
    public let article17 = GuardianFont(style: .textEgyptianRegular, size: 17)
    public let articleBld15 = GuardianFont(style: .textEgyptianBold, size: 15)
    public let articleBld17 = GuardianFont(style: .textEgyptianBold, size: 17)
    public let articleBldIta15 = GuardianFont(style: .textEgyptianBoldItalic, size: 15)
    public let articleBldIta17 = GuardianFont(style: .textEgyptianBoldItalic, size: 17)
    public let articleIta15 = GuardianFont(style: .textEgyptianRegularItalic, size: 15)
    public let articleIta17 = GuardianFont(style: .textEgyptianRegularItalic, size: 17)


    // MARK: GuardianTextEgyptian
    /// Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages.

    public let textEgyp14 = GuardianFont(style: .textEgyptianRegular, size: 14)
    public let textEgyp15 = GuardianFont(style: .textEgyptianRegular, size: 15)
    public let textEgyp17 = GuardianFont(style: .textEgyptianBold, size: 17)
    public let textEgypBld14 = GuardianFont(style: .textEgyptianBold, size: 14)
    public let textEgypBld15 = GuardianFont(style: .textEgyptianBold, size: 15)
    public let textEgypBld17 = GuardianFont(style: .textEgyptianBold, size: 17)
    public let textEgypBldIta14 = GuardianFont(style: .textEgyptianBoldItalic, size: 14)
    public let textEgypBldIta15 = GuardianFont(style: .textEgyptianBoldItalic, size: 15)
    public let textEgypBldIta17 = GuardianFont(style: .textEgyptianBoldItalic, size: 17)
    public let textEgypIta14 = GuardianFont(style: .textEgyptianRegularItalic, size: 14)
    public let textEgypIta15 = GuardianFont(style: .textEgyptianRegularItalic, size: 15)
    public let textEgypIta17 = GuardianFont(style: .textEgyptianRegularItalic, size: 17)


    // MARK: GuardianTextSans
    /// Use for interactive page elements like buttons and text input fields and for meta information like datelines, image captions and data visualisations.
    /// ** Note: Text Sans is used across the board on paid content templates to help differentiate from editorial content

    public let textSans11 = GuardianFont(style: .textSansRegular, size: 11)
    public let textSans12 = GuardianFont(style: .textSansRegular, size: 12)
    public let textSans14 = GuardianFont(style: .textSansRegular, size: 14)
    public let textSans15 = GuardianFont(style: .textSansRegular, size: 15)
    public let textSans17 = GuardianFont(style: .textSansRegular, size: 17)
    public let textSans20 = GuardianFont(style: .textSansRegular, size: 20)
    public let textSans24 = GuardianFont(style: .textSansRegular, size: 24)
    public let textSans28 = GuardianFont(style: .textSansRegular, size: 28)
    public let textSans34 = GuardianFont(style: .textSansRegular, size: 34)

    public let textSansBld11 = GuardianFont(style: .textSansBold, size: 11)
    public let textSansBld12 = GuardianFont(style: .textSansBold, size: 12)
    public let textSansBld14 = GuardianFont(style: .textSansBold, size: 14)
    public let textSansBld15 = GuardianFont(style: .textSansBold, size: 15)
    public let textSansBld17 = GuardianFont(style: .textSansBold, size: 17)
    public let textSansBld20 = GuardianFont(style: .textSansBold, size: 20)
    public let textSansBld24 = GuardianFont(style: .textSansBold, size: 24)
    public let textSansBld28 = GuardianFont(style: .textSansBold, size: 28)
    public let textSansBld34 = GuardianFont(style: .textSansBold, size: 34)

    public let textSansIta11 = GuardianFont(style: .textSansRegularItalic, size: 11)
    public let textSansIta12 = GuardianFont(style: .textSansRegularItalic, size: 12)
    public let textSansIta14 = GuardianFont(style: .textSansRegularItalic, size: 14)
    public let textSansIta15 = GuardianFont(style: .textSansRegularItalic, size: 15)
    public let textSansIta17 = GuardianFont(style: .textSansRegularItalic, size: 17)
    public let textSansIta20 = GuardianFont(style: .textSansRegularItalic, size: 20)
    public let textSansIta24 = GuardianFont(style: .textSansRegularItalic, size: 24)
    public let textSansIta28 = GuardianFont(style: .textSansRegularItalic, size: 28)
    public let textSansIta34 = GuardianFont(style: .textSansRegularItalic, size: 34)


    // MARK: GuardianTitlepiece
    /// Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly and at large sizes only.
    /// **Note: this font is not available on theguardian.com

    public let titlepiece42 = GuardianFont(style: .titlepieceBold, size: 42)
    public let titlepiece50 = GuardianFont(style: .titlepieceBold, size: 50)
    public let titlepiece70 = GuardianFont(style: .titlepieceBold, size: 70)
}
