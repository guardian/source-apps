package com.gu.source.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage

private const val ImageUrl = "https://picsum.photos/695/544?random="

/**
 * Renders the appropriate Composable for [SampleImage]. In preview mode, a default placeholder
 * image is displayed.
 * @param modifier
 * @param randomKey The random key to be appended to the image URL. If same key is passed, Coil may
 * use the existing cached image again.
 */
@Composable
internal fun SampleImage(modifier: Modifier = Modifier, randomKey: Int = 0) {
    val placeholder = if (LocalInspectionMode.current) {
        painterResource(id = android.R.drawable.ic_menu_gallery)
    } else {
        null
    }

    val contentScale = if (LocalInspectionMode.current) {
        ContentScale.Fit
    } else {
        ContentScale.Crop
    }

    AsyncImage(
        modifier = modifier,
        placeholder = placeholder,
        contentDescription = null,
        model = ImageUrl + randomKey,
        contentScale = contentScale,
    )
}