import SwiftUI

public struct PaginationButtons: View {
    let iconColor: Color
    let borderColor: Color
    @Binding var selectedIndex: Int?
    let pageCount: Int

    public init(
        iconColor: Color,
        borderColor: Color,
        selectedIndex: Binding<Int?>,
        pageCount: Int
    ) {
        self.iconColor = iconColor
        self.borderColor = borderColor
        self._selectedIndex = selectedIndex
        self.pageCount = pageCount
    }

    private var backDisabled: Bool {
        guard let selectedIndex else { return true }
        return selectedIndex == 0
    }

    private var forwardDisabled: Bool {
        guard let selectedIndex else { return true }
        return selectedIndex >= pageCount - 1
    }

    public var body: some View {
        HStack {
            IconButton(
                icon: Image(.chevronLeft),
                size: .small,
                iconColor: iconColor,
                borderColor: borderColor,
                disabled: backDisabled
            ) {
                withAnimation {
                    if let selectedIndex {
                        self.selectedIndex = selectedIndex - 1
                    }
                }
            }
            IconButton(
                icon: Image(.chevronRight),
                size: .small,
                iconColor: iconColor,
                borderColor: borderColor,
                disabled: forwardDisabled
            ) {
                withAnimation {
                    if let selectedIndex {
                        self.selectedIndex = selectedIndex + 1
                    }
                }
            }
        }
    }
}

#Preview {
    PaginationButtons(iconColor: .blue, borderColor: .red, selectedIndex: .constant(0), pageCount: 10)
}
