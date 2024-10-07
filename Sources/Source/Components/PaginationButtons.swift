import SwiftUI

struct PaginationButtons: View {
    let iconColor: Color
    let borderColor: Color
    @Binding var selectedIndex: Int
    @Binding var canNavigateBack: Bool
    @Binding var canNavigateForward: Bool

    var body: some View {
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
