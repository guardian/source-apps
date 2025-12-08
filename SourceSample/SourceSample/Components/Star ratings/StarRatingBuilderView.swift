import SwiftUI
import Source

struct StarRatingBuilderView: View {

    private var sizes: [ComponentSize] = [.small, .large]
    @State private var rating: Int = 0
    @State private var size: ComponentSize = .small
    var body: some View {
        VStack {
            StarRating(rating: rating, size: size)
                .frame(width: 200)
            GroupBox {
                ratingPicker
                sizePicker
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
}

#Preview {
    StarRatingBuilderView()
}
