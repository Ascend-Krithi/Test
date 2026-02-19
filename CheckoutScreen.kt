package com.example.dsgcheckout.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.hamcrest.Matchers.allOf

class CheckoutScreen {
    // Locator for the Promos Card
    private val promosCardMatcher = withId(R.id.promos_card)

    // Method to tap the Promos Card
    fun tapPromosCard() {
        onView(promosCardMatcher).perform(click())
    }
}
