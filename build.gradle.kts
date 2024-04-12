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
}

allprojects {
    // Exclude generated files from linter
    tasks.withType<org.jmailen.gradle.kotlinter.tasks.LintTask> {
        exclude { it.file.path.contains("/build/generated/") }
    }
}