package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends ParentPage {



    @FindBy (xpath = "//a[@href='/ua/category/Noutbuki-c4093/' and contains(@class, 'drops-caption') and text()='Ноутбуки']")
    private WebElement laptopCategoryButton;

    public CatalogPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "ua/catalog/";
    }


    public CatalogPage checkIsRedirectToCatalogPage() {
        checkUrl();
        return this;
    }

    public void clickOnLaptopCategoryButton() {
        clickOnElement(laptopCategoryButton);
    }
}


