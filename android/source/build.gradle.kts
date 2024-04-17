plugins {
    `maven-publish`
    alias(libs.plugins.guardian.library.android)
    alias(libs.plugins.guardian.compose.library)
    alias(libs.plugins.guardian.detekt)
}

android {
    namespace = "com.gu.source"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

dependencies {
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.gu.source"
            artifactId = "source-android"
            version = libs.versions.libraryVersion.get()

            afterEvaluate {
                from(components["release"])
            }
        }
    }
    repositories {
        maven {
            name = "gusource"
            url = uri("${project.buildDir}/gusource")
        }
    }
}