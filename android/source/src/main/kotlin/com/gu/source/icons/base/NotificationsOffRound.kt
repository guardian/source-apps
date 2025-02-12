package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.NotificationsOffRound: ImageVector
    get() {
        if (_NotificationsOffRound != null) {
            return _NotificationsOffRound!!
        }
        _NotificationsOffRound = ImageVector.Builder(
            name = "NotificationsOffRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 21.167f)
                curveTo(17.063f, 21.167f, 21.167f, 17.063f, 21.167f, 12f)
                curveTo(21.167f, 6.937f, 17.063f, 2.833f, 12f, 2.833f)
                curveTo(6.937f, 2.833f, 2.833f, 6.937f, 2.833f, 12f)
                curveTo(2.833f, 17.063f, 6.937f, 21.167f, 12f, 21.167f)
                close()
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(6.836f, 11.995f)
                curveTo(6.836f, 13.323f, 7.303f, 14.54f, 8.053f, 15.524f)
                lineTo(7.795f, 15.782f)
                curveTo(6.701f, 14.885f, 6f, 13.532f, 6f, 11.995f)
                curveTo(6f, 10.458f, 6.701f, 9.106f, 7.795f, 8.208f)
                lineTo(8.053f, 8.467f)
                curveTo(7.303f, 9.45f, 6.836f, 10.667f, 6.836f, 11.995f)
                close()
                moveTo(17.139f, 11.995f)
                curveTo(17.139f, 10.667f, 16.709f, 9.45f, 15.922f, 8.467f)
                lineTo(16.205f, 8.208f)
                curveTo(17.299f, 9.106f, 18f, 10.458f, 18f, 11.995f)
                curveTo(18f, 13.532f, 17.299f, 14.885f, 16.205f, 15.782f)
                lineTo(15.922f, 15.524f)
                curveTo(16.709f, 14.54f, 17.139f, 13.323f, 17.139f, 11.995f)
                close()
                moveTo(8.594f, 11.995f)
                curveTo(8.594f, 12.782f, 8.828f, 13.483f, 9.234f, 14.061f)
                lineTo(8.902f, 14.38f)
                curveTo(8.275f, 13.753f, 7.918f, 12.93f, 7.918f, 11.995f)
                curveTo(7.918f, 11.061f, 8.275f, 10.2f, 8.902f, 9.61f)
                lineTo(9.234f, 9.917f)
                curveTo(8.828f, 10.508f, 8.594f, 11.208f, 8.594f, 11.995f)
                close()
                moveTo(15.406f, 11.995f)
                curveTo(15.406f, 11.208f, 15.172f, 10.508f, 14.779f, 9.917f)
                lineTo(15.086f, 9.61f)
                curveTo(15.713f, 10.2f, 16.082f, 11.061f, 16.082f, 11.995f)
                curveTo(16.082f, 12.93f, 15.713f, 13.753f, 15.086f, 14.38f)
                lineTo(14.779f, 14.061f)
                curveTo(15.172f, 13.483f, 15.406f, 12.782f, 15.406f, 11.995f)
                close()
                moveTo(13.967f, 11.995f)
                curveTo(13.967f, 13.09f, 13.094f, 13.962f, 12f, 13.962f)
                curveTo(10.906f, 13.962f, 10.033f, 13.09f, 10.033f, 11.995f)
                curveTo(10.033f, 10.901f, 10.906f, 10.028f, 12f, 10.028f)
                curveTo(13.094f, 10.028f, 13.967f, 10.901f, 13.967f, 11.995f)
                close()
                moveTo(13.23f, 11.995f)
                curveTo(13.23f, 11.319f, 12.664f, 10.766f, 12f, 10.766f)
                curveTo(11.299f, 10.766f, 10.771f, 11.319f, 10.771f, 11.995f)
                curveTo(10.771f, 12.672f, 11.299f, 13.225f, 12f, 13.225f)
                curveTo(12.664f, 13.225f, 13.23f, 12.672f, 13.23f, 11.995f)
                close()
            }
        }.build()

        return _NotificationsOffRound!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationsOffRound: ImageVector? = null