plugins {
    alias(libs.plugins.guardian.application)
    alias(libs.plugins.guardian.compose.application)
    alias(libs.plugins.licensee)
}

licensee {
    allow("Apache-2.0")
    allow("MIT")
    allowUrl("https://jsoup.org/license") {
        because("JSoup copy of MIT license")
    }
}

android {
    namespace = "com.gu.source.sample"

    defaultConfig {
        applicationId = "com.gu.source.sample"
        versionCode = 1
        versionName = rootProject.file(libs.versions.versionFileName.get()).readText().trim()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(path = ":source"))
    implementation(libs.androidx.activity.compose)

    implementation(libs.coil.compose)

    implementation(libs.kotlin.serialisation.core)

    implementation(libs.androidx.nav.runtime)
    implementation(libs.androidx.nav.ui)
}