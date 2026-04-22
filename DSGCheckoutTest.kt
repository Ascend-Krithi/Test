class DSGCheckoutTest {
    @Test
    fun testPromosCardNavigation() {
        val checkoutScreen = CheckoutScreen()
        val enterPromosScreen = EnterPromosScreen()

        checkoutScreen.tapPromosCard()
        assertTrue(enterPromosScreen.isScreenDisplayed())
    }
}
