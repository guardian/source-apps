package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.NotificationsOnRound: ImageVector
    get() {
        if (_NotificationsOnRound != null) {
            return _NotificationsOnRound!!
        }
        _NotificationsOnRound = ImageVector.Builder(
            name = "NotificationsOnRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(8.053f, 15.526f)
                curveTo(7.303f, 14.542f, 6.836f, 13.325f, 6.836f, 11.997f)
                curveTo(6.836f, 10.669f, 7.303f, 9.452f, 8.053f, 8.468f)
                lineTo(7.795f, 8.21f)
                curveTo(6.701f, 9.108f, 6f, 10.46f, 6f, 11.997f)
                curveTo(6f, 13.534f, 6.701f, 14.886f, 7.795f, 15.784f)
                lineTo(8.053f, 15.526f)
                close()
                moveTo(15.922f, 8.468f)
                curveTo(16.709f, 9.452f, 17.139f, 10.669f, 17.139f, 11.997f)
                curveTo(17.139f, 13.325f, 16.709f, 14.542f, 15.922f, 15.526f)
                lineTo(16.205f, 15.784f)
                curveTo(17.299f, 14.886f, 18f, 13.534f, 18f, 11.997f)
                curveTo(18f, 10.46f, 17.299f, 9.108f, 16.205f, 8.21f)
                lineTo(15.922f, 8.468f)
                close()
                moveTo(9.234f, 14.063f)
                curveTo(8.828f, 13.485f, 8.594f, 12.784f, 8.594f, 11.997f)
                curveTo(8.594f, 11.21f, 8.828f, 10.509f, 9.234f, 9.919f)
                lineTo(8.902f, 9.612f)
                curveTo(8.275f, 10.202f, 7.918f, 11.063f, 7.918f, 11.997f)
                curveTo(7.918f, 12.931f, 8.275f, 13.755f, 8.902f, 14.382f)
                lineTo(9.234f, 14.063f)
                close()
                moveTo(14.779f, 9.919f)
                curveTo(15.172f, 10.509f, 15.406f, 11.21f, 15.406f, 11.997f)
                curveTo(15.406f, 12.784f, 15.172f, 13.485f, 14.779f, 14.063f)
                lineTo(15.086f, 14.382f)
                curveTo(15.713f, 13.755f, 16.082f, 12.931f, 16.082f, 11.997f)
                curveTo(16.082f, 11.063f, 15.713f, 10.202f, 15.086f, 9.612f)
                lineTo(14.779f, 9.919f)
                close()
                moveTo(12f, 10.03f)
                curveTo(13.094f, 10.03f, 13.967f, 10.903f, 13.967f, 11.997f)
                curveTo(13.967f, 13.091f, 13.094f, 13.964f, 12f, 13.964f)
                curveTo(10.906f, 13.964f, 10.033f, 13.091f, 10.033f, 11.997f)
                curveTo(10.033f, 10.903f, 10.906f, 10.03f, 12f, 10.03f)
                close()
            }
        }.build()

        return _NotificationsOnRound!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationsOnRound: ImageVector? = null