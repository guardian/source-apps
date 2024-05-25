package com.gu.source.icons

import androidx.annotation.Discouraged
import androidx.compose.ui.graphics.vector.ImageVector
import kotlin.collections.List as ____KtList

/**
 * Source provided raw icons.
 */
@Discouraged("These are not ready for production use.")
object SourceIcon

private var __Base: ____KtList<ImageVector>? = null

val SourceIcon.Base: ____KtList<ImageVector>
  get() {
    if (__Base != null) {
      return __Base!!
    }
    __Base = listOf(Check)
    return __Base!!
  }