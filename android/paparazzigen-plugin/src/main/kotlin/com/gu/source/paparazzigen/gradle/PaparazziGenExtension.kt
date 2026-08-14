package com.gu.source.paparazzigen.gradle

import org.gradle.api.provider.Property

/**
 * Configuration for the `com.gu.source.paparazzigen` plugin.
 *
 * ```kotlin
 * paparazzigen {
 *     dependencyVersion.set("10.0.1")
 *     addDependencies.set(true)
 *     variant.set("debug")
 * }
 * ```
 */
abstract class PaparazziGenExtension {
    /**
     * Version of the `com.gu.source:paparazzigen-*` artifacts to add as dependencies.
     *
     * Defaults to the version of this plugin, which is the only combination that is tested
     * together. Only override this if you need to pin the runtime artifacts independently.
     */
    abstract val dependencyVersion: Property<String>

    /**
     * Whether the plugin adds the paparazzigen dependencies for you. Defaults to `true`.
     *
     * Set to `false` to declare `compileOnly`, `ksp` and `testImplementation` dependencies on the
     * paparazzigen artifacts yourself.
     */
    abstract val addDependencies: Property<Boolean>

    /**
     * The Android build variant the processor runs against. Defaults to `debug`.
     *
     * Tests are generated once, from a single variant, so that the same test is not generated
     * several times. Ignored for non-Android modules.
     */
    abstract val variant: Property<String>
}