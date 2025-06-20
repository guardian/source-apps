import org.jmailen.gradle.kotlinter.tasks.FormatTask

buildscript {
    dependencies {
        classpath(libs.other.composeLint)
        // This is temporarily required till detekt catches up with the latest Kotlin version
        classpath(libs.kotlin.compiler.embeddable)
    }
}

plugins {
    alias(libs.plugins.agp.application) apply false
    alias(libs.plugins.kgp) apply false
    alias(libs.plugins.agp.library) apply false
    alias(libs.plugins.kotlinter) apply false
    alias(libs.plugins.detekt) apply false
    alias(libs.plugins.paparazzi) apply false
//    alias(libs.plugins.nexus.publish)
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.dokka) apply false
    alias(libs.plugins.metalava) apply false
    alias(libs.plugins.licensee) apply false
}

group = libs.versions.group.get()
version = rootProject.file(libs.versions.versionFileName.get()).readText().trim()

//nexusPublishing {
//    repositories {
//        sonatype {
//            nexusUrl.set(uri("https://ossrh-staging-api.central.sonatype.com/service/local/"))
//            snapshotRepositoryUrl.set(uri("https://central.sonatype.com/repository/maven-snapshots/"))
//
//            // Sonatype token provides username and passwords as revokable secrets combined with a
//            // colon. We split them and provide it to the nexus plugin. See here for more:
//            // https://github.com/guardian/gha-scala-library-release-workflow/commit/23a148a03cf71bb2093a91f047d3c368adcdf45c
//            val token = System.getenv("AUTOMATED_MAVEN_RELEASE_SONATYPE_TOKEN") ?: ":"
//            val (uname, pwd) = token.split(":")
//            username = uname
//            password = pwd
//        }
//    }
//}

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