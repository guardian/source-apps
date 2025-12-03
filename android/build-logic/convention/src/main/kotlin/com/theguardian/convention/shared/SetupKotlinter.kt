package com.theguardian.convention.shared

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.jmailen.gradle.kotlinter.tasks.FormatTask
import org.jmailen.gradle.kotlinter.tasks.LintTask

internal fun Project.setupKtlint() {
    with(pluginManager) {
        apply(libs.plugin("kotlinter").pluginId)
    }

    dependencies {
        add("ktlint", libs.findLibrary("ktlint-compose").get())
    }

    tasks.withType(LintTask::class.java).configureEach {
        exclude { it.file.path.contains("/build/generated/") }
        exclude { it.file.path.contains("src/main/kotlin/com/gu/source/icons") }
    }

    tasks.withType(FormatTask::class.java).configureEach {
        exclude { it.file.path.contains("src/main/kotlin/com/gu/source/icons") }
    }
}