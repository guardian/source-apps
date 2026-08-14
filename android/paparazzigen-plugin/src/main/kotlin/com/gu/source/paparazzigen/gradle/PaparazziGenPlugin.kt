package com.gu.source.paparazzigen.gradle

import com.android.build.api.dsl.CommonExtension
import com.google.devtools.ksp.gradle.KspExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.file.Directory
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.SourceTask
import java.util.Properties

private const val KSP_PLUGIN_ID = "com.google.devtools.ksp"
private const val PAPARAZZI_PLUGIN_ID = "app.cash.paparazzi"
private const val ANDROID_LIBRARY_PLUGIN_ID = "com.android.library"
private const val ANDROID_APPLICATION_PLUGIN_ID = "com.android.application"

private const val EXTENSION_NAME = "paparazzigen"
private const val OUTPUT_DIR_OPTION = "paparazzigen.outputDir"
private const val OUTPUT_DIR = "generated/paparazzigen/kotlin"
private const val OUTPUT_PROPERTY_NAME = "paparazzigenGeneratedTests"
private const val INCREMENTAL_PROPERTY = "ksp.incremental"

private const val GROUP = "com.gu.source"
private const val ANNOTATIONS_ARTIFACT = "$GROUP:paparazzigen-annotations"
private const val PROCESSOR_ARTIFACT = "$GROUP:paparazzigen-processor"
private const val TESTING_ARTIFACT = "$GROUP:paparazzigen-testing"

private const val VERSION_RESOURCE = "/paparazzigen.properties"
private const val TEST_SOURCE_SET = "test"

/**
 * Generates Paparazzi screenshot tests from `@PaparazziTest` annotated Compose previews.
 *
 * The plugin does not apply KSP or Paparazzi itself, because their versions are tightly coupled to
 * the consumer's Kotlin and AGP versions. Both must already be applied to the project.
 */
class PaparazziGenPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            val extension = createExtension()
            val outputDir = layout.buildDirectory.dir(OUTPUT_DIR)

            disableKspIncrementalProcessing()

            pluginManager.withPlugin(KSP_PLUGIN_ID) {
                extensions.configure(KspExtension::class.java) {
                    arg(OUTPUT_DIR_OPTION, outputDir.get().asFile.absolutePath)
                }
                addPaparazziGenDependencies(extension)
                registerGeneratedTestSourceDirectory(outputDir)
                afterEvaluate { configureTasks(extension, outputDir) }
            }

            verifyPrerequisitePluginsAreApplied()
        }
    }
}

private fun Project.createExtension(): PaparazziGenExtension =
    extensions.create(EXTENSION_NAME, PaparazziGenExtension::class.java).apply {
        dependencyVersion.convention(pluginVersion())
        addDependencies.convention(true)
        variant.convention("debug")
    }

private fun Project.configureTasks(
    extension: PaparazziGenExtension,
    outputDir: Provider<Directory>,
) {
    val names = TaskNames(this, extension.variant.get())

    // KSP writes these tests with plain file I/O rather than through its CodeGenerator, because
    // CodeGenerator output is attached to the main compilation. Declaring the directory as an
    // output of the KSP task keeps up to date checks and the build cache correct.
    tasks.matching { it.name == names.kspTask }.configureEach {
        outputs.dir(outputDir).withPropertyName(OUTPUT_PROPERTY_NAME)
    }

    tasks.matching { it.name in names.unitTestCompileTasks }.configureEach {
        dependsOn(names.kspTask)
    }
}

/**
 * Adds the paparazzigen artifacts by Maven coordinate.
 *
 * KSP copies the contents of its `ksp<Variant>` configuration when the project has finished
 * evaluating, so adding these dependencies from an `afterEvaluate` block is too late for the
 * processor to be picked up. They are instead registered eagerly, but as a lazy provider, so that
 * the values configured in the `paparazzigen { }` block are still honoured.
 */
private fun Project.addPaparazziGenDependencies(extension: PaparazziGenExtension) {
    val project = this
    configurations.configureEach {
        val configurationName = name
        dependencies.addAllLater(
            project.provider { project.paparazziGenDependenciesFor(configurationName, extension) },
        )
    }
}

private fun Project.paparazziGenDependenciesFor(
    configurationName: String,
    extension: PaparazziGenExtension,
): List<Dependency> {
    if (!extension.addDependencies.get()) return emptyList()

    val artifact = when (configurationName) {
        "compileOnly" -> ANNOTATIONS_ARTIFACT
        "testImplementation" -> TESTING_ARTIFACT
        TaskNames(this, extension.variant.get()).kspConfiguration -> PROCESSOR_ARTIFACT
        else -> return emptyList()
    }
    return listOf(dependencies.create("$artifact:${extension.dependencyVersion.get()}"))
}

private fun Project.registerGeneratedTestSourceDirectory(outputDir: Provider<Directory>) {
    if (isAndroidModule()) {
        extensions.getByType(CommonExtension::class.java)
            .sourceSets
            .getByName(TEST_SOURCE_SET)
            .kotlin
            .directories
            .add(outputDir.get().asFile.absolutePath)
    } else {
        extensions.getByType(SourceSetContainer::class.java)
            .getByName(TEST_SOURCE_SET)
            .java
            .srcDir(outputDir)
    }
}

/**
 * KSP's incremental mode only passes changed files to the processor. Because the processor clears
 * and rewrites its whole output directory, that would delete the tests for unchanged files, so
 * incremental processing is turned off unless the build has explicitly configured it.
 */
private fun Project.disableKspIncrementalProcessing() {
    if (!hasProperty(INCREMENTAL_PROPERTY)) {
        extensions.extraProperties[INCREMENTAL_PROPERTY] = "false"
    }
}

private fun Project.verifyPrerequisitePluginsAreApplied() {
    afterEvaluate {
        requirePlugin(KSP_PLUGIN_ID, "<version matching your Kotlin version>")
        requirePlugin(PAPARAZZI_PLUGIN_ID, "<version matching your AGP version>")
    }
}

private fun Project.requirePlugin(pluginId: String, versionHint: String) {
    check(pluginManager.hasPlugin(pluginId)) {
        "The com.gu.source.paparazzigen plugin requires the $pluginId plugin to be applied to " +
            "project $path. Add `id(\"$pluginId\") version \"$versionHint\"` to its " +
            "plugins { } block."
    }
}

private fun Project.isAndroidModule() = pluginManager.hasPlugin(ANDROID_LIBRARY_PLUGIN_ID) ||
    pluginManager.hasPlugin(ANDROID_APPLICATION_PLUGIN_ID)

/** Names of the KSP and unit test tasks, which differ between Android and plain JVM modules. */
private class TaskNames(
    project: Project,
    variant: String,
) {
    private val isAndroid = project.isAndroidModule()
    private val capitalisedVariant =
        variant.replaceFirstChar { it.uppercase() }.takeIf { isAndroid }.orEmpty()

    val kspConfiguration = "ksp$capitalisedVariant"
    val kspTask = "ksp${capitalisedVariant}Kotlin"
    val unitTestCompileTasks = if (isAndroid) {
        setOf("compile${capitalisedVariant}UnitTestKotlin")
    } else {
        setOf("compileTestKotlin")
    }
}

private fun pluginVersion(): String {
    val properties = Properties()
    val stream =
        checkNotNull(PaparazziGenPlugin::class.java.getResourceAsStream(VERSION_RESOURCE)) {
            "$VERSION_RESOURCE is missing from the paparazzigen plugin jar."
        }
    stream.use(properties::load)
    return checkNotNull(properties.getProperty("version")) {
        "version is missing from $VERSION_RESOURCE."
    }
}