import SwiftUI
import GuardianFonts

public struct SourceButtonStyle: ButtonStyle {
    let buttonSize: ButtonSize
    let buttonPriority: ButtonPriority
    let buttonTheme: ButtonTheme

    @Environment(\.colorScheme) private var colorScheme

    private var disabledOpacity: CGFloat {
        return colorScheme == .dark ? 0.6 : 0.4
    }

    public func makeBody(configuration: Configuration) -> some View {
        configuration.label
            .frame(maxWidth: .infinity)
            .padding(.vertical, buttonSize.verticalPad)
            .padding(.horizontal, buttonSize.horizontalPad)
            .font(GuardianFont(style: .textSansBold, size: buttonSize.fontSize))
            .foregroundColor(foregroundColor(for: buttonPriority))
            .background(backgroundShape(for: buttonPriority))
            .opacity(configuration.isPressed ? 0.8 : 1)
            .scaleEffect(configuration.isPressed ? 0.95 : 1)
            .lineLimit(1)
    }

    private func foregroundColor(for priority: ButtonPriority) -> Color {
        switch priority {
        case .primary:
            return Color(uiColor: buttonTheme.foregroundColorPrimary)
        case .secondary:
            return Color(uiColor: buttonTheme.foregroundColorSecondary)
        case .tertiary:
            return Color(uiColor: buttonTheme.foregroundColorTertiary)
        case .subdubed:
            return Color(uiColor: buttonTheme.foregroundColorSubdued)
        }
    }

    private func backgroundShape(for priority: ButtonPriority) -> some View {
        Group {
            switch priority {
            case .primary:
                Capsule()
                    .fill(Color(uiColor: buttonTheme.backgroundColorPrimary))
            case .secondary:
                Capsule()
                    .fill(Color(uiColor: buttonTheme.backgroundColorSecondary))
            case .tertiary:
                Capsule()
                    .stroke(Color(uiColor: buttonTheme.foregroundColorTertiary))
            case .subdubed:
                EmptyView()

            }
        }
    }
}

public extension ButtonStyle where Self == SourceButtonStyle {
    static func source(size: ButtonSize, priority: ButtonPriority, theme: ButtonTheme) -> SourceButtonStyle {
        SourceButtonStyle(buttonSize: size, buttonPriority: priority, buttonTheme: theme)
    }
}

#Preview {
    ScrollView {
        VStack(alignment: .leading) {

            Section {
                Button(action: {}) {
                    Text("Primary")
                }
                .buttonStyle(.source(size: .medium, priority: .primary, theme: .brand))

                Button(action: {}) {
                    Text("Secondary")
                }
                .buttonStyle(.source(size: .medium, priority: .secondary, theme: .brand))

                Button(action: {}) {
                    Text("Tertiary")
                }
                .buttonStyle(.source(size: .medium, priority: .tertiary, theme: .brand))

                Button(action: {}) {
                    Text("Subdued")
                }
                .buttonStyle(.source(size: .medium, priority: .subdubed, theme: .brand))

            } header: {
                Text("Medium")
            }

            Section {
                Button(action: {}) {
                    Text("Primary")
                }
                .buttonStyle(.source(size: .small, priority: .primary, theme: .brand))

                Button(action: {}) {
                    Text("Secondary")
                }
                .buttonStyle(.source(size: .small, priority: .secondary, theme: .brand))

                Button(action: {}) {
                    Text("Sign in")
                }
                .buttonStyle(.source(size: .small, priority: .tertiary, theme: .brand))

                Button(action: {}) {
                    Text("Subdued")
                }
                .buttonStyle(.source(size: .small, priority: .subdubed, theme: .brand))

            } header: {
                Text("Small")
            }

            Section {
                Button(action: {}) {
                    Text("Primary")
                }
                .buttonStyle(.source(size: .xsmall, priority: .primary, theme: .brand))

                Button(action: {}) {
                    Text("Secondary")
                }
                .buttonStyle(.source(size: .xsmall, priority: .secondary, theme: .brand))

                Button(action: {}) {
                    Text("Tertiary")
                }
                .buttonStyle(.source(size: .xsmall, priority: .tertiary, theme: .brand))

                Button(action: {}) {
                    Text("Subdued")
                }
                .buttonStyle(.source(size: .xsmall, priority: .subdubed, theme: .brand))

            } header: {
                Text("Xsmall")
            }
        }
        .padding()
        .previewFonts()
    }
}
