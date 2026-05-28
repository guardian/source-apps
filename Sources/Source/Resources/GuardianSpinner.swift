//

import SwiftUI

struct GuardianSpinner: View {
    var size: CGFloat = 22
    var theme: ButtonTheme = .brand
    var priority: ButtonPriority = .primary
    var lineWidth: CGFloat = 4
    var duration: Double = 2.75

    var body: some View {
        TimelineView(.animation) { timeline in
            Canvas { context, canvasSize in
                let center = CGPoint(x: canvasSize.width / 2, y: canvasSize.height / 2)
                let radius = min(canvasSize.width, canvasSize.height) / 2 - lineWidth / 2

                let date = timeline.date.timeIntervalSinceReferenceDate
                let cycleTime = date.truncatingRemainder(dividingBy: duration)
                let cycleProgress = cycleTime / duration

                // Simulate strokeStart and strokeEnd (0 to 1)
                let strokeStart: Double
                let strokeEnd: Double
                
                if cycleProgress < 0.5 {
                    // First half: arc grows to full circle
                    let t = cycleProgress * 2
                    strokeStart = 0
                    strokeEnd = t
                } else {
                    // Second half: arc shrinks
                    let t = (cycleProgress - 0.5) * 2
                    strokeStart = t
                    strokeEnd = 1
                }
                
                // Add rotation
                let rotation = cycleProgress * 360
                
                // Convert stroke values to angles
                let startAngle = -90 + rotation + (strokeStart * 360)
                let endAngle = -90 + rotation + (strokeEnd * 360)

                // Background circle with secondary color at 0.1 opacity
                let backgroundPath = Path { path in
                    path.addArc(
                        center: center,
                        radius: radius,
                        startAngle: .degrees(0),
                        endAngle: .degrees(360),
                        clockwise: false
                    )
                }

                context.stroke(
                    backgroundPath,
                    with: .color(foregroundColor(for: priority).opacity(0.1)),
                    lineWidth: lineWidth
                )

                // Rotating arc segment
                if endAngle > startAngle {
                    let chasingPath = Path { path in
                        path.addArc(
                            center: center,
                            radius: radius,
                            startAngle: .degrees(startAngle),
                            endAngle: .degrees(endAngle),
                            clockwise: false
                        )
                    }

                    context.stroke(
                        chasingPath,
                        with: .color(foregroundColor(for: priority)),
                        lineWidth: lineWidth
                    )
                }
            }
        }
        .frame(width: size, height: size)
    }
    
    private func foregroundColor(for priority: ButtonPriority) -> Color {
        switch priority {
        case .primary:
            return Color(theme.foregroundColorPrimary)
        case .secondary:
            return Color(theme.foregroundColorSecondary)
        case .tertiary:
            return Color(theme.foregroundColorTertiary)
        case .subdued:
            return Color(theme.foregroundColorSubdued)
        }
    }
}

#Preview {
    GuardianSpinner(size: 48, theme: .brand, lineWidth: 8)
        .frame(maxWidth: .infinity, maxHeight: .infinity)
}
