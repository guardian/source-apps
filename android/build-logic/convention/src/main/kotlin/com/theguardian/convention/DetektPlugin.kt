package com.theguardian.convention

import com.theguardian.convention.shared.isJvmModule
import com.theguardian.convention.shared.libs
import com.theguardian.convention.shared.plugin
import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import io.gitlab.arturbosch.detekt.report.ReportMergeTask
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * The Detekt convention plugin applies detekt plugins, and sets up configuration based on settings.
 */
class DetektPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugin("detekt").pluginId)
            }

            tasks.register("reportMerge", ReportMergeTask::class.java) {
                output.set(rootProject.layout.buildDirectory.file("reports/detekt/merge.sarif"))
            }

            val reportMerge = tasks.named("reportMerge", ReportMergeTask::class.java)

            reportMerge.configure {
                input.from(tasks.withType(Detekt::class.java).map { it.sarifReportFile })
            }

            // enable reports
            tasks.withType(Detekt::class.java) {
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
                )

                finalizedBy(reportMerge)
            }

            extensions.configure(DetektExtension::class.java) {
                toolVersion = libs.findVersion("detekt").get().requiredVersion
                config.setFrom(file("$rootDir/config/detekt.yml"))
                parallel = true

                basePath = rootProject.projectDir.absolutePath

                if (!target.isJvmModule()) {
                    // By default only main and test sources are included. I've added androidTest too
                    source.from("src/androidTest/java", "src/androidTest/kotlin")
                }
            }
        }
    }
}