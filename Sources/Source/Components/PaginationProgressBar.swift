import SwiftUI
import Source

/// This component used to signpost progression through a paginated view.
///
/// On tablet, buttons are provided to allow users to navigate through the pages.
public struct PaginationProgressBar: View {

    private let pageCount: Int
    private let indicatorWidth: CGFloat
    @Binding private var selectedIndex: Int
    private let primaryColor: Color
    private let secondaryColor: Color

    @Environment(\.horizontalSizeClass)
    private var sizeClass

    @State private var canNavigateBack = true

    @State private var canNavigateForward = false

    public init(
        pageCount: Int,
        indicatorWidth: CGFloat,
        selectedIndex: Binding<Int>,
        primaryColor: Color,
        secondaryColor: Color
    ) {
        self.pageCount = pageCount
        self.indicatorWidth = indicatorWidth
        self._selectedIndex = selectedIndex
        self.primaryColor = primaryColor
        self.secondaryColor = secondaryColor
    }

    public var body: some View {
        Group {
            if sizeClass == .regular {
                ZStack(alignment: .trailing) {
                    scrollingIndicator
                        .frame(maxWidth: .infinity, alignment: .center)
                    progressButtons
                        .frame(alignment: .trailing)
                }
            } else {
                scrollingIndicator
            }
        }
        .onChange(of: selectedIndex) { selectedIndex in
            updateButtonDisabledState()
        }
    }

    private var scrollingIndicator: some View {
        ScrollingPaginationIndicator(
            pageCount: pageCount,
            indicatorWidth: indicatorWidth,
            selectedIndex: $selectedIndex,
            primaryColor: primaryColor,
            secondaryColor: secondaryColor
        )
    }

    private var progressButtons: some View {
        HStack {
            IconButton(
                icon: Image(.chevronLeft),
                size: .small,
                iconColor: primaryColor,
                borderColor: secondaryColor,
                disabled: $canNavigateBack
            ) {
                withAnimation {
                    selectedIndex -= 1
                }
            }
            IconButton(
                icon: Image(.chevronRight),
                size: .small,
                iconColor: primaryColor,
                borderColor: secondaryColor,
                disabled: $canNavigateForward
            ) {
                withAnimation {
                    selectedIndex += 1
                }
            }
        }
    }

    private func updateButtonDisabledState() {
        canNavigateBack = selectedIndex == 0
        canNavigateForward = selectedIndex == pageCount - 1
    }
}

struct PaginationProgressBar_Previews_Container: PreviewProvider {
    struct Container: View {
        @State var selectedIndex = 0
        let elementArray = [0, 1, 2, 3, 4, 5, 6]
        var body: some View {
            VStack {
                TabView(selection: $selectedIndex) {
                    ForEach(elementArray, id: \.self) { index in
                        Text("\(index)")
                            .font(.largeTitle)
                    }
                }
                .tabViewStyle(.page(indexDisplayMode: .never))
                PaginationProgressBar(
                    pageCount: elementArray.count,
                    indicatorWidth: 16,
                    selectedIndex: $selectedIndex,
                    primaryColor: Color(uiColor: ColorPalette.neutral0),
                    secondaryColor: Color(uiColor: ColorPalette.neutral73)
                )
                .padding()
            }
        }
    }

    static var previews: some View {
        Container()
    }
}
