//
//  SwiftUIView.swift
//  
//
//  Created by Aoife McLaughlin on 19/07/2024.
//

import SwiftUI

@available(iOS 17.0, *)
struct ScrollingPageIndicator: View {

    private let pageCount: Int
    @Binding private var selectedIndex: Int
    private let numberOfVisibleDots = 5
    private let spacing: CGFloat = 4
    private let indicatorSize: CGFloat = 16
    private let selectedColor: Color
    private let unselectedColor: Color
    
    /// This determines the visible area of the paging indicators based on the maximum number of visible dots
    private var scrollViewWidth: CGFloat {
        CGFloat(numberOfVisibleDots * Int(spacing + indicatorSize))
    }

    init(pageCount: Int, selectedIndex: Binding<Int>, selectedColor: Color, unselectedColor: Color) {
        self.pageCount = pageCount
        self.selectedColor = selectedColor
        self.unselectedColor = unselectedColor
        self._selectedIndex = selectedIndex
    }

    // TODO: make this more dynamic
    private func scale(for index: Int) -> CGFloat {
        if selectedIndex == index {
             return 1
        } else if abs(index - selectedIndex) < 2 {
            return  0.75
        } else {
            return 0.5
        }
    }

    var body: some View {
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

@available(iOS 17.0, *)
struct ScrollingPageIndicator_Previews_Container: PreviewProvider {
    struct Container: View {
    @State var selectedIndex = 0
      let elementArray = [0, 1, 2, 3, 4, 5, 6, 7]
    var body: some View {
        VStack {
            TabView(selection: $selectedIndex) {
                ForEach(elementArray, id: \.self) { index in
                    Text("\(index)")
                        .id(index)
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
