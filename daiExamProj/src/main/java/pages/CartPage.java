package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage {

    @FindBy(xpath = "//div[@class='not-found center']")
    private WebElement emptyCartMessage;

    @FindBy(xpath = "//span[@class='dotted-text' and text()='Очистити кошик']")
    private WebElement clearTheCartButton;

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "ua/cart/";
    }

    public CartPage checkIsRedirectToCartPage() {
        checkUrl();
        return this;
    }

    public void clickOnClearTheCartButton() {
        clickOnElement(clearTheCartButton);
    }

    public boolean checkIsCartEmpty() {
        return isElementVisible(emptyCartMessage);

    }
}
