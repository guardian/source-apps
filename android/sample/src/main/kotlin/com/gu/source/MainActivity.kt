package com.gu.source

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.gu.source.daynight.AppColourMode
import com.gu.source.navigation.Destination
import com.gu.source.navigation.Navigator.Companion.rememberNavigator
import com.gu.source.previews.AlertBannerPreview
import com.gu.source.previews.ButtonPreview
import com.gu.source.previews.ChipsPreview
import com.gu.source.previews.IconsPreview
import com.gu.source.previews.ImagePagerWithProgressIndicator
import com.gu.source.previews.PalettePreview
import com.gu.source.previews.PromoStickerPreview
import com.gu.source.previews.RatingPreview
import com.gu.source.previews.TextButtonPreview

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
                            PalettePreview(navigator::popBackStack)
                        }
                        entry(Destination.PagerProgressBarPreview) {
                            ImagePagerWithProgressIndicator(navigator::popBackStack)
                        }
                        entry(Destination.ButtonsPreview) {
                            ButtonPreview(navigator::popBackStack)
                        }
                        entry(Destination.TextButtonPreview) {
                            TextButtonPreview(navigator::popBackStack)
                        }
                        entry(Destination.IconsPreview) {
                            IconsPreview(navigator::popBackStack)
                        }
                        entry(Destination.AlertBannerPreview) {
                            AlertBannerPreview(navigator::popBackStack)
                        }
                        entry(Destination.ChipsPreview) {
                            ChipsPreview(navigator::popBackStack)
                        }
                        entry(Destination.BadgesPreview) {
                            PromoStickerPreview(navigator::popBackStack)
                        }
                        entry(Destination.StarRatingsPreview) {
                            RatingPreview(navigator::popBackStack)
                        }
                    },
                    transitionSpec = {
                        // Slide in from right when navigating forward
                        slideInHorizontally(initialOffsetX = { it }) togetherWith
                            slideOutHorizontally(targetOffsetX = { -it })
                    },
                    popTransitionSpec = {
                        // Slide in from left when navigating back
                        fadeIn(
                            spring(dampingRatio = 1.0f, stiffness = 1600.0f),
                        ) togetherWith
                            slideOutHorizontally(targetOffsetX = { it })
                    },
                    predictivePopTransitionSpec = {
                        // Slide in from left when navigating back
                        fadeIn(
                            spring(dampingRatio = 1.0f, stiffness = 1600.0f),
                        ) togetherWith
                            slideOutHorizontally(targetOffsetX = { it })
                    },
                )
            }
        }
    }
}