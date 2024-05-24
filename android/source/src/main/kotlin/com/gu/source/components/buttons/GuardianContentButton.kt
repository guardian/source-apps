package com.gu.source.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gu.source.R
import com.gu.source.Source
import com.gu.source.components.buttons.GuardianContentButton.Style.ContentPadding
import com.gu.source.presets.palette.Brand400
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.typography.TextSans12
import com.gu.source.utils.fontFamilyResource

internal object GuardianContentButton {
    object Style {
        // Horizontal padding updated to match M2 button padding. In M3, the horizontal padding has
        // increased to 24.dp.
        val ContentPadding = PaddingValues(vertical = 8.dp, horizontal = 16.dp)
    }
}

/**
 * Stateless button with round ends that takes a composable for content. This button enforces a
 * minimum width of `66.dp` [R.dimen.button_default_minimumWidth]
 * @param viewData Describes the format of the button container
 * @param onClick Callback for action to take when user clicks the button
 * @param modifier
 * @param height Button height in dp. If null, the default height is used.
 * @param content Slot for composable content to present inside the container
 */
@Composable
fun GuardianContentButton(
    viewData: GuardianButtonViewData,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    height: Dp? = null,
    content: @Composable RowScope.() -> Unit,
) {
//    val defaultMinWidth = dimensionResource(id = R.dimen.button_default_minimumWidth)
//    val defaultMinHeight = height ?: dimensionResource(id = R.dimen.button_default_minimumHeight)
    val padding =
//        if (defaultMinHeight < 36.dp) {
//        // Vertical padding set to zero to allow XSmall button size.
//        viewData.contentPadding.copy(top = 0.dp, bottom = 0.dp)
//    } else {
        viewData.contentPadding
//    }
    Button(
        onClick = onClick,
        modifier = modifier
//            .defaultMinSize(
//            minWidth = defaultMinWidth,
//            minHeight = defaultMinHeight,
//        )
        ,
        shape = MaterialTheme.shapes.small.copy(all = CornerSize(viewData.cornerRadius)),
        colors = viewData.buttonColors,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            focusedElevation = 0.dp,
            hoveredElevation = 0.dp,
            disabledElevation = 0.dp,
        ),
        border = viewData.borderStroke,
        contentPadding = padding,
        content = content,
    )
}

data class GuardianButtonViewData(
    val cornerRadius: Dp = 50.dp,
    val buttonColors: ButtonColors,
    val borderStroke: BorderStroke? = null,
    // Updated to match M2 button padding. In M3, the horizontal padding has increased to 24.dp
    val contentPadding: PaddingValues = ContentPadding,
)

@Preview
@Composable
private fun Preview() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        GuardianContentButton(
            viewData = GuardianButtonViewData(
                buttonColors = ButtonDefaults.buttonColors(
                    containerColor = Source.Palette.Brand400,
                    contentColor = Source.Palette.Neutral100,
                ),
            ),
            onClick = {},
        ) {
//            ButtonText(
//                viewData = GuardianButtonTextViewData(
//                    text = "Hello!",
//                    fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
//                    letterSpacing = spDimensionResource2(
//                        id = R.dimen.button_letterSpacing,
//                    ),
//                ),
//                textStyle = Source.Typography.TextSans12,
//            )
        }
    }
}