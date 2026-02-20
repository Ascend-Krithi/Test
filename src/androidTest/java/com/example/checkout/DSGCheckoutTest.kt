package com.example.checkout

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.assertTrue

@LargeTest
@RunWith(AndroidJUnit4::class)
class DSGCheckoutTest {
    @Test
    fun testPromosCardNavigation() {
        val checkoutScreen = CheckoutScreen()
        val enterPromosScreen = EnterPromosScreen()
        checkoutScreen.tapPromosCard()
        assertTrue(enterPromosScreen.isScreenDisplayed())
    }
}
