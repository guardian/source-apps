package com.gu.source.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack

internal class Navigator private constructor(val backstack: NavBackStack<NavKey>) {
    fun navigate(destination: Destination) {
        backstack += destination
    }

    fun popBackStack() {
        backstack.removeLastOrNull()
    }

    companion object {
        @Composable
        fun rememberNavigator(startDestination: Destination): Navigator {
            val backstack = rememberNavBackStack(startDestination)
            return remember(startDestination) {
                Navigator(backstack)
            }
        }
    }
}