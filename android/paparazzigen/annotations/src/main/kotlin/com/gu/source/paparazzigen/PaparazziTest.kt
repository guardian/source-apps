package com.gu.source.paparazzigen

/**
 * Generates a Paparazzi screenshot test for the annotated `@Composable` preview function.
 *
 * One test file is generated per production file, containing a test for every annotated function in
 * that file. Functions annotated with different configurations are split into separate test classes
 * within that file.
 *
 * Each axis - [nightMode], [device], [fontScale] and [orientation] - is either `All`, in which case
 * the axis becomes a test parameter and every variant is rendered, or a single specific value which
 * is rendered on its own.
 *
 * ```kotlin
 * // Day and night on a portrait phone, at the default font scale.
 * @PaparazziTest
 * @Preview
 * @Composable
 * internal fun MyWidgetPreview() { MyWidget() }
 *
 * // Day and night, on both phone and tablet, at both font scales.
 * @PaparazziTest(device = TestDevice.All, fontScale = TestFontScale.All)
 * @Preview
 * @Composable
 * internal fun MyWidgetAllSizesPreview() { MyWidget() }
 * ```
 *
 * The annotated function must be a non-private, top level `@Composable` function that is callable
 * with no arguments.
 *
 * @property nightMode The night modes to render in.
 * @property device The devices to render on.
 * @property fontScale The font scales to render at.
 * @property orientation The orientations to render in.
 * @property renderMode Whether to render just the component, or the whole screen.
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class PaparazziTest(
    val nightMode: TestNightMode = TestNightMode.All,
    val device: TestDevice = TestDevice.Phone,
    val fontScale: TestFontScale = TestFontScale.Normal,
    val orientation: TestOrientation = TestOrientation.Portrait,
    val renderMode: RenderMode = RenderMode.Component,
)

/** The night mode variants to render a [PaparazziTest] in. */
enum class TestNightMode {
    /** Render in both day and night mode. */
    All,

    /** Render in day mode only. */
    Day,

    /** Render in night mode only. */
    Night,
}

/** The device variants to render a [PaparazziTest] on. */
enum class TestDevice {
    /** Render on both phone and tablet. */
    All,

    /** Render on a phone only. */
    Phone,

    /** Render on a tablet only. */
    Tablet,
}

/** The font scale variants to render a [PaparazziTest] at. */
enum class TestFontScale {
    /** Render at both the normal and extra large font scale. */
    All,

    /** Render at the device default font scale only. */
    Normal,

    /** Render at a large accessibility font scale only. */
    ExtraLarge,
}

/** The orientation variants to render a [PaparazziTest] in. */
enum class TestOrientation {
    /** Render in both portrait and landscape. */
    All,

    /** Render in portrait only. */
    Portrait,

    /** Render in landscape only. */
    Landscape,
}

/** How much of the screen a [PaparazziTest] should render. */
enum class RenderMode {
    /**
     * Shrink the snapshot to the component's drawable area. Use for sub screen level components.
     */
    Component,

    /** Render a full, device sized screen. Use for screen level components. */
    Screen,
}