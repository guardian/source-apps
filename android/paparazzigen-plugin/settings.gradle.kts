pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

// Must match the artifactId of the published plugin implementation so that Gradle can substitute
// this included build for the `com.gu.source:paparazzigen-gradle-plugin` coordinate.
rootProject.name = "paparazzigen-gradle-plugin"
