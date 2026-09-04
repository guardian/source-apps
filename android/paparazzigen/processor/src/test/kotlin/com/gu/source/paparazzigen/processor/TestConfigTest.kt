package com.gu.source.paparazzigen.processor

import com.gu.source.paparazzigen.RenderMode
import com.gu.source.paparazzigen.TestDevice
import com.gu.source.paparazzigen.TestFontScale
import com.gu.source.paparazzigen.TestNightMode
import com.gu.source.paparazzigen.TestOrientation
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestConfigTest {
    @Test
    fun `default config is parameterised because night mode defaults to all`() {
        assertTrue(TestConfig().isParameterised)
    }

    @Test
    fun `config with every axis pinned is not parameterised`() {
        val config = TestConfig(
            nightMode = TestNightMode.Day,
            device = TestDevice.Phone,
            fontScale = TestFontScale.Normal,
            orientation = TestOrientation.Portrait,
        )

        assertFalse(config.isParameterised)
    }

    @Test
    fun `night mode alone does not need a screenshot filter`() {
        assertFalse(TestConfig().needsScreenshotFilter)
    }

    @Test
    fun `night mode combined with another axis needs a screenshot filter`() {
        assertTrue(TestConfig(device = TestDevice.All).needsScreenshotFilter)
        assertTrue(TestConfig(fontScale = TestFontScale.All).needsScreenshotFilter)
        assertTrue(TestConfig(orientation = TestOrientation.All).needsScreenshotFilter)
    }

    @Test
    fun `a pinned night mode never needs a screenshot filter`() {
        val config = TestConfig(nightMode = TestNightMode.Day, device = TestDevice.All)

        assertFalse(config.needsScreenshotFilter)
    }

    @Test
    fun `the default config has an empty class name suffix`() {
        assertEquals("", TestConfig().classNameSuffix)
    }

    @Test
    fun `the class name suffix describes every non default axis`() {
        val config = TestConfig(
            nightMode = TestNightMode.Night,
            device = TestDevice.Tablet,
            fontScale = TestFontScale.ExtraLarge,
            orientation = TestOrientation.Landscape,
            renderMode = RenderMode.Screen,
        )

        assertEquals("NightTabletExtraLargeFontLandscapeScreen", config.classNameSuffix)
    }
}