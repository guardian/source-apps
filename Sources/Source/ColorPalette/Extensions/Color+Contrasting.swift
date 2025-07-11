//

import SwiftUI

public extension Color {
    var contrastingColor: Color {
        let uiColor = PlatformColor(self)

        var red: CGFloat = 0
        var green: CGFloat = 0
        var blue: CGFloat = 0
        var alpha: CGFloat = 0

        uiColor.getRed(&red, green: &green, blue: &blue, alpha: &alpha)

        // Calculate the brightness based on the relative luminance of each color
        let brightness = (red * 0.299 + green * 0.587 + blue * 0.114) / 1

        return brightness > 0.5 ? Color.black : Color.white
    }
}
