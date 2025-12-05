import SwiftUI

public struct StarRatingView: View {
    public init(rating: Int,
                  size: ComponentSize,
                  filledBackgroundColor: Color,
                  emptyBackgroundColor: Color,
                  foregroundColor: Color) {
        self.rating = rating
        self.size = size
        self.filledBackgroundColor = filledBackgroundColor
        self.emptyBackgroundColor = emptyBackgroundColor
        self.foregroundColor = foregroundColor
    }

    let rating: Int
    let size: ComponentSize
    let filledBackgroundColor: Color
    let emptyBackgroundColor: Color
    let foregroundColor: Color

    @ScaledMetric var smallStarSize = 12.0
    @ScaledMetric var largeStarSize = 14.0

    var starSize: CGFloat {
        switch size {
        case .xsmall, .small, .medium:
            return smallStarSize
        case .large, .xlarge:
            return largeStarSize
        }
    }

    public var body: some View {
        #if DEBUG
        // swiftlint:disable:next redundant_discardable_let
        let _ = Self._printChanges()
        #endif
        HStack(spacing: 2) {
            ForEach(0..<5) { number in
                if number < rating {
                    filledStarRating
                } else {
                    emptyStarRating
                }
            }
        }
        .padding(2)
        .foregroundStyle(foregroundColor)
        .accessibilityAddTraits(.isStaticText)
        .accessibilityElement(children: .combine)
        .accessibilityLabel(
            Text("\(rating, format: .number) out of 5 stars")
        )
        .allowsHitTesting(false)
    }

    var filledStarRating: some View {
        Image(.star)
            .resizable()
            .frame(width: starSize, height: starSize)
            .padding(3)
            .background {
                Circle()
                    .fill(filledBackgroundColor)
            }
            .accessibility(removeTraits: .isImage)
    }

    var emptyStarRating: some View {
        Image(.starOutline)
            .resizable()
            .frame(width: starSize, height: starSize)
            .padding(3)
            .background {
                Circle()
                    .fill(emptyBackgroundColor)
            }
            .accessibility(removeTraits: .isImage)
    }
}

#Preview {
    VStack {
        ForEach(0..<6) { num in
            StarRatingView(
                rating: num,
                size: .large,
                filledBackgroundColor: .yellow,
                emptyBackgroundColor: .gray,
                foregroundColor: .black
            )
        }
    }
    .padding()
}
