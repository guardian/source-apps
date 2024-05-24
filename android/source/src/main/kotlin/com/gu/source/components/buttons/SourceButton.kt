package com.gu.source.components.buttons

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.invisibleToUser
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gu.source.Source
import com.gu.source.presets.palette.Brand400
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.typography.TextSansBold14
import com.gu.source.presets.typography.TextSansBold17


@Composable
fun SourceButton(modifier: Modifier = Modifier) {
    // TODO: 23/05/2024
}


/**
 * Object for property models for the [SourceButton] component.
 */
object SourceButton {
    /** Enum for the size of the [SourceButton]. */
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
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal fun SourceButton(
    guardianButtonViewData: GuardianButtonViewData,
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: SourceButton.Size = SourceButton.Size.Small,
    buttonIcon: ButtonIcon? = null,
) {
    GuardianContentButton(
        viewData = guardianButtonViewData,
        onClick = onClick,
        modifier = modifier,
        height = size.heightDp.dp,
    ) {
//        val guardianButtonTextViewData = GuardianButtonTextViewData(
//            text = text,
//            fontFamily = fontFamilyResource(R.font.guardian_texsan_two_bold),
//            letterSpacing = spDimensionResource2(
//                id = R.dimen.button_letterSpacing,
//            ),
//        )
        if (buttonIcon?.side == ButtonIcon.Side.LEFT) {
            Icon(
                painter = buttonIcon.painter,
                contentDescription = null,
                modifier = Modifier
//                    .height(guardianButtonTextViewData.fontSize.value.dp)
                    .align(Alignment.CenterVertically)
                    .semantics { invisibleToUser() },
            )
            Spacer(Modifier.width(8.dp))
        }
//        ButtonText(
//            viewData = guardianButtonTextViewData,
//            textStyle = size.textStyle,
//        )
        if (buttonIcon?.side == ButtonIcon.Side.RIGHT) {
            Spacer(
                Modifier.width(8.dp),
            )
            Icon(
                painter = buttonIcon.painter,
                contentDescription = null,
                modifier = Modifier
//                    .height(guardianButtonTextViewData.fontSize.value.dp)
                    .align(Alignment.CenterVertically)
                    .semantics { invisibleToUser() },
            )
        }
    }
}

@Composable
private fun SourceButtonPreview(size: SourceButton.Size) {
//    val backgroundColour = colorResource(id = R.color.coreWhite_primaryButton_background)
//    val contentColour = colorResource(id = R.color.coreWhite_primaryButton_textColour)
    val backgroundColour = Source.Palette.Neutral100
    val contentColour = Source.Palette.Brand400

//    PreviewColumn {
        SourceButton(
            guardianButtonViewData = GuardianButtonViewData(
                buttonColors = ButtonDefaults.buttonColors(
                    containerColor = backgroundColour,
                    contentColor = contentColour,
                ),
            ),
            text = "OK, I understand",
            size = size,
            onClick = {},
        )
        SourceButton(
            guardianButtonViewData = GuardianButtonViewData(
                buttonColors = ButtonDefaults.buttonColors(
                    containerColor = backgroundColour,
                    contentColor = contentColour,
                ),
            ),
            text = "OK, I understand",
            onClick = {},
            size = size,
//            buttonIcon = ButtonIcon(
//                painter = painterResource(id = R.drawable.ic_reload),
//                side = ButtonIcon.Side.LEFT,
//            ),
        )
        SourceButton(
            guardianButtonViewData = GuardianButtonViewData(
                buttonColors = ButtonDefaults.buttonColors(
                    containerColor = backgroundColour,
                    contentColor = contentColour,
                ),
            ),
            text = "OK, I understand",
            onClick = {},
            size = size,
//            buttonIcon = ButtonIcon(
//                painter = painterResource(id = R.drawable.ic_reload),
//                side = ButtonIcon.Side.RIGHT,
//            ),
        )
//    }
}

@Preview
@Composable
private fun MediumPreview() {
    SourceButtonPreview(SourceButton.Size.Medium)
}

@Preview
@Composable
private fun SmallPreview() {
    SourceButtonPreview(SourceButton.Size.Small)
}

@Preview
@Composable
private fun XSmallPreview() {
    SourceButtonPreview(SourceButton.Size.XSmall)
}

data class ButtonIcon(
    val painter: Painter,
    val side: Side,
) {
    enum class Side {
        LEFT,
        RIGHT,
    }
}