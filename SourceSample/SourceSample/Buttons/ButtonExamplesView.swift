//
//  ButtonExamplesView.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 30/06/2025.
//


import SwiftUI
import Source
import GuardianFonts

struct ButtonExamplesView: View {
    var body: some View {
        List {

            // MARK: - Standard Text Buttons
           Section("Standard Buttons") {
                // Primary buttons
                HStack(spacing: 12) {
                    Button("Primary Medium") { }
                        .buttonStyle(
                            .source(
                                size: .medium,
                                priority: .primary,
                                theme: .brand
                            )
                        )

                    Button("Primary Small") { }
                        .buttonStyle(
                            .source(
                                size: .small,
                                priority: .primary,
                                theme: .brand
                            )
                        )

                    Button("Primary XSmall") { }
                        .buttonStyle(
                            .source(
                                size: .xsmall,
                                priority: .primary,
                                theme: .brand
                            )
                        )
                }
                .padding()

                // Secondary buttons
                HStack(spacing: 12) {
                    Button("Secondary Medium") { }
                        .buttonStyle(
                            .source(
                                size: .medium,
                                priority: .secondary,
                                theme: .brand
                            )
                        )

                    Button("Secondary Small") { }
                        .buttonStyle(
                            .source(
                                size: .small,
                                priority: .secondary,
                                theme: .brand
                            )
                        )

                    Button("Secondary XSmall") { }
                        .buttonStyle(
                            .source(
                                size: .xsmall,
                                priority: .secondary,
                                theme: .brand
                            )
                        )
                }
                .padding()

                // Tertiary buttons
                HStack(spacing: 12) {
                    Button("Tertiary Medium") { }
                        .buttonStyle(
                            .source(
                                size: .medium,
                                priority: .tertiary,
                                theme: .brand
                            )
                        )

                    Button("Tertiary Small") { }
                        .buttonStyle(
                            .source(
                                size: .small,
                                priority: .tertiary,
                                theme: .brand
                            )
                        )

                    Button("Tertiary XSmall") { }
                        .buttonStyle(
                            .source(
                                size: .xsmall,
                                priority: .tertiary,
                                theme: .brand
                            )
                        )
                }
                .padding()

                // Tertiary buttons
                HStack(spacing: 12) {
                    Button("Subdued Medium") { }
                        .buttonStyle(
                            .source(
                                size: .medium,
                                priority: .subdued,
                                theme: .brand
                            )
                        )

                    Button("Subdued Small") { }
                        .buttonStyle(
                            .source(
                                size: .small,
                                priority: .subdued,
                                theme: .brand
                            )
                        )

                    Button("Subdued XSmall") { }
                        .buttonStyle(
                            .source(
                                size: .xsmall,
                                priority: .subdued,
                                theme: .brand
                            )
                        )
                }
                .padding()
           }

            // MARK: - Icon Only Buttons
            Section("Icon Only Buttons") {
                HStack(spacing: 16) {
                    Text("Medium")
                    IconButton(
                        icon: Image(source: .plus),
                        size: .medium,
                        iconColor: Color(ColorPalette.brand400),
                        borderColor: Color(ColorPalette.brand400)
                    ) {}

                    IconButton(
                        icon: Image(source: .cross),
                        size: .medium,
                        iconColor: Color(ColorPalette.error400),
                        borderColor: Color(ColorPalette.error400)
                    ) {}

                    IconButton(
                        icon: Image(source: .checkmark),
                        size: .medium,
                        iconColor: Color(ColorPalette.success400),
                        borderColor: Color(ColorPalette.success400)
                    ) {}


                    IconButton(
                        icon: Image(source: .chevronRightSingle),
                        size: .medium,
                        iconColor: Color(ColorPalette.brand400),
                        borderColor: Color(ColorPalette.brand400),
                        disabled: true
                    ) {}
                }
                .padding()

                HStack(spacing: 16) {
                    Text("Small")
                    IconButton(
                        icon: Image(source: .edit),
                        size: .small,
                        iconColor: Color(ColorPalette.brand400),
                        borderColor: Color(ColorPalette.brand400)
                    ) {}

                    IconButton(
                        icon: Image(source: .bin),
                        size: .medium,
                        iconColor: Color(ColorPalette.error400),
                        borderColor: Color(ColorPalette.error400),
                        disabled: false
                    ) {}

                    IconButton(
                        icon: Image(source: .download),
                        size: .small,
                        iconColor: Color(ColorPalette.brand500),
                        borderColor: Color(ColorPalette.brand500)
                    ) {}

                    IconButton(
                        icon: Image(source: .calendar),
                        size: .small,
                        iconColor: Color(ColorPalette.brand400),
                        borderColor: Color(ColorPalette.brand400),
                        disabled: true
                    ) {}
                }
                .padding()

                HStack(spacing: 16) {
                    Text("XSmall")
                    IconButton(
                        icon: Image(source: .mediaControlsPlay),
                        size: .xsmall,
                        iconColor: Color(ColorPalette.brand400),
                        borderColor: Color(ColorPalette.brand400)
                    ) {}

                    IconButton(
                        icon: Image(source: .mediaControlsPause),
                        size: .xsmall,
                        iconColor: Color(ColorPalette.brand400),
                        borderColor: Color(ColorPalette.brand400),
                    ) {}

                    IconButton(
                        icon: Image(source: .mediaControlsStop),
                        size: .xsmall,
                        iconColor: Color(ColorPalette.brand400),
                        borderColor: Color(ColorPalette.brand400)
                    ) {}

                    IconButton(
                        icon: Image(source: .mediaControlsForward),
                        size: .xsmall,
                        iconColor: Color(ColorPalette.brand400),
                        borderColor: Color(ColorPalette.brand400),
                        disabled: true
                    ) {}
                }
                .padding()
            }

            // MARK: - Custom Buttons with Text + Icons
            Section("Custom Text + Icon Buttons") {
                HStack(spacing: 16) {
                    // Custom button with icon and text
                    CustomIconTextButton(
                        title: "Listen",
                        icon: .audio,
                        priority: .primary,
                        size: .medium
                    ) {}

                    CustomIconTextButton(
                        title: "Share Article",
                        icon: .shareWeb,
                        priority: .secondary,
                        size: .medium
                    ) {}

                    CustomIconTextButton(
                        title: "Download",
                        icon: .download,
                        priority: .tertiary,
                        size: .medium
                    ) {}
                }
                .padding()

                // Media control buttons
                HStack(spacing: 16) {
                    CustomIconTextButton(
                        title: "Save",
                        icon: .plus,
                        priority: .primary,
                        size: .small
                    ) {}

                    CustomIconTextButton(
                        title: "Remove",
                        icon: .cross,
                        priority: .secondary,
                        size: .small
                    ) {}

                    CustomIconTextButton(
                        title: "Remind",
                        icon: .alarmClockOutlined,
                        priority: .tertiary,
                        size: .small
                    ) {}
                }
                .padding()

                // Media control buttons
                HStack(spacing: 16) {
                    CustomIconTextButton(
                        title: "Play",
                        icon: .mediaControlsPlay,
                        priority: .primary,
                        size: .xsmall
                    ) {}

                    CustomIconTextButton(
                        title: "Pause",
                        icon: .mediaControlsPause,
                        priority: .secondary,
                        size: .xsmall
                    ) {}

                    CustomIconTextButton(
                        title: "Stop",
                        icon: .mediaControlsStop,
                        priority: .tertiary,
                        size: .xsmall
                    ) {}
                }
                .padding()
            }
        }
        .navigationTitle("Button Examples")
    }
}

// MARK: - Custom Button Components

struct CustomIconTextButton: View {
    let title: String
    let icon: SourceIcon
    let priority: ButtonPriority
    let size: ButtonSize
    let action: () -> Void

    var body: some View {
        Button(action: action) {
            HStack(spacing: 8) {
                Image(source: icon)
                    .imageScale(.medium)
                Text(title)
            }
        }
        .buttonStyle(.source(size: size, priority: priority, theme: .brand))
    }
}

// MARK: - Additional Custom Button Styles

struct DestructiveButton: View {
    let title: String
    let action: () -> Void

    var body: some View {
        Button(action: action) {
            HStack {
                Image(source: .bin)
                    .imageScale(.small)
                Text(title)
            }
            .foregroundColor(.white)
            .padding(.horizontal, 20)
            .padding(.vertical, 12)
            .background(
                Capsule()
                    .fill(.red)
            )
        }
        .font(Typography.textSansBld17)
    }
}

struct LinkButton: View {
    let title: String
    let action: () -> Void

    var body: some View {
        Button(action: action) {
            HStack(spacing: 4) {
                Text(title)
                Image(source: .external)
                    .imageScale(.small)
            }
            .foregroundColor(.blue)
            .underline()
        }
        .font(Typography.textSans15)
    }
}

#Preview {
    ButtonExamplesView()
}
