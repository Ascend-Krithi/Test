package com.example.checkout

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.assertTrue

@RunWith(AndroidJUnit4::class)
class DSGCheckoutTest {
    // Replace MainActivity::class.java with the actual launch activity
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    private val checkoutScreen = CheckoutScreen()
    private val enterPromosScreen = EnterPromosScreen()

    @Test
    fun testNavigateFromPromosCardToEnterPromosScreen() {
        // Tap on the Promos Card
        checkoutScreen.tapPromosCard()

        // Assert that the Enter Promos screen is displayed
        assertTrue(
            "Enter Promos screen should be displayed after tapping Promos Card",
            enterPromosScreen.isScreenDisplayed()
        )
    }
}
