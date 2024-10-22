package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchResultPage extends ParentPage {


//    @FindBy(xpath = "//div[@class='search-result' and contains(., '%s')]", searchData)
//    private WebElement searchResult;

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "";
    }

    public boolean isSearchResultDisplayed(String searchData){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        String searchResultXpath = String.format("//div[@class='search-result' and contains(., '%s')]", searchData);
        WebElement searchResultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchResultXpath)));
        return searchResultElement.isDisplayed();
    }
}
