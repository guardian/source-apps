import SwiftUI

/// A button which only displays an icon.
///
/// Used in situations where space is a premium and extra text results in a cluttered design. 
public struct IconButton: View {
    private let icon: Image
    private let size: ButtonSize
    private let iconColor: Color
    private let borderColor: Color?
    private let fillColor: Color?
    private let action: () -> ()

    public init(icon: Image, size: ButtonSize, iconColor: Color, borderColor: Color? = nil, fillColor: Color? = nil, action: @escaping () -> Void) {
        self.icon = icon
        self.size = size
        self.iconColor = iconColor
        self.borderColor = borderColor
        self.fillColor = fillColor
        self.action = action
    }

    public var body: some View {
        Button {
            action()
        } label: {
            icon
                .resizable()
                .frame(width: size.iconSize, height: size.iconSize)
                .foregroundStyle(iconColor)
                .padding(size.iconPadding)
        }
        .background {
            buttonBackground
        }

    }

    @ViewBuilder
    private var buttonBackground: some View {
        if let borderColor {
            Circle()
                .stroke(borderColor, lineWidth: 1.0)
        } else if let fillColor {
            Circle()
                .fill(fillColor)
        }
    }
}

// FIXME: modifer button appearance based on priority and colours 

#Preview {
    IconButton(icon: Image(.chevronLeft), size: .small, iconColor: .black, borderColor: .gray, action: {})
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
