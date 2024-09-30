package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Laptop1Page extends ParentPage {



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
}
