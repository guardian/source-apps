
import Foundation

public enum ButtonSize {
    // check with luke - maybe large dims should actually be medium, and no xsmall? or xxsmall? 
    case xsmall, small, medium, large
}

extension ButtonSize {
    var fontSize: CGFloat {
        switch self {
        case .large: 17
        case .medium: 17
        case .small: 17
        case .xsmall: 14
        }
    }

    var verticalPad: CGFloat {
        switch self {
        case .large: 16
        case .medium: 12
        case .small: 8
        case .xsmall: 6
        }
    }

    var horizontalPad: CGFloat {
        switch self {
        case .large: 20
        case .medium: 16
        case .small: 12
        case .xsmall: 12
        }
    }
}
