// ktlint-disable filename
package com.gu.source.utils

import androidx.annotation.FontRes
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

/**
 * Load the font resource into a FontFamily object.
 */
internal fun fontFamilyResource(@FontRes fontResId: Int) = FontFamily(Font(fontResId))