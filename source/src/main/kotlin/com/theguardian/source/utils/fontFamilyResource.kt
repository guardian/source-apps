package com.theguardian.source.utils

import androidx.annotation.FontRes
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

fun fontFamilyResource(@FontRes fontResId: Int) = FontFamily(Font(fontResId))