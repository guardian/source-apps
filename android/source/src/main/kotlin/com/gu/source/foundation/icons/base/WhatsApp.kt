package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.WhatsApp: ImageVector
    get() {
        if (_WhatsApp != null) {
            return _WhatsApp!!
        }
        _WhatsApp = ImageVector.Builder(
            name = "WhatsApp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(19.09f, 4.52f)
                curveTo(17.21f, 2.64f, 14.71f, 1.6f, 12.04f, 1.6f)
                curveTo(6.55f, 1.6f, 2.08f, 6.07f, 2.08f, 11.56f)
                curveTo(2.08f, 13.31f, 2.54f, 15.03f, 3.41f, 16.54f)
                lineTo(2f, 21.69f)
                lineTo(7.28f, 20.31f)
                curveTo(8.73f, 21.1f, 10.37f, 21.52f, 12.04f, 21.52f)
                curveTo(17.53f, 21.52f, 22f, 17.05f, 22f, 11.56f)
                curveTo(22f, 8.91f, 20.97f, 6.41f, 19.09f, 4.52f)
                close()
                moveTo(12.04f, 19.84f)
                curveTo(10.55f, 19.84f, 9.09f, 19.44f, 7.82f, 18.69f)
                lineTo(7.52f, 18.51f)
                lineTo(4.39f, 19.33f)
                lineTo(5.23f, 16.28f)
                lineTo(5.03f, 15.97f)
                curveTo(4.2f, 14.65f, 3.76f, 13.12f, 3.77f, 11.56f)
                curveTo(3.77f, 7f, 7.48f, 3.29f, 12.05f, 3.29f)
                curveTo(14.26f, 3.29f, 16.34f, 4.15f, 17.9f, 5.72f)
                curveTo(19.46f, 7.28f, 20.32f, 9.36f, 20.32f, 11.57f)
                curveTo(20.32f, 16.13f, 16.6f, 19.84f, 12.04f, 19.84f)
                close()
                moveTo(16.58f, 13.64f)
                curveTo(16.33f, 13.52f, 15.11f, 12.91f, 14.88f, 12.83f)
                curveTo(14.65f, 12.75f, 14.49f, 12.71f, 14.32f, 12.95f)
                curveTo(14.15f, 13.2f, 13.68f, 13.76f, 13.53f, 13.92f)
                curveTo(13.39f, 14.09f, 13.24f, 14.11f, 12.99f, 13.98f)
                curveTo(12.74f, 13.86f, 11.94f, 13.59f, 10.99f, 12.75f)
                curveTo(10.25f, 12.09f, 9.75f, 11.28f, 9.61f, 11.03f)
                curveTo(9.46f, 10.78f, 9.59f, 10.65f, 9.72f, 10.52f)
                curveTo(9.83f, 10.41f, 9.97f, 10.23f, 10.09f, 10.08f)
                curveTo(10.21f, 9.93f, 10.26f, 9.83f, 10.34f, 9.66f)
                curveTo(10.42f, 9.49f, 10.38f, 9.35f, 10.32f, 9.22f)
                curveTo(10.26f, 9.1f, 9.76f, 7.87f, 9.55f, 7.37f)
                curveTo(9.35f, 6.88f, 9.14f, 6.95f, 8.99f, 6.94f)
                curveTo(8.85f, 6.93f, 8.68f, 6.93f, 8.51f, 6.93f)
                curveTo(8.34f, 6.93f, 8.07f, 6.99f, 7.85f, 7.24f)
                curveTo(7.63f, 7.49f, 6.98f, 8.09f, 6.98f, 9.32f)
                curveTo(6.98f, 10.54f, 7.87f, 11.73f, 8f, 11.89f)
                curveTo(8.12f, 12.06f, 9.75f, 14.57f, 12.25f, 15.65f)
                curveTo(12.84f, 15.91f, 13.31f, 16.06f, 13.67f, 16.17f)
                curveTo(14.27f, 16.36f, 14.81f, 16.33f, 15.24f, 16.27f)
                curveTo(15.72f, 16.2f, 16.71f, 15.67f, 16.92f, 15.09f)
                curveTo(17.13f, 14.51f, 17.13f, 14.01f, 17.06f, 13.91f)
                curveTo(17f, 13.83f, 16.83f, 13.77f, 16.58f, 13.64f)
                close()
            }
        }.build()

        return _WhatsApp!!
    }

@Suppress("ObjectPropertyName")
private var _WhatsApp: ImageVector? = null