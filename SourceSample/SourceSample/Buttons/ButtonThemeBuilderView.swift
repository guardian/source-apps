//
//  ButtonThemeBuilderView.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 01/07/2025.
//

import SwiftUI
import Source

struct ButtonThemeBuilderView: View {
    @Binding var theme: ButtonTheme

    init(theme: Binding<ButtonTheme>) {
        self._theme = theme
        self._foregroundColorPrimary = State(
            initialValue: Color(theme.wrappedValue.foregroundColorPrimary)
        )
        self._backgroundColorPrimary = State(
            initialValue: Color(theme.wrappedValue.backgroundColorPrimary)
        )
        self._foregroundColorSecondary = State(
            initialValue: Color(theme.wrappedValue.foregroundColorSecondary)
        )
        self._backgroundColorSecondary = State(
            initialValue: Color(theme.wrappedValue.backgroundColorSecondary)
        )
        self._foregroundColorTertiary = State(
            initialValue: Color(theme.wrappedValue.foregroundColorTertiary)
        )
        self._foregroundColorSubdued = State(
            initialValue: Color(theme.wrappedValue.foregroundColorSubdued)
        )
    }

    @State var foregroundColorPrimary: Color
    @State var backgroundColorPrimary: Color
    @State var foregroundColorSecondary: Color
    @State var backgroundColorSecondary: Color
    @State var foregroundColorTertiary: Color
    @State var foregroundColorSubdued: Color

    var body: some View {
        Grid(alignment: .topLeading) {
            GridRow {
                Text("Primary")
                    .font(.headline)
                ColorPicker(
                    "Foreground",
                    selection: $foregroundColorPrimary,
                    supportsOpacity: false
                )
                ColorPicker(
                    "Background",
                    selection: $backgroundColorPrimary,
                    supportsOpacity: false
                )
            }
            GridRow {
                Text("Secondary")
                    .font(.headline)
                ColorPicker(
                    "Foreground",
                    selection: $foregroundColorSecondary,
                    supportsOpacity: false
                )
                ColorPicker(
                    "Background",
                    selection: $backgroundColorSecondary,
                    supportsOpacity: false
                )
            }
            GridRow {
                Text("Tertiary")
                    .font(.headline)
                ColorPicker(
                    "Foreground",
                    selection: $foregroundColorTertiary,
                    supportsOpacity: false
                )
            }
            GridRow {
                Text("Subdued")
                    .font(.headline)
                ColorPicker(
                    "Foreground",
                    selection: $foregroundColorSubdued,
                    supportsOpacity: false
                )
            }
        }
    }
}

#Preview {
    @Previewable @State var theme = ButtonTheme.brand
    Form {
        ButtonThemeBuilderView(theme: $theme)
    }
}
