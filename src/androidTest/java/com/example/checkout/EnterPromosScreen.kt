package com.example.checkout

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText

class EnterPromosScreen {
    private val enterPromosTitle = onView(withText("Enter Promos"))

    fun isScreenDisplayed(): Boolean {
        enterPromosTitle.check(matches(isDisplayed()))
        return true
    }
}
