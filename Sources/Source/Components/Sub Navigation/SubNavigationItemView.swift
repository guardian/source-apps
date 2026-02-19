//
import SwiftUI

/// View for the selectable options with a SubNavigationView. Tapping one should call SubNavigationItems
/// didTapOptions func to update the SubNavigationView

public struct SubNavigationItemView: View {
    public let title: String
    public let palette: SubNavigationItemColorPalette
    public let isSelected: Bool
    public let isNew: Bool
    public let namespace: Namespace.ID

    public init(
        title: String,
        palette: SubNavigationItemColorPalette = .defaultPalette,
        isSelected: Bool,
        isNew: Bool,
        namespace: Namespace.ID
    ) {
        self.title = title
        self.palette = palette
        self.isSelected = isSelected
        self.isNew = isNew
        self.namespace = namespace
    }

    public var body: some View {
        VStack(alignment: .center) {
            HStack(spacing: 4) {
                Text(title)
                    .font(Typography.textSans14)
                    .foregroundStyle(
                        isSelected ? palette.selectedTextColor : palette.textColor
                    )
                if isNew {
                    Badge(
                        text: "New",
                        foregroundColor: palette.badgeForegroundColor,
                        backgroundColor: palette.badgeBackgroundColor
                    )
                    .controlSize(.small)
                }
            }
                .frame(maxWidth: .infinity)
                .frame(height: 36)
                .background(.white.opacity(0.000000000001)) // Almost transparent to provide a larger hit area
        }
        .background {
            if isSelected {
                Capsule()
                    .fill(palette.selectedBackgroundColor)
                    .matchedGeometryEffect(
                        id: "background",
                        in: namespace
                    )
            }
        }
        .animation(.snappy, value: isSelected)
    }
}

#Preview {
    @Previewable @Namespace var namespace1
    @Previewable @Namespace var namespace2
    VStack {
        HStack {
            SubNavigationItemView(
                title: "Test 1",
                palette: .defaultPalette,
                isSelected: false,
                isNew: false,
                namespace: namespace1
            )
            SubNavigationItemView(
                title: "Test 2",
                palette: .defaultPalette,
                isSelected: true,
                isNew: false,
                namespace: namespace1
            )
        }
        HStack {
            SubNavigationItemView(
                title: "Test 1",
                palette: .defaultPalette,
                isSelected: false,
                isNew: true,
                namespace: namespace2
            )
            SubNavigationItemView(
                title: "Test 2",
                palette: .defaultPalette,
                isSelected: true,
                isNew: true,
                namespace: namespace2
            )
        }
    }
    .padding()
    .previewFonts()
}
