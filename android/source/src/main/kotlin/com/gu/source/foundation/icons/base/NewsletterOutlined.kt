package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.NewsletterOutlined: ImageVector
    get() {
        if (_NewsletterOutlined != null) {
            return _NewsletterOutlined!!
        }
        _NewsletterOutlined = ImageVector.Builder(
            name = "NewsletterOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.48f, 2f)
                horizontalLineTo(17.49f)
                lineTo(18.2f, 2.71f)
                verticalLineTo(7.68f)
                horizontalLineTo(20.57f)
                lineTo(22.01f, 9.28f)
                lineTo(22f, 9.289f)
                verticalLineTo(12.43f)
                lineTo(21.98f, 19.91f)
                verticalLineTo(20.57f)
                lineTo(21.52f, 21.04f)
                lineTo(21.04f, 21.53f)
                lineTo(20.57f, 22f)
                horizontalLineTo(19.91f)
                lineTo(4.12f, 22.02f)
                horizontalLineTo(3.46f)
                lineTo(2.99f, 21.56f)
                lineTo(2.47f, 21.05f)
                lineTo(2f, 20.58f)
                verticalLineTo(9.29f)
                verticalLineTo(9.28f)
                lineTo(2.007f, 9.283f)
                lineTo(3.42f, 7.68f)
                horizontalLineTo(5.78f)
                verticalLineTo(2.71f)
                lineTo(6.48f, 2f)
                close()
                moveTo(5.78f, 9.28f)
                horizontalLineTo(4.14f)
                lineTo(3.6f, 9.889f)
                verticalLineTo(11.28f)
                lineTo(5.78f, 12.665f)
                verticalLineTo(9.28f)
                close()
                moveTo(7.08f, 13.491f)
                lineTo(11.69f, 16.42f)
                horizontalLineTo(12.23f)
                lineTo(16.9f, 13.47f)
                verticalLineTo(3.3f)
                horizontalLineTo(7.08f)
                verticalLineTo(13.491f)
                close()
                moveTo(18.2f, 12.649f)
                lineTo(20.4f, 11.26f)
                verticalLineTo(9.876f)
                lineTo(19.86f, 9.28f)
                horizontalLineTo(18.2f)
                verticalLineTo(12.649f)
                close()
                moveTo(15.43f, 5.04f)
                horizontalLineTo(8.56f)
                verticalLineTo(6.04f)
                horizontalLineTo(15.43f)
                verticalLineTo(5.04f)
                close()
                moveTo(20.41f, 12.44f)
                verticalLineTo(19.92f)
                lineTo(19.91f, 20.41f)
                lineTo(4.12f, 20.43f)
                lineTo(3.6f, 19.92f)
                verticalLineTo(12.45f)
                lineTo(11.17f, 18.04f)
                horizontalLineTo(12.76f)
                lineTo(20.4f, 12.44f)
                horizontalLineTo(20.41f)
                close()
                moveTo(8.56f, 10.32f)
                horizontalLineTo(15.43f)
                verticalLineTo(11.32f)
                horizontalLineTo(8.56f)
                verticalLineTo(10.32f)
                close()
                moveTo(15.43f, 7.68f)
                horizontalLineTo(8.56f)
                verticalLineTo(8.68f)
                horizontalLineTo(15.43f)
                verticalLineTo(7.68f)
                close()
            }
        }.build()

        return _NewsletterOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _NewsletterOutlined: ImageVector? = null