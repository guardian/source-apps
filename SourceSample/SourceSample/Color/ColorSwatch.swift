//
//  ColorSwatchViewModel.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//

import Foundation
#if os(iOS)
import UIKit
#else
import AppKit
#endif

struct ColorSwatch: Hashable {
#if os(iOS)
    let color: UIColor
#else
    let color: NSColor
#endif
    let description: String

    var hexString: String? {
        color.toHexString()
    }
}
