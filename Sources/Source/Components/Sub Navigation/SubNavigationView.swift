//
import SwiftUI

#if os(iOS)
public struct SubNavigationView: View {

    @Environment(\.horizontalSizeClass)
    private var horizontalSizeClass

    let items: [SubNavigationItem]
    let backgroundColor: Color
    let dividerColor: Color

    @Namespace var namespace
    @State private var currentItem: SubNavigationItem

    var selectedItemContent: AnyView? {
        currentItem.content()
    }

    public init(
        _ items: SubNavigationItem...,
        startingAt initialItemIndex: Int? = nil,
        dividerColor: Color = Color(
            .dynamicColor(
                light: ColorPalette.neutral73,
                dark: ColorPalette.neutral38
            )
        ),
        backgroundColor: Color = Color(
            .dynamicColor(
                light: .white,
                dark: .black
            )
        )
    ) {
        precondition(items.count >= 2, "We should alway have at least two items in our Subnav")
        self.items = items
        self._currentItem = State(initialValue: items[initialItemIndex ?? 0])
        self.dividerColor = dividerColor
        self.backgroundColor = backgroundColor
    }

    public var body: some View {
        let horizontalPadding: CGFloat = UIDevice.current.userInterfaceIdiom == .pad &&
            horizontalSizeClass == .regular ? 184 : 16
        VStack(spacing: 0) {
            selectedItemContent
            VStack {
                dividerView()
                HStack {
                    ForEach(items, id: \.title) { item in
                        if item.isHidden == false {
                            Button {
                            } label: {
                                SubNavigationItemView(
                                    title: item.title,
                                    palette: item.palette,
                                    isSelected: item == currentItem,
                                    isNew: item.isNew,
                                    namespace: namespace
                                )
                            }
                            .buttonStyle(.plain)
                            .simultaneousGesture(
                                TapGesture().onEnded { _ in
                                    item.didSelectItem?(currentItem, item)
                                    currentItem = item
                                }
                            )
                        }
                    }
                }
                .padding(.horizontal, horizontalPadding)
                dividerView()
            }
            .frame(maxHeight: 52)
            .background(backgroundColor)
        }
    }

    @Environment(\.displayScale)
    private var displayScale

    @ViewBuilder
    private func dividerView() -> some View {
        Rectangle()
            .frame(height: 1 / displayScale)
            .padding(.bottom, 0)
            .foregroundStyle(dividerColor)
    }
}

#Preview {
    SubNavigationView(
        SubNavigationItem(
            title: "Test 1",
            content: {
                Text("Test 1")
                    .frame(
                        maxWidth: .infinity,
                        maxHeight: .infinity
                    )
            }
        ),
        SubNavigationItem(
            title: "Test 2",
            content: {
                Text("Test 2")
                    .frame(
                        maxWidth: .infinity,
                        maxHeight: .infinity
                    )
            }
        ),
        SubNavigationItem(
            title: "Test 3",
            isNew: true,
            content: {
                Text("Test 3")
                    .frame(
                        maxWidth: .infinity,
                        maxHeight: .infinity
                    )
            }
        ),
        SubNavigationItem(
            title: "Test 4 (Hidden)",
            isHidden: true,
            content: {
                Text("Test 4")
                    .frame(
                        maxWidth: .infinity,
                        maxHeight: .infinity
                    )
            }
        )
    )
}
#endif
