package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private final By emailInput = By.id("email");
    private final By subscribeButton = By.cssSelector("button[type='submit']");
    private final By successMessage = By.cssSelector("#success-message");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void clickSubscribe() {
        driver.findElement(subscribeButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
