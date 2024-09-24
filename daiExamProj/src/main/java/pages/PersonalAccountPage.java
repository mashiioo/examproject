package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalAccountPage extends ParentPage {


    @FindBy(xpath = "//span[@class='bordered-text' and text()='Редагувати дані']")
    private WebElement editDataButton;

    public PersonalAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "";
    }

    public PersonalAccountPage checkIsRedirectToPersonalAccountPage() {
        checkUrl();
        return this;
    }

    public void clickOnEditDataButton() {
        clickOnElement(editDataButton);
    }
}
