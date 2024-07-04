//
//  ContentView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//

import SwiftUI
import Source

// FIXME: create a grid with sections for palette colours
struct ContentView: View {
    var body: some View {
        VStack {
            Color.init(uiColor: ColorPalette.brand100)
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
