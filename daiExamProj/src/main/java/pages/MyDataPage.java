package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyDataPage extends ParentPage {


    @FindBy(xpath = "//input[@type='text' and contains(@class, 'input user-first-name') and @placeholder=\"Ім'я\"]")
    private WebElement editFirstNameInput;

    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'btn-save') and text()='Зберегти']")
    private WebElement saveButton;

    public MyDataPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "ua/user/";
    }

    public MyDataPage checkIsRedirectToMyDataPage() {
        checkUrl();
        return this;
    }

    public MyDataPage enterNewFirstName(String newFirstName) {
        clearAndEnterTextIntoElement(editFirstNameInput, newFirstName);
        return this;
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);


    }

    public boolean isSaveButtonVisible() {
        return isElementVisible(saveButton);
    }

    public MyDataPage checkIsNameUpdated(String updatedName) {
        Assert.assertEquals("Name is not updated", updatedName, editFirstNameInput.getAttribute("value"));
        return this;
    }


}
