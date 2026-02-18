package com.dsg.app.utils;

import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.idling.CountingIdlingResource;

public class EspressoIdlingResource {
    private static final CountingIdlingResource resource =
            new CountingIdlingResource("GLOBAL");
    public static void increment() {
        resource.increment();
    }
    public static void decrement() {
        if (!resource.isIdleNow()) {
            resource.decrement();
        }
    }
    public static IdlingResource getIdlingResource() {
        return resource;
    }
}