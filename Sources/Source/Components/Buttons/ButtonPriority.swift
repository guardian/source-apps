//

import Foundation

/// Use priority to inform users of how important an action is.
public enum ButtonPriority: CaseIterable {
    
    /// Use as the main call to action on a page. The fewer you use, the stronger they look.
    case primary

    /// Use for actions that need to be clear, but aren’t the primary focus of a page.
    case secondary

    /// Use for less prominent actions. It can be used in isolation or paired with a primary button.
    case tertiary

    /// Use only in a group with a primary button for low priority actions.
    case subdued
    
    /// Use for text-only buttons without borders, similar to tertiary but with a pressed state styling.
    case textButton
}
