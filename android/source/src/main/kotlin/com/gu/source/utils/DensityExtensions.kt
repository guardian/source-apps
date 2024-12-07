@file:Suppress("TooManyFunctions")

package com.gu.source.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** Converts this Int value from Density-independent Pixels (dp) to Pixels (px). */
@Composable
fun Int.dpToPx() = with(LocalDensity.current) { dp.toPx() }

/** Converts this Float value from Density-independent Pixels (dp) to Pixels (px). */
@Composable
fun Float.dpToPx() = with(LocalDensity.current) { dp.toPx() }

/** Converts this Dp value to Pixels (px). */
@Composable
fun Dp.toPx() = value.dpToPx()

/** Converts this Int value from Pixels (px) to Density-independent Pixels (dp). */
@Composable
fun Int.pxToDp() = with(LocalDensity.current) { toDp() }

/** Converts this Float value from Pixels (px) to Density-independent Pixels (dp). */
@Composable
fun Float.pxToDp() = with(LocalDensity.current) { toDp() }

/** Converts this TextUnit value to Pixels (px). */
@Composable
fun TextUnit.toPx() = with(LocalDensity.current) { toPx() }

/** Converts this TextUnit value to Density-independent Pixels (dp). */
@Composable
fun TextUnit.toDp() = with(LocalDensity.current) { toDp() }

/** Converts this Dp value to Scale-independent Pixels (sp). */
@Composable
fun Dp.toSp() = with(LocalDensity.current) { toSp() }

/** Converts this Int value from Pixels (px) to Scale-independent Pixels (sp). */
@Composable
fun Int.pxToSp() = with(LocalDensity.current) { toSp() }

/** Converts this Float value from Pixels (px) to Scale-independent Pixels (sp). */
@Composable
fun Float.pxToSp() = with(LocalDensity.current) { toSp() }

/** Returns the sum of this and the other TextUnit value. */
@Stable
operator fun TextUnit.plus(other: TextUnit) = (this.value + other.value).sp