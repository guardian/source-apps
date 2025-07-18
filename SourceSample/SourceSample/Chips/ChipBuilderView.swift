//
//  ChipBuilderView.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 11/07/2025.
//
import SwiftUI
import Source

struct ChipBuilderView: View {
    @State private var size: ChipSize = .medium
    @State private var style: ChipStyle = .bordered
    @State private var title: String = "Test"
    @State private var leadingIcon: SourceIcon?
    @State private var trailingIcon: SourceIcon?
    @State private var selectedImage: PlatformImage?
    @State private var shouldShowBadge: Bool = false
    @State private var unselectedPalette: ChipPalette = .unselected
    @State private var selectedPalette: ChipPalette = .selected
    @State private var borderedPalette: ChipPalette = .bordered

    var mainImage: Image? {
        if let selectedImage {
#if os(macOS)
            return Image(nsImage: selectedImage)
#else
            return Image(uiImage: selectedImage)
#endif
        } else {
            return nil
        }
    }

    var leadingImage: Image? {
        if let leadingIcon {
            Image(source: leadingIcon)
        } else {
            nil
        }
    }

    var trailingImage: Image? {
        if let trailingIcon {
            Image(source: trailingIcon)
        } else {
            nil
        }
    }

    var body: some View {
        VStack {
            HStack(spacing: 24) {
                VStack {
                    CompactChipView(
                        size: size,
                        style: style,
                        title: title,
                        leadingIcon: leadingImage,
                        trailingIcon: trailingImage,
                        hasImage: selectedImage != nil,
                        image: {
                            mainImage?
                                .resizable()
                                .scaledToFill()
                        },
                        isSelected: true,
                        shouldShowBadge: shouldShowBadge,
                        unselectedPalette: unselectedPalette,
                        selectedPalette: selectedPalette,
                        borderedPalette: borderedPalette
                    ) {}

                    if style == .borderless {
                        Text("Selected")
                            .monospaced()
                            .foregroundStyle(.secondary)
                    }
                }
                if style == .borderless {
                    VStack {
                        CompactChipView(
                            size: size,
                            style: style,
                            title: title,
                            leadingIcon: leadingImage,
                            trailingIcon: trailingImage,
                            hasImage: selectedImage != nil,
                            image: {
                                mainImage?
                                    .resizable()
                                    .scaledToFill()
                            },
                            isSelected: false,
                            shouldShowBadge: shouldShowBadge,
                            unselectedPalette: unselectedPalette,
                            selectedPalette: selectedPalette,
                            borderedPalette: borderedPalette
                        ) {}
                        Text("Unselected")
                            .monospaced()
                            .foregroundStyle(.secondary)
                    }
                }
            }
            .padding()
            .background {
                RoundedRectangle(cornerRadius: 20)
                    .fill(.background)
            }
            .frame(
                maxWidth: .infinity,
                maxHeight: .infinity

            )

            GroupBox {
                GroupBox("Chip Config") {
                    VStack(alignment: .leading) {
                        ImagePickerSection(selectedImage: $selectedImage)
                        TextField("Title", text: $title)
                            .textFieldStyle(.roundedBorder)

                        Picker("Size", selection: $size) {
                            ForEach(ChipSize.allCases, id: \.self) { size in
                                Text(size.title)
                            }
                        }
                        .pickerStyle(.segmented)

                        Picker("Style", selection: $style) {
                            ForEach(ChipStyle.allCases, id: \.self) { style in
                                Text(style.title)
                            }
                        }
                        .pickerStyle(.segmented)


                        IconPicker(
                            "Leading Icon",
                            selection: $leadingIcon
                        )
                        IconPicker(
                            "Trailing Icon",
                            selection: $trailingIcon
                        )

                        Toggle("Show Badge", isOn: $shouldShowBadge)
                    }
                    .frame(maxWidth: .infinity, alignment: .leading)
                    .padding()
                    .frame(maxWidth: 600)
                }

                GroupBox("Chip Palette") {
                    HStack(alignment: .top) {
                        if style == .borderless {
                            PaletteEditor(
                                title: "Selected",
                                palette: $selectedPalette
                            )

                            PaletteEditor(
                                title: "Unselected",
                                palette: $unselectedPalette
                            )
                        } else {
                            PaletteEditor(
                                title: "Bordered",
                                palette: $borderedPalette
                            )
                        }
                    }
                    .frame(maxWidth: .infinity, alignment: .leading)
                    .padding()
                    .frame(maxWidth: 600)
                }
            }
        }
        .padding()
    }
}

extension ChipSize {
    var title: String {
        switch self {
        case .large: "Large"
        case .medium: "Medium"
        case .small: "Small"
        }
    }
}

extension ChipStyle {
    var title: String {
        switch self {
        case .bordered: "Bordered"
        case .borderless: "Borderless"
        }
    }
}

#Preview {
    NavigationStack {
        ScrollView {
            ChipBuilderView()
        }
    }
}
