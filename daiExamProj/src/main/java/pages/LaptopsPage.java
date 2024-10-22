package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LaptopsPage extends ParentPage {



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

    public void clickOnFirstLaptop(String laptopName){
    String laptopXpath = String.format("//a[@class='to_product' and @title='%s']", laptopName);
    WebElement laptopElement = webDriverWait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(laptopXpath)));
    clickOnElement(laptopElement);
}
}
