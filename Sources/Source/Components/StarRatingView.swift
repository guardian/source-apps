import SwiftUI

public struct StarRatingView: View {
    public enum Theme {
        case `default`, feature

        public var description: String {
            switch self {
            case .default:
                return "Default"
            case .feature:
                return "Feature"
            }
        }
    }
    public init(rating: Int,
                  size: ComponentSize,
                theme: Theme) {
        self.rating = rating
        self.size = size
        self.theme = theme
    }

    let rating: Int
    let size: ComponentSize
    let theme: Theme

    private var filledBackgroundColor: Color {
        .dynamicColor(light: Color(ColorPalette.brandAlt400), dark: Color(ColorPalette.brandAlt200))
    }
    private var emptyBackgroundColor: Color {
        switch theme {
        case .default:
            return .dynamicColor(light: Color(ColorPalette.neutral86), dark: Color(ColorPalette.neutral60))
        case .feature:
            return Color(ColorPalette.neutral60)
        }

    }
    private var foregroundColor: Color {
        Color(ColorPalette.neutral7)
    }

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
                theme: .default
            )
        }
    }
    .padding()
}
