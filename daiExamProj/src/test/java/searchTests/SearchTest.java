package searchTests;

import baseBase.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class SearchTest extends BaseTest {

    private String searchData = "iPhone 16 pro max";

    @Test
    public void TC_002_SearchWithValidData() {
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().clickOnSearchInput();
        pageProvider.getLoginPage().enterTextIntoSearchInput(searchData);
        pageProvider.getLoginPage().clickOnSearchButtonInInput();

        Assert.assertTrue("Search result is not displayed", pageProvider.getSearchResultPage().isSearchResultDisplayed(searchData));
    }

}
