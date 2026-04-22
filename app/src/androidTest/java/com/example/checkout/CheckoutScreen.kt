package com.example.checkout

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.hamcrest.Matchers.allOf

class CheckoutScreen {
    // Replace R.id.promos_card with the actual ID of the Promos Card
    private val promosCardMatcher = withId(R.id.promos_card)

    fun tapPromosCard() {
        onView(allOf(promosCardMatcher, isDisplayed())).perform(click())
    }
}
