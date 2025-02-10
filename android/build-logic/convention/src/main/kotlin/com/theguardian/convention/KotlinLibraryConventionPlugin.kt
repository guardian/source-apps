package com.theguardian.convention

import com.theguardian.convention.shared.*
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

/**
 * Configures the Android application module.
 *
 * Core responsibilities:
 * 1. Apply Kotlin and ktlint plugins
 * 2. Set up Java version
 * 3. Add core dependencies
 */
class KotlinLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.jvm")
                apply(libs.plugin("kotlinter").pluginId)
            }

            setupDetekt()
            setupKotlinter()

            addBaseDependencies<KotlinJvmProjectExtension>()
        }
    }
}