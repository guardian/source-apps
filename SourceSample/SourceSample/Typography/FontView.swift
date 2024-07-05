//
//  FontView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 05/07/2024.
//

import SwiftUI
import GuardianFonts

struct FontView: View {
    @State var showingPopover = false

    let viewModel: GuardianFontViewModel

    var body: some View {
        Button(action: {
            showingPopover = true
        }, label: {
            Text(viewModel.title ?? "")
                .font(viewModel.font)
                .padding()
        })
        .popover(isPresented: $showingPopover) {
            VStack {
                Text("For facts' sake")
                    .font(viewModel.font)
                Text("Font size: \(Int(viewModel.font.size))")
                if let lineHeight = viewModel.font.lineHeightDescription {
                    Text("Line height: \(lineHeight)%")

                }
                Text(viewModel.propertyName)
                    .textSelection(.enabled)
            }
            .padding()
        }
    }
}
