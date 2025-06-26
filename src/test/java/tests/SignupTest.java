package tests;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignupTest extends BaseTests {

    @Test
    public void testSuccessfulNewsletterSignup() {
        driver.get("https://collinsadu-newsleterform.vercel.app/");
        HomePage homePage = new HomePage(driver);

        homePage.enterEmail("nanaquaci@yahoo.com");
        homePage.clickSubscribe();

        String message = homePage.getSuccessMessage();
        assertTrue(message.contains("Thanks for subscribing"), "Success message not shown");
    }
}
