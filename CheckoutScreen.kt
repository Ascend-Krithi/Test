class CheckoutScreen {
    private val promosCard = onView(withId(R.id.promos_card))

    fun tapPromosCard() {
        promosCard.perform(click())
    }
}
