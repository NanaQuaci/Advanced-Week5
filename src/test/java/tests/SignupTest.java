package tests;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignupTest extends BaseTests {


    //Testing demo
    @Test
    public void testSuccessfulNewsletterSignup() {
        driver.get("https://collinsadu-newsleterform.vercel.app/");
        HomePage homePage = new HomePage(driver);

        homePage.enterEmail("nanaquaci@yahoo.com");
        homePage.clickSubscribe();

        String message = homePage.getSuccessMessage();
        assertTrue(message.contains("Thanks for subscribing"), "Success message not shown");
    }


    @Test
    public void testInvalidEmailShowsError() {
        driver.get("https://collinsadu-newsleterform.vercel.app/");
        HomePage homePage = new HomePage(driver);

        homePage.enterEmail("@missingusername.com"); // No '@' or domain
        homePage.clickSubscribe();

        String error = homePage.getErrorMessage();
        assertTrue(error.contains("Valid email required"), "Error message should indicate invalid email");
    }

    @Test
    public void testEmptyEmailShowsError() {
        driver.get("https://collinsadu-newsleterform.vercel.app/");
        HomePage homePage = new HomePage(driver);

        homePage.enterEmail("");
        homePage.clickSubscribe();

        String error = homePage.getErrorMessage();
        assertTrue(error.contains("Enter a valid email required"), "Error should appear for empty email input");
    }

    @Test
    public void testEmailWithoutDomainShowsError() {
        driver.get("https://collinsadu-newsleterform.vercel.app/");
        HomePage homePage = new HomePage(driver);

        homePage.enterEmail("nana@");
        homePage.clickSubscribe();

        String error = homePage.getErrorMessage();
        assertTrue(error.contains("Valid email required"), "Error should appear for email without domain");
    }

    @Test
    public void testEmailWithoutAtSymbolShowsError() {
        driver.get("https://collinsadu-newsleterform.vercel.app/");
        HomePage homePage = new HomePage(driver);

        homePage.enterEmail("nanaquaci.com");
        homePage.clickSubscribe();

        String error = homePage.getErrorMessage();
        assertTrue(error.contains("Email is invalid"), "Error should appear for email without '@' symbol");
    }

}
