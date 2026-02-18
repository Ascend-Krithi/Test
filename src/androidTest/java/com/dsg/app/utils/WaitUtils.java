package com.dsg.app.utils;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.matcher.ViewMatchers;
import android.view.View;
import org.hamcrest.Matcher;

public class WaitUtils {
    public static void waitForView(final Matcher<View> matcher, long timeoutMs) {
        final long startTime = System.currentTimeMillis();
        final long endTime = startTime + timeoutMs;
        do {
            try {
                Espresso.onView(matcher).check((view, noViewFoundException) -> {});
                return;
            } catch (NoMatchingViewException e) {
                // Ignore and retry
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (System.currentTimeMillis() < endTime);
        throw new AssertionError("View " + matcher + " not found after " + timeoutMs + "ms");
    }
}