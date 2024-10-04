package pages;

import data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends ParentPage {


    @FindBy(xpath = "//div[@class='search-result' and contains(., '" + TestData.SEARCH_DATA + "')]")
    private WebElement searchResult;

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "";
    }

    public boolean isSearchResultDisplayed() {
        return isElementVisible(searchResult);

    }
}
