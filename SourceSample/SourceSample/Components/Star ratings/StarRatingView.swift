import SwiftUI
import Source

struct StarRating: View {

    let rating: Int
    let size: ComponentSize
    let theme: StarRatingView.Theme

    var body: some View {
        StarRatingView(
            rating: rating,
            size: size,
            theme: theme
        )
    }
}

#Preview {
    StarRating(rating: 3, size: .large, theme: .default)
}
