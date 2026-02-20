package com.example.checkout

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.checkout.R

class CheckoutScreen {
    private val promosCard = onView(withId(R.id.promos_card))

    fun tapPromosCard() {
        promosCard.perform(click())
    }
}
