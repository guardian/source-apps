import SwiftUI
import GuardianFonts

/// A standard button from the design system. Use the `.buttonTheme()` modifier to apply a style.
struct SourceButton: View {
    let label: String
    let buttonSize: ButtonSize
    let fontSize: CGFloat
    let hideLabel: Bool
    var disabled: Bool
    var action: () -> Void

    public init(
        label: String,
        buttonSize: ButtonSize,
        fontSize: CGFloat = 15,
        hideLabel: Bool,
        disabled: Bool,
        action: @escaping () -> Void
    ) {
        self.label = label
        self.buttonSize = buttonSize
        self.fontSize = fontSize
        self.hideLabel = hideLabel
        self.disabled = disabled
        self.action = action
    }

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
                buttonSize: buttonSize,
                fontSize: fontSize,
                hideLabel: hideLabel,
                isDisabled: disabled
            )
        )
    }
}

struct SourceButtonStyle: ButtonStyle {
    let label: String
    let buttonSize: ButtonSize
    let fontSize: CGFloat
    let hideLabel: Bool
    var isDisabled: Bool

    @Environment(\.colorScheme) private var colorScheme
    @Environment(\.buttonTheme) private var buttonTheme

    private var disabledOpacity: CGFloat {
        return colorScheme == .dark ? 0.6 : 0.4
    }

    func makeBody(configuration: Configuration) -> some View {
        configuration.label
            .frame(maxWidth: .infinity)
            .padding(buttonSize.buttonPadding)
            .font(GuardianFont(style: .textSansBold, size: fontSize))
            .foregroundColor(Color(uiColor: buttonTheme.foregroundColor))
            .background(
                Group {
                    switch buttonTheme.buttonPriority {
                    case .primary, .secondary:
                        Capsule()
                            .fill(Color(uiColor: buttonTheme.backgroundColor))
                    case .tertiary:
                        Capsule()
                            .stroke(Color(uiColor: buttonTheme.foregroundColor), lineWidth: 1)
                    }
                }
            )
            .opacity(isDisabled ? disabledOpacity : 1.0)
            .opacity(configuration.isPressed ? 0.8 : 1)
            .scaleEffect(configuration.isPressed ? 0.95 : 1)
            .lineLimit(1)
    }
}

#Preview {
    ScrollView {
        VStack(alignment: .leading) {
            Section {
                SourceButton(
                    label: "Sign in",
                    buttonSize: .medium,
                    hideLabel: false,
                    disabled: false,
                    action: {}
                )
                .buttonTheme(.brandPrimary)

                SourceButton(
                    label: "Sign in",
                    buttonSize: .medium,
                    hideLabel: false,
                    disabled: false,
                    action: {}
                )
                .buttonTheme(.brandSecondary)

                SourceButton(
                    label: "Sign in",
                    buttonSize: .medium,
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
                    buttonSize: .small,
                    hideLabel: false,
                    disabled: false,
                    action: {}
                )
                .buttonTheme(.brandPrimary)

                SourceButton(
                    label: "Sign in",
                    buttonSize: .small,
                    hideLabel: false,
                    disabled: false,
                    action: {}
                )
                .buttonTheme(.brandSecondary)

                SourceButton(
                    label: "Sign in",
                    buttonSize: .small,
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
                    buttonSize: .xsmall,
                    hideLabel: false,
                    disabled: false,
                    action: {}
                )
                .buttonTheme(.brandPrimary)

                SourceButton(
                    label: "Sign in",
                    buttonSize: .xsmall,
                    hideLabel: false,
                    disabled: false,
                    action: {}
                )
                .buttonTheme(.brandSecondary)

                SourceButton(
                    label: "Sign in",
                    buttonSize: .xsmall,
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
                    buttonSize: .medium,
                    hideLabel: false,
                    disabled: true,
                    action: {}
                )
                .buttonTheme(.brandPrimary)

                SourceButton(
                    label: "Disabled secondary",
                    buttonSize: .medium,
                    hideLabel: false,
                    disabled: true,
                    action: {}
                )
                .buttonTheme(.brandSecondary)

                SourceButton(
                    label: "Disabled tertiary",
                    buttonSize: .medium,
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
}
