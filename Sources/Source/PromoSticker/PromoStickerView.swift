//

import SwiftUI

struct PromoStickerView: View {

    let text: String
    let size: PromoStickerSize
    let theme: PromoStickerTheme
    var alignment: CornerPlacement?

    var body: some View {
        Text(text)
            .font(size == .large ? Typography.textSansBld15 : Typography.textSansBld12)
            .padding(.horizontal, size == .small ? 4 : 8)
            .padding(.vertical, size == .small ? 4 : 6.5)
            .background {
                container
                    .fill(theme.backgroundColor)


            }
            .foregroundStyle(theme.foregroundColor)
            // dynamic type not supported on this component for now...
            .dynamicTypeSize(.medium)
    }

    private var container: AnyShape {
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
                theme: .red
            )
            PromoStickerView(
                text: "Save 30%",
                size: .large,
                theme: .red
            )
        }
        HStack(alignment: .top) {
            PromoStickerView(
                text: "Save 30%",
                size: .small,
                theme: .blue
            )
            PromoStickerView(
                text: "Save 30%",
                size: .large,
                theme: .blue
            )
        }
        HStack(alignment: .top) {
            PromoStickerView(
                text: "Save 30%",
                size: .small,
                theme: .purple
            )
            PromoStickerView(
                text: "Save 30%",
                size: .large,
                theme: .purple
            )
        }
        HStack(alignment: .top) {
            PromoStickerView(
                text: "Save 30%",
                size: .small,
                theme: .green
            )
            PromoStickerView(
                text: "Save 30%",
                size: .large,
                theme: .green
            )
        }
        Divider()
        RoundedRectangle(cornerRadius: 4)
            .strokeBorder(lineWidth: 1)
            .frame(width: 150, height: 200)
            .foregroundColor(Color(uiColor: ColorPalette.sport400))
            .overlay(alignment: .bottomTrailing) {
                PromoStickerView(
                    text: "B trailing",
                    size: .small,
                    theme: .blue,
                    alignment: .bottomTrailing
                )
            }
            .overlay(alignment: .topLeading) {
                PromoStickerView(
                    text: "T leading",
                    size: .small,
                    theme: .blue,
                    alignment: .topLeading
                )
            }
            .overlay(alignment: .bottomLeading) {
                PromoStickerView(
                    text: "B leading",
                    size: .small,
                    theme: .blue,
                    alignment: .bottomLeading
                )
            }
            .overlay(alignment: .topTrailing) {
                PromoStickerView(
                    text: "T trailing",
                    size: .small,
                    theme: .blue,
                    alignment: .topTrailing
                )
            }
    }
    .previewFonts()
}
