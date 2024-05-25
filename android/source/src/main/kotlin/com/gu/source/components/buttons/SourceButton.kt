package com.gu.source.components.buttons

import androidx.annotation.Discouraged
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gu.source.Source
import com.gu.source.daynight.AppColourMode
import com.gu.source.presets.palette.Brand400
import com.gu.source.presets.typography.TextSansBold14
import com.gu.source.presets.typography.TextSansBold17


/**
 * Object for property models for the [SourceBasicButton] component.
 */
object SourceButton {
    /** Enum for the size of the [SourceBasicButton]. */
    enum class Size(
        internal val heightDp: Int,
        internal val textStyle: TextStyle,
    ) {
        XSmall(
            heightDp = 24,
            textStyle = Source.Typography.TextSansBold14.copy(letterSpacing = 0.sp),
        ),
        Small(
            heightDp = 36,
            textStyle = Source.Typography.TextSansBold17.copy(letterSpacing = 0.sp),
        ),
        Medium(
            heightDp = 44,
            textStyle = Source.Typography.TextSansBold17.copy(letterSpacing = 0.sp),
        ),
    }

    /** Enum for the style of the [SourceBasicButton]. */
    enum class Style {
        PrimaryOnWhite,
        SecondaryOnWhite,
        TertiaryOnWhite,
        PrimaryOnBlue,
        SecondaryOnBlue,
        TertiaryOnBlue,
        PrimaryOnYellow,
        SecondaryOnYellow,
        TertiaryOnYellow,
        ;

        fun isSecondary() = this in setOf(
            SecondaryOnWhite,
            SecondaryOnBlue,
            SecondaryOnYellow,
        )
    }

    /** Enum for the source style theme. */
    enum class Theme {
        Core,
        ReaderRevenue,
    }

    enum class ImagePosition {
        Left, Right,
    }
}

@Composable
fun SourceBaseButton(
    size: SourceButton.Size,
    style: SourceButton.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @Discouraged("Wrap the whole composition in the theme local composition instead.")
    theme: SourceButton.Theme? = null,
    content: @Composable () -> Unit,
) {
    require(
        !(theme == SourceButton.Theme.ReaderRevenue && style.isSecondary()),
    ) { "ReaderRevenue theme doesn't have secondary buttons." }

    // TODO: 23/05/2024
    Button(
        onClick = onClick,
        modifier = modifier,
//            .defaultMinSize(
//            minWidth = defaultMinWidth,
//            minHeight = defaultMinHeight,
//        )
//        shape = MaterialTheme.shapes.small.copy(all = CornerSize(viewData.cornerRadius)),
        //colors = viewData.buttonColors,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            focusedElevation = 0.dp,
            hoveredElevation = 0.dp,
            disabledElevation = 0.dp,
        ),
        //border = viewData.borderStroke,
        //contentPadding = padding,
        content = { content() },
    )
}

@Composable
fun SourceButton(
    text: String,
    size: SourceButton.Size,
    style: SourceButton.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @Discouraged("Wrap the whole composition in the theme local composition instead.")
    theme: SourceButton.Theme? = null,
    imagePosition: SourceButton.ImagePosition = SourceButton.ImagePosition.Left,
    imageContent: @Composable () -> Unit = {},
) {
    SourceBaseButton(
        size = size,
        style = style,
        onClick = onClick,
        modifier = modifier,
        theme = theme,
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            if (imagePosition == SourceButton.ImagePosition.Left) {
                imageContent()
            }

            Text(text = text, style = size.textStyle, color = Source.Palette.Brand400)

            if (imagePosition == SourceButton.ImagePosition.Right) {
                imageContent()
            }
        }
    }
}

@Composable
fun SourceIconButton(
    size: SourceButton.Size,
    style: SourceButton.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @Discouraged("Wrap the whole composition in the theme local composition instead.")
    theme: SourceButton.Theme? = null,
    imageContent: @Composable () -> Unit = {},
) {
    IconButton(onClick = { /*TODO*/ }) {
        imageContent()
    }
}

@Preview
@Composable
private fun TextButtonPreview() {
    AppColourMode {
        SourceButton(
            text = "Button",
            size = SourceButton.Size.Small,
            style = SourceButton.Style.PrimaryOnWhite,
            onClick = {},
        )
    }
}

@Preview
@Composable
private fun IconButtonPreview() {
    AppColourMode {
        SourceIconButton(
            size = SourceButton.Size.Small,
            style = SourceButton.Style.PrimaryOnWhite,
            onClick = {},
        ) {
            Image(
                imageVector = Icons.Default.Done,
                contentDescription = null,
            )
        }
    }
}