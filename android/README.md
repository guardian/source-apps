![source](https://github.com/guardian/source-android/assets/79363218/3aecb407-00f6-4472-a662-7504d5f0315f)

# The Source library for Android

### Using the library

The library is available on Maven Central. Add the library dependency to your `build.gradle.kts` file:

```kotlin
implementation("com.gu.source:source-android:0.0.1")
```

See the main [README](../README.md) for using the library.

### Building and using as a bundled repo

1. Build the library
   Run
   ```shell
   ./gradlew :source:publishReleasePublicationToGusourceRepository
   ```
   This will produce the library output at `/source/build/gusource/`.

2. Copy the built library to the news app
   Copy the library the built folder from `/source/build/gusource/` to the `android-news-app/src/main/libs/maven` folder in the `android-news-app` repo.

3. Update the version number in the news app
   If the library version has changed, update it in the version catalog for the news app.

### Building and using from maven local

1. Build the library
   Run
   ```shell
   ./gradlew :source:publishToMavenLocal
   ```
   This will publish the library to your local maven repository.

2. Update the version number in the news app
   If the library version has changed, update it in the version catalog for the news app.
   
3. Ensure you have `mavenLocal` declared first in your repositories
   ```groovy
   repositories {
       mavenLocal()
       mavenCentral()
       google()
   }
   ```

### Other notes

1. We use the `com.gu` package name and group id so we can use the Guardian's Sonatype infra for signing and publishing the library. See [this comment](https://github.com/guardian/source-android/pull/10/files?w=1#r1567071142) for reference. 