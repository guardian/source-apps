package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Pinned: ImageVector
    get() {
        if (_Pinned != null) {
            return _Pinned!!
        }
        _Pinned = ImageVector.Builder(
            name = "Pinned",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(18.323f, 13.99f)
                curveTo(17.586f, 12.452f, 16.3f, 11.209f, 14.72f, 10.535f)
                lineTo(14.13f, 3.665f)
                curveTo(15.184f, 3.328f, 16.111f, 2.759f, 16.89f, 2f)
                horizontalLineTo(14.003f)
                horizontalLineTo(10f)
                horizontalLineTo(7.113f)
                curveTo(7.871f, 2.759f, 8.82f, 3.328f, 9.873f, 3.665f)
                lineTo(9.304f, 10.535f)
                curveTo(7.703f, 11.209f, 6.417f, 12.452f, 5.68f, 13.99f)
                horizontalLineTo(9.009f)
                horizontalLineTo(11.011f)
                verticalLineTo(19.996f)
                lineTo(12.002f, 24f)
                lineTo(12.992f, 19.996f)
                verticalLineTo(13.99f)
                horizontalLineTo(14.994f)
                horizontalLineTo(18.323f)
                close()
            }
        }.build()

        return _Pinned!!
    }

@Suppress("ObjectPropertyName")
private var _Pinned: ImageVector? = null