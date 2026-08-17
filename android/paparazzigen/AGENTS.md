# AGENTS.md - paparazzigen

Guidance for working on paparazzigen itself. For how to *use* it, see [README.md](README.md).

## Layout

| Path | Type | Notes |
|---|---|---|
| `annotations/` | Kotlin JVM | `@PaparazziTest` + enums. No dependencies. |
| `processor/` | Kotlin JVM | KSP processor, KotlinPoet. Depends on `annotations`. |
| `testing/` | Kotlin JVM | Runtime helpers. `compileOnly` on Paparazzi, `api` on JUnit + TestParameterInjector. |
| `../paparazzigen-plugin/` | Included build | The Gradle plugin. **Not** a subproject of the main build. |

All four are kept entirely separate from `:source` so they can be published and consumed
independently.

### Processor files

- `PaparazziTestProcessor.kt` - KSP entry point, symbol collection, validation, file I/O.
- `TestConfig.kt` - the resolved config of one annotation, plus `isParameterised`,
  `needsScreenshotFilter` and `classNameSuffix`.
- `Naming.kt` - file, class and test method naming rules.
- `TestFileGenerator.kt` - all KotlinPoet emission. Pure, and therefore the easiest to unit test.

## Things that will bite you

### The processor writes files itself, not via `CodeGenerator`

`CodeGenerator` output is attached to the **main** compilation, but these tests belong to the unit
test source set. So the processor writes with plain `File.writeText` to the directory given by the
`paparazzigen.outputDir` KSP option, and the Gradle plugin registers that directory on the test
source set and as an output of the KSP task.

Using `kspTest(...)` instead has been evaluated and rejected three times. It does not work because:

- `getSymbolsWithAnnotation` only scans the current compilation's **sources**; main would be on the
  classpath.
- `SOURCE` retention is erased from bytecode, so the annotation would have to become `BINARY` and
  would leak into the published AAR.
- `containingFile` is `null` for classpath declarations, which destroys the one-test-file-per-
  production-file grouping.

Don't re-litigate this without new information.

### KSP *copies* its processor classpath, it does not `extendsFrom`

`kspDebugKotlinProcessorClasspath` snapshots the contents of `kspDebug` at the end of evaluation.
Consequences:

- Dependencies added in `afterEvaluate` **never reach the processor**.
- `Configuration.withDependencies` on `kspDebug` never fires.

The working pattern, in `PaparazziGenPlugin.addPaparazziGenDependencies`, is eager registration with
a lazy value:

```kotlin
configurations.configureEach {
    dependencies.addAllLater(project.provider { /* ... */ })
}
```

That keeps the `paparazzigen { }` extension values honoured while still being early enough.

### Lint/format/detekt vs. the generated directory

The generated directory is part of the test source set, so Gradle fails the build with *"uses this
output of task ':source:kspDebugKotlin' without declaring a dependency"* unless those tasks depend
on the KSP task. Two traps:

- `setSource(source.minus(fileTree(dir)))` does **not** fix it. `FileCollection.minus` subtracts
  files, not the tracked directory. An explicit `dependsOn` is required, *plus* an `exclude` filter
  to keep generated code out of linting.
- The validation only fires when both tasks are in the **same** Gradle invocation. Running
  `:source:lintKotlinTest` alone passes. Always verify with a full run.

### Incremental processing is off

The processor clears and rewrites its whole output directory, so KSP's incremental mode - which only
passes changed files - would delete tests for unchanged files. The plugin sets `ksp.incremental=false`
unless the build has already configured it. The output is also cleared on the first round
*regardless of whether any symbols were found*, so that a file losing its last annotation removes
its stale test.

### Generated code is not linted

KotlinPoet always emits explicit `public` modifiers and has no toggle for it
([KotlinPoet #1099](https://github.com/square/KotlinPoet/issues/1099)), so generated code cannot
satisfy the repo's style. It is excluded rather than made to conform. Don't try to make golden
strings in tests match repo style either - match what KotlinPoet actually emits.

### The Gradle plugin is an included build

- Its tasks are addressed by **directory** name: `:paparazzigen-plugin:lintKotlin` works,
  `:paparazzigen-gradle-plugin:jar` does not, even though the latter is its `rootProject.name`.
- `kotlin-dsl` applies SAM-with-receiver, so `Action<T>` lambdas expose `T` as `this`, **not** `it`.
  `Spec` lambdas such as `tasks.matching { it.name == ... }` still use `it`.
- AGP and KSP are `compileOnly` only. The plugin must never apply them.
- The plugin's version is baked into its jar as `/paparazzigen.properties` by the
  `writeVersionProperties` task, and used as the default `dependencyVersion`.

### `:source` resolves the artifacts by coordinate

The plugin adds dependencies by Maven coordinate so external consumers work. `:source` maps those
coordinates back to the local projects with `dependencySubstitution`, so there aren't two sets of
dependency declarations. If you rename a module, update that block in `source/build.gradle.kts`.

## Conventions

- `.editorconfig` sets `insert_final_newline = false`, but file creation tools add a trailing
  newline. **Run `./gradlew :paparazzigen:<module>:formatKotlin` after creating any Kotlin file**,
  or Kotlinter fails with `[standard:final-newline] Redundant newline`.
- Detekt enforces `UndocumentedPublicProperty`, `ReturnCount` (max 2), `LongMethod` (max 60) and
  `StringLiteralDuplication` here. Extract constants for repeated literals and long expected strings
  in tests.
- Every public declaration in `annotations` and `testing` needs KDoc, including enum entries and
  properties - they are part of the published API.

## Verifying changes

```bash
# Unit tests for the processor and helpers
./gradlew :paparazzigen:processor:test :paparazzigen:testing:test

# Style
./gradlew :paparazzigen:processor:formatKotlin lintKotlin :paparazzigen-plugin:lintKotlin detekt

# End to end: does :source still generate, compile and match its baselines?
./gradlew :source:verifyPaparazziDebug

# What the processor actually produced
find source/build/generated/paparazzigen -name '*.kt'
```

After changing generation, run the full CI equivalent from a clean state, because of the
same-invocation caveat above:

```bash
./gradlew clean
./gradlew licensee lint lintKotlin :build-logic:convention:lint :paparazzigen-plugin:lintKotlin \
    detekt verifyPaparazziDebug test
```

Changing naming or config grouping renames snapshot files. Delete the old baselines and re-record
with `./gradlew :source:recordPaparazziDebug`, then confirm the new images are byte identical to the
old ones - the rendering shouldn't have changed, only the file names.

## Known gaps

- Previews needing a wrapper (e.g. `AppColourMode` with a background `Modifier`) aren't supported,
  so `SourceRatingTest` and `SourceChipTest` are still hand written. See the TODO in
  `TestFileGenerator.kt`.
- Publishing is not set up yet. The shared release workflow's `MODULES` input is used as both a
  Gradle path and a file path, so nested modules need a small upstream change to
  `gha-gradle-library-release-workflow`.
- A non-`debug` `variant`, `addDependencies = false` and a custom `dependencyVersion` have never
  been exercised.
