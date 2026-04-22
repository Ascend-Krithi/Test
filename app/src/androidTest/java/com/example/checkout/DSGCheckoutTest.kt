package com.example.checkout

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DSGCheckoutTest {
    @get:Rule
    val activityRule = ActivityTestRule(CheckoutActivity::class.java)

    private val checkoutScreen = CheckoutScreen()
    private val enterPromosScreen = EnterPromosScreen()

    @Test
    fun testNavigateFromPromosCardToEnterPromosScreen() {
        // Tap the Promos Card
        checkoutScreen.tapPromosCard()
        // Assert Enter Promos screen is displayed
        enterPromosScreen.assertScreenIsDisplayed()
    }
}
