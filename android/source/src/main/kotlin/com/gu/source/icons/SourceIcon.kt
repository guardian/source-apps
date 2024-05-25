package com.gu.source.icons

import androidx.annotation.Discouraged
import androidx.compose.ui.graphics.vector.ImageVector
import kotlin.collections.List as ____KtList

/** Source provided raw icons. */
@Discouraged("These are not ready for production use.")
object SourceIcon

@Suppress("TopLevelPropertyNaming")
private var __Base: ____KtList<ImageVector>? = null

/** Set of base icons without circular border or fill. */
val SourceIcon.Base: ____KtList<ImageVector>
    get() = __Base ?: listOf(Check).also { __Base = it }