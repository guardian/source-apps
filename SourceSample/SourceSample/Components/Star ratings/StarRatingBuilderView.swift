import SwiftUI
import Source

struct StarRatingBuilderView: View {

    private var sizes: [ComponentSize] = [.small, .large]
    private var themes: [StarRatingView.Theme] = [.default, .feature]
    @State private var rating: Int = 0
    @State private var size: ComponentSize = .small
    @State private var theme: StarRatingView.Theme = .default

    var body: some View {
        VStack {
            StarRating(rating: rating, size: size, theme: theme)
                .frame(width: 200)
            GroupBox {
                ratingPicker
                sizePicker
                themePicker
            }
        }
        .padding()
    }

    var ratingPicker: some View {
        Picker("Rating", selection: $rating) {
            ForEach(0..<6) { rating in
                Text("\(rating)")
            }
        }
        .pickerStyle(.segmented)
    }

    var sizePicker: some View {
        Picker("Size", selection: $size) {
            ForEach(sizes, id: \.self) { size in
                Text(size.description)
            }
        }
        .pickerStyle(.segmented)
    }

    var themePicker: some View {
        Picker("Theme", selection: $theme) {
            ForEach(themes, id: \.self) { theme in
                Text(theme.description)
            }
        }
        .pickerStyle(.segmented)
    }
}

#Preview {
    StarRatingBuilderView()
}
