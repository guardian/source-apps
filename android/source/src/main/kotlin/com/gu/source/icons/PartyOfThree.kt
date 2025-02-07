package com.gu.source.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.gu.source.Source

val Source.Icons.Base.PartyOfThree: ImageVector
    get() {
        if (_PartyOfThree != null) {
            return _PartyOfThree!!
        }
        _PartyOfThree = ImageVector.Builder(
            name = "PartyOfThree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF052962)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.072f, 1.1f)
                curveTo(18.761f, 1.1f, 20.16f, 2.475f, 20.16f, 4.164f)
                curveTo(20.16f, 5.876f, 18.761f, 7.251f, 17.072f, 7.251f)
                curveTo(15.384f, 7.251f, 14.009f, 5.876f, 14.009f, 4.164f)
                verticalLineTo(4.067f)
                curveTo(13.502f, 3.995f, 13.044f, 3.946f, 12.586f, 3.946f)
                curveTo(9.811f, 3.946f, 7.11f, 5.297f, 5.783f, 7.686f)
                lineTo(5.662f, 7.903f)
                lineTo(5.638f, 7.878f)
                lineTo(5.421f, 7.275f)
                lineTo(4.577f, 6.841f)
                lineTo(3.95f, 7.058f)
                curveTo(5.711f, 3.995f, 8.991f, 2.041f, 12.586f, 2.041f)
                curveTo(13.261f, 2.041f, 13.961f, 2.137f, 14.66f, 2.282f)
                curveTo(15.215f, 1.558f, 16.083f, 1.1f, 17.072f, 1.1f)
                close()
                moveTo(21.149f, 6.962f)
                curveTo(22.042f, 8.506f, 22.5f, 10.243f, 22.5f, 11.979f)
                curveTo(22.5f, 13.692f, 22.066f, 15.405f, 21.173f, 16.949f)
                curveTo(20.836f, 17.552f, 20.425f, 18.107f, 19.943f, 18.637f)
                curveTo(20.088f, 18.999f, 20.16f, 19.409f, 20.16f, 19.795f)
                curveTo(20.16f, 20.326f, 20.039f, 20.832f, 19.75f, 21.315f)
                curveTo(19.171f, 22.304f, 18.158f, 22.859f, 17.072f, 22.859f)
                curveTo(16.566f, 22.859f, 16.035f, 22.714f, 15.553f, 22.449f)
                curveTo(14.564f, 21.87f, 14.009f, 20.857f, 14.009f, 19.771f)
                curveTo(14.009f, 19.264f, 14.153f, 18.734f, 14.419f, 18.251f)
                curveTo(14.998f, 17.262f, 16.035f, 16.707f, 17.121f, 16.707f)
                curveTo(17.627f, 16.707f, 18.182f, 16.804f, 18.64f, 17.118f)
                lineTo(18.713f, 17.166f)
                curveTo(19.026f, 16.78f, 19.316f, 16.394f, 19.533f, 16.008f)
                curveTo(20.257f, 14.753f, 20.618f, 13.354f, 20.618f, 11.979f)
                curveTo(20.618f, 10.701f, 20.329f, 9.374f, 19.702f, 8.24f)
                lineTo(19.581f, 8.023f)
                horizontalLineTo(19.605f)
                lineTo(20.232f, 8.144f)
                lineTo(21.028f, 7.613f)
                lineTo(21.149f, 6.962f)
                close()
                moveTo(12.634f, 21.918f)
                lineTo(12.127f, 21.484f)
                lineTo(12.079f, 20.519f)
                lineTo(12.513f, 20.036f)
                verticalLineTo(20.012f)
                horizontalLineTo(12.272f)
                curveTo(9.522f, 20.012f, 6.989f, 18.42f, 5.614f, 16.008f)
                curveTo(5.373f, 15.598f, 5.18f, 15.164f, 5.011f, 14.705f)
                curveTo(5.059f, 14.681f, 5.083f, 14.681f, 5.107f, 14.657f)
                curveTo(6.096f, 14.078f, 6.651f, 13.065f, 6.651f, 11.979f)
                curveTo(6.651f, 11.473f, 6.507f, 10.942f, 6.241f, 10.46f)
                curveTo(5.662f, 9.471f, 4.625f, 8.916f, 3.564f, 8.916f)
                curveTo(3.033f, 8.916f, 2.526f, 9.061f, 2.044f, 9.326f)
                curveTo(1.055f, 9.905f, 0.5f, 10.918f, 0.5f, 12.003f)
                curveTo(0.5f, 12.51f, 0.645f, 13.041f, 0.91f, 13.523f)
                curveTo(1.393f, 14.368f, 2.237f, 14.898f, 3.129f, 15.043f)
                curveTo(3.346f, 15.718f, 3.636f, 16.346f, 3.974f, 16.949f)
                curveTo(5.759f, 20.06f, 9.088f, 21.942f, 12.634f, 21.918f)
                close()
            }
        }.build()

        return _PartyOfThree!!
    }

@Suppress("ObjectPropertyName")
private var _PartyOfThree: ImageVector? = null