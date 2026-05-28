//


import SwiftUI
import GuardianFonts

/// Custom button style for spinner buttons.
///
/// Applies consistent styling across all spinner button states and sizes.
public struct SpinnerButtonStyle: ButtonStyle {
    private let buttonSize: ButtonSize
    private let buttonPriority: ButtonPriority
    private let buttonTheme: ButtonTheme
    private let isLoading: Bool
    
    @Environment(\.colorScheme) private var colorScheme
    
    public init(
        size: ButtonSize,
        priority: ButtonPriority,
        theme: ButtonTheme,
        isLoading: Bool = false
    ) {
        self.buttonSize = size
        self.buttonPriority = priority
        self.buttonTheme = theme
        self.isLoading = isLoading
    }
    
    public func makeBody(configuration: Configuration) -> some View {
        configuration.label
            .font(GuardianFont(style: .textSansBold, size: buttonSize.fontSize))
            .scaleEffect(configuration.isPressed ? 0.95 : 1)
            .foregroundColor(foregroundColor(for: buttonPriority))
            .padding(.horizontal, buttonSize.horizontalPad)
            .background(backgroundShape(for: buttonPriority))
            .opacity(configuration.isPressed ? 0.8 : 1)
            .lineLimit(1)
    }
    
    private func backgroundShape(for priority: ButtonPriority) -> some View {
        Group {
            switch priority {
            case .primary:
                Capsule()
                    .fill(Color(buttonTheme.backgroundColorPrimary))
            case .secondary:
                Capsule()
                    .fill(Color(buttonTheme.backgroundColorSecondary))
            case .tertiary:
                Capsule()
                    .stroke(Color(buttonTheme.foregroundColorTertiary))
            case .subdued:
                EmptyView()
            }
        }
    }
    
    private func foregroundColor(for priority: ButtonPriority) -> Color {
        switch priority {
        case .primary:
            return Color(buttonTheme.foregroundColorPrimary)
        case .secondary:
            return Color(buttonTheme.foregroundColorSecondary)
        case .tertiary:
            return Color(buttonTheme.foregroundColorTertiary)
        case .subdued:
            return Color(buttonTheme.foregroundColorSubdued)
        }
    }
}
