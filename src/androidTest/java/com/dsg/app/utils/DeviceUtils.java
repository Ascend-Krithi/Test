package com.dsg.app.utils;

import androidx.test.platform.app.InstrumentationRegistry;

public class DeviceUtils {
    public static String getArgument(String key) {
        return InstrumentationRegistry.getArguments().getString(key, "");
    }
}
