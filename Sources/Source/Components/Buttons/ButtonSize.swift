
import Foundation

public enum ButtonSize {
    case xsmall, small, medium
}

extension ButtonSize {
    var buttonPadding: CGFloat {
        switch self {
            case .xsmall:
                6
            case .small:
                10
            case .medium:
                14
        }
    }
}
