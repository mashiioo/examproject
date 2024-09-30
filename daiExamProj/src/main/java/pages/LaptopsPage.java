package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopsPage extends ParentPage {


    @FindBy(xpath = "//a[@class='to_product' and @title='Ноутбук Vinga Iron S150 (S150-12158512G)']")
    public WebElement firstLaptop;


    public LaptopsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "ua/category/Noutbuki-c4093/";
    }

    public LaptopsPage checkIsRedirectToLaptopsPage() {
        checkUrl();
        return this;
    }

    public void clickOnFirstLaptop() {
        clickOnElement(firstLaptop);
    }
}
