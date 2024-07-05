//
//  NavigationRootView.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 05/07/2024.
//

import SwiftUI

enum SideBarItem: String, Identifiable, CaseIterable {
    var id: String { rawValue }
    case palette
    case typography
}

struct NavigationRootView: View {
    @State var sideBarVisibility: NavigationSplitViewVisibility = .doubleColumn
    @State var selectedSideBarItem: SideBarItem = .palette
    var body: some View {
        NavigationSplitView(columnVisibility: $sideBarVisibility) {
            List(SideBarItem.allCases, selection: $selectedSideBarItem) { item in
                NavigationLink(item.rawValue.localizedCapitalized, value: item)
            }
        } detail: {
            NavigationStack {
                switch selectedSideBarItem {
                    case .palette:
                        ColorSwatchView()
                    case .typography:
                        TypographyView()
                }
            }
        }

    }
}

#Preview {
    NavigationRootView()
}
