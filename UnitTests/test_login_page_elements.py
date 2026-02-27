# Import necessary modules
import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from webdriver_manager.chrome import ChromeDriverManager

# Test Scenario: Verify that the login page loads successfully with all required elements
@pytest.fixture(scope="function")
def setup_browser():
    """
    Fixture to set up and tear down the WebDriver.
    """
    # Set up Chrome WebDriver options
    chrome_options = Options()
    chrome_options.add_argument("--headless")  # Run browser in headless mode
    chrome_options.add_argument("--disable-gpu")  # Disable GPU for headless mode
    chrome_options.add_argument("--no-sandbox")  # Bypass OS security model
    chrome_options.add_argument("--disable-dev-shm-usage")  # Overcome limited resource problems

    # Initialize WebDriver
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=chrome_options)
    driver.implicitly_wait(10)  # Implicit wait for elements to load
    yield driver  # Provide the WebDriver instance to the test
    driver.quit()  # Quit the browser after the test

def test_login_page_elements(setup_browser):
    """
    Test to verify that the login page loads successfully with all required elements.
    """
    # Arrange: Define the login page URL
    login_page_url = "http://example.com/login"  # Replace with the actual URL of the login page

    # Act: Open the login page
    driver = setup_browser
    driver.get(login_page_url)

    # Assert: Verify that all required elements are present on the login page
    try:
        # Check for the username field
        username_field = driver.find_element(By.ID, "username")  # Replace "username" with the actual ID
        assert username_field.is_displayed(), "Username field is not displayed on the login page."

        # Check for the password field
        password_field = driver.find_element(By.ID, "password")  # Replace "password" with the actual ID
        assert password_field.is_displayed(), "Password field is not displayed on the login page."

        # Check for the login button
        login_button = driver.find_element(By.ID, "loginButton")  # Replace "loginButton" with the actual ID
        assert login_button.is_displayed(), "Login button is not displayed on the login page."

        # Check for the 'Forgot Password?' link
        forgot_password_link = driver.find_element(By.LINK_TEXT, "Forgot Password?")  # Replace with the actual link text
        assert forgot_password_link.is_displayed(), "'Forgot Password?' link is not displayed on the login page."

    except Exception as e:
        pytest.fail(f"Test failed due to an exception: {str(e)}")

    # Log success message
    print("All required elements are present on the login page.")

# Run the tests
if __name__ == "__main__":
    pytest.main(["-v", "-s", __file__])