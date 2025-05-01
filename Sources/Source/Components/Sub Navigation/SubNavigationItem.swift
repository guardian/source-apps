//
import SwiftUI

#if os(iOS)
/// Config struct to style a SubNavigationItemView
public struct SubNavigationItem {
    public let title: String
    public let palette: SubNavigationItemColorPalette
    public let didSelectItem: ((SubNavigationItem, SubNavigationItem) -> Void)?
    @ViewBuilder public let content: () -> AnyView

    public init(
        title: String,
        palette: SubNavigationItemColorPalette = .defaultPalette,
        didSelectItem: ((SubNavigationItem, SubNavigationItem) -> Void)? = nil,
        @ViewBuilder content: @escaping () -> some View
    ) {
        self.palette = palette
        self.title = title
        self.didSelectItem = didSelectItem
        self.content = { AnyView(erasing: content()) }
    }
}

extension SubNavigationItem: Equatable {
    public static func == (lhs: SubNavigationItem, rhs: SubNavigationItem) -> Bool {
        lhs.title == rhs.title
    }
}
#endif
