package com.gu.source.utils.paparazzi

import com.android.resources.NightMode
import com.android.resources.ScreenOrientation
import org.junit.Assert.assertEquals
import org.junit.Test

class ToDeviceConfigTest {
    @Test
    fun `keeps dimensions when phone is rendered in its native portrait orientation`() {
        val base = BaseDeviceConfig.Phone.deviceConfig
        val config = BaseDeviceConfig.Phone.toDeviceConfig(orientation = Orientation.Portrait)

        assertEquals(ScreenOrientation.PORTRAIT, config.orientation)
        assertEquals(base.screenWidth, config.screenWidth)
        assertEquals(base.screenHeight, config.screenHeight)
    }

    @Test
    fun `swaps dimensions when phone is rendered in landscape`() {
        val base = BaseDeviceConfig.Phone.deviceConfig
        val config = BaseDeviceConfig.Phone.toDeviceConfig(orientation = Orientation.Landscape)

        assertEquals(ScreenOrientation.LANDSCAPE, config.orientation)
        assertEquals(base.screenHeight, config.screenWidth)
        assertEquals(base.screenWidth, config.screenHeight)
    }

    @Test
    fun `swaps dimensions when tablet is rendered in portrait`() {
        val base = BaseDeviceConfig.Tablet.deviceConfig
        val config = BaseDeviceConfig.Tablet.toDeviceConfig(orientation = Orientation.Portrait)

        assertEquals(ScreenOrientation.PORTRAIT, config.orientation)
        assertEquals(base.screenHeight, config.screenWidth)
        assertEquals(base.screenWidth, config.screenHeight)
    }

    @Test
    fun `keeps dimensions when tablet is rendered in its native landscape orientation`() {
        val base = BaseDeviceConfig.Tablet.deviceConfig
        val config = BaseDeviceConfig.Tablet.toDeviceConfig(orientation = Orientation.Landscape)

        assertEquals(ScreenOrientation.LANDSCAPE, config.orientation)
        assertEquals(base.screenWidth, config.screenWidth)
        assertEquals(base.screenHeight, config.screenHeight)
    }

    @Test
    fun `applies night mode and font scale`() {
        val config = BaseDeviceConfig.Phone.toDeviceConfig(
            nightMode = NightMode.NIGHT,
            fontScale = FontScale.ExtraLarge,
        )

        assertEquals(NightMode.NIGHT, config.nightMode)
        assertEquals(FontScale.ExtraLarge.value, config.fontScale, 0f)
    }

    @Test
    fun `defaults to light mode, normal font scale and portrait`() {
        val config = BaseDeviceConfig.Phone.toDeviceConfig()

        assertEquals(NightMode.NOTNIGHT, config.nightMode)
        assertEquals(FontScale.Normal.value, config.fontScale, 0f)
        assertEquals(ScreenOrientation.PORTRAIT, config.orientation)
    }
}