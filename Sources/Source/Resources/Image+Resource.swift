//

import SwiftUI

public extension Image {

    /// Use this initialiser to access images from the source-apps repo's assets catalog.
    ///
    /// Example usage:
    /// ```swift
    /// Image(sourceName: "chevron.left")
    /// ```
    init(sourceName name: String) {
        self.init(name, bundle: Bundle.module)
    }
}
