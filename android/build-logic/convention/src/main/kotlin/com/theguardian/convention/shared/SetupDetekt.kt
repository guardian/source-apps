package com.theguardian.convention.shared

import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import io.gitlab.arturbosch.detekt.report.ReportMergeTask
import org.gradle.api.JavaVersion
import org.gradle.api.Project

/**
 * The Detekt convention plugin applies detekt plugins, and sets up configuration based on settings.
 */
fun Project.setupDetekt() {
    with(this) {
        with(pluginManager) {
            this.apply(libs.plugin("detekt").pluginId)
        }

        tasks.register("reportMerge", ReportMergeTask::class.java) {
            output.set(
                rootProject.layout.buildDirectory.file("reports/detekt/merge.sarif"),
            )
        }

        val reportMerge = tasks.named("reportMerge", ReportMergeTask::class.java)

        reportMerge.configure {
            input.from(tasks.withType(Detekt::class.java).map { it.sarifReportFile })
        }

        // enable reports
        tasks.withType(Detekt::class.java).configureEach {
            jvmTarget = JavaVersion.VERSION_17.toString()
            reports {
                xml.required.set(false)
                html.required.set(true)
                txt.required.set(true)
                md.required.set(false)

                sarif.required.set(true)
            }

            exclude(
                "**/build/*",
                "**/generated/*",
                "**/build.gradle.kts",
                "**/settings.gradle.kts",
                // Icons are generated so we don't run detekt on them
                "**/icons/base/*",
            )

            finalizedBy(reportMerge)
        }

        extensions.configure(DetektExtension::class.java) {
            toolVersion = libs.findVersion("detekt").get().requiredVersion
            config.setFrom(file("${rootDir}/config/detekt.yml"))
            parallel = true

            basePath = rootProject.projectDir.absolutePath
            ignoredBuildTypes = listOf("release")

            if (!isJvmModule()) {
                // By default only main and test sources are included. I've added androidTest too
                source.from("src/androidTest/java", "src/androidTest/kotlin")
            }
        }
    }
}