//

import SwiftUI
import GuardianFonts

/// Compact view which optionally presents a horizontally stacked icon, image and title.
/// Use `shouldShowBadge` to present a badge on the top left corner
/// ImageContent can be the image or can be ImageView
public struct CompactChipView<ImageContent: View>: View {

    @Environment(\.dynamicTypeSize) private
    var dynamicTypeSize

    private var titleColor: Color {
        switch style {
        case .bordered:
            return borderedPalette.title
        case .borderless:
            return isSelected ? selectedPalette.title : unselectedPalette.title
        }
    }

    private var backgroundColor: Color {
        switch style {
        case .bordered:
            return borderedPalette.background
        case .borderless:
            return isSelected ? selectedPalette.background : unselectedPalette.background
        }
    }

    private var badgeColor: Color {
        switch style {
        case .bordered:
            return borderedPalette.badge
        case .borderless:
            return isSelected ? selectedPalette.badge : unselectedPalette.badge
        }
    }

    private var borderColor: Color {
        switch style {
        case .bordered:
            return borderedPalette.borderColor
        case .borderless:
            return isSelected ? selectedPalette.borderColor : unselectedPalette.borderColor
        }
    }

    private var trailingPadding: CGFloat = 16
    private var badgeSize: CGFloat = 8
    private var imageSize: CGFloat = 24
    private var iconHeight: CGFloat {
        switch size {
        case .small:
            15
        case .medium, .large:
            16
        }
    }

    private let size: ChipSize
    private let style: ChipStyle
    private let title: String?
    private let leadingIcon: Image?
    private let trailingIcon: Image?
    private let hasImage: Bool
    private let image: () -> ImageContent?
    private let isSelected: Bool
    private var shouldShowBadge: Bool
    private let unselectedPalette: ChipPalette
    private let selectedPalette: ChipPalette
    private let borderedPalette: ChipPalette
    private let action: () -> Void

    /// Provides room for the `badge` to appear without being clipped
    private let topPadding: CGFloat = 2

    public init(
        size: ChipSize,
        style: ChipStyle = .borderless,
        title: String? = nil,
        leadingIcon: Image? = nil,
        trailingIcon: Image? = nil,
        hasImage: Bool = false,
        @ViewBuilder image: @escaping () -> ImageContent? = { EmptyView() },
        isSelected: Bool = false,
        shouldShowBadge: Bool = false,
        unselectedPalette: ChipPalette = .unselected,
        selectedPalette: ChipPalette = .selected,
        borderedPalette: ChipPalette = .bordered,
        action: @escaping () -> Void
    ) {
        self.size = size
        self.style = style
        self.title = title
        self.leadingIcon = leadingIcon
        self.trailingIcon = trailingIcon
        self.hasImage = hasImage
        self.image = image
        self.isSelected = isSelected
        self.shouldShowBadge = shouldShowBadge
        self.unselectedPalette = unselectedPalette
        self.selectedPalette = selectedPalette
        self.borderedPalette = borderedPalette
        self.action = action
    }

    public var body: some View {
        VStack {
            ZStack(alignment: .topLeading) {
                HStack(spacing: 8) {
                    if let leadingIcon {
                        leadingIcon
                            .resizable()
                            .scaledToFit()
                            .foregroundStyle(titleColor)
                            .frame(height: iconHeight)
                            .padding(.leading, 8)
                            .padding(.trailing, -4)
                    }
                    image()
                        .frame(
                            width: imageSize,
                            height: imageSize
                        )
                        .clipShape(
                            Circle()
                        )
                    if let title {
                        Text(title)
                            .font(.textSansBold, size: 14)
                            .lineLimit(1)
                            .foregroundStyle(titleColor)
                    }
                    if let trailingIcon {
                        trailingIcon
                            .resizable()
                            .scaledToFit()
                            .foregroundStyle(titleColor)
                            .frame(height: iconHeight)
                    }
                }
                .padding(.leading, hasImage == false && leadingIcon == nil ? 16 : 8)
                .padding(.trailing, trailingIcon != nil ? 8 : 16)
                .padding(.vertical, 4)
                .frame(minHeight: size == .small ? 32 : 40)
                .background(backgroundColor)
                .overlay(
                    Group {
                        RoundedRectangle(cornerRadius: 8, style: .continuous)
                            .stroke(borderColor, lineWidth: style == .bordered ? 1 : 0)
                    }
                )
                .mask {
                    chipMask
                }
                if shouldShowBadge {
                    badgeView
                }
            }
        }
        .padding(.top, topPadding)
        .onTapGesture {
            action()
        }
    }

    private var badgeView: some View {
        Circle()
            .frame(width: badgeSize, height: badgeSize)
            .foregroundStyle(badgeColor)
            .offset(y: -4)
    }

    /// Provides a mask to round the corners of the chip.
    /// Also masks around the circumference of the badge when needed
    private var chipMask: some View {
        ZStack(alignment: .topLeading) {
            RoundedRectangle(
                cornerRadius: 8,
                style: .continuous
            )
            .foregroundStyle(.white)
            if shouldShowBadge {
                Circle()
                    .foregroundStyle(.black)
                    .frame(width: 10, height: 10)
                    .offset(x: -1, y: -5)
            }
        }
        .compositingGroup()
        .luminanceToAlpha()
    }
}

#Preview {
    ScrollView(.horizontal) {
        HStack {
            CompactChipView(
                size: .small,
                title: "Test",
                leadingIcon: Image(
                    "plus",
                    bundle: .module
                ),
                isSelected: true,
                shouldShowBadge: true
            ) { }
            CompactChipView(
                size: .small,
                title: "Test",
                leadingIcon: Image(
                    "checkmark",
                    bundle: .module
                ),
                isSelected: true
            ) { }
            CompactChipView(
                size: .small,
                title: "Chip",
                leadingIcon: Image(
                    systemName: "checkmark"
                ),
                trailingIcon: Image(
                    systemName: "plus"
                ),
                isSelected: false
            ) { }
            CompactChipView(
                size: .small,
                title: "Portion of skinny fries",
                isSelected: false,
                shouldShowBadge: true
            ) { }
        }
        .frame(height: 100)
    }
}
