package com.dsg.app.hooks;

import com.dsg.app.utils.EspressoIdlingResource;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import com.dsg.app.utils.PermissionUtils;

public class Hooks {
    @Before
    public void setUp() {
        // Register idling resources
        // Espresso.registerIdlingResources(EspressoIdlingResource.getIdlingResource());
        PermissionUtils.grantLocationPermission();
        PermissionUtils.grantNotificationPermission();
    }
    @After
    public void tearDown() {
        // Unregister idling resources if needed
        // Espresso.unregisterIdlingResources(EspressoIdlingResource.getIdlingResource());
    }
}