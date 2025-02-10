package com.gu.source.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.Edit: ImageVector
    get() {
        if (_Edit != null) {
            return _Edit!!
        }
        _Edit = ImageVector.Builder(
            name = "Edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1F2F60)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.317f, 4.945f)
                lineTo(15.252f, 6.008f)
                lineTo(17.991f, 8.747f)
                lineTo(19.055f, 7.683f)
                verticalLineTo(6.96f)
                lineTo(17.04f, 4.945f)
                horizontalLineTo(16.317f)
                close()
                moveTo(3.723f, 15.238f)
                lineTo(12.952f, 6.008f)
                lineTo(12.947f, 6.003f)
                lineTo(14.097f, 4.853f)
                lineTo(14.102f, 4.858f)
                lineTo(15.96f, 3f)
                horizontalLineTo(16.673f)
                horizontalLineTo(16.683f)
                horizontalLineTo(17.396f)
                lineTo(21f, 6.604f)
                verticalLineTo(8.04f)
                lineTo(9.74f, 19.3f)
                lineTo(9.74f, 19.3f)
                lineTo(8.762f, 20.277f)
                lineTo(3.723f, 21f)
                lineTo(3f, 20.277f)
                lineTo(3.723f, 15.238f)
                lineTo(3.723f, 15.238f)
                close()
                moveTo(8.584f, 18.144f)
                lineTo(5.846f, 15.406f)
                lineTo(14.101f, 7.158f)
                lineTo(16.84f, 9.897f)
                lineTo(8.584f, 18.144f)
                close()
            }
        }.build()

        return _Edit!!
    }

@Suppress("ObjectPropertyName")
private var _Edit: ImageVector? = null