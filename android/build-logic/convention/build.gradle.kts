plugins {
    `kotlin-dsl`
    alias(libs.plugins.android.lint)
}

group = "com.theguardian.buildlogic"

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}

lint {
    baseline = file("gradle-lint-baseline.xml")
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.detekt.gradlePlugin)
    compileOnly(libs.kotlinter.gradlePlugin)
    compileOnly(libs.composeCompiler.gradlePlugin)
    compileOnly(libs.dokka.gradlePlugin)

    lintChecks(libs.androidx.lint.gradle)
}

gradlePlugin {
    plugins {
        register("androidApplicationPlugin") {
            id = "com.theguardian.application"
            implementationClass = "com.theguardian.convention.AndroidApplicationConventionPlugin"
            version = "1"
        }
        register("androidLibraryPlugin") {
            id = "com.theguardian.library.android"
            implementationClass = "com.theguardian.convention.AndroidLibraryConventionPlugin"
            version = "1"
        }
        register("kotlinLibraryPlugin") {
            id = "com.theguardian.library.kotlin"
            implementationClass = "com.theguardian.convention.KotlinLibraryConventionPlugin"
            version = "1"
        }
        register("androidComposeLibrary") {
            id = "com.theguardian.compose.library"
            implementationClass = "com.theguardian.convention.ComposeLibraryConventionPlugin"
            version = "1"
        }
        register("androidComposeApplication") {
            id = "com.theguardian.compose.application"
            implementationClass = "com.theguardian.convention.ComposeApplicationConventionPlugin"
            version = "1"
        }
        register("androidTestPlugin") {
            id = "com.theguardian.test.android"
            implementationClass = "com.theguardian.convention.AndroidTestConventionPlugin"
            version = "1"
        }
    }
}