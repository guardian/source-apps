import SwiftUI
import Source

struct StarRating: View {

    let rating: Int
    let size: ComponentSize

    var foregroundColor: Color {
        Color(ColorPalette.neutral7.cgColor)
    }

    var emptyBackgroundColor: Color {
        .dynamicColor(light: Color(ColorPalette.neutral86.cgColor), dark: Color(ColorPalette.neutral60.cgColor))
    }

    var filledBackgroundColor: Color {
        .dynamicColor(light: Color(ColorPalette.brandAlt400.cgColor), dark: Color(ColorPalette.brandAlt200.cgColor))
    }

    var body: some View {
        StarRatingView(
            rating: rating,
            size: size,
            filledBackgroundColor: filledBackgroundColor,
            emptyBackgroundColor: emptyBackgroundColor,
            foregroundColor: foregroundColor
        )
    }
}

#Preview {
    StarRating(rating: 3, size: .large)
}
