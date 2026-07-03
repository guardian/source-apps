import SwiftUI
import Source

struct PromoStickerBuilderView: View {

    // Wrapper so we can select a `PromoStickerTheme` (which is a struct)
    // from a `Picker` and iterate over the available options.
    private enum StickerTheme: String, CaseIterable, Identifiable {
        case red, purple, blue, green
        var id: Self { self }

        var title: String { rawValue.capitalized }

        var theme: PromoStickerTheme {
            switch self {
            case .red: .red
            case .purple: .purple
            case .blue: .blue
            case .green: .green
            }
        }
    }

    private enum StickerSize: String, CaseIterable, Identifiable {
        case small, large
        var id: Self { self }

        var title: String { rawValue.capitalized }

        var size: PromoStickerSize {
            switch self {
            case .small: .small
            case .large: .large
            }
        }
    }

    private enum StickerAlignment: String, CaseIterable, Identifiable {
        case topLeading, topTrailing, bottomLeading, bottomTrailing
        var id: Self { self }

        var title: String {
            switch self {
            case .topLeading: "Top Leading"
            case .topTrailing: "Top Trailing"
            case .bottomLeading: "Bottom Leading"
            case .bottomTrailing: "Bottom Trailing"
            }
        }

        var placement: CornerPlacement {
            switch self {
            case .topLeading: .topLeading
            case .topTrailing: .topTrailing
            case .bottomLeading: .bottomLeading
            case .bottomTrailing: .bottomTrailing
            }
        }

        var overlayAlignment: Alignment {
            switch self {
            case .topLeading: .topLeading
            case .topTrailing: .topTrailing
            case .bottomLeading: .bottomLeading
            case .bottomTrailing: .bottomTrailing
            }
        }
    }

    @State private var text: String = "Save 30%"
    @State private var theme: StickerTheme = .red
    @State private var size: StickerSize = .small
    @State private var showInCard: Bool = false
    @State private var alignment: StickerAlignment = .topLeading

    var body: some View {
        VStack(spacing: 24) {
            preview

            GroupBox {
                VStack(alignment: .leading, spacing: 12) {
                    TextField("Text", text: $text)
                        .textFieldStyle(.roundedBorder)

                    themePicker
                    sizePicker

                    Toggle("Show in card", isOn: $showInCard.animation())

                    if showInCard {
                        alignmentPicker
                    }
                }
                .padding()
            }
        }
        .frame(maxWidth: 400)
        .padding()
    }

    @ViewBuilder
    private var preview: some View {
        if showInCard {
            card
        } else {
            PromoStickerView(
                text: text,
                size: size.size,
                theme: theme.theme
            )
            .frame(height: 220)
        }
    }

    private var card: some View {
        RoundedRectangle(cornerRadius: 4)
            .strokeBorder(lineWidth: 1)
            .frame(width: 200, height: 220)
            .foregroundColor(.secondary)
            .overlay(alignment: alignment.overlayAlignment) {
                PromoStickerView(
                    text: text,
                    size: size.size,
                    theme: theme.theme,
                    alignment: alignment.placement
                )
            }
    }

    private var themePicker: some View {
        Picker("Theme", selection: $theme) {
            ForEach(StickerTheme.allCases) { theme in
                Text(theme.title).tag(theme)
            }
        }
        .pickerStyle(.segmented)
    }

    private var sizePicker: some View {
        Picker("Size", selection: $size) {
            ForEach(StickerSize.allCases) { size in
                Text(size.title).tag(size)
            }
        }
        .pickerStyle(.segmented)
    }

    private var alignmentPicker: some View {
        Picker("Alignment", selection: $alignment) {
            ForEach(StickerAlignment.allCases) { alignment in
                Text(alignment.title).tag(alignment)
            }
        }
        .pickerStyle(.menu)
    }
}

#Preview {
    PromoStickerBuilderView()
}
