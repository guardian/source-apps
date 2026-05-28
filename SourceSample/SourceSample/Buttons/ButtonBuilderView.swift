//
//  ButtonBuilderView.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 01/07/2025.
//

import SwiftUI
import Source

struct ButtonBuilderView: View {
    @State var buttonType: ButtonType = .regular

    enum ButtonType {
        case icon, regular, spinner
    }

    var body: some View {
        VStack {
            switch buttonType {
            case .icon:
                IconButtonBuilderView()
            case .regular:
                StandardButtonBuilderView()
            case .spinner:
                SpinnerButtonBuilderView()
            }
        }
        .padding()
        .toolbar {
            ToolbarItem {
                Picker("Type", selection: $buttonType) {
                    Text("Standard").tag(ButtonType.regular)
                    Text("Icon").tag(ButtonType.icon)
                    Text("Spinner").tag(ButtonType.spinner)
                }
                .pickerStyle(.segmented)
                .labelsHidden()
            }
        }
        .navigationTitle("Button Builder")
    }
}

struct IconButtonBuilderView: View {
    @State var title: String = "Button"
    @State var icon: SourceIcon? = nil
    @State var size: ButtonSize = .medium
    @State var priority: ButtonPriority = .primary

    @State var iconColor: Color = Color(ColorPalette.brand400)
    @State var borderColor: Color = Color(ColorPalette.brand400)

    @State var showingIconPicker = false

    var body: some View {
        VStack {
            Group {
                if let icon {
                    IconButton(
                        icon: Image(source: icon),
                        size: size,
                        iconColor: iconColor,
                        borderColor: borderColor,
                        action: {}
                    )
                } else {
                    IconButton(
                        icon: Image(systemName: "circle.slash"),
                        size: size,
                        iconColor: iconColor,
                        borderColor: borderColor,
                        action: {}
                    )
                }
            }
            .frame(
                maxWidth: .infinity,
                minHeight: 200,
                maxHeight: .infinity
            )

            GroupBox {
                GroupBox("Button Config") {
                    VStack(alignment: .leading) {
                        IconPicker("Icon", selection: $icon)
                        Picker("Size", selection: $size) {
                            ForEach(ButtonSize.allCases, id: \.self) {  size in
                                Text(size.displayName)
                            }
                        }
                        .pickerStyle(.segmented)
                    }
                    .padding()
                    .frame(maxWidth: 600)
                }


                GroupBox("Button Theme") {
                    HStack {
                        ColorPicker("Icon Color", selection: $iconColor)
                        ColorPicker("Border Color", selection: $borderColor)
                    }
                    .frame(maxWidth: .infinity, alignment: .leading)
                    .padding()
                    .frame(maxWidth: 600)
                }
            }
        }
    }
}

struct StandardButtonBuilderView: View {
    @State var title: String = "Button"
    @State var icon: SourceIcon? = nil
    @State var size: ButtonSize = .medium
    @State var priority: ButtonPriority = .primary
    @State var theme: ButtonTheme = .brand

    @State var showingIconPicker = false

    var body: some View {
        VStack {
            Button {} label: {
                HStack(spacing: 8) {
                    if let icon {
                        Image(source: icon)
                            .imageScale(.medium)
                    }
                    Text(title)
                }
            }
            .buttonStyle(
                .source(
                    size: size,
                    priority: priority,
                    theme: theme
                )
            )
            .frame(
                maxWidth: .infinity,
                minHeight: 200,
                maxHeight: .infinity
            )

            GroupBox {
                GroupBox("Button Config") {
                    VStack(alignment: .leading) {
                        TextField("Title", text: $title)
                            .textFieldStyle(.roundedBorder)
                        IconPicker("Icon", selection: $icon)
                        Picker("Size", selection: $size) {
                            ForEach(ButtonSize.allCases, id: \.self) {  size in
                                Text(size.displayName)
                            }
                        }
                        .pickerStyle(.segmented)
                        Picker("Priority", selection: $priority) {
                            ForEach(ButtonPriority.allCases, id: \.self) {  priority in
                                Text(priority.displayName)
                            }
                        }
                        .pickerStyle(.segmented)
                    }
                    .padding()
                    .frame(maxWidth: 600)
                }

                GroupBox("Button Theme") {
                    ButtonThemeBuilderView(theme: $theme)
                        .frame(maxWidth: .infinity, alignment: .leading)
                        .padding()
                        .frame(maxWidth: 600)
                }
            }
        }
    }
}

struct SpinnerButtonBuilderView: View {
    @State var title: String = "Submit"
    @State var state: SpinnerButtonState = .loading
    @State var size: ButtonSize = .medium
    @State var priority: ButtonPriority = .primary
    @State var theme: ButtonTheme = .brand

    var body: some View {
        VStack {
            SpinnerButton(
                title: title,
                state: state,
                size: size,
                priority: priority,
                theme: theme,
                action: {}
            )
            .frame(
                maxWidth: .infinity,
                minHeight: 200,
                maxHeight: .infinity
            )

            GroupBox {
                GroupBox("Button Config") {
                    VStack(alignment: .leading) {
                        TextField("Title", text: $title)
                            .textFieldStyle(.roundedBorder)
                        Picker("State", selection: $state) {
                            Text("Idle").tag(SpinnerButtonState.idle)
                            Text("Loading").tag(SpinnerButtonState.loading)
                        }
                        .pickerStyle(.segmented)
                        Picker("Size", selection: $size) {
                            ForEach(ButtonSize.allCases, id: \.self) {  size in
                                Text(size.displayName)
                            }
                        }
                        .pickerStyle(.segmented)
                        Picker("Priority", selection: $priority) {
                            ForEach(ButtonPriority.allCases, id: \.self) {  priority in
                                Text(priority.displayName)
                            }
                        }
                        .pickerStyle(.segmented)
                    }
                    .padding()
                    .frame(maxWidth: 600)
                }

                GroupBox("Button Theme") {
                    ButtonThemeBuilderView(theme: $theme)
                        .frame(maxWidth: .infinity, alignment: .leading)
                        .padding()
                        .frame(maxWidth: 600)
                }
            }
        }
    }
}

#Preview {
    NavigationStack {
        ButtonBuilderView()
    }
}
