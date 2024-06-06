package com.gu.source.components.buttons

import android.annotation.SuppressLint
import androidx.annotation.Discouraged
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gu.source.Source
import com.gu.source.presets.palette.Culture200
import com.gu.source.presets.palette.Culture800

/**
 * A basic Source compatible button component. This button does not have any Source colour theming.
 * This is a low-level component and should be sparingly used only for custom buttons. Prefer to
 * use [SourceButton] or [SourceBaseIconButton] instead.
 *
 * @param size Button size from [SourceButton.Size]s. Reflects the prominence of the action.
 * @param buttonColours Colours for the button. Use [ButtonColours] to create the colours.
 * @param onClick Callback for action to take when user clicks the button.
 * @param modifier Optional [Modifier]
 * @param content Slot for composable content to present inside the button.
 */
@Discouraged(
    "Preferably use `SourceButton`." +
        " It provides correct styling & size for text and icons." +
        " This variant is for supporting custom button designs only.",
)
@Composable
fun PlainSourceContentButton(
    size: SourceButton.Size,
    buttonColours: ButtonColours,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier.defaultMinSize(
            minWidth = SourceButton.MinButtonWidth,
            minHeight = size.heightDp.dp,
        ),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColours.container.current,
            contentColor = buttonColours.content.current,
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            focusedElevation = 0.dp,
            hoveredElevation = 0.dp,
            disabledElevation = 0.dp,
        ),
        border = BorderStroke(
            width = 1.dp,
            color = buttonColours.border.current,
        ),
        contentPadding = size.contentPadding,
        content = { content() },
    )
}

/**
 * A plain Source button component with text and an optional icon, but no Source colour theming.
 *
 * Prefer to use [SourceButton] or [SourceBaseIconButton] instead.
 *
 * @param text Text to display on the button.
 * @param size Button size from [SourceButton.Size]s. Reflects the prominence of the action.
 * @param buttonColours Colours for the button. Use [ButtonColours] to create the colours.
 * @param onClick Callback for action to take when user clicks the button.
 * @param modifier Optional [Modifier]
 * @param iconSide Optional the side of the button on which the icon appears. Defaults to
 * [SourceButton.IconSide.Left].
 * @param icon Optional icon to display on the button.
 */
@SuppressLint("DiscouragedApi")
@Discouraged(
    "Preferably use `SourceButton`." +
        " It provides correct styling & size for text and icons." +
        " This variant is for supporting custom button designs and colours only.",
)
@Composable
fun PlainSourceButton(
    text: String,
    size: SourceButton.Size,
    buttonColours: ButtonColours,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    iconSide: SourceButton.IconSide = SourceButton.IconSide.Left,
    icon: @Composable (Modifier) -> Unit = {},
) {
    PlainSourceContentButton(
        size = size,
        buttonColours = buttonColours,
        onClick = onClick,
        modifier = modifier,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (iconSide == SourceButton.IconSide.Left) {
                icon(Modifier.size(size.textStyle.fontSize.value.dp))
            }

            Text(
                text = text,
                style = size.textStyle,
                overflow = TextOverflow.Ellipsis,
                softWrap = false,
                maxLines = 1,
                letterSpacing = 0.sp,
                modifier = Modifier.offset(y = (-1).dp),
            )

            if (iconSide == SourceButton.IconSide.Right) {
                icon(Modifier.size(size.textStyle.fontSize.value.dp))
            }
        }
    }
}

@SuppressLint("DiscouragedApi")
@Preview
@Composable
private fun Preview() {
    PlainSourceButton(
        text = "Button",
        size = SourceButton.Size.Small,
        buttonColours = ButtonColours(
            border = Source.Palette.Culture200,
            container = Source.Palette.Culture800,
            content = Source.Palette.Culture200,
        ),
        onClick = {},
    )
}