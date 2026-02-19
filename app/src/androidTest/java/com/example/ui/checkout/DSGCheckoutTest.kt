package com.example.ui.checkout

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DSGCheckoutTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    private val checkoutScreen = CheckoutScreen()
    private val enterPromosScreen = EnterPromosScreen()

    @Test
    fun testNavigationFromPromosCardToEnterPromosScreen() {
        // Tap the Promos Card
        checkoutScreen.tapPromosCard()

        // Assert navigation to Enter Promos screen
        enterPromosScreen.assertScreenIsDisplayed()
    }
}
