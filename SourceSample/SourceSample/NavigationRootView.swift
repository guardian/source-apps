//
//  NavigationRootView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 05/07/2024.
//

import SwiftUI

struct NavigationRootView: View {
    enum ViewType: String, CaseIterable, Identifiable {
        case colours, fonts, icons
        var id: Self { self }

        var title: String {
            switch self {
            case .colours: return "Colours"
            case .fonts: return "Typography"
            case .icons: return "Icons"
            }
        }
    }

    @State private var selectedView: ViewType? = .colours

    var body: some View {
        NavigationSplitView {
            List(selection: $selectedView) {
                ForEach(ViewType.allCases) { viewType in
                    Text(viewType.title)
                        .tag(viewType)
                }
            }
            .navigationTitle("Categories")
        } detail: {
            if let selectedView = selectedView {
                ContentDetailView(viewType: selectedView)
            } else {
                Text("Select a category")
                    .font(.title)
                    .foregroundStyle(.secondary)
            }
        }
    }
}

struct ContentDetailView: View {
    var viewType: NavigationRootView.ViewType

    var body: some View {
        switch viewType {
        case .colours:
            ColorSwatchView()
        case .fonts:
            TypographyView()
        case .icons:
            IconView()
        }
    }
}

#Preview {
    NavigationRootView()
}

