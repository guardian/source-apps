//

import Foundation

public enum CornerPlacement {
    case topLeading, bottomLeading, bottomTrailing, topTrailing

    var topLeadingRadius: CGFloat {
        switch self {
        case .topLeading:
            4
        case .bottomLeading:
            0
        case .bottomTrailing:
            4
        case .topTrailing:
            0
        }
    }

    var bottomLeadingRadius: CGFloat {
        switch self {
        case .topLeading:
            0
        case .bottomLeading:
            4
        case .bottomTrailing:
            0
        case .topTrailing:
            4
        }
    }


    var bottomTrailingRadius: CGFloat {
        switch self {
        case .topLeading:
            4
        case .bottomLeading:
            0
        case .bottomTrailing:
            4
        case .topTrailing:
            0
        }
    }

    var topTrailingRadius: CGFloat {
        switch self {
        case .topLeading:
            0
        case .bottomLeading:
            4
        case .bottomTrailing:
            0
        case .topTrailing:
            4
        }
    }
}
