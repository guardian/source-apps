package com.theguardian.convention

import com.android.build.api.variant.LibraryAndroidComponentsExtension
import com.android.build.gradle.LibraryExtension
import com.theguardian.convention.shared.*
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

/**
 * Configures the Android library modules.
 *
 * Core responsibilities:
 * 1. Apply Android, Kotlin and Ktlint plugins
 * 2. Set up SDK & Java versions
 * 3. Add core dependencies
 * 4. Add lint checks
 * 5. Set up Android tests & Gradle managed devices if the module has test sources
 */
class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            val shouldSetupAndroidTests = hasAndroidTests()

            with(pluginManager) {
                apply(libs.plugin("agp-library").pluginId)
                apply(libs.plugin("kgp").pluginId)
                apply(libs.plugin("dokka").pluginId)
                apply(libs.plugin("kotlinter").pluginId)
            }

            extensions.configure<LibraryExtension> {
                configureAndroidModule(this)

                if (shouldSetupAndroidTests) {
                    configureAndroidTests(this)
                }
            }

            // Setup Dokka
            dependencies {
                add("implementation", libs.findLibrary("dokka-android").get())
            }
            dokkaConfig()

            if (!shouldSetupAndroidTests) {
                // Disable unnecessary Android instrumented tests for the project if there are no
                // tests in the `androidTest` folder. Otherwise, these projects would be compiled,
                // packaged, installed and run only to end-up with the following message:
                //
                // > Starting 0 tests on AVD
                extensions.configure<LibraryAndroidComponentsExtension> {
                    beforeVariants { it.enableAndroidTest = false }
                }
            }
        }
    }

    /**
     * Checks if any AndroidTest files exist.
     */
    private fun Project.hasAndroidTests() = projectDir.resolve("src/androidTest").exists() &&
        projectDir.resolve("src/androidTest")
            .walkBottomUp()
            .firstOrNull { it.isFile } != null
}