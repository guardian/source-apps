package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HeadphonesFilled: ImageVector
    get() {
        if (_HeadphonesFilled != null) {
            return _HeadphonesFilled!!
        }
        _HeadphonesFilled = ImageVector.Builder(
            name = "HeadphonesFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(20.8f, 11.253f)
                curveTo(20.8f, 6.42f, 16.88f, 2.5f, 12.043f, 2.5f)
                curveTo(7.206f, 2.5f, 3.29f, 6.42f, 3.29f, 11.253f)
                curveTo(3.29f, 12.325f, 3.485f, 13.349f, 3.836f, 14.301f)
                curveTo(3.517f, 14.894f, 3.334f, 15.576f, 3.334f, 16.297f)
                verticalLineTo(16.588f)
                curveTo(3.334f, 18.922f, 5.234f, 20.823f, 7.569f, 20.823f)
                horizontalLineTo(8.171f)
                lineTo(9.394f, 19.6f)
                lineTo(9.629f, 19.365f)
                verticalLineTo(13.52f)
                lineTo(8.171f, 12.062f)
                horizontalLineTo(7.569f)
                curveTo(6.585f, 12.062f, 5.68f, 12.4f, 4.959f, 12.966f)
                curveTo(4.828f, 12.416f, 4.748f, 11.843f, 4.748f, 11.253f)
                curveTo(4.748f, 7.233f, 8.023f, 3.958f, 12.043f, 3.958f)
                curveTo(16.063f, 3.958f, 19.338f, 7.233f, 19.338f, 11.253f)
                curveTo(19.338f, 11.839f, 19.262f, 12.404f, 19.131f, 12.946f)
                curveTo(18.414f, 12.392f, 17.521f, 12.058f, 16.545f, 12.058f)
                horizontalLineTo(15.943f)
                lineTo(14.485f, 13.516f)
                verticalLineTo(19.361f)
                lineTo(14.712f, 19.588f)
                lineTo(15.943f, 20.819f)
                horizontalLineTo(16.545f)
                curveTo(18.88f, 20.819f, 20.78f, 18.918f, 20.78f, 16.584f)
                verticalLineTo(16.293f)
                curveTo(20.78f, 15.56f, 20.593f, 14.87f, 20.262f, 14.269f)
                curveTo(20.609f, 13.329f, 20.796f, 12.313f, 20.796f, 11.253f)
                horizontalLineTo(20.8f)
                close()
            }
        }.build()

        return _HeadphonesFilled!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesFilled: ImageVector? = null