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

    // Create a single variant for publishing called "release". Add separate jars for javadoc
    // and sources.
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

            pom {
                name.set("Source Android")
                description.set("Guardian design system library for Android")
                url.set("https://github.com/guardian/source-android")
                packaging = "aar"
                licenses {
                    license {
                        name.set("Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("ab-gnm")
                        name.set("Aditya Bhaskar")
                        email.set("aditya.bhaskar@guardian.co.uk")
                        url.set("https://github.com/ab-gnm")
                        organization {
                            name.set("Guardian News & Media")
                            url.set("https://www.theguardian.com")
                        }
                    }
                }
            }

            // Use the artifacts called "release" for publishing.
            afterEvaluate {
                from(components["release"])
            }
        }
    }

    repositories {
        // Adds a task for publishing locally to the build directory.
        maven {
            name = "gusource"
            url = uri("${project.buildDir}/gusource")
        }
    }
}