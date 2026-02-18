package com.dsg.app.utils;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;

public class DeviceUtils {
    public static void ensureAppLaunched() {
        // Optionally, bring app to foreground if needed
        // UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        // device.pressHome();
        // device.executeShellCommand("am start -n com.dsg.app/.MainActivity");
    }
}