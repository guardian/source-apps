//

import Foundation

public enum ButtonSize {
    case xsmall, small, medium
}

extension ButtonSize {
    var fontSize: CGFloat {
        switch self {
        case .medium: 17
        case .small: 17
        case .xsmall: 14
        }
    }

    var verticalPad: CGFloat {
        switch self {
        case .medium: 16
        case .small: 12
        case .xsmall: 6
        }
    }

    var horizontalPad: CGFloat {
        switch self {
        case .medium: 20
        case .small: 16
        case .xsmall: 12
        }
    }
}
