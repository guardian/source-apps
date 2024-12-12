plugins {
    `maven-publish`
    signing
    alias(libs.plugins.guardian.library.android)
    alias(libs.plugins.guardian.compose.library)
    alias(libs.plugins.guardian.detekt)
}

android {
    namespace = libs.versions.group.get()

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
            groupId = libs.versions.group.get()
            artifactId = "source-android"
            version = libs.versions.libraryVersion.get()

            pom {
                name.set("Source Android")
                description.set("The Guardian's design system library for Android")
                url.set("https://github.com/guardian/source-apps")
                packaging = "aar"
                licenses {
                    license {
                        name.set("Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("ab-gnm")
                        name.set("Aditya Bhaskar")
                        email.set("aditya.bhaskar@guardian.co.uk")
                        url.set("https://github.com/ab-gnm")
                    }
                }
                organization {
                    name.set("Guardian News & Media")
                    url.set("https://www.theguardian.com")
                }
                scm {
                    connection.set("scm:git:github.com/guardian/source-apps.git")
                    developerConnection.set("scm:git:ssh://github.com/guardian/source-apps.git")
                    url.set("https://github.com/guardian/source-apps/tree/main")
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
        // Use as `./gradlew :source:publishReleasePublicationToGusourceRepository`
        maven {
            name = "gusource"
            url = uri("${project.buildDir}/gusource")
        }
    }
}

signing {
    useInMemoryPgpKeys(
        System.getenv("AUTOMATED_MAVEN_RELEASE_PGP_SECRET") ?: "",
        // We use a passwordless key so the an empty string is used as password here.
        "",
    )
    sign(publishing.publications)
}