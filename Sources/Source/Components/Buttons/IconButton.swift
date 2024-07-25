import SwiftUI

/// A button which only displays an icon.
///
/// Used in situations where space is a premium and extra text results in a cluttered design. 
public struct IconButton: View {
    private let icon: Image
    private let size: ButtonSize
    private let iconColor: Color
    private let borderColor: Color
    private let action: () -> ()
    @Binding private var disabled: Bool

    public init(icon: Image, size: ButtonSize, iconColor: Color, borderColor: Color, disabled: Binding<Bool>, action: @escaping () -> Void) {
        self.icon = icon
        self.size = size
        self.iconColor = iconColor
        self.borderColor = borderColor
        self._disabled = disabled
        self.action = action
    }

    public var body: some View {
        Button {
            guard disabled == false else { return }
            action()
        } label: {
            icon
                .resizable()
        }
        .buttonStyle(IconButtonStyle(size: size, isDisabled: $disabled, borderColor: borderColor, iconColor: iconColor))

    }
}

/// Custom button style used to style an icon button.
///
/// Custom disabled functionality has been used here, rather than the native to ensure the styling of the button in the disabled state is correctly reflected and that no touch events are passed through to the view behind.
struct IconButtonStyle: ButtonStyle {
    let size: ButtonSize
    @Binding private var isDisabled: Bool
    let borderColor: Color
    let iconColor: Color

    init(size: ButtonSize, isDisabled: Binding<Bool>, borderColor: Color, iconColor: Color) {
        self.size = size
        self._isDisabled = isDisabled
        self.borderColor = borderColor
        self.iconColor = iconColor
    }

    func makeBody(configuration: Configuration) -> some View {
        configuration.label
            .frame(width: size.iconSize, height: size.iconSize)
            .foregroundStyle(iconColor)
            .padding(size.iconPadding)
            .background {
                if configuration.isPressed, isDisabled == false {
                    Circle()
                        .fill(borderColor)
                } else {
                    Circle()
                        .stroke(borderColor, lineWidth: 1.0)
                }
            }
            .opacity(isDisabled ? 0.2 : 1.0)
    }
}

#Preview {
    IconButton(icon: Image(.chevronLeft), size: .small, iconColor: .black, borderColor: .gray, disabled: .constant(false), action: {})
}

// Maps button size to layout values for icon.
fileprivate extension ButtonSize {
    var iconSize: CGFloat {
        switch self {
            case .xsmall:
                return 14
            case .small:
                return 18
            case .medium:
                return 22
        }
    }

    var iconPadding: CGFloat {
        switch self {
            case .xsmall:
                return 5
            case .small:
                return 9
            case .medium:
                return 11
        }
    }
}
