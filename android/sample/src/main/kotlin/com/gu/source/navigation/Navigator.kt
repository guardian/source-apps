package com.gu.source.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

internal class Navigator private constructor(startDestination: Destination) {

    val backstack = mutableStateListOf(startDestination)

    fun navigate(destination: Destination) {
        backstack += destination
    }

    fun popBackStack() {
        backstack.removeLastOrNull()
    }

    companion object {
        @Composable
        fun rememberNavigator(startDestination: Destination) =
            remember(startDestination) { Navigator(startDestination) }
    }
}