package com.gu.source.foundation.icons.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.AllRecipes: ImageVector
    get() {
        if (_AllRecipes != null) {
            return _AllRecipes!!
        }
        _AllRecipes = ImageVector.Builder(
            name = "AllRecipes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(6.125f, 12.25f)
                horizontalLineTo(13.875f)
                verticalLineTo(13.875f)
                horizontalLineTo(6.125f)
                verticalLineTo(12.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(12.25f, 14.875f)
                horizontalLineTo(6.125f)
                verticalLineTo(16.5f)
                horizontalLineTo(12.25f)
                verticalLineTo(14.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.375f, 3.627f)
                lineTo(3.5f, 4.502f)
                verticalLineTo(19.5f)
                lineTo(4.375f, 20.375f)
                horizontalLineTo(16.125f)
                lineTo(17f, 19.5f)
                verticalLineTo(4.502f)
                lineTo(16.125f, 3.627f)
                horizontalLineTo(4.375f)
                close()
                moveTo(5.125f, 9.5f)
                verticalLineTo(5.252f)
                horizontalLineTo(15.375f)
                verticalLineTo(9.5f)
                horizontalLineTo(5.125f)
                close()
                moveTo(5.125f, 11.125f)
                verticalLineTo(18.75f)
                horizontalLineTo(15.375f)
                verticalLineTo(11.125f)
                horizontalLineTo(5.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(18.762f, 5.5f)
                horizontalLineTo(17.75f)
                lineTo(17.75f, 18.5f)
                lineTo(18.627f, 18.49f)
                lineTo(19.375f, 17.74f)
                lineTo(19.375f, 6.127f)
                lineTo(18.762f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF052962))) {
                moveTo(21.012f, 7.492f)
                horizontalLineTo(20f)
                verticalLineTo(16.578f)
                lineTo(20.877f, 16.568f)
                lineTo(21.625f, 15.818f)
                verticalLineTo(8.119f)
                lineTo(21.012f, 7.492f)
                close()
            }
        }.build()

        return _AllRecipes!!
    }

@Suppress("ObjectPropertyName")
private var _AllRecipes: ImageVector? = null