plugins {
    alias(libs.plugins.guardian.library.kotlin)
}

dependencies {
    implementation(project(":paparazzigen:annotations"))
    implementation(libs.ksp.symbolProcessingApi)
    implementation(libs.kotlinpoet)

    testImplementation(libs.junit)
}
