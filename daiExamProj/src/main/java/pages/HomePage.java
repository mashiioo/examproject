package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {


    @FindBy(xpath = "//div[@class='navbar']//span[text()='Марія']")
    public WebElement firstName;

    @FindBy(xpath = "//a[@href='/ua/catalog/' and contains(@class, 'catalog') and text()=' Всі товари ']")
    private WebElement catalogButton;

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

    public void clickOnFirstNameButton() {
        clickOnElement(firstName);
    }

    public void clickOnCatalogButton() {
        clickOnElement(catalogButton);
    }
}
