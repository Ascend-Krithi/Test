package com.example.checkout

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.hamcrest.Matchers.allOf

class EnterPromosScreen {
    // Replace R.id.enter_promos_title with a unique element on the Enter Promos screen
    private val enterPromosTitleMatcher = withId(R.id.enter_promos_title)

    fun assertScreenIsDisplayed() {
        onView(allOf(enterPromosTitleMatcher, isDisplayed())).check(matches(isDisplayed()))
    }
}
