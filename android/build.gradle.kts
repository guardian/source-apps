import org.jmailen.gradle.kotlinter.tasks.FormatTask

buildscript {
    dependencies {
        classpath(libs.other.composeLint)
    }
}

plugins {
    alias(libs.plugins.agp.application) apply false
    alias(libs.plugins.kgp) apply false
    alias(libs.plugins.agp.library) apply false
    alias(libs.plugins.kotlinter) apply false
    alias(libs.plugins.detekt) apply false
    alias(libs.plugins.paparazzi) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.dokka) apply false
    alias(libs.plugins.metalava) apply false
    alias(libs.plugins.licensee) apply false
}

group = libs.versions.group.get()
version = rootProject.file(libs.versions.versionFileName.get()).readText().trim()

allprojects {
    // Exclude generated files from linter
    tasks.withType<org.jmailen.gradle.kotlinter.tasks.LintTask>().configureEach {
        source = this.source.minus(fileTree("src/build/generated")).asFileTree
    }
    tasks.withType<FormatTask>().configureEach {
        source = this.source.minus(fileTree("src/build/generated")).asFileTree
    }
}

fun Project.getVersionNumber() = rootProject.file("version.txt").readText().trim()