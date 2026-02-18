package com.dsg.app.utils;

import android.Manifest;
import android.os.Build;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;

public class PermissionUtils {
    public static void grantLocationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            try {
                device.executeShellCommand("pm grant com.dsg.app " + Manifest.permission.ACCESS_FINE_LOCATION);
            } catch (Exception e) {
                // Log or handle
            }
        }
    }
    public static void grantNotificationPermission() {
        if (Build.VERSION.SDK_INT >= 33) {
            UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            try {
                device.executeShellCommand("pm grant com.dsg.app " + Manifest.permission.POST_NOTIFICATIONS);
            } catch (Exception e) {
                // Log or handle
            }
        }
    }
}