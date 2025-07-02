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
                Section(section.name) {
                    ForEach(section.icons, id:\.name) { icon in
                        ViewThatFits {
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


                            HStack {
                                Image(source: icon.icon)
                                    .imageScale(.large)
                                Text(icon.name)
                                    .bold()
                                Spacer()
                            }


                            VStack(alignment: .leading) {
                                Image(source: icon.icon)
                                    .imageScale(.large)
                                Text(icon.name)
                                    .bold()
                            }
                        }
                        .padding()
                        .onTapGesture {
#if os(iOS)
                            UIPasteboard.general.setObjects([icon.iconDescriptor])
#else
                            NSPasteboard.general.clearContents()
                            NSPasteboard.general.setString(icon.iconDescriptor, forType: .string)
#endif
                        }
                    }
                }
            }
        }
        .navigationTitle("Source Icons")
    }
}

#Preview {
    IconView()
}
