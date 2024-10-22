package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FavouritePage extends ParentPage {


    @FindBy(xpath = "//span[@class='dotted-text' and text()='Очистити список відкладених']")
    private WebElement clearTheListButton;

    @FindBy(xpath = "//div[@class='not-found__strong' and text()='Немає відкладених товарів.']")
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

    public boolean isFirstLaptopDisplayed(String laptopName) {
        String laptopXpath = String.format("//a[@class='to_product' and @title='%s']", laptopName);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement laptopElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(laptopXpath)));
        return laptopElement.isDisplayed();
    }

    public void clickOnClearTheListButton() {
        clickOnElement(clearTheListButton);
    }

    public void checkIsListEmpty() {
        boolean isEmpty = isElementVisible(emptyListMessage);
        Assert.assertTrue("The list is not empty", isEmpty);
    }

}
