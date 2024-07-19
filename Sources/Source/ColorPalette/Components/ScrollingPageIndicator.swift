//
//  SwiftUIView.swift
//  
//
//  Created by Aoife McLaughlin on 19/07/2024.
//

import SwiftUI

public struct ScrollingPageIndicator: View {

    private let pageCount: Int
    @Binding private var selectedIndex: Int
    private let numberOfVisibleDots = 5
    private let spacing: CGFloat = 4
    private let indicatorSize: CGFloat = 16
    private let selectedColor: Color
    private let unselectedColor: Color
    private let scaleSpan: Int
    private let maximumScale = 1.0
    private let minimumScale = 0.5

    /// This determines the visible area of the paging indicators based on the maximum number of visible dots
    private var scrollViewWidth: CGFloat {
        CGFloat(numberOfVisibleDots * Int(spacing + indicatorSize))
    }

    public init(pageCount: Int, selectedIndex: Binding<Int>, scaleSpan: Int = 2, selectedColor: Color, unselectedColor: Color) {
        self.pageCount = pageCount
        self.scaleSpan = scaleSpan
        self.selectedColor = selectedColor
        self.unselectedColor = unselectedColor
        self._selectedIndex = selectedIndex
    }

    private func scale(for index: Int) -> CGFloat {
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
                            .frame(height: indicatorSize)

                    }
                }
            }
            .disabled(true)
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
            ScrollingPageIndicator(pageCount: elementArray.count, selectedIndex: $selectedIndex, selectedColor: .blue, unselectedColor: .black)
                .padding()
        }
    }
  }

    static var previews: some View {
    Container()
  }
}
