package com.gu.source.paparazzigen.processor

import com.gu.source.paparazzigen.RenderMode
import com.gu.source.paparazzigen.TestDevice
import com.gu.source.paparazzigen.TestFontScale
import com.gu.source.paparazzigen.TestNightMode
import com.gu.source.paparazzigen.TestOrientation

/** The resolved configuration of a single `@PaparazziTest` annotation. */
internal data class TestConfig(
    val nightMode: TestNightMode = TestNightMode.All,
    val device: TestDevice = TestDevice.Phone,
    val fontScale: TestFontScale = TestFontScale.Normal,
    val orientation: TestOrientation = TestOrientation.Portrait,
    val renderMode: RenderMode = RenderMode.Component,
) {
    /** True when any axis is parameterised, and so needs a test runner to supply the values. */
    val isParameterised: Boolean
        get() = nightMode == TestNightMode.All ||
            device == TestDevice.All ||
            fontScale == TestFontScale.All ||
            orientation == TestOrientation.All

    /**
     * Filtering only skips night mode screenshots on non-default devices, font scales and
     * orientations, so it is only useful when night mode is parameterised alongside at least one
     * other axis.
     */
    val needsScreenshotFilter: Boolean
        get() = nightMode == TestNightMode.All &&
            (
                device == TestDevice.All ||
                    fontScale == TestFontScale.All ||
                    orientation == TestOrientation.All
                )

    val classNameSuffix: String
        get() = buildString {
            append(
                when (nightMode) {
                    TestNightMode.All -> ""
                    TestNightMode.Day -> "Day"
                    TestNightMode.Night -> "Night"
                },
            )
            append(
                when (device) {
                    TestDevice.All -> "AllDevices"
                    TestDevice.Phone -> ""
                    TestDevice.Tablet -> "Tablet"
                },
            )
            append(
                when (fontScale) {
                    TestFontScale.All -> "AllFontScales"
                    TestFontScale.Normal -> ""
                    TestFontScale.ExtraLarge -> "ExtraLargeFont"
                },
            )
            append(
                when (orientation) {
                    TestOrientation.All -> "AllOrientations"
                    TestOrientation.Portrait -> ""
                    TestOrientation.Landscape -> "Landscape"
                },
            )
            append(
                when (renderMode) {
                    RenderMode.Component -> ""
                    RenderMode.Screen -> "Screen"
                },
            )
        }
}

internal data class PreviewFunction(
    val functionName: String,
    val testName: String,
)

internal data class TestClass(
    val className: String,
    val config: TestConfig,
    val previews: List<PreviewFunction>,
)

internal data class TestFile(
    val packageName: String,
    val fileName: String,
    val classes: List<TestClass>,
)