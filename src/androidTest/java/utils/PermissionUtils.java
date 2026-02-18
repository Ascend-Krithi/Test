package utils;

import androidx.test.rule.GrantPermissionRule;

public class PermissionUtils {
    public static GrantPermissionRule grantLocationPermission() {
        return GrantPermissionRule.grant("android.permission.ACCESS_FINE_LOCATION");
    }
    public static GrantPermissionRule grantNotificationPermission() {
        return GrantPermissionRule.grant("android.permission.POST_NOTIFICATIONS");
    }
}