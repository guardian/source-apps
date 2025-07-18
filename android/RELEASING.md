# Releasing

This document describes the process of releasing a new version of the library.

## Production release

To create a production release, run the [Release action](https://github.com/guardian/source-apps/actions/workflows/release.yml)
with the `main` branch as the target. This action will:

- Update the version number in the `version.txt` file
- Update the API in the `source/api.txt` file
- Publish the library to Maven Central with the new version number
- Create a Github release with the new version number

## Preview releases

To create a preview release, run the [Release action](https://github.com/guardian/source-apps/actions/workflows/release.yml)
with <u>your working branch</u> as the target. This action will:

- Publish the library to the `mavenCentral` repository with a preview version number
- Add a comment to your PR with the preview version number and a link to the workflow run

Preview versions follow the format `x.y.z-PREVIEW.<branch-name>.<Date-Time>.<commit-hash>`, where 
`x.y.z` is the evaluated version number.

We can do multiple preview releases for the same branch to test different changes before merging to 
`main`. To use a preview version in the app, use the full version name in the version catalog.

E.g.:

```toml
[versions]
source = "0.10.0-PREVIEW.abreleaseversioning.2025-06-26T1217.d364320a"

[libs]
gu-source = { module = "com.gu.source:source-android", version.ref = "source" }
```

## Versioning

The library uses [Semantic Versioning](https://semver.org/) to manage versions. The current version
number is defined in the [`version.txt`](version.txt) file.  It is used by Gradle to set the version 
of the library in the [`source/build.gradle.kts`](source/build.gradle.kts) file. The path for this 
file is set in the version catalog under the property `versionFileName`.

> [!Important]
> Do not edit the `version.txt` file manually. It is automatically updated by the
> [Release action](../../../.github/workflows/release.yml) when run on `main`.

### Metalava

The library uses [Metalava](https://github.com/tylerbwong/metalava-gradle) to generate and check the
API signature. The API is defined in [`source/api/source-api.txt`](source/api/source-api.txt).

The reusable releases workflow uses the `:source:metalavaGenerateSignatureRelease` and 
`:source:metalavaCheckCompatibilityRelease` tasks tasks to generate and check the API signature.

### Automatic version increments

The version number is automatically updated by the [Release action](../../../.github/workflows/release.yml)
when run on `main`. The action reads the version number from the `version.txt`, and uses the 
[`source/api/source-api.txt`](source/api/source-api.txt) to calculate the next version based on the 
changes made to the API. Broadly, the version is incremented based on the type of changes made:

- **Major**: When `metalavaCheckCompatibilityRelease` fails, indicating a breaking change to the 
API.
- **Minor**: When `metalavaCheckCompatibilityRelease` but there are changes to `api.txt` indicating 
new public APIs are added, and `metalavaCheckCompatibilityRelease` passes.
- **Patch**: When `metalavaCheckCompatibilityRelease` passes and there are no changes to the API.

See the 
[reusable release workflow documentation](https://github.com/guardian/gha-gradle-library-release-workflow/)
for more details.
