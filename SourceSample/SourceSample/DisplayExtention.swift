//
//  File.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 01/07/2025.
//
import Source

extension ButtonSize {
    var displayName: String {
        switch self {
        case .medium: "Medium"
        case .small: "Small"
        case .xsmall: "XSmall"
        }
    }
}


extension ButtonPriority {
    var displayName: String {
        switch self {
        case .primary: "Primary"
        case .secondary: "Secondary"
        case .tertiary: "Tertiary"
        case .subdued: "Subdued"
        }
    }
}
