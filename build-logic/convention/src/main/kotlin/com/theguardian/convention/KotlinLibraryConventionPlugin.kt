package com.theguardian.convention

import com.theguardian.convention.shared.addBaseDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project

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
                apply("jvm-module-test")
                apply("org.jmailen.kotlinter")
            }

            addBaseDependencies()
        }
    }
}