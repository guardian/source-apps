public enum ComponentSize: Comparable {
    case xsmall, small, medium, large, xlarge

    public var description: String {
        switch self {
        case .xsmall: return "Extra Small"
        case .small: return "Small"
        case .medium: return "Medium"
        case .large: return "Large"
        case .xlarge: return "Extra Large"
        }
    }
}
