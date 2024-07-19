import SwiftUI

/// A scrolling page indicator, inspired by Instagram's paging indicator.
///
/// This uses a ScrollViewProxy to programmatically scroll to the selected index, anchoring it to the center of the scroll view.
public struct ScrollingPageIndicator: View {

    private let pageCount: Int
    @Binding private var selectedIndex: Int
    private let numberOfVisibleDots: Int
    private let spacing: CGFloat
    private let indicatorWidth: CGFloat
    private let selectedColor: Color
    private let unselectedColor: Color
    private let scaleSpan: Int
    private let maximumScale = 1.0
    private let minimumScale = 0.33

    /// This determines the visible area of the paging indicators based on the maximum number of visible dots
    private var scrollViewWidth: CGFloat {
        let visibleDots = min(numberOfVisibleDots, pageCount)
        return CGFloat(visibleDots * Int(indicatorWidth) + (visibleDots - 1) * Int(spacing))
    }

    public init(
        pageCount: Int,
        numberOfVisibleDots: Int = 5,
        indicatorWidth: CGFloat,
        spacing: CGFloat = 4,
        selectedIndex: Binding<Int>,
        scaleSpan: Int = 2,
        selectedColor: Color,
        unselectedColor: Color
    ) {
        self.pageCount = pageCount
        self.numberOfVisibleDots = numberOfVisibleDots.nearestOddNumberBelow()
        self.indicatorWidth = indicatorWidth
        self.spacing = spacing
        self.scaleSpan = scaleSpan
        self.selectedColor = selectedColor
        self.unselectedColor = unselectedColor
        self._selectedIndex = selectedIndex
    }

    /// Calculates the scale factor for an item based on its distance from the selected index.
    ///
    /// The scaling effect is such that items closer to the selected index are
    /// scaled larger, while those farther away are scaled smaller. The scale factor is clamped between
    /// `minimumScale` and `maximumScale`.
    ///
    /// - Parameter index: The index of the item for which the scale factor is to be calculated.
    /// - Returns: A `CGFloat` value representing the scale factor for the item at the given index.
    private func scale(for index: Int) -> CGFloat {
        guard pageCount >= numberOfVisibleDots else { return 1.0 }
        let distance = abs(index - selectedIndex)
        let scaleFactor = 1.0 - (CGFloat(distance) / CGFloat(scaleSpan))
        let scale = minimumScale + (maximumScale - minimumScale) * scaleFactor
        return max(minimumScale, scale)
    }

    public var body: some View {
        ScrollViewReader { scrollViewProxy in
            ScrollView(.horizontal) {
                HStack(spacing: spacing) {
                    ForEach(0..<pageCount, id: \.self) { index in
                        Circle()
                            .id(index)
                            .scaleEffect(scale(for: index))
                            .foregroundStyle(selectedIndex == index ? selectedColor : unselectedColor)
                            .frame(width: indicatorWidth)
                            .animation(.smooth, value: selectedIndex)

                    }
                }
            }
            .disabled(true) // The scroll view is only used for the scroll effect and shouldn't be interactable
            .frame(width: scrollViewWidth)
            .onChange(of: selectedIndex) { newValue in
                withAnimation {
                    scrollViewProxy.scrollTo(newValue, anchor: .center)
                }
            }
        }
    }
}

struct ScrollingPageIndicator_Previews_Container: PreviewProvider {
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
                ScrollingPageIndicator(pageCount: elementArray.count, indicatorWidth: 16, selectedIndex: $selectedIndex, selectedColor: .blue, unselectedColor: .black)
                    .padding()
            }
        }
    }

    static var previews: some View {
        Container()
    }
}

fileprivate extension Int {
    
    /// Returns the nearest odd number, will just return itself if it is an odd number already.
    /// - Returns: An odd Integer
    func nearestOddNumberBelow() -> Int {
        if self % 2 != 0 {
            return self
        }
        return self - 1
    }
}
