import SwiftUI
import GuardianFonts

/// A standard button from the design system. Use the `.buttonTheme()` modifier to apply a style.
struct SourceButton: View {
    let label: String
    let size: ButtonSize
    let hideLabel: Bool
    var disabled: Bool
    var action: () -> Void

    var body: some View {
        Button(action: action) {
            HStack(spacing: 0) {
                if hideLabel == false {
                    Text(label)
                }
            }
        }
        .buttonStyle(
            SourceButtonStyle(
                label: label,
                size: size,
                hideLabel: hideLabel,
                isDisabled: disabled
            )
        )
    }
}

struct SourceButtonStyle: ButtonStyle {
    let label: String
    let size: ButtonSize
    let hideLabel: Bool
    var isDisabled: Bool

    @Environment(\.colorScheme) private var colorScheme
    @Environment(\.buttonTheme) private var buttonTheme

    private var disabledOpacity: CGFloat {
        return colorScheme == .dark ? 0.4 : 0.2
    }

    func makeBody(configuration: Configuration) -> some View {
        configuration.label
            .frame(maxWidth: .infinity)
            .frame(height: size.iconSize)
            .padding(size.padding)
            .font(GuardianFont(style: .textSansBold, size: 15))
            .foregroundColor(buttonTheme.foregroundColor)
            .opacity(isDisabled ? disabledOpacity : 1.0)
            .background(
                Group {
                    switch buttonTheme.buttonPriority {
                    case .primary, .secondary:
                        Capsule()
                            .fill(buttonTheme.backgroundColor)
                    case .tertiary:
                        Capsule()
                            .stroke(buttonTheme.foregroundColor, lineWidth: 1)
                    }
                }
            )
            .opacity(configuration.isPressed ? 0.8 : 1)
            .scaleEffect(configuration.isPressed ? 0.95 : 1)
    }
}

#Preview {
    VStack(alignment: .leading) {
        Section {
            SourceButton(
                label: "Sign in",
                size: .medium,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandPrimary)

            SourceButton(
                label: "Sign in",
                size: .medium,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandSecondary)

            SourceButton(
                label: "Sign in",
                size: .medium,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandTertiary)
        } header: {
            Text("Medium")
        }

        Section {
            SourceButton(
                label: "Sign in",
                size: .small,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandPrimary)

            SourceButton(
                label: "Sign in",
                size: .small,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandSecondary)

            SourceButton(
                label: "Sign in",
                size: .small,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandTertiary)
        } header: {
            Text("Small")
        }

        Section {
            SourceButton(
                label: "Sign in",
                size: .xsmall,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandPrimary)

            SourceButton(
                label: "Sign in",
                size: .xsmall,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandSecondary)

            SourceButton(
                label: "Sign in",
                size: .xsmall,
                hideLabel: false,
                disabled: false,
                action: {}
            )
            .buttonTheme(.brandTertiary)
        } header: {
            Text("Xsmall")
        }

        Section {
            SourceButton(
                label: "Disabled primary",
                size: .medium,
                hideLabel: false,
                disabled: true,
                action: {}
            )
            .buttonTheme(.brandPrimary)

            SourceButton(
                label: "Disabled secondary",
                size: .medium,
                hideLabel: false,
                disabled: true,
                action: {}
            )
            .buttonTheme(.brandSecondary)

            SourceButton(
                label: "Disabled tertiary",
                size: .medium,
                hideLabel: false,
                disabled: true,
                action: {}
            )
            .buttonTheme(.brandTertiary)
        } header: {
            Text("Disabled")
        }
    }
    .padding()
    .previewFonts()
}
