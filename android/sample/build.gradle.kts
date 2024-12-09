plugins {
    alias(libs.plugins.guardian.application)
    alias(libs.plugins.guardian.compose.application)
}

android {
    namespace = "com.gu.source.sample"

    defaultConfig {
        applicationId = "com.gu.source.sample"
        versionCode = 1
        versionName = libs.versions.libraryVersion.get()

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

detekt {
    baseline = file("detekt-baseline-debug.xml")
}

dependencies {
    implementation(project(path = ":source"))
    implementation(libs.androidx.activity.compose)

    implementation(libs.coil.compose)
}