package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Laptop1Page extends ParentPage {


    @FindBy(xpath = "//div[@class='product-info clear product-info-right']//a[@class='add add-cart add-cart__text left' and @data-id='976248']")
    private WebElement buyButton;

    @FindBy(xpath = "//div[@class='fancybox-skin']")
    private WebElement cartInModal;

    @FindBy(xpath = "//a[@title='Закрити' and @class='fancybox-item fancybox-close']")
    private WebElement closeButtonInCartModal;

    @FindBy(xpath = "//div[@class='product-info clear product-info-right']//a[@class='add add-cart add-cart__text left added-to-cart' and @data-product-code='U0877699']")
    private WebElement placeOrderButton;

    public Laptop1Page(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "ua/product/Noutbuk_Vinga_Iron_S150_S150-12158512G-p976248/";
    }

    public Laptop1Page checkIsRedirectToLaptop1Page() {
        checkUrl();
        return this;

    }

    public void clickOBuyButton() {
        clickOnElement(buyButton);
    }

    public boolean isFirstLaptopDisplayedInCartModal() {
        webDriverWait15.until(ExpectedConditions.visibilityOf(cartInModal));
        return isElementVisible(cartInModal);
    }

    public void clickOnCloseButtonInCartModal() {
        clickOnElement(closeButtonInCartModal);
    }

    public Laptop1Page checkIsButtonPlaceOrderVisible() {
        boolean isVisible = isElementVisible(placeOrderButton);
        Assert.assertTrue("Place Order button is not visible", isVisible);
        return this;
    }
}
