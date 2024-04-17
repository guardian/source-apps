package com.theguardian.convention

import com.android.build.api.dsl.ApplicationExtension
import com.theguardian.convention.shared.configureAndroidModule
import com.theguardian.convention.shared.configureAndroidTests
import com.theguardian.convention.shared.libs
import com.theguardian.convention.shared.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

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

            extensions.configure<ApplicationExtension> {
                defaultConfig {
                    targetSdk = libs.findVersion("targetsdk").get().toString().toInt()
                }

                configureAndroidModule(this)

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