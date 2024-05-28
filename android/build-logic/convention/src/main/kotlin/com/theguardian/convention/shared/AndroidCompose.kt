package com.theguardian.convention.shared

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeCompilerGradlePluginExtension

/**
 * This extension function applies the correct flags and dependencies to the module represented by
 * the [Project].
 */
internal fun Project.configureAndroidCompose(
    extension: CommonExtension<*, *, *, *, *, *>,
) {
    with(pluginManager) {
        apply(libs.findPlugin("compose-compiler").get().get().pluginId)
    }

    extension.apply {
        buildFeatures {
            compose = true
        }

        extensions.configure(ComposeCompilerGradlePluginExtension::class.java) {
            reportsDestination.set(layout.buildDirectory.dir("compose_compiler"))
            enableStrongSkippingMode.set(true)
        }

        dependencies {
            val bom = libs.findLibrary("androidx-compose-bom").get()
            add("implementation", platform(bom))
            // View inter-op
            add("implementation", "androidx.compose.ui:ui-viewbinding")
            // Animations
            add("implementation", "androidx.compose.animation:animation")
            // Tooling support (Previews, etc.)
            add("implementation", "androidx.compose.ui:ui-tooling")
            add("implementation", "androidx.compose.ui:ui-tooling-preview")

            // region Material 3
            add(
                configurationName = "implementation",
                dependencyNotation = libs.findLibrary("androidx-compose-material3").get(),
            )
            // Ripple - Same as M2
            add(
                configurationName = "implementation",
                dependencyNotation = libs.findLibrary("androidx-compose-material-ripple").get(),
            )
            add(
                configurationName = "implementation",
                dependencyNotation = libs.findLibrary("androidx-compose-material3-windowSize")
                    .get(),
            )
            // endregion

            // Access to immutable collections
            add(
                configurationName = "implementation",
                dependencyNotation = libs.findLibrary("kotlinx-collections-immutable").get(),
            )

            add("androidTestImplementation", platform(bom))
            add("androidTestImplementation", "androidx.compose.ui:ui-test-manifest")
            add(
                configurationName = "androidTestImplementation",
                dependencyNotation = libs.findLibrary("androidx-compose-uiTest").get(),
            )

            // For paparazzi
            add(
                configurationName = "testImplementation",
                dependencyNotation = libs.findLibrary("junit").get(),
            )
            add(
                configurationName = "testImplementation",
                dependencyNotation = libs.findLibrary("google-testParameterInjector").get(),
            )
        }
    }
}