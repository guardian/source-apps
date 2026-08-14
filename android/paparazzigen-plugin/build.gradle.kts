import org.gradle.api.tasks.WriteProperties

plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlinter)
}

group = libs.versions.group.get()
version = file("../${libs.versions.versionFileName.get()}").readText().trim()

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}

dependencies {
    // The plugin never applies KSP, Paparazzi or AGP itself - those versions are coupled to the
    // consumer's Kotlin and AGP versions - so it only compiles against them.
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.android.gradlePlugin)
}

// Bakes the plugin's own version into the jar so it can default the version of the paparazzigen
// artifacts it adds as dependencies.
val writeVersionProperties = tasks.register<WriteProperties>("writeVersionProperties") {
    destinationFile.set(
        layout.buildDirectory.file("generated/paparazzigen/paparazzigen.properties"),
    )
    property("version", project.version.toString())
}

sourceSets.named("main") {
    resources.srcDir(writeVersionProperties.map { it.destinationFile.get().asFile.parentFile })
}

gradlePlugin {
    plugins {
        register("paparazzigen") {
            id = "com.gu.source.paparazzigen"
            implementationClass = "com.gu.source.paparazzigen.gradle.PaparazziGenPlugin"
            displayName = "Source Paparazzi test generator"
            description = "Generates Paparazzi screenshot tests from annotated Compose previews."
        }
    }
}
