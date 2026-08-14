package com.gu.source.paparazzigen.processor

import com.gu.source.paparazzigen.TestDevice
import kotlin.test.Test
import kotlin.test.assertEquals

class NamingTest {
    @Test
    fun `test file name replaces the kt extension with the test suffix`() {
        assertEquals("CoreButtonPaparazziTest", testFileName("CoreButton.kt"))
    }

    @Test
    fun `test class name has no config suffix when the file has a single config`() {
        val name = testClassName(
            sourceFileName = "CoreButton.kt",
            config = TestConfig(),
            isOnlyConfigInFile = true,
        )

        assertEquals("CoreButtonPaparazziTest", name)
    }

    @Test
    fun `test class name is suffixed with the config when a file has several configs`() {
        val name = testClassName(
            sourceFileName = "CoreButton.kt",
            config = TestConfig(device = TestDevice.Tablet),
            isOnlyConfigInFile = false,
        )

        assertEquals("CoreButtonPaparazziTestTablet", name)
    }

    @Test
    fun `test function name strips the preview suffix and decapitalises`() {
        assertEquals("coreButton", testFunctionName("CoreButtonPreview", taken = emptySet()))
    }

    @Test
    fun `test function name only decapitalises when there is no preview suffix`() {
        assertEquals("coreButton", testFunctionName("CoreButton", taken = emptySet()))
    }

    @Test
    fun `test function name falls back to the full name on collision`() {
        val name = testFunctionName("CoreButtonPreview", taken = setOf("coreButton"))

        assertEquals("coreButtonPreview", name)
    }

    @Test
    fun `test function name falls back to a numbered name on repeated collision`() {
        val name = testFunctionName(
            functionName = "CoreButtonPreview",
            taken = setOf("coreButton", "coreButtonPreview"),
        )

        assertEquals("coreButtonPreview2", name)
    }
}