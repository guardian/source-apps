plugins {
    alias(libs.plugins.guardian.library.android)
    alias(libs.plugins.guardian.compose.library)
    alias(libs.plugins.guardian.detekt)
}

android {
    namespace = "com.theguardian.source"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {
}