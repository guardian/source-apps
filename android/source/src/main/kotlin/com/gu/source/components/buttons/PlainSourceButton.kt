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
import com.gu.source.daynight.AppColour
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral100

private val PlainDefault: ButtonColours
    get() = ButtonColours(
        border = AppColour(Source.Palette.Neutral0, Source.Palette.Neutral100),
        container = AppColour.Transparent,
        content = AppColour(Source.Palette.Neutral0, Source.Palette.Neutral100),
    )

/**
 * A plain, basic Source compatible button component. This button does not have any Source colour
 * theming. Provide [buttonColours] to theme the button.
 *
 *
 * This is a low-level component and should be sparingly used only for custom buttons. Prefer to
 * use [PlainSourceButton] or [SourceIconButton] instead.
 *
 * @param size Button size from [SourceButton.Size]s. Reflects the prominence of the action.
 * @param onClick Callback for action to take when user clicks the button.
 * @param modifier Optional [Modifier]
 * @param buttonColours Optional colours for the button. Use this to theme the button.
 * @param content Slot for composable content to present inside the button.
 */
@Discouraged(
    "Preferably use `PlainSourceButton`." +
        " It provides correct styling & size for text and icons." +
        " This variant is for supporting custom button designs only.",
)
@Composable
fun PlainSourceContentButton(
    size: SourceButton.Size,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonColours: ButtonColours = PlainDefault,
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
 * A plain Source button component with text and an optional icon. This has no Source colour
 * theming. Provide [buttonColours] to theme the button.
 *
 * Prefer to use [SourceButton] or [SourceBaseIconButton] instead.
 *
 * @param text Text to display on the button.
 * @param onClick Callback for action to take when user clicks the button.
 * @param modifier Optional [Modifier]
 * @param buttonColours Optional colours for the button. Use this to theme the button.
 * @param size Button size from [SourceButton.Size]s. Reflects the prominence of the action.
 * @param iconSide Optional the side of the button on which the icon appears. Defaults to
 * [SourceButton.IconSide.Left].
 * @param icon Optional icon to display on the button.
 */
@Composable
fun PlainSourceButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonColours: ButtonColours = PlainDefault,
    size: SourceButton.Size = SourceButton.Size.Small,
    iconSide: SourceButton.IconSide = SourceButton.IconSide.Left,
    icon: @Composable (Modifier) -> Unit = {},
) {
    PlainSourceContentButton(
        size = size,
        onClick = onClick,
        modifier = modifier,
        buttonColours = buttonColours,
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
        onClick = {},
        size = SourceButton.Size.Small,
    )
}