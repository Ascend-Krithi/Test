package com.example.dsgcheckout.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.dsgcheckout.ui.CheckoutScreen
import com.example.dsgcheckout.ui.EnterPromosScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.assertTrue
import com.example.dsgcheckout.MainActivity

@RunWith(AndroidJUnit4::class)
class DSGCheckoutTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    private val checkoutScreen = CheckoutScreen()
    private val enterPromosScreen = EnterPromosScreen()

    @Test
    fun testPromosCardNavigatesToEnterPromosScreen() {
        // Tap the Promos Card
        checkoutScreen.tapPromosCard()

        // Assert that Enter Promos screen is displayed
        assertTrue(
            "Tapping Promos Card should navigate to Enter Promos screen",
            enterPromosScreen.isScreenDisplayed()
        )
    }
}
