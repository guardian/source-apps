package com.gu.source

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.layout.calculatePaneScaffoldDirective
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import androidx.compose.material3.adaptive.navigation3.rememberListDetailSceneStrategy
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
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
    @OptIn(ExperimentalMaterial3AdaptiveApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navigator = rememberNavigator(Destination.Home)

            val windowInfo = currentWindowAdaptiveInfo()
            val isHomeOnTop = navigator.backstack.lastOrNull() is Destination.Home

            val directive = remember(windowInfo, isHomeOnTop) {
                val isCompact = !windowInfo.windowSizeClass
                    .isWidthAtLeastBreakpoint(widthDpBreakpoint = 600)
                calculatePaneScaffoldDirective(windowInfo)
                    .copy(
                        horizontalPartitionSpacerSize = 0.dp,
                        maxHorizontalPartitions = if (isCompact || isHomeOnTop) 1 else 2,
                    )
            }

            AppColourMode { modifier ->
                NavDisplay(
                    backStack = navigator.backstack,
                    onBack = { navigator.popBackStack() },
                    modifier = modifier,
                    sceneStrategy = rememberListDetailSceneStrategy(
                        shouldHandleSinglePaneLayout = true,
                        directive = directive,
                    ),
                    entryProvider = entryProvider {
                        entry<Destination.Home>(
                            metadata = ListDetailSceneStrategy.listPane(),
                        ) {
                            Home {
                                if (!isHomeOnTop) {
                                    navigator.popBackStack()
                                }
                                navigator.navigate(it)
                            }
                        }
                        entry<Destination.PalettePreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            PalettePreview(navigator::popBackStack)
                        }
                        entry<Destination.PagerProgressBarPreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            ImagePagerWithProgressIndicator(navigator::popBackStack)
                        }
                        entry<Destination.ButtonsPreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            ButtonPreview(navigator::popBackStack)
                        }
                        entry<Destination.TextButtonPreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            TextButtonPreview(navigator::popBackStack)
                        }
                        entry<Destination.IconsPreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            IconsPreview(navigator::popBackStack)
                        }
                        entry<Destination.AlertBannerPreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            AlertBannerPreview(navigator::popBackStack)
                        }
                        entry<Destination.ChipsPreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            ChipsPreview(navigator::popBackStack)
                        }
                        entry<Destination.BadgesPreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            PromoStickerPreview(navigator::popBackStack)
                        }
                        entry<Destination.StarRatingsPreview>(
                            metadata = ListDetailSceneStrategy.detailPane(),
                        ) {
                            BackHandler { navigator.popBackStack() }
                            RatingPreview(navigator::popBackStack)
                        }
                    },
                )
            }
        }
    }
}