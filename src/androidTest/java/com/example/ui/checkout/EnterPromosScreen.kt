package com.example.ui.checkout

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.assertion.ViewAssertions.matches

class EnterPromosScreen {
    // Replace R.id.enter_promos_title and R.id.promos_input_field with actual IDs
    private val titleMatcher = withId(R.id.enter_promos_title)
    private val inputFieldMatcher = withId(R.id.promos_input_field)

    fun assertScreenIsDisplayed() {
        onView(titleMatcher).check(matches(isDisplayed()))
        onView(inputFieldMatcher).check(matches(isDisplayed()))
    }
}
