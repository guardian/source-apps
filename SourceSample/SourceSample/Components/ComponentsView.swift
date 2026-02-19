//
//  ComponentsView.swift
//  Sourcy
//
//  Created by Aoife Mclaughlin on 04/12/2025.
//

import SwiftUI

struct ComponentsView: View {
    var body: some View {
        List {
            Section("Star Rating") {
                StarRatingBuilderView()
            }
        }
    }
}

#Preview {
    ComponentsView()
}
