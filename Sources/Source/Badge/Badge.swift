//

import SwiftUI
import GuardianFonts

public struct Badge: View {
    public let text: String
    public let foregroundColor: Color
    public let backgroundColor: Color

    public init(
        text: String,
        foregroundColor: Color,
        backgroundColor: Color
    ) {
        self.text = text
        self.foregroundColor = foregroundColor
        self.backgroundColor = backgroundColor
    }

    @Environment(\.controlSize)
    private var controlSize

    public var body: some View {
        Text(text)
            .font(badgeFont)
            .padding(.horizontal, badgePadding)
            .frame(height: badgeHeight)
            .foregroundStyle(foregroundColor)
            .background(backgroundColor)
            .clipShape(.rect(cornerRadius: 4))
    }

    private var badgeFont: GuardianFont {
        switch controlSize {
        case .mini, .small:
            Typography.textSansBld12
        case .regular, .large, .extraLarge:
            Typography.textSansBld15
        @unknown default:
            Typography.textSansBld15
        }
    }

    private var badgeHeight: CGFloat {
        switch controlSize {
        case .mini, .small: 16
        case .regular, .large, .extraLarge: 24
        @unknown default: 24
        }
    }

    private var badgePadding: CGFloat {
        switch controlSize {
        case .mini, .small: 4
        case .regular, .large, .extraLarge: 8
        @unknown default: 8
        }
    }
}


#Preview {
    Grid {
        GridRow {
            Badge(
                text: "Save 30%",
                foregroundColor: Color(ColorPalette.neutral97),
                backgroundColor: Color(ColorPalette.sport400)
            )
            Badge(
                text: "Save 30%",
                foregroundColor: Color(ColorPalette.neutral20),
                backgroundColor: Color(ColorPalette.neutral86)
            )
            Badge(
                text: "Save 30%",
                foregroundColor: Color(ColorPalette.neutral97),
                backgroundColor: Color(ColorPalette.news400)
            )
            Badge(
                text: "Save 30%",
                foregroundColor: Color(ColorPalette.neutral97),
                backgroundColor: Color(ColorPalette.brand400)
            )
        }
        GridRow {
            Badge(
                text: "Save 30%",
                foregroundColor: Color(ColorPalette.neutral97),
                backgroundColor: Color(ColorPalette.sport400)
            )
            Badge(
                text: "Save 30%",
                foregroundColor: Color(ColorPalette.neutral20),
                backgroundColor: Color(ColorPalette.neutral86)
            )
            Badge(
                text: "Save 30%",
                foregroundColor: Color(ColorPalette.neutral97),
                backgroundColor: Color(ColorPalette.news400)
            )
            Badge(
                text: "Save 30%",
                foregroundColor: Color(ColorPalette.neutral97),
                backgroundColor: Color(ColorPalette.brand400)
            )
        }
        .controlSize(.small)
    }
    .previewFonts()
}
