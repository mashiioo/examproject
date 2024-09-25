package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {


    @FindBy(xpath = "//span[@class='active cabinet-link' and text()='Марія']")
    public WebElement firstName;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/";
    }

    public boolean isFirstNameVisible() {
        return isElementVisible(firstName);

    }

    public void clickOnFirstNamebutton() {
        clickOnElement(firstName);
    }
}
