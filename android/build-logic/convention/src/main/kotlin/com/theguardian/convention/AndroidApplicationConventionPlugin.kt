package com.theguardian.convention

import com.android.build.api.dsl.ApplicationExtension
import com.theguardian.convention.shared.*
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

/**
 * Configures the Android application module.
 *
 * Core responsibilities:
 * 1. Apply Android, Kotlin and Ktlint plugins
 * 2. Set up SDK & Java versions
 * 3. Add core dependencies
 * 4. Add lint checks
 * 5. Set up Android tests & Gradle managed devices.
 */
class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugin("agp-application").pluginId)
                apply(libs.plugin("kgp").pluginId)
                apply(libs.plugin("kotlinter").pluginId)
            }

            setupDetekt()

            extensions.configure<ApplicationExtension> {
                defaultConfig {
                    targetSdk = libs.findVersion("targetsdk").get().toString().toInt()
                }

                configureAndroidModule<KotlinAndroidProjectExtension>(this)

                configureAndroidTests(this)

                // This will tell Gradle to run lint checks but don't abort build
                lint {
                    abortOnError = false
                    error += "VisibleForTests"
                    checkDependencies = true
                }

                testOptions {
                    unitTests.isReturnDefaultValues = true
                    animationsDisabled = true
                }
            }
        }
    }
}