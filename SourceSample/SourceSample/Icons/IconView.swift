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
                                CopyableLabel(icon.iconDescriptor)
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
