package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HeadphonesRoundFilled: ImageVector
    get() {
        if (_HeadphonesRoundFilled != null) {
            return _HeadphonesRoundFilled!!
        }
        _HeadphonesRoundFilled = ImageVector.Builder(
            name = "HeadphonesRoundFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(17.55f, 11.53f)
                curveTo(17.55f, 12.2f, 17.43f, 12.84f, 17.21f, 13.43f)
                curveTo(17.42f, 13.81f, 17.54f, 14.25f, 17.54f, 14.71f)
                verticalLineTo(14.89f)
                curveTo(17.54f, 16.36f, 16.34f, 17.56f, 14.87f, 17.56f)
                horizontalLineTo(14.49f)
                lineTo(13.71f, 16.78f)
                lineTo(13.57f, 16.64f)
                verticalLineTo(12.95f)
                lineTo(14.49f, 12.03f)
                horizontalLineTo(14.87f)
                curveTo(15.49f, 12.03f, 16.05f, 12.24f, 16.5f, 12.59f)
                curveTo(16.58f, 12.25f, 16.63f, 11.89f, 16.63f, 11.52f)
                curveTo(16.63f, 8.98f, 14.56f, 6.91f, 12.02f, 6.91f)
                curveTo(9.48f, 6.91f, 7.41f, 8.98f, 7.41f, 11.52f)
                curveTo(7.41f, 11.89f, 7.46f, 12.25f, 7.54f, 12.6f)
                curveTo(8f, 12.24f, 8.57f, 12.03f, 9.19f, 12.03f)
                horizontalLineTo(9.57f)
                lineTo(10.49f, 12.95f)
                verticalLineTo(16.64f)
                lineTo(10.34f, 16.79f)
                lineTo(9.57f, 17.56f)
                horizontalLineTo(9.19f)
                curveTo(7.72f, 17.56f, 6.52f, 16.36f, 6.52f, 14.89f)
                verticalLineTo(14.71f)
                curveTo(6.52f, 14.25f, 6.64f, 13.82f, 6.84f, 13.45f)
                curveTo(6.62f, 12.85f, 6.5f, 12.2f, 6.5f, 11.53f)
                curveTo(6.5f, 8.48f, 8.97f, 6f, 12.03f, 6f)
                curveTo(15.09f, 6f, 17.56f, 8.48f, 17.56f, 11.53f)
                horizontalLineTo(17.55f)
                close()
            }
        }.build()

        return _HeadphonesRoundFilled!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesRoundFilled: ImageVector? = null