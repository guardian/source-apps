//
//  ColorSwatchViewModel.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//

import Foundation
import UIKit

struct ColorSwatch: Hashable {
    let color: UIColor
    let description: String

    var hexString: String? {
        color.toHexString()
    }
}
