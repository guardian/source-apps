//

import SwiftUI

struct PromoStickerView: View {

    let text: String
    let size: PromoStickerSize
    let foregroundColor: Color
    let backgroundColor: Color
    var alignment: CornerPlacement?

    var body: some View {
        Text(text)
            .font(size == .large ? Typography.textSansBld15 : Typography.textSansBld12)
            .padding(.horizontal, size == .small ? 4 : 8)
            .padding(.vertical, size == .small ? 4 : 6.5)
            .background {
                roundedRectangle
                    .fill(backgroundColor)

            }
            .foregroundStyle(foregroundColor)
            .dynamicTypeSize(.medium)
    }

    private var roundedRectangle: AnyShape {
        if let alignment {
            AnyShape(
                UnevenRoundedRectangle(
                    topLeadingRadius: alignment.topLeadingRadius,
                    bottomLeadingRadius: alignment.bottomLeadingRadiuus,
                    bottomTrailingRadius: alignment.bottomTrailingRadius,
                    topTrailingRadius: alignment.topTrailingRadius
                )
            )
        } else {
            AnyShape(RoundedRectangle(cornerRadius: 4))
        }
    }
}

#Preview {
    VStack {
        HStack(alignment: .top) {
            PromoStickerView(
                text: "Save 30%",
                size: .small,
                foregroundColor: Color(uiColor: ColorPalette.neutral97),
                backgroundColor: Color(uiColor: ColorPalette.sport400),
            )
            PromoStickerView(
                text: "Save 30%",
                size: .large,
                foregroundColor: Color(uiColor: ColorPalette.neutral97),
                backgroundColor: Color(uiColor: ColorPalette.sport400),
            )
        }
        HStack(alignment: .top) {
            PromoStickerView(
                text: "Save 30%",
                size: .small,
                foregroundColor: Color(uiColor: ColorPalette.neutral97),
                backgroundColor: Color(uiColor: ColorPalette.news400),
            )
            PromoStickerView(
                text: "Save 30%",
                size: .large,
                foregroundColor: Color(uiColor: ColorPalette.neutral97),
                backgroundColor: Color(uiColor: ColorPalette.news400),
            )
        }
        HStack(alignment: .top) {
            PromoStickerView(
                text: "Save 30%",
                size: .small,
                foregroundColor: Color(uiColor: ColorPalette.neutral97),
                backgroundColor: Color(uiColor: ColorPalette.lifestyle400),
            )
            PromoStickerView(
                text: "Save 30%",
                size: .large,
                foregroundColor: Color(uiColor: ColorPalette.neutral97),
                backgroundColor: Color(uiColor: ColorPalette.lifestyle400),
            )
        }
        HStack(alignment: .top) {
            PromoStickerView(
                text: "Save 30%",
                size: .small,
                foregroundColor: Color(uiColor: ColorPalette.neutral97),
                backgroundColor: Color(uiColor: ColorPalette.labs200),
            )
            PromoStickerView(
                text: "Save 30%",
                size: .large,
                foregroundColor: Color(uiColor: ColorPalette.neutral97),
                backgroundColor: Color(uiColor: ColorPalette.labs200),
            )
        }
        Divider()
        RoundedRectangle(cornerRadius: 4)
            .strokeBorder(lineWidth: 1)
            .frame(width: 150, height: 200)
            .foregroundColor(.blue)

            .overlay(alignment: .bottomTrailing) {
                PromoStickerView(
                    text: "Beta",
                    size: .small,
                    foregroundColor: .blue,
                    backgroundColor: .blue,
                    alignment: .bottomTrailing
                )
            }
            .overlay(alignment: .topLeading) {
                PromoStickerView(
                    text: "Beta",
                    size: .small,
                    foregroundColor: .blue,
                    backgroundColor: .blue,
                    alignment: .topLeading
                )
            }
            .overlay(alignment: .bottomLeading) {
                PromoStickerView(
                    text: "Beta",
                    size: .small,
                    foregroundColor: .blue,
                    backgroundColor: .blue,
                    alignment: .bottomLeading
                )
            }
            .overlay(alignment: .topTrailing) {
                PromoStickerView(
                    text: "Beta",
                    size: .small,
                    foregroundColor: .blue,
                    backgroundColor: .blue,
                    alignment: .topTrailing
                )
            }
    }
    .previewFonts()
}
