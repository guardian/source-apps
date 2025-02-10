package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.HeadphonesOutlined: ImageVector
    get() {
        if (_HeadphonesOutlined != null) {
            return _HeadphonesOutlined!!
        }
        _HeadphonesOutlined = ImageVector.Builder(
            name = "HeadphonesOutlined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(20.8f, 11.255f)
                curveTo(20.8f, 6.423f, 16.88f, 2.502f, 12.043f, 2.502f)
                curveTo(7.206f, 2.502f, 3.29f, 6.423f, 3.29f, 11.255f)
                curveTo(3.29f, 12.327f, 3.485f, 13.351f, 3.836f, 14.303f)
                curveTo(3.517f, 14.897f, 3.334f, 15.578f, 3.334f, 16.299f)
                verticalLineTo(16.59f)
                curveTo(3.334f, 18.925f, 5.234f, 20.825f, 7.569f, 20.825f)
                horizontalLineTo(8.171f)
                lineTo(9.394f, 19.602f)
                lineTo(9.629f, 19.367f)
                verticalLineTo(13.522f)
                lineTo(8.171f, 12.064f)
                horizontalLineTo(7.569f)
                curveTo(6.585f, 12.064f, 5.68f, 12.403f, 4.959f, 12.969f)
                curveTo(4.828f, 12.419f, 4.748f, 11.845f, 4.748f, 11.255f)
                curveTo(4.748f, 7.235f, 8.023f, 3.96f, 12.043f, 3.96f)
                curveTo(16.063f, 3.96f, 19.338f, 7.235f, 19.338f, 11.255f)
                curveTo(19.338f, 11.841f, 19.262f, 12.407f, 19.131f, 12.949f)
                curveTo(18.414f, 12.395f, 17.521f, 12.06f, 16.545f, 12.06f)
                horizontalLineTo(15.943f)
                lineTo(14.485f, 13.518f)
                verticalLineTo(19.363f)
                lineTo(14.712f, 19.59f)
                lineTo(15.943f, 20.821f)
                horizontalLineTo(16.545f)
                curveTo(18.88f, 20.821f, 20.78f, 18.921f, 20.78f, 16.586f)
                verticalLineTo(16.295f)
                curveTo(20.78f, 15.562f, 20.593f, 14.873f, 20.262f, 14.271f)
                curveTo(20.609f, 13.331f, 20.796f, 12.315f, 20.796f, 11.255f)
                horizontalLineTo(20.8f)
                close()
                moveTo(5.497f, 14.455f)
                curveTo(6.007f, 13.885f, 6.744f, 13.522f, 7.569f, 13.522f)
                horizontalLineTo(8.171f)
                verticalLineTo(19.367f)
                horizontalLineTo(7.569f)
                curveTo(6.035f, 19.367f, 4.792f, 18.124f, 4.792f, 16.59f)
                verticalLineTo(16.299f)
                curveTo(4.792f, 16.255f, 4.796f, 16.215f, 4.8f, 16.172f)
                curveTo(4.828f, 15.514f, 5.087f, 14.917f, 5.497f, 14.455f)
                close()
                moveTo(19.326f, 16.295f)
                verticalLineTo(16.586f)
                curveTo(19.326f, 18.12f, 18.083f, 19.363f, 16.549f, 19.363f)
                horizontalLineTo(15.947f)
                verticalLineTo(13.518f)
                horizontalLineTo(16.549f)
                curveTo(17.366f, 13.518f, 18.095f, 13.873f, 18.601f, 14.431f)
                curveTo(19.015f, 14.885f, 19.278f, 15.474f, 19.314f, 16.128f)
                curveTo(19.314f, 16.184f, 19.322f, 16.235f, 19.322f, 16.291f)
                lineTo(19.326f, 16.295f)
                close()
            }
        }.build()

        return _HeadphonesOutlined!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesOutlined: ImageVector? = null