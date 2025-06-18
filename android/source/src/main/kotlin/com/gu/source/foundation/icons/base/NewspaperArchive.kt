package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.NewspaperArchive: ImageVector
    get() {
        if (_NewspaperArchive != null) {
            return _NewspaperArchive!!
        }
        _NewspaperArchive = ImageVector.Builder(
            name = "NewspaperArchive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.423f, 4f)
                lineTo(3.944f, 5.479f)
                lineTo(4.153f, 6.878f)
                horizontalLineTo(3.498f)
                lineTo(2f, 8.377f)
                lineTo(4.034f, 18.731f)
                lineTo(5.948f, 20.01f)
                horizontalLineTo(17.972f)
                lineTo(19.887f, 18.731f)
                lineTo(22f, 8.377f)
                lineTo(20.502f, 6.878f)
                horizontalLineTo(19.867f)
                lineTo(20.056f, 5.469f)
                lineTo(18.577f, 4f)
                lineTo(5.423f, 4f)
                close()
                moveTo(19.847f, 8.477f)
                lineTo(20.274f, 8.897f)
                lineTo(18.468f, 17.751f)
                lineTo(17.496f, 18.401f)
                horizontalLineTo(6.425f)
                lineTo(5.462f, 17.761f)
                lineTo(3.726f, 8.907f)
                lineTo(4.153f, 8.477f)
                horizontalLineTo(19.847f)
                close()
                moveTo(18.26f, 6.878f)
                lineTo(18.369f, 6.049f)
                lineTo(17.923f, 5.599f)
                horizontalLineTo(6.077f)
                lineTo(5.631f, 6.039f)
                lineTo(5.75f, 6.878f)
                horizontalLineTo(18.26f)
                close()
                moveTo(7.506f, 10.246f)
                lineTo(7.804f, 11.845f)
                horizontalLineTo(16.127f)
                lineTo(16.425f, 10.246f)
                horizontalLineTo(7.506f)
                close()
                moveTo(8.468f, 13.274f)
                lineTo(8.766f, 14.873f)
                horizontalLineTo(15.165f)
                lineTo(15.462f, 13.274f)
                horizontalLineTo(8.468f)
                close()
            }
        }.build()

        return _NewspaperArchive!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperArchive: ImageVector? = null