package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void openLoginPage() {
        webDriver.get(baseUrl);
        logger.info("Login page was opened " + baseUrl);
    }

    public void enterPhoneNumber(String phoneNumber) {
        clearAndEnterTextIntoElement(inputPhoneNumberInLoginForm, phoneNumber);

    }

    public void enterPassword(String password) {
        clearAndEnterTextIntoElement(inputPasswordInLoginForm, password);

    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public boolean isButtonLoginVisible() {
        return isElementVisible(loginButton);
    }

    public void clickOnLoginButtoninModal() {
        clickOnElement(loginButtonInModal);
    }
}
