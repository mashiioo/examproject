package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends ParentPage {


    @FindBy(xpath = "//input[@placeholder='Телефон']")
    private WebElement inputPhoneNumberInLoginForm;

    @FindBy(xpath = "//input[@placeholder='Пароль']")
    private WebElement inputPasswordInLoginForm;

    @FindBy(xpath = "//span[text()='Вхід']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@class='btn login-btn btn-block' and text()='Вхiд']")
    private WebElement loginButtonInModal;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/";
    }

    public LoginPage openLoginPage() {
        webDriver.get(baseUrl);
        logger.info("Login page was opened " + baseUrl);
        return this;
    }

    public LoginPage enterPhoneNumber(String phoneNumber) {
        enterTextUsingActions(inputPhoneNumberInLoginForm, phoneNumber);
     return this;
    }

    public LoginPage enterPassword(String password) {
        clearAndEnterTextIntoElement(inputPasswordInLoginForm, password);
return this;
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public boolean isButtonLoginVisible() {
        webDriverWait15.until(ExpectedConditions.invisibilityOf(loginButton));
        return isElementVisible(loginButton);
    }

    public void clickOnLoginButtoninModal() {
        clickOnElement(loginButtonInModal);
    }

}
