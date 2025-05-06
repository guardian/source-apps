//
import SwiftUI

/// View for the selectable options with a SubNavigationView. Tapping one should call SubNavigationItems
/// didTapOptions func to update the SubNavigationView

#if os(iOS)
public struct SubNavigationItemView: View {
    let title: String
    let palette: SubNavigationItemColorPalette
    let isSelected: Bool
    let namespace: Namespace.ID

    public init(
        title: String,
        palette: SubNavigationItemColorPalette = .defaultPalette,
        isSelected: Bool,
        namespace: Namespace.ID
    ) {
        self.title = title
        self.palette = palette
        self.isSelected = isSelected
        self.namespace = namespace
    }

    public var body: some View {
        VStack(alignment: .center) {
            Text(title)
                .font(Typography.textSans14)
                .foregroundStyle(
                    isSelected ? palette.selectedTextColor : palette.textColor
                )
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
#endif
