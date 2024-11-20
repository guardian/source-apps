//

import SwiftUI

public extension Image {
    init(sourceName name: String) {
        self.init(name, bundle: Bundle.module)
    }
}
