plugins {
    alias(libs.plugins.guardian.application)
    alias(libs.plugins.guardian.compose.application)
    alias(libs.plugins.detekt)
}

android {
    namespace = "com.theguardian.source.sample"

    defaultConfig {
        applicationId = "com.theguardian.source"
        versionCode = 1
        versionName = "1.0"

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
                "proguard-rules.pro"
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
    implementation(libs.androidx.activity.compose)
}