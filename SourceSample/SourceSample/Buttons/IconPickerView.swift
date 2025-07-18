//
//  IconPickerView.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 01/07/2025.
//

import SwiftUI
import Source

struct IconPicker: View {
    let text: String
    @Binding var selection: SourceIcon?
    init(_ text: String, selection: Binding<SourceIcon?>) {
        self.text = text
        self._selection = selection
    }

    @State private var showingIconPicker = false
    var body: some View {
        LabeledContent(text) {
            HStack {
                Image(source: selection ?? .cross)
                    .resizable()
                    .scaledToFit()
                    .frame(height: 18)
                Text(selection?.imageName ?? "None")
            }
            .onTapGesture {
                showingIconPicker.toggle()
            }
            .popover(isPresented: $showingIconPicker) {
                ScrollView {
                    IconPickerView(selection: $selection)
                }
#if os(macOS)
                .frame(
                    width: 440,
                    height: 400
                )
#endif
            }
        }
    }
}

struct IconPickerView: View {
    @Binding var selection: SourceIcon?
    let model = IconModel()
    var body: some View {
        ScrollView {
            LazyVGrid(columns: [GridItem(.adaptive(minimum: 100, maximum: 100))]) {
                Section {
                    IconPickerItemView(
                        icon: .cross,
                        name: "Clear Selection",
                        selected: selection == nil
                    )
                    .onTapGesture {
                        selection = nil
                    }
                }
                ForEach(model.sections, id:\.name) { section in
                    Section {
                        ForEach(section.icons, id:\.name) { iconData in
                            IconPickerItemView(
                                icon: iconData.icon,
                                name: iconData.name,
                                selected: iconData.icon == selection
                            )
                            .onTapGesture {
                                selection = iconData.icon
                            }
                        }
                    } header: {
                        Text(section.name)
                            .font(.headline)
                            .frame(
                                maxWidth: .infinity,
                                alignment: .leading
                            )
                    }
                }
            }
            .padding()
        }
    }
}

struct IconPickerItemView: View {
    let icon: SourceIcon
    let name: String
    let selected: Bool
    var body: some View {
        VStack {
            Image(source: icon)
            Text(
                name.replacingOccurrences(of: "-", with: " ").capitalized
            )
            .lineLimit(
                2,
                reservesSpace: true
            )
            .multilineTextAlignment(.center)
        }
        .frame(
            width: 100,
            height: 100,
            alignment: .center
        )
        .background {
            if selected {
                RoundedRectangle(cornerRadius: 12)
                    .fill(Color.accentColor)
            } else {
                Color.white.opacity(0.00000000001)
            }
        }
    }
}

#Preview {
    @Previewable @State var icon: SourceIcon? = .alertTriangle
    ScrollView {
        IconPickerView(selection: $icon)
    }
    .frame(width: 500)
}

#Preview {
    @Previewable @State var icon: SourceIcon? = .alertTriangle
    ScrollView {
        IconPicker("Icon", selection: $icon)
    }
    .frame(width: 500)
}
