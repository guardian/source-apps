package com.gu.source

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.gu.source.daynight.AppColourMode
import com.gu.source.navigation.Destination
import com.gu.source.navigation.Navigator.Companion.rememberNavigator
import com.gu.source.previews.PalettePreview

internal class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navigator = rememberNavigator(Destination.Home)

            AppColourMode { modifier ->
                NavDisplay(
                    backStack = navigator.backstack,
                    onBack = { navigator.popBackStack() },
                    modifier = modifier,
                    entryProvider = entryProvider {
                        entry(Destination.Home) {
                            Home { navigator.navigate(it) }
                        }
                        entry(Destination.PalettePreview) {
                            PalettePreview({ navigator.popBackStack() })
                        }
                    },
                )
            }
        }
    }
}