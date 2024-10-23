
import Foundation

public enum ButtonSize {
    case xsmall, small, medium
}

extension ButtonSize {
    var iconSize: CGFloat {
        switch self {
            case .xsmall:
                return 20
            case .small:
                return 24
            case .medium:
                return 28
        }
    }

    var padding: CGFloat {
        switch self {
            case .xsmall:
                return 4
            case .small:
                return 6
            case .medium:
                return 8
        }
    }
}
