import SwiftUI
import Source

public struct PaginationProgressBar: View {

    private let pageCount: Int
    private let indicatorWidth: CGFloat
    private let scaleSpan: Int
    @Binding private var selectedIndex: Int
    private let primaryColor: Color
    private let secondaryColor: Color

    @Environment(\.horizontalSizeClass)
    private var sizeClass

    public init(
        pageCount: Int,
        indicatorWidth: CGFloat,
        scaleSpan: Int = 2,
        selectedIndex: Binding<Int>,
        primaryColor: Color,
        secondaryColor: Color
    ) {
        self.pageCount = pageCount
        self.indicatorWidth = indicatorWidth
        self.scaleSpan = scaleSpan
        self._selectedIndex = selectedIndex
        self.primaryColor = primaryColor
        self.secondaryColor = secondaryColor
    }

    public var body: some View {
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

    private var scrollingIndicator: some View {
        ScrollingPaginationIndicator(pageCount: pageCount, indicatorWidth: indicatorWidth, scaleSpan: scaleSpan, selectedIndex: $selectedIndex, primaryColor: primaryColor, secondaryColor: secondaryColor)
    }

    private var progressButtons: some View {
        HStack {
            IconButton(icon: Image(.chevronLeft), size: .small, iconColor: primaryColor, borderColor: secondaryColor) {
                if selectedIndex > 0 {
                    selectedIndex -= 1
                } else {
                     selectedIndex = pageCount - 1
                }
            }
            IconButton(icon: Image(.chevronRight), size: .small, iconColor: primaryColor, borderColor: secondaryColor) {
                if selectedIndex < pageCount - 1 {
                    selectedIndex += 1
                } else {
                    selectedIndex = 0
                }
            }
        }
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
                PaginationProgressBar(pageCount: elementArray.count, indicatorWidth: 16, selectedIndex: $selectedIndex, primaryColor: .blue, secondaryColor: .black)
                    .padding()
            }
        }
    }

    static var previews: some View {
        Container()
    }
}
