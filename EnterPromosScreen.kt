class EnterPromosScreen {
    private val enterPromosTitle = onView(withText("Enter Promos"))

    fun isScreenDisplayed(): Boolean {
        enterPromosTitle.check(matches(isDisplayed()))
        return true
    }
}
