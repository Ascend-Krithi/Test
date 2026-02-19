package com.example.dsgcheckout.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.assertion.ViewAssertions.matches

class EnterPromosScreen {
    // Locator for a unique element on the Enter Promos screen
    private val enterPromosTitleMatcher = withId(R.id.enter_promos_title)

    // Method to validate that the Enter Promos screen is displayed
    fun isScreenDisplayed(): Boolean {
        return try {
            onView(enterPromosTitleMatcher).check(matches(isDisplayed()))
            true
        } catch (e: Throwable) {
            false
        }
    }
}
