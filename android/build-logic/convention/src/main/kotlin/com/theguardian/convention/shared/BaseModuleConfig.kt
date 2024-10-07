package com.theguardian.convention.shared

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.*
import org.gradle.plugin.use.PluginDependency
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinTopLevelExtension

/**
 * The Version Catalog.
 */
internal val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal fun VersionCatalog.plugin(alias: String): PluginDependency = findPlugin(alias).get().get()

/**
 * Sets up core config for all Android modules - application and library.
 */
internal inline fun <reified T : KotlinTopLevelExtension> Project.configureAndroidModule(
    extension: CommonExtension<*, *, *, *, *, *>,
) {
    extension.apply {
        defaultConfig {
            minSdk = libs.findVersion("minsdk").get().toString().toInt()
            compileSdk = libs.findVersion("compilesdk").get().toString().toInt()
        }

        addBaseDependencies<T>()

        dependencies {
            add("implementation", libs.findLibrary("other-timber").get())
        }
    }
}

/**
 * Adds the base dependencies that every module needs.
 */
internal inline fun <reified T : KotlinTopLevelExtension> Project.addBaseDependencies() {
    dependencies {
        add("implementation", libs.findLibrary("kotlin-stdlib").get())
        add("implementation", libs.findLibrary("javax-inject").get())
    }
    setupKotlinCompilerOptions<T>()
}

private inline fun <reified T : KotlinTopLevelExtension> Project.setupKotlinCompilerOptions() =
    configure<T> {
        when (this) {
            is KotlinAndroidProjectExtension -> compilerOptions
            is KotlinJvmProjectExtension -> compilerOptions
            else -> error("Unsupported project extension $this ${T::class}")
        }.apply {
            jvmToolchain(libs.findVersion("java").get().toString().toInt())
            val warningsAsErrors: String? by project
            allWarningsAsErrors = warningsAsErrors.toBoolean()
            freeCompilerArgs.addAll(
                // Suggested by Braze SDK integration guide, for further information:
                // https://kotlinlang.org/docs/java-to-kotlin-interop.html#default-methods-in-interfaces
                "-Xjvm-default=all",
                "-opt-in=kotlin.RequiresOptIn",
                // Enable experimental coroutines APIs, including Flow
                "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
                "-opt-in=kotlinx.coroutines.FlowPreview",
                "-opt-in=androidx.compose.material3.ExperimentalMaterial3Api",
            )
        }
    }

internal fun Project.dokkaConfig() {
    tasks.withType<DokkaTask>().configureEach {

        moduleName.set("Source for Android")
        moduleVersion.set("v." + libs.findVersion("libraryVersion").get().toString())
        // outputDirectory.set(layout.buildDirectory.dir("../docs"))

        // Config for HTML files
        val dokkaBaseConfiguration = """
        {
          "customAssets": ["${file("../docsAssets/source-logo.png")}"],
          "customStyleSheets": ["${file("../docsAssets/logo-styles.css")}"]
        }
        """
        pluginsMapConfiguration.set(
            mapOf(
                // fully qualified plugin name to json configuration
                "org.jetbrains.dokka.base.DokkaBase" to dokkaBaseConfiguration,
            ),
        )
    }
}