import SwiftUI

public struct PaginationButtons: View {
    let iconColor: Color
    let borderColor: Color
    @Binding var selectedIndex: Int?
    let canNavigateForward: Bool

    public init(
        iconColor: Color,
        borderColor: Color,
        selectedIndex: Binding<Int?>,
        canNavigateForward: Bool
    ) {
        self.iconColor = iconColor
        self.borderColor = borderColor
        self._selectedIndex = selectedIndex
        self.canNavigateForward = canNavigateForward
    }

    private var backDisabled: Bool {
        guard let selectedIndex else { return true }
        return selectedIndex == 0
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
                disabled: canNavigateForward
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
    PaginationButtons(iconColor: .blue, borderColor: .red, selectedIndex: .constant(0), canNavigateForward: true)
}
