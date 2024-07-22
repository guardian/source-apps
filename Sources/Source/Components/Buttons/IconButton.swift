import SwiftUI

public struct IconButton: View {
    private let icon: Image
    private let primaryColor: Color
    private let secondaryColor: Color
    private let action: () -> ()

    public init(icon: Image, primaryColor: Color, secondaryColor: Color, action: @escaping () -> Void) {
        self.icon = icon
        self.primaryColor = primaryColor
        self.secondaryColor = secondaryColor
        self.action = action
    }

    public var body: some View {
        Button {
            action()
        } label: {
            icon
                .resizable()
                .frame(width: 24, height: 24) // FIXME: figure out sizing
                .foregroundStyle(primaryColor)
                .padding(6)
        }
        .background {
            Circle()
                .stroke(secondaryColor, lineWidth: 1.0)
        }

    }
}

#Preview {
    IconButton(icon: Image(.chevronLeft), primaryColor: .black, secondaryColor: .gray, action: {})
}
