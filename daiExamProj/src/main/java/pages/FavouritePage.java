package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class FavouritePage extends ParentPage {


    @FindBy(xpath = "/html/body/main/section/header/a/span")
    private WebElement clearTheListButton;

    @FindBy(xpath = "/html/body/main/section/div/div/div[1]")
    private WebElement emptyListMessage;

    public FavouritePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "ua/favorites/";
    }

    public FavouritePage checkIsRedirectToFavouritePage() {
        checkUrl();
        return this;
    }

    public boolean isFirstLaptopDisplayed() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='to_product' and @title='Ноутбук Vinga Iron S150 (S150-12158512G)']")));
        return element.isDisplayed();
    }

    public FavouritePage clickOnClearTheListButton() {
        clickOnElement(clearTheListButton);
        return this;
    }

    public boolean checkIsListEmpty() {
        return isElementVisible(emptyListMessage);
    }

}
