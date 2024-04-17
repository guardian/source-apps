package com.theguardian.convention.shared

import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin

internal fun Project.isJvmModule(): Boolean {
    plugins.forEach {
        if (it is JavaPlugin) return true
    }
    return false
}