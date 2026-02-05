package com.dsg.automation.framework;

import androidx.test.espresso.IdlingPolicies;
import java.util.concurrent.TimeUnit;

public class WaitUtils {
    public static void setGlobalTimeouts(long seconds) {
        IdlingPolicies.setMasterPolicyTimeout(seconds, TimeUnit.SECONDS);
        IdlingPolicies.setIdlingResourceTimeout(seconds, TimeUnit.SECONDS);
    }
}
