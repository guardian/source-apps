![source](https://github.com/guardian/source-android/assets/79363218/3aecb407-00f6-4472-a662-7504d5f0315f)

# The Source library for Android

> [!Note]
> ~~This is an exploratory project as we evolve Source to support the apps, and the accompanying code infra.~~

### Using the library

Add the library dependency:

```kotlin
implementation("com.gu.source:source-android:0.0.1")
```

See the main [README](../README.md) for using the library.

### Building and using as a bundled repo

~~Please note: This is a temporary solution until we publish the library to mavencentral~~

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

### Other notes

1. We use the `com.gu` package name and group id so we can use the Guardian's Sonatype infra for signing and publishing the library. See [this comment](https://github.com/guardian/source-android/pull/10/files?w=1#r1567071142) for reference. 