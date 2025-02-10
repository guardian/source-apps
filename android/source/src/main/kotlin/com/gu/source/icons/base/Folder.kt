package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Folder: ImageVector
    get() {
        if (_Folder != null) {
            return _Folder!!
        }
        _Folder = ImageVector.Builder(
            name = "Folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.688f, 5.375f)
                lineTo(4.5f, 4.563f)
                horizontalLineTo(10.399f)
                lineTo(12.649f, 6.813f)
                horizontalLineTo(19.5f)
                lineTo(20.313f, 7.625f)
                verticalLineTo(18.75f)
                lineTo(19.5f, 19.563f)
                horizontalLineTo(4.5f)
                lineTo(3.688f, 18.75f)
                verticalLineTo(5.375f)
                close()
                moveTo(5.313f, 6.188f)
                verticalLineTo(17.938f)
                horizontalLineTo(18.688f)
                verticalLineTo(8.438f)
                horizontalLineTo(11.976f)
                lineTo(9.726f, 6.188f)
                horizontalLineTo(5.313f)
                close()
            }
        }.build()

        return _Folder!!
    }

@Suppress("ObjectPropertyName")
private var _Folder: ImageVector? = null