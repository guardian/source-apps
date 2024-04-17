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
public enum Typography {

    // MARK: GuardianHeadline
    /// Use for headlines, headings and any short form text like pull quotes, bylines and titles.

    public static let headlineBld14 = GuardianFont(style: .headlineBold, size: 14)
    public static let headlineBld15 = GuardianFont(style: .headlineBold, size: 15)
    public static let headlineBld16 = GuardianFont(style: .headlineBold, size: 16)
    public static let headlineBld17 = GuardianFont(style: .headlineBold, size: 17)
    public static let headlineBld18 = GuardianFont(style: .headlineBold, size: 18)
    public static let headlineBld20 = GuardianFont(style: .headlineBold, size: 20)
    public static let headlineBld22 = GuardianFont(style: .headlineBold, size: 22)
    public static let headlineBld24 = GuardianFont(style: .headlineBold, size: 24)
    public static let headlineBld28 = GuardianFont(style: .headlineBold, size: 28)
    public static let headlineBld34 = GuardianFont(style: .headlineBold, size: 34)
    public static let headlineBld42 = GuardianFont(style: .headlineBold, size: 42)

    public static let headlineLit14 = GuardianFont(style: .headlineLight, size: 14)
    public static let headlineLit15 = GuardianFont(style: .headlineLight, size: 15)
    public static let headlineLit16 = GuardianFont(style: .headlineLight, size: 16)
    public static let headlineLit17 = GuardianFont(style: .headlineLight, size: 17)
    public static let headlineLit18 = GuardianFont(style: .headlineLight, size: 18)
    public static let headlineLit20 = GuardianFont(style: .headlineLight, size: 20)
    public static let headlineLit22 = GuardianFont(style: .headlineLight, size: 22)
    public static let headlineLit24 = GuardianFont(style: .headlineLight, size: 24)
    public static let headlineLit28 = GuardianFont(style: .headlineLight, size: 28)
    public static let headlineLit34 = GuardianFont(style: .headlineLight, size: 34)
    public static let headlineLit42 = GuardianFont(style: .headlineLight, size: 42)

    public static let headlineMed14 = GuardianFont(style: .headlineMedium, size: 14)
    public static let headlineMed15 = GuardianFont(style: .headlineMedium, size: 15)
    public static let headlineMed16 = GuardianFont(style: .headlineMedium, size: 16)
    public static let headlineMed17 = GuardianFont(style: .headlineMedium, size: 17)
    public static let headlineMed18 = GuardianFont(style: .headlineMedium, size: 18)
    public static let headlineMed20 = GuardianFont(style: .headlineMedium, size: 20)
    public static let headlineMed22 = GuardianFont(style: .headlineMedium, size: 22)
    public static let headlineMed24 = GuardianFont(style: .headlineMedium, size: 24)
    public static let headlineMed28 = GuardianFont(style: .headlineMedium, size: 28)
    public static let headlineMed34 = GuardianFont(style: .headlineMedium, size: 34)
    public static let headlineMed42 = GuardianFont(style: .headlineMedium, size: 42)

    public static let headlineMedIta14 = GuardianFont(style: .headlineMediumItalic, size: 14)
    public static let headlineMedIta15 = GuardianFont(style: .headlineMediumItalic, size: 15)
    public static let headlineMedIta16 = GuardianFont(style: .headlineMediumItalic, size: 16)
    public static let headlineMedIta17 = GuardianFont(style: .headlineMediumItalic, size: 17)
    public static let headlineMedIta18 = GuardianFont(style: .headlineMediumItalic, size: 18)
    public static let headlineMedIta20 = GuardianFont(style: .headlineMediumItalic, size: 20)
    public static let headlineMedIta22 = GuardianFont(style: .headlineMediumItalic, size: 22)
    public static let headlineMedIta24 = GuardianFont(style: .headlineMediumItalic, size: 24)
    public static let headlineMedIta28 = GuardianFont(style: .headlineMediumItalic, size: 28)
    public static let headlineMedIta34 = GuardianFont(style: .headlineMediumItalic, size: 34)
    public static let headlineMedIta42 = GuardianFont(style: .headlineMediumItalic, size: 42)

    public static let headlineSemiBld14 = GuardianFont(style: .headlineSemibold, size: 14)
    public static let headlineSemiBld15 = GuardianFont(style: .headlineSemibold, size: 15)
    public static let headlineSemiBld16 = GuardianFont(style: .headlineSemibold, size: 16)
    public static let headlineSemiBld17 = GuardianFont(style: .headlineSemibold, size: 17)
    public static let headlineSemiBld18 = GuardianFont(style: .headlineSemibold, size: 18)
    public static let headlineSemiBld20 = GuardianFont(style: .headlineSemibold, size: 20)
    public static let headlineSemiBld22 = GuardianFont(style: .headlineSemibold, size: 22)
    public static let headlineSemiBld24 = GuardianFont(style: .headlineSemibold, size: 24)
    public static let headlineSemiBld28 = GuardianFont(style: .headlineSemibold, size: 28)
    public static let headlineSemiBld34 = GuardianFont(style: .headlineSemibold, size: 34)
    public static let headlineSemiBld42 = GuardianFont(style: .headlineSemibold, size: 42)


    // MARK: Article body text – GuardianTextEgyptian
    /// Use for article body text.

    public static let article15 = GuardianFont(style: .textEgyptianRegular, size: 15)
    public static let article17 = GuardianFont(style: .textEgyptianRegular, size: 17)
    public static let articleBld15 = GuardianFont(style: .textEgyptianBold, size: 15)
    public static let articleBld17 = GuardianFont(style: .textEgyptianBold, size: 17)
    public static let articleBldIta15 = GuardianFont(style: .textEgyptianBoldItalic, size: 15)
    public static let articleBldIta17 = GuardianFont(style: .textEgyptianBoldItalic, size: 17)
    public static let articleIta15 = GuardianFont(style: .textEgyptianRegularItalic, size: 15)
    public static let articleIta17 = GuardianFont(style: .textEgyptianRegularItalic, size: 17)


    // MARK: GuardianTextEgyptian
    /// Use for multiple sentences/paragraphs of text, like paragraphs of text on marketing pages.

    public static let textEgyp14 = GuardianFont(style: .textEgyptianRegular, size: 14)
    public static let textEgyp15 = GuardianFont(style: .textEgyptianRegular, size: 15)
    public static let textEgyp17 = GuardianFont(style: .textEgyptianBold, size: 17)
    public static let textEgypBld14 = GuardianFont(style: .textEgyptianBold, size: 14)
    public static let textEgypBld15 = GuardianFont(style: .textEgyptianBold, size: 15)
    public static let textEgypBld17 = GuardianFont(style: .textEgyptianBold, size: 17)
    public static let textEgypBldIta14 = GuardianFont(style: .textEgyptianBoldItalic, size: 14)
    public static let textEgypBldIta15 = GuardianFont(style: .textEgyptianBoldItalic, size: 15)
    public static let textEgypBldIta17 = GuardianFont(style: .textEgyptianBoldItalic, size: 17)
    public static let textEgypIta14 = GuardianFont(style: .textEgyptianRegularItalic, size: 14)
    public static let textEgypIta15 = GuardianFont(style: .textEgyptianRegularItalic, size: 15)
    public static let textEgypIta17 = GuardianFont(style: .textEgyptianRegularItalic, size: 17)


    // MARK: GuardianTextSans
    /// Use for interactive page elements like buttons and text input fields and for meta information like datelines, image captions and data visualisations.
    /// ** Note: Text Sans is used across the board on paid content templates to help differentiate from editorial content

    public static let textSans11 = GuardianFont(style: .textSansRegular, size: 11)
    public static let textSans12 = GuardianFont(style: .textSansRegular, size: 12)
    public static let textSans14 = GuardianFont(style: .textSansRegular, size: 14)
    public static let textSans15 = GuardianFont(style: .textSansRegular, size: 15)
    public static let textSans17 = GuardianFont(style: .textSansRegular, size: 17)
    public static let textSans20 = GuardianFont(style: .textSansRegular, size: 20)
    public static let textSans24 = GuardianFont(style: .textSansRegular, size: 24)
    public static let textSans28 = GuardianFont(style: .textSansRegular, size: 28)
    public static let textSans34 = GuardianFont(style: .textSansRegular, size: 34)

    public static let textSansBld11 = GuardianFont(style: .textSansBold, size: 11)
    public static let textSansBld12 = GuardianFont(style: .textSansBold, size: 12)
    public static let textSansBld14 = GuardianFont(style: .textSansBold, size: 14)
    public static let textSansBld15 = GuardianFont(style: .textSansBold, size: 15)
    public static let textSansBld17 = GuardianFont(style: .textSansBold, size: 17)
    public static let textSansBld20 = GuardianFont(style: .textSansBold, size: 20)
    public static let textSansBld24 = GuardianFont(style: .textSansBold, size: 24)
    public static let textSansBld28 = GuardianFont(style: .textSansBold, size: 28)
    public static let textSansBld34 = GuardianFont(style: .textSansBold, size: 34)

    public static let textSansIta11 = GuardianFont(style: .textSansRegularItalic, size: 11)
    public static let textSansIta12 = GuardianFont(style: .textSansRegularItalic, size: 12)
    public static let textSansIta14 = GuardianFont(style: .textSansRegularItalic, size: 14)
    public static let textSansIta15 = GuardianFont(style: .textSansRegularItalic, size: 15)
    public static let textSansIta17 = GuardianFont(style: .textSansRegularItalic, size: 17)
    public static let textSansIta20 = GuardianFont(style: .textSansRegularItalic, size: 20)
    public static let textSansIta24 = GuardianFont(style: .textSansRegularItalic, size: 24)
    public static let textSansIta28 = GuardianFont(style: .textSansRegularItalic, size: 28)
    public static let textSansIta34 = GuardianFont(style: .textSansRegularItalic, size: 34)


    // MARK: GuardianTitlepiece
    /// Use for impact. Ideal for marketing messages, page headers and numerals. Use sparingly and at large sizes only.
    /// **Note: this font is not available on theguardian.com

    public static let titlepiece42 = GuardianFont(style: .titlepieceBold, size: 42)
    public static let titlepiece50 = GuardianFont(style: .titlepieceBold, size: 50)
    public static let titlepiece70 = GuardianFont(style: .titlepieceBold, size: 70)
}
