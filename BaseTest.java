package com.dsg.automation.framework;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import com.dsg.automation.MainActivity;
import org.junit.Rule;

public abstract class BaseTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);
}
