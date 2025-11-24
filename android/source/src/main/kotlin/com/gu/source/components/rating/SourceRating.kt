package com.gu.source.components.rating

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.gu.source.R

/**
 * A reusable star rating component that displays circular stars with ratings.
 *
 * @param rating The rating value (1-5)
 * @param style The visual style configuration
 * @param modifier Modifier for styling
 */
@Composable
fun SourceRating(
    rating: Int,
    style: RatingStyle,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        val circleSize = with(LocalDensity.current) { style.circleSize.pixels.sp.toDp() }
        val starIconSize = with(LocalDensity.current) { style.starIconSize.pixels.sp.toDp() }
        val isDarkTheme = isSystemInDarkTheme()

        repeat(MAX_STARS) { index ->
            val starNumber = index + 1
            val isFilled = starNumber <= rating

            if (index > 0) {
                Spacer(modifier = Modifier.width(style.starSpacing))
            }

            CircularStar(
                isFilled = isFilled,
                backgroundColor = if (isFilled) {
                    if (isDarkTheme) style.darkFilledCircleColor else style.lightFilledCircleColor
                } else {
                    style.emptyCircleColor
                },
                starColor = style.starIconColor,
                circleSize = circleSize,
                starIconSize = starIconSize,
            )
        }
    }
}

@Composable
private fun CircularStar(
    isFilled: Boolean,
    backgroundColor: Color,
    starColor: Color,
    circleSize: Dp,
    starIconSize: Dp,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(circleSize)
            .background(
                color = backgroundColor,
                shape = CircleShape,
            ),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            modifier = Modifier.size(starIconSize),
            painter = painterResource(
                if (isFilled) {
                    R.drawable.ic_vector_star_filled
                } else {
                    R.drawable.ic_vector_star_outlined
                },
            ),
            contentDescription = if (isFilled) "Filled Star" else "Outlined Star",
            tint = starColor,
        )
    }
}

private const val MAX_STARS = 5