package com.gu.source.components.buttons

import androidx.annotation.Discouraged
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gu.source.Source

// TODO: 25/05/2024
@Composable
fun SourceIconButton(
    size: SourceButton.Size,
    style: SourceButton.Style,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @Discouraged("Wrap the whole composition in the theme local composition instead.")
    theme: Source.Theme? = null,
    icon: @Composable (Modifier) -> Unit = {},
) {
    IconButton(onClick = { /*TODO*/ }) {
        icon(Modifier.size(size.textStyle.fontSize.value.dp))
    }
}