package com.gu.source.paparazzigen.processor

private const val PREVIEW_SUFFIX = "Preview"
private const val TEST_CLASS_SUFFIX = "PaparazziTest"

internal fun testFileName(sourceFileName: String) =
    sourceFileName.removeSuffix(".kt") + TEST_CLASS_SUFFIX

/**
 * When a file contains only one config the plain [testFileName] name is used, so that snapshot file
 * names stay stable. If there are more than one configs used on previews in a file, each class is
 * suffixed with a description of its config.
 */
internal fun testClassName(
    sourceFileName: String,
    config: TestConfig,
    isOnlyConfigInFile: Boolean,
): String {
    val base = testFileName(sourceFileName)
    return if (isOnlyConfigInFile) base else base + config.classNameSuffix
}

/**
 * Strips the conventional `Preview` suffix and decapitalises, e.g. `CoreButtonPreview` becomes
 * `coreButton`. Falls back to progressively adding an index if that would collide with a test
 * already generated for the same class (e.g. `coreButton1`, `coreButton2`, etc).
 */
internal fun testFunctionName(functionName: String, taken: Set<String>): String {
    val candidates = sequence {
        val stripped = functionName.removeSuffix(PREVIEW_SUFFIX)
        if (stripped.isNotEmpty()) yield(stripped.decapitalise())
        yield(functionName.decapitalise())
        var index = 2
        while (true) {
            yield(functionName.decapitalise() + index)
            index++
        }
    }
    return candidates.first { it !in taken }
}

private fun String.decapitalise() = replaceFirstChar { it.lowercase() }