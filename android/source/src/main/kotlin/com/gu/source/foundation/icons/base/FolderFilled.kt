package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.FolderFilled: ImageVector
    get() {
        if (_FolderFilled != null) {
            return _FolderFilled!!
        }
        _FolderFilled = ImageVector.Builder(
            name = "FolderFilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd,
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
            }
        }.build()

        return _FolderFilled!!
    }

@Suppress("ObjectPropertyName")
private var _FolderFilled: ImageVector? = null