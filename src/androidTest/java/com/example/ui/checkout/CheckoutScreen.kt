package com.example.ui.checkout

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.assertion.ViewAssertions.matches
import org.hamcrest.Matchers.allOf

class CheckoutScreen {
    // Replace R.id.promos_card with the actual ID of the Promos Card
    private val promosCardMatcher = withId(R.id.promos_card)

    fun tapPromosCard() {
        onView(promosCardMatcher)
            .check(matches(isDisplayed()))
            .perform(click())
    }
}
