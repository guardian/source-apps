plugins {
    `java-library`
    alias(libs.plugins.guardian.library.kotlin)
}

dependencies {
    // Paparazzi is supplied by the consumer's Paparazzi Gradle plugin at test runtime, so we only
    // need it to compile against. This ensures the consumer's Paparazzi version always wins.
    compileOnly(libs.paparazzi)

    // Generated tests reference these types directly, so they are part of this module's API.
    api(libs.junit)
    api(libs.google.testParameterInjector)

    testImplementation(libs.paparazzi)
}
