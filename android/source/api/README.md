# API compatibility checks

## Using Metalava

* Run `./gradlew :source:metalavaGenerateSignatureRelease` to update the baseline.
* Run `./gradlew :source:metalavaCheckCompatibilityRelease` to compare the current API with the 
baseline.

The [API Check action](../../../.github/workflows/api-check.yml) checks compatibility on PRs and 
`main`. It is not a mandatory check at the moment.

## Automatically updating App versions (In progress)

The API baseline and checks will be used to automatically update the app baseline using this simple 
logic:

1. If check fails, the app version will be updated to the next major version.
2. If check passes, but there are changes to the API file,  the app version will be updated to the 
next minor version.
3. If check passes and there are no changes to the API file, the app version will be updated to the
next patch version.