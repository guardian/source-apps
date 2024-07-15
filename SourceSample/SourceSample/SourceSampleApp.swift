//
//  SourceSampleApp.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//

import SwiftUI
import GuardianFonts

@main
struct SourceSampleApp: App {
    init() {
        GuardianFonts.registerFonts()
    }
    
    var body: some Scene {
        WindowGroup {
            NavigationRootView()
        }
    }
}
