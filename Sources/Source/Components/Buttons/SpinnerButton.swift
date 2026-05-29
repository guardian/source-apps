//

import SwiftUI
import GuardianFonts

public enum SpinnerButtonState {
    case idle
    case loading
}

public struct SpinnerButton: View {
    let title: String
    let state: SpinnerButtonState
    let size: ButtonSize
    let priority: ButtonPriority
    let theme: ButtonTheme
    let action: () -> Void
    
    @Environment(\.colorScheme) private var colorScheme
    
    public init(
        title: String,
        state: SpinnerButtonState = .idle,
        size: ButtonSize,
        priority: ButtonPriority,
        theme: ButtonTheme,
        action: @escaping () -> Void
    ) {
        self.title = title
        self.state = state
        self.size = size
        self.priority = priority
        self.theme = theme
        self.action = action
    }
    
    public var body: some View {
        Button(action: action) {
            HStack(alignment: .center, spacing: 8) {
                Spacer(minLength: 0)
                
                if state == .loading {
                    GuardianSpinner(
                        size: size.spinnerSize,
                        theme: theme,
                        priority: priority,
                        lineWidth: size.spinnerLineWidth
                    )
                    .padding(.vertical, size.spinnerVerticalPad)
                }
                
                Text(title)
                    .padding(.vertical, size.verticalPad)
                    
                Spacer(minLength: 0)
                
                if state == .loading {
                    Color.clear
                        .frame(width: size.spinnerSize, height: 0)
                }
            }
        }
        .buttonStyle(
            SpinnerButtonStyle(
                size: size,
                priority: priority,
                theme: theme,
                isLoading: state == .loading
            )
        )
        .disabled(state == .loading)
    }
}

extension ButtonSize {
    var spinnerSize: CGFloat {
        switch self {
        case .medium:
            return 24
        case .small:
            return 16
        case .xsmall:
            return 14
        }
    }
    
    var spinnerLineWidth: CGFloat {
        switch self {
        case .medium:
            return 4
        case .small:
            return 2
        case .xsmall:
            return 1.5
        }
    }
    
    var spinnerVerticalPad: CGFloat {
        return 10
    }
}

#Preview {
    VStack(spacing: 20) {
        SpinnerButton(
            title: "Submit",
            state: .idle,
            size: .medium,
            priority: .primary,
            theme: .brand,
            action: {}
        )
        
        SpinnerButton(
            title: "Submit",
            state: .loading,
            size: .medium,
            priority: .primary,
            theme: .brand,
            action: {}
        )
    }
    .padding()
}
