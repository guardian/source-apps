//
//  IconView.swift
//  SourceSample
//
//  Created by Benjamin Briggs on 30/06/2025.
//

import SwiftUI
import Source
import GuardianFonts

struct IconView: View {
    let model = IconModel()
    var body: some View {
        List {
            ForEach(model.sections, id:\.name) { section in
                Section {
                    ForEach(section.icons, id:\.name) { icon in
                        HStack {
                            Image(source: icon.icon)
                                .imageScale(.large)
                            Text(icon.name)
                                .bold()
                            Spacer()
                            Text(icon.iconDescriptor)
                                .monospaced()
                                .foregroundStyle(.secondary)
                        }
                        .padding()
                        .onTapGesture {
                            NSPasteboard.general.clearContents()
                            NSPasteboard.general.setString(icon.iconDescriptor, forType: .string)
                        }
                    }
                } header: {
                    Text(section.name)
                        .font(Typography.headlineBld18)
                        .padding(.bottom, 8)
                }
            }
        }
    }
}

#Preview {
    IconView()
}
