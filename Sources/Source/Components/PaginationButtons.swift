import SwiftUI

public struct PaginationButtons: View {
    let iconColor: Color
    let borderColor: Color
    @Binding var selectedIndex: Int
    @Binding var canNavigateBack: Bool
    @Binding var canNavigateForward: Bool

    public init(
        iconColor: Color,
        borderColor: Color,
        selectedIndex: Binding<Int>,
        canNavigateBack: Binding<Bool>,
        canNavigateForward: Binding<Bool>
    ) {
        self.iconColor = iconColor
        self.borderColor = borderColor
        self._selectedIndex = selectedIndex
        self._canNavigateBack = canNavigateBack
        self._canNavigateForward = canNavigateForward
    }

    public var body: some View {
        HStack {
            IconButton(
                icon: Image(.chevronLeft),
                size: .small,
                iconColor: iconColor,
                borderColor: borderColor,
                disabled: $canNavigateBack
            ) {
                withAnimation {
                    selectedIndex -= 1
                }
            }
            IconButton(
                icon: Image(.chevronRight),
                size: .small,
                iconColor: iconColor,
                borderColor: borderColor,
                disabled: $canNavigateForward
            ) {
                withAnimation {
                    selectedIndex += 1
                }
            }
        }
    }
}

#Preview {
    PaginationButtons(iconColor: .blue, borderColor: .red, selectedIndex: .constant(0), canNavigateBack: .constant(true), canNavigateForward: .constant(false))
}
