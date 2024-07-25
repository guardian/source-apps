//
#if os(iOS)
import UIKit

public extension UIColor {
    class func dynamicColor(light: UIColor, dark: UIColor) -> UIColor {
         UIColor {
            switch $0.userInterfaceStyle {
            case .dark:
               return dark
            default:
               return light
            }
         }
      }

    // swiftlint: disable color_named_reference
    class func colorFromBundle(named: String) -> UIColor? {
        UIColor(named: named,
                in: .module,
                compatibleWith: .none)
    }
    // swiftlint: enable color_named_reference
}
#endif
